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
import java.util.*;

public class DocenteTest {

    public DocenteTest() {
    }

    @Test
    public void testGeneral() {
        IDocente docenteDao = new ImplDocente();

// TEST INSERTAR
        int filas = 0;
        Docente doc = new Docente("321654987", "andres", "orozco", "Riobamba y la que Cruza",new Date(), "riobamba", "c", 1);
        try {
            filas = docenteDao.insertar(doc);
            System.out.println("Ingreso de " + filas + " Filas Correctas");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        assertTrue(filas > 0);
//
//            //TEST OBTENER POR CODIGO
////        
        Docente docent = new Docente();
        try {
            docent = docenteDao.obtener(1);
            System.out.println(docent.getCodigoD()+ "    "+docent.getCedula()+ "    "  + docent.getNombres()+ "    " + docent.getApellidos()+ "    " + docent.getDirecciopn()+ "    " + docent.getFechaNaciemiento()+ "    " + docent.getEmail()+ "    " + docent.getTelefono());
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
        assertEquals(docent!=null, true);

//            //TEST LISTADO
        ArrayList<Docente> docentes = new ArrayList<>();
        try {
            docentes = docenteDao.obtener();
            System.out.println("Docentes");
            for (Docente docente : docentes) {
                System.out.println(docent.getCodigoD()+ "    "+docent.getCedula()+ "    "  + docent.getNombres()+ "    " + docent.getApellidos()+ "    " + docent.getDirecciopn()+ "    " + docent.getFechaNaciemiento()+ "    " + docent.getEmail()+ "    " + docent.getTelefono());
            }
        } catch (Exception e) {
        }
        assertTrue(docentes.size()>0);
    }

}
