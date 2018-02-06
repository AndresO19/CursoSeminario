
package docentes.rnegocio.entidades;

import java.util.*;


public class Docente {
    
    private int codigoD;
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date fechanaciemiento;
    private String email;
    private String telefono;

    public Docente() {
    }

    public Docente(int codigoD, int cedula, String nombre, String apellido, String direccion, Date fechanaciemiento, String email, String telefono) {
        this.codigoD = codigoD;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechanaciemiento = fechanaciemiento;
        this.email = email;
        this.telefono = telefono;
    }

    public int getCodigoD() {
        return codigoD;
    }

    public void setCodigoD(int codigoD) {
        this.codigoD = codigoD;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechanaciemiento() {
        return fechanaciemiento;
    }

    public void setFechanaciemiento(Date fechanaciemiento) {
        this.fechanaciemiento = fechanaciemiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
