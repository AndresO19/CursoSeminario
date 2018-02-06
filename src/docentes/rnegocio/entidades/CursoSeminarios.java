
package docentes.rnegocio.entidades;


public class CursoSeminarios {

   
        
        
        private Docente Docente;
        private int Cod_Curso;
        private String Nombre;
        private int Horas;
        private String Direccion;
        private String Descripcion;

    public CursoSeminarios() {
    }

    public CursoSeminarios(Docente Docente, int Cod_Curso, String Nombre, int Horas, String Direccion, String Descripcion) {
        this.Docente = Docente;
        this.Cod_Curso = Cod_Curso;
        this.Nombre = Nombre;
        this.Horas = Horas;
        this.Direccion = Direccion;
        this.Descripcion = Descripcion;
    }

    public int getCod_Curso() {
        return Cod_Curso;
    }

    public void setCod_Curso(int Cod_Curso) {
        this.Cod_Curso = Cod_Curso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
        
        
        
    
    
}
