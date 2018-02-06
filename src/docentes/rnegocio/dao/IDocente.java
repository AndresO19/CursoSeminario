
package docentes.rnegocio.dao;
import docentes.rnegocio.entidades.*;
import java.util.*;

public interface IDocente {
    
      
    public int insertar(Docente docente) throws Exception;

    public int modificar(Docente docente) throws Exception;

    public int eliminar(Docente docente) throws Exception;

    public Docente  obtener(int codigo) throws Exception;

    public ArrayList<Docente> obtener() throws Exception;
    
}
