package mx.edu.ceneval.mapeos;
// Generated 6/02/2013 11:28:23 AM by Hibernate Tools 3.2.1.GA



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer id;
     private String nombre;

    public Usuarios() {
    }

    public Usuarios(String nombre) {
       this.nombre = nombre;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


