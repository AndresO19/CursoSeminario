
package docentes.rnegocio.entidades;


public class CursoSeminarios {
        private Docente Docente;
        private String nombreCursoSeminario;
        private int horas;
        private String Ubicacion;
        private String descripcion;
        private int codCursoSeminario;

    public CursoSeminarios() {
    }

    public CursoSeminarios(Docente Docente, String nombreCursoSeminario, int horas, String Ubicacion, String descripcion, int codCursoSeminario) {
        this.Docente = Docente;
        this.nombreCursoSeminario = nombreCursoSeminario;
        this.horas = horas;
        this.Ubicacion = Ubicacion;
        this.descripcion = descripcion;
        this.codCursoSeminario = codCursoSeminario;
    }

    public Docente getDocente() {
        return Docente;
    }

    public void setDocente(Docente Docente) {
        this.Docente = Docente;
    }

    public String getNombreCursoSeminario() {
        return nombreCursoSeminario;
    }

    public void setNombreCursoSeminario(String nombreCursoSeminario) {
        this.nombreCursoSeminario = nombreCursoSeminario;
    }

    public int gethoras() {
        return horas;
    }

    public void sethoras(int horas) {
        this.horas = horas;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodCursoSeminario() {
        return codCursoSeminario;
    }

    public void setCodCursoSeminario(int codCursoSeminario) {
        this.codCursoSeminario = codCursoSeminario;
    }

        
        
        
    
    
}
