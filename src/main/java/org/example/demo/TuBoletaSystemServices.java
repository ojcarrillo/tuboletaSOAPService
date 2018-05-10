package org.example.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-05-10T13:07:46.429-05:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.example.org/demo/", name = "TuBoletaSystemServices")
@XmlSeeAlso({ObjectFactory.class})
public interface TuBoletaSystemServices {

    @WebMethod
    @RequestWrapper(localName = "realizarReserva", targetNamespace = "http://www.example.org/demo/", className = "org.example.demo.RealizarReserva")
    @ResponseWrapper(localName = "realizarReservaResponse", targetNamespace = "http://www.example.org/demo/", className = "org.example.demo.RealizarReservaResponse")
    public void realizarReserva(
        @WebParam(name = "reservas", targetNamespace = "")
        java.util.List<org.example.demo.RealizarReserva.Reservas> reservas,
        @WebParam(mode = WebParam.Mode.OUT, name = "respuesta", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> respuesta,
        @WebParam(mode = WebParam.Mode.OUT, name = "estado", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> estado,
        @WebParam(mode = WebParam.Mode.OUT, name = "fechaReserva", targetNamespace = "")
        javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> fechaReserva
    );

    @WebMethod
    @RequestWrapper(localName = "obtenerReserva", targetNamespace = "http://www.example.org/demo/", className = "org.example.demo.ObtenerReserva")
    @ResponseWrapper(localName = "obtenerReservaResponse", targetNamespace = "http://www.example.org/demo/", className = "org.example.demo.ObtenerReservaResponse")
    public void obtenerReserva(
        @WebParam(mode = WebParam.Mode.INOUT, name = "idReserva", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> idReserva,
        @WebParam(mode = WebParam.Mode.OUT, name = "estado", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> estado,
        @WebParam(mode = WebParam.Mode.OUT, name = "fechaReserva", targetNamespace = "")
        javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> fechaReserva,
        @WebParam(mode = WebParam.Mode.OUT, name = "boletas", targetNamespace = "")
        javax.xml.ws.Holder<org.example.demo.ObtenerReservaResponse.Boletas> boletas
    );

    @WebMethod
    @RequestWrapper(localName = "cancelarReserva", targetNamespace = "http://www.example.org/demo/", className = "org.example.demo.CancelarReserva")
    @ResponseWrapper(localName = "cancelarReservaResponse", targetNamespace = "http://www.example.org/demo/", className = "org.example.demo.CancelarReservaResponse")
    public void cancelarReserva(
        @WebParam(name = "idReserva", targetNamespace = "")
        java.lang.String idReserva,
        @WebParam(mode = WebParam.Mode.OUT, name = "respuesta", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> respuesta,
        @WebParam(mode = WebParam.Mode.OUT, name = "estado", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> estado,
        @WebParam(mode = WebParam.Mode.OUT, name = "fechaReserva", targetNamespace = "")
        javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> fechaReserva
    );
}