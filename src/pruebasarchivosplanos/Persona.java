package pruebasarchivosplanos;

import java.io.Serializable;


public class Persona implements Serializable{// prepara el objeto para que pueda ser guardada en el archivo
    private String cedula;
    private String nombre;
    private String edad;

    public Persona(String cedula, String nombre, String edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getInformaciion()
    {
        return "Cedula:"+getCedula()+" Nombre:"+getNombre()+" Edad:"+getEdad();
    }
}
