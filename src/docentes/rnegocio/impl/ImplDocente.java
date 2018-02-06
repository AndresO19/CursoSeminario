
package docentes.rnegocio.impl;

import docentes.rnegocio.dao.*;
import docentes.rnegocio.impl.*;
import docentes.rnegocio.entidades.*;
import accesodatos.*;
import java.util.*;
import java.sql.*;


public class ImplDocente implements IDocente {
    
    @Override
    public int insertar(Docente docente) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "Insert Into Docente (cedula, nombres, apellidos, direcciopn, fechaNacimineto, email, telefono, codDocente) Values (?,?,?,?,?,?,?,?)";
        ArrayList<Parametro> listParametro = new ArrayList<>();
        listParametro.add(new Parametro(1, docente.getCedula()));
        listParametro.add(new Parametro(2, docente.getNombres()));
        listParametro.add(new Parametro(3, docente.getApellidos()));
        listParametro.add(new Parametro(4, docente.getDirecciopn()));
        if (docente.getFechaNaciemiento() instanceof java.util.Date) {
            listParametro.add(new Parametro(5, new java.sql.Date(((java.util.Date) docente.getFechaNaciemiento()).getTime())));
        } else {
            listParametro.add(new Parametro(5, docente.getFechaNaciemiento()));
        }
        listParametro.add(new Parametro(6, docente.getEmail()));
        listParametro.add(new Parametro(7, docente.getTelefono()));
        listParametro.add(new Parametro(8, docente.getCodigoD()));
        Conexion conec = null;
        try {
            conec = new Conexion();
            conec.conectar();
            numFilasAfectadas = conec.ejecutarComando(sql, listParametro);
        } catch (Exception e) {
            throw e;
        } finally {
            if(conec!=null){
            conec.desconectar();}
        }
        return numFilasAfectadas;
    }

    @Override
    public int modificar(Docente docente) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE Docente SET cedula=?, nombres=?, apellidos=?, direcciopn=?, fechaNacimineto=?, email=?, telefono=?, codDocente=? WHERE codDocente=?";
        ArrayList<Parametro> listParametro = new ArrayList<>();
        listParametro.add(new Parametro(1, docente.getCedula()));
        listParametro.add(new Parametro(2, docente.getNombres()));
        listParametro.add(new Parametro(3, docente.getApellidos()));
        listParametro.add(new Parametro(4, docente.getDirecciopn()));
        if (docente.getFechaNaciemiento() instanceof java.util.Date) {
            listParametro.add(new Parametro(5, new java.sql.Date(((java.util.Date) docente.getFechaNaciemiento()).getTime())));
        } else {
            listParametro.add(new Parametro(5, docente.getFechaNaciemiento()));
        }
        listParametro.add(new Parametro(6, docente.getEmail()));
        listParametro.add(new Parametro(7, docente.getTelefono()));
        listParametro.add(new Parametro(8, docente.getCodigoD()));
        listParametro.add(new Parametro(9, docente.getCedula()));
        Conexion conec=null;
        try {
            conec = new Conexion();
            conec.conectar();
            numFilasAfectadas=conec.ejecutarComando(sql, listParametro);
        } catch (Exception e) {
        }finally {
            if(conec!=null){
            conec.desconectar();}
        }
        return numFilasAfectadas;
    }

    @Override
    public int eliminar(Docente docente) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "DELETE FROM Docente WHERE codDocente=?";
        ArrayList<Parametro> listParametro = new ArrayList<>();
        listParametro.add(new Parametro(1, docente.getCodigoD()));
        Conexion conec = null;
        try {
            conec = new Conexion();
            conec.conectar();
            numFilasAfectadas = conec.ejecutarComando(sql, listParametro);
        } catch (Exception e) {
            throw e;
        } finally {
            if(conec!=null){
            conec.desconectar();}
        }
        return numFilasAfectadas;
    }

    @Override
    public Docente obtener(int codigo) throws Exception {
        Docente docente = null;
        String sql = "Select cedula, nombres, apellidos, direcciopn, fechaNacimineto, email, telefono, codDocente From Docente where codDocente=?";
        ArrayList<Parametro> listadoParametros = new ArrayList<>();
        listadoParametros.add(new Parametro(1, codigo));
        Conexion conec = null;
        try {
            conec = new Conexion();
            conec.conectar();
            ResultSet resultado = conec.ejecutarQuery(sql, listadoParametros);
            while (resultado.next()) {
                docente = new Docente();
                docente.setCedula(resultado.getString(1));
                docente.setNombres(resultado.getString(2));
                docente.setApellidos(resultado.getString(3));
                docente.setDirecciopn(resultado.getString(4));
                docente.setFechaNaciemiento(resultado.getDate(5));
                docente.setEmail(resultado.getString(6));
                docente.setTelefono(resultado.getString(7));
                docente.setCodigoD(resultado.getInt(8));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(conec!=null){
            conec.desconectar();}
        }
        return docente;
    }

    @Override
    public ArrayList<Docente> obtener() throws Exception {
        Docente docente = null;
        ArrayList<Docente> lista = new ArrayList<>();
        String sql = "SELECT codigo_c, descripcion FROM CursoSeminarios";
        Conexion conec = null;
        try {
            conec = new Conexion();
            conec.conectar();
            ResultSet resultado = conec.ejecutarQuery(sql, null);
            while (resultado.next()) {
                docente = new Docente();
                docente.setCedula(resultado.getString(1));
                docente.setNombres(resultado.getString(2));
                docente.setApellidos(resultado.getString(3));
                docente.setDirecciopn(resultado.getString(4));
                docente.setFechaNaciemiento(resultado.getDate(5));
                docente.setEmail(resultado.getString(6));
                docente.setTelefono(resultado.getString(7));
                docente.setCodigoD(resultado.getInt(8));
                lista.add(docente);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(conec!=null){
            conec.desconectar();}
        }
        return lista;
    }

    
    
    
}
