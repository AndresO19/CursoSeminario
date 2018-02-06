
package docentes.rnegocio.entidades;

import java.util.*;


public class Docente {
    
    
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direcciopn;
    private Date fechaNaciemiento;
    private String email;
    private String telefono;
    private int codigoD;

    public Docente() {
    }

    public Docente(String cedula, String nombres, String apellidos, String direcciopn, Date fechaNaciemiento, String email, String telefono, int codigoD) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direcciopn = direcciopn;
        this.fechaNaciemiento = fechaNaciemiento;
        this.email = email;
        this.telefono = telefono;
        this.codigoD = codigoD;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirecciopn() {
        return direcciopn;
    }

    public void setDirecciopn(String direcciopn) {
        this.direcciopn = direcciopn;
    }

    public Date getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(Date fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
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

    public int getCodigoD() {
        return codigoD;
    }

    public void setCodigoD(int codigoD) {
        this.codigoD = codigoD;
    }

    
    
}
