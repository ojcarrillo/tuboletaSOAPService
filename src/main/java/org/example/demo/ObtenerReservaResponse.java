
package org.example.demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="boletas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="persona" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="tipoDocIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nroDocIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nroTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="tipoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="fila" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="silla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="grada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="idBoleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idReserva",
    "estado",
    "fechaReserva",
    "boletas"
})
@XmlRootElement(name = "obtenerReservaResponse")
public class ObtenerReservaResponse {

    protected String idReserva;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaReserva;
    protected ObtenerReservaResponse.Boletas boletas;

    /**
     * Obtiene el valor de la propiedad idReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReserva() {
        return idReserva;
    }

    /**
     * Define el valor de la propiedad idReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReserva(String value) {
        this.idReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Define el valor de la propiedad fechaReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaReserva(XMLGregorianCalendar value) {
        this.fechaReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad boletas.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerReservaResponse.Boletas }
     *     
     */
    public ObtenerReservaResponse.Boletas getBoletas() {
        return boletas;
    }

    /**
     * Define el valor de la propiedad boletas.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerReservaResponse.Boletas }
     *     
     */
    public void setBoletas(ObtenerReservaResponse.Boletas value) {
        this.boletas = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="persona" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="tipoDocIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="nroDocIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="nroTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="tipoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="fila" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="silla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="grada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="idBoleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "persona",
        "tipoEvento",
        "lugar",
        "sector",
        "fila",
        "silla",
        "grada",
        "idBoleta",
        "fecha",
        "hora"
    })
    public static class Boletas {

        protected ObtenerReservaResponse.Boletas.Persona persona;
        protected String tipoEvento;
        protected String lugar;
        protected String sector;
        protected String fila;
        protected String silla;
        protected String grada;
        protected String idBoleta;
        protected String fecha;
        protected String hora;

        /**
         * Obtiene el valor de la propiedad persona.
         * 
         * @return
         *     possible object is
         *     {@link ObtenerReservaResponse.Boletas.Persona }
         *     
         */
        public ObtenerReservaResponse.Boletas.Persona getPersona() {
            return persona;
        }

        /**
         * Define el valor de la propiedad persona.
         * 
         * @param value
         *     allowed object is
         *     {@link ObtenerReservaResponse.Boletas.Persona }
         *     
         */
        public void setPersona(ObtenerReservaResponse.Boletas.Persona value) {
            this.persona = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoEvento() {
            return tipoEvento;
        }

        /**
         * Define el valor de la propiedad tipoEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoEvento(String value) {
            this.tipoEvento = value;
        }

        /**
         * Obtiene el valor de la propiedad lugar.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLugar() {
            return lugar;
        }

        /**
         * Define el valor de la propiedad lugar.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLugar(String value) {
            this.lugar = value;
        }

        /**
         * Obtiene el valor de la propiedad sector.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSector() {
            return sector;
        }

        /**
         * Define el valor de la propiedad sector.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSector(String value) {
            this.sector = value;
        }

        /**
         * Obtiene el valor de la propiedad fila.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFila() {
            return fila;
        }

        /**
         * Define el valor de la propiedad fila.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFila(String value) {
            this.fila = value;
        }

        /**
         * Obtiene el valor de la propiedad silla.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSilla() {
            return silla;
        }

        /**
         * Define el valor de la propiedad silla.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSilla(String value) {
            this.silla = value;
        }

        /**
         * Obtiene el valor de la propiedad grada.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrada() {
            return grada;
        }

        /**
         * Define el valor de la propiedad grada.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrada(String value) {
            this.grada = value;
        }

        /**
         * Obtiene el valor de la propiedad idBoleta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdBoleta() {
            return idBoleta;
        }

        /**
         * Define el valor de la propiedad idBoleta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdBoleta(String value) {
            this.idBoleta = value;
        }

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecha(String value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad hora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHora() {
            return hora;
        }

        /**
         * Define el valor de la propiedad hora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHora(String value) {
            this.hora = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="tipoDocIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="nroDocIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="nroTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nombre",
            "apellido",
            "tipoDocIdentidad",
            "nroDocIdentidad",
            "nroTelefono",
            "correo"
        })
        public static class Persona {

            protected String nombre;
            protected String apellido;
            protected String tipoDocIdentidad;
            protected String nroDocIdentidad;
            protected String nroTelefono;
            protected String correo;

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad apellido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApellido() {
                return apellido;
            }

            /**
             * Define el valor de la propiedad apellido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApellido(String value) {
                this.apellido = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoDocIdentidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoDocIdentidad() {
                return tipoDocIdentidad;
            }

            /**
             * Define el valor de la propiedad tipoDocIdentidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoDocIdentidad(String value) {
                this.tipoDocIdentidad = value;
            }

            /**
             * Obtiene el valor de la propiedad nroDocIdentidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNroDocIdentidad() {
                return nroDocIdentidad;
            }

            /**
             * Define el valor de la propiedad nroDocIdentidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNroDocIdentidad(String value) {
                this.nroDocIdentidad = value;
            }

            /**
             * Obtiene el valor de la propiedad nroTelefono.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNroTelefono() {
                return nroTelefono;
            }

            /**
             * Define el valor de la propiedad nroTelefono.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNroTelefono(String value) {
                this.nroTelefono = value;
            }

            /**
             * Obtiene el valor de la propiedad correo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorreo() {
                return correo;
            }

            /**
             * Define el valor de la propiedad correo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorreo(String value) {
                this.correo = value;
            }

        }

    }

}
