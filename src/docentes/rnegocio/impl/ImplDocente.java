
package docentes.rnegocio.impl;

import docentes.rnegocio.dao.*;
import docentes.rnegocio.impl.*;
import docentes.rnegocio.entidades.*;
import java.util.*;
import java.sql.*;


public class ImplDocente implements IDocente {
    
    @Override
    public int insertar(Docente docente) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into CursoSeminarios (codigo_c, descripcion) values (?,?)";
        ArrayList<Parametro> listParametro = new ArrayList<>();
        listParametro.add(new Parametro(1, curso.getCodigo()));
        listParametro.add(new Parametro(2, curso.getDescripcion()!=null?curso.getDescripcion():null));
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
        String sql = "UPDATE CursoSeminarios SET codigo_c=?, descripcion=? WHERE codigo_c=?";
        ArrayList<Parametro> listParametro = new ArrayList<>();
        listParametro.add(new Parametro(1, curso.getCodigo()));
        listParametro.add(new Parametro(2, curso.getDescripcion()));
        listParametro.add(new Parametro(1, curso.getCodigo()));
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
        String sql = "DELETE FROM CursoSeminarios WHERE codigo_c=?";
        ArrayList<Parametro> listParametro = new ArrayList<>();
        listParametro.add(new Parametro(1, curso.getCodigo()));
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
        CursoSeminarios curso = null;
        String sql = "SELECT codigo_c, descripcion FROM CursoSeminarios where codigo_c=?";
        ArrayList<Parametro> listadoParametros = new ArrayList<>();
        listadoParametros.add(new Parametro(1, codigo));
        Conexion conec = null;
        try {
            conec = new Conexion();
            conec.conectar();
            ResultSet resultado = conec.ejecutarQuery(sql, listadoParametros);
            while (resultado.next()) {
                curso = new CursoSeminarios();
                curso.setCodigo(resultado.getInt(1));
                curso.setDescripcion(resultado.getString(2));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(conec!=null){
            conec.desconectar();}
        }
        return curso;
    }

    @Override
    public ArrayList<Docente> obtener() throws Exception {
        CursoSeminarios curso = null;
        ArrayList<CursoSeminarios> lista = new ArrayList<>();
        String sql = "SELECT codigo_c, descripcion FROM CursoSeminarios";
        Conexion conec = null;
        try {
            conec = new Conexion();
            conec.conectar();
            ResultSet resultado = conec.ejecutarQuery(sql, null);
            while (resultado.next()) {
                curso=new CursoSeminarios();
                curso.setCodigo(resultado.getInt(1));
                curso.setDescripcion(resultado.getString(2));
                lista.add(curso);
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
