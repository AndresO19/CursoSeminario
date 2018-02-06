
package docentes.rnegocio.entidades;


public class CursoSeminarios {

   
        
        
        private Docente Docente;
        private String nombreCursoSeminario;
        private int Hhras;
        private String Ubicacion;
        private String descripcion;
        private int codCursoSeminario;

    public CursoSeminarios() {
    }

    public CursoSeminarios(Docente Docente, String nombreCursoSeminario, int Hhras, String Ubicacion, String descripcion, int codCursoSeminario) {
        this.Docente = Docente;
        this.nombreCursoSeminario = nombreCursoSeminario;
        this.Hhras = Hhras;
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

    public int getHhras() {
        return Hhras;
    }

    public void setHhras(int Hhras) {
        this.Hhras = Hhras;
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
