package mx.edu.ceneval.mapeos;
// Generated 6/02/2013 11:28:23 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Incidencias generated by hbm2java
 */
public class Incidencias  implements java.io.Serializable {


     private Integer id;
     private String tipoArchivo;
     private String posicionArchivo;
     private Integer folio;
     private String incidencia;
     private String campoAfectado;
     private String datoOriginal;
     private String datoCorregido;
     private String usuario;
     private Date fechaCorrecion;
     private Boolean corregido;

    public Incidencias() {
    }

    public Incidencias(String tipoArchivo, String posicionArchivo, Integer folio, String incidencia, String campoAfectado, String datoOriginal, String datoCorregido, String usuario, Date fechaCorrecion, Boolean corregido) {
       this.tipoArchivo = tipoArchivo;
       this.posicionArchivo = posicionArchivo;
       this.folio = folio;
       this.incidencia = incidencia;
       this.campoAfectado = campoAfectado;
       this.datoOriginal = datoOriginal;
       this.datoCorregido = datoCorregido;
       this.usuario = usuario;
       this.fechaCorrecion = fechaCorrecion;
       this.corregido = corregido;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipoArchivo() {
        return this.tipoArchivo;
    }
    
    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }
    public String getPosicionArchivo() {
        return this.posicionArchivo;
    }
    
    public void setPosicionArchivo(String posicionArchivo) {
        this.posicionArchivo = posicionArchivo;
    }
    public Integer getFolio() {
        return this.folio;
    }
    
    public void setFolio(Integer folio) {
        this.folio = folio;
    }
    public String getIncidencia() {
        return this.incidencia;
    }
    
    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }
    public String getCampoAfectado() {
        return this.campoAfectado;
    }
    
    public void setCampoAfectado(String campoAfectado) {
        this.campoAfectado = campoAfectado;
    }
    public String getDatoOriginal() {
        return this.datoOriginal;
    }
    
    public void setDatoOriginal(String datoOriginal) {
        this.datoOriginal = datoOriginal;
    }
    public String getDatoCorregido() {
        return this.datoCorregido;
    }
    
    public void setDatoCorregido(String datoCorregido) {
        this.datoCorregido = datoCorregido;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Date getFechaCorrecion() {
        return this.fechaCorrecion;
    }
    
    public void setFechaCorrecion(Date fechaCorrecion) {
        this.fechaCorrecion = fechaCorrecion;
    }
    public Boolean getCorregido() {
        return this.corregido;
    }
    
    public void setCorregido(Boolean corregido) {
        this.corregido = corregido;
    }




}


