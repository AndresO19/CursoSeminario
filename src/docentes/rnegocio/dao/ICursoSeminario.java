
package docentes.rnegocio.dao;

import docentes.rnegocio.entidades.*;
import java.util.*;
public interface ICursoSeminario {
    
    public int insertar(CursoSeminarios cursoseminario) throws Exception;

    public int modificar(CursoSeminarios cursoseminario) throws Exception;

    public int eliminar(CursoSeminarios cursoseminario) throws Exception;

    public CursoSeminarios obtener(int codigo) throws Exception;

    public ArrayList<CursoSeminarios> obtener() throws Exception;
    
}
