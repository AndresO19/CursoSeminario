
package docente.test;

import docentes.rnegocio.dao.*;
import docentes.rnegocio.impl.*;
import docentes.rnegocio.entidades.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CursoSeminarioTest {
    
    public CursoSeminarioTest() {
    }
    
    @Test
    
    public void TestGeneral(){
        ICursoSeminario curDao = new ImplCursoSeminario();
        
      //////////Test Insertar
       int filas = 0;
       Docente docente = new Docente(1, 06031437047, 'Name', 'name', 'deed',  'sdsd', 'sdsd');
        CursoSeminarios curs = new CursoSeminarios(docente, 1, 'capacitacion', 5, '10 de agosto', 'de');
        try {
            filas = curDao.insertar(curs);
            System.out.println("Ingreso de " + filas + " Filas Correctas");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        assertTrue(filas > 0);
      
        
        
    }
}
