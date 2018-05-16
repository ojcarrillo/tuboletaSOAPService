package co.com.javeriana.soap.integracion.tuboletaSOAPService;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import org.tuboleta.demo.CancelarReserva;
import org.tuboleta.demo.ObtenerReserva;
import org.tuboleta.demo.RealizarReserva;
import org.tuboleta.demo.RealizarReservaResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.javeriana.soap.integracion.rest.RestInvoker;

@Component
public class SoapService {

	public void cancelarReserva(final Exchange exchange) {
		CancelarReserva datos = exchange.getIn().getBody(CancelarReserva.class);
		String serviceURL = "http://35.203.93.92:9091/cancelarReserva/" + datos.getIdReserva();
		String method = "POST";
		String accept = "application/xml";
		String response = RestInvoker.invokeService(serviceURL, method, accept, datos.getIdReserva());
		exchange.getOut().setBody(response);
	}

	public void obtenerReserva(final Exchange exchange) {
		ObtenerReserva datos = exchange.getIn().getBody(ObtenerReserva.class);
		String serviceURL = "http://35.203.93.92:9091/obtenerReserva/" + datos.getIdReserva();
		String method = "GET";
		String accept = "application/xml";
		String response = RestInvoker.invokeService(serviceURL, method, accept, datos.getIdReserva());
		exchange.getOut().setBody(response);
	}

	public void realizarReserva(final Exchange exchange) {
		try {
			RealizarReserva datos = exchange.getIn().getBody(RealizarReserva.class);
			String serviceURL = "http://35.203.93.92:9091/realizarReserva/";
			String method = "POST";
			String accept = "application/json";
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(datos.getReservas());
			String response = RestInvoker.invokeService(serviceURL, method, accept, jsonInString);
			RealizarReservaResponse rta = mapper.readValue(response, RealizarReservaResponse.class);
			exchange.getOut().setBody(rta);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
