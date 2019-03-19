
package BD;

import Clases.cLibro;
import java.util.*;
import java.sql.*;

public class Libro extends cLibro{
    Conexion con;
    
    public Libro(){
        con = new Conexion();
    }
    
    public void agregarLibro(cLibro l){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("INSERT INTO LIBRO (nserie, isbn, titulo, npaginas, neto, iva, anio, nedicion) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            p.setInt(1, l.getNserie());
            p.setInt(2, l.getIsbn());
            p.setString(3, l.getTitulo());
            p.setInt(4, l.getNpaginas());
            p.setDouble(5, l.getNeto());
            p.setDouble(6, l.getIva());
            p.setInt(7, l.getAnio());
            p.setInt(8, l.getNedicion());
            p.execute();
            p.close();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    public void modificarLibro (cLibro l){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("UPDATE LIBRO SET isbn = ?, SET titulo = ?, npaginas = ?, neto = ?, iva = ?, anio = ?, nedicion = ? WHERE nserie = ?");
            p.setInt(1, l.getIsbn());
            p.setString(2, l.getTitulo());
            p.setInt(3, l.getNpaginas());
            p.setDouble(4, l.getNeto());
            p.setDouble(5, l.getIva());
            p.setInt(6, l.getAnio());
            p.setInt(7, l.getNedicion());
            p.setInt(13, l.getNserie());
            p.execute();
            p.close();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    public void eliminarLibro (cLibro l){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("DELETE FROM LIBRO WHERE nserie = ?");
            p.setInt(1, l.getNserie());
            p.execute();
            p.close();
        } catch(SQLException e){
            System.out.println(e);
        } 
    }
    
    public Object [][] getDatos(){
        int x = 0;
        try{
            con.conectar();
            PreparedStatement p = con.mostrar().prepareStatement("SELECT count(1) nserie, isbn, titulo, npaginas, neto, iva, anio, nedicion FROM LIBRO");
            ResultSet r = p.executeQuery();
            r.next();
            x = r.getInt("total");
            r.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        Object[][] s = new String[x][2];
        
        try{
            con.conectar();
            PreparedStatement p = con.mostrar().prepareStatement("SELECT nserie, isbn, titulo, npaginas, neto, iva, anio, nedicion FROM libro ORDER BY nserie");
            ResultSet r = p.executeQuery();
            int i = 0;
            while (r.next()){
                s[i][0]= r.getInt("nserie");
                s[i][1]= r.getInt("isbn");
                s[i][2]= r.getString("titulo");
                s[i][3]= r.getInt("npaginas");
                s[i][4]= r.getDouble("neto");
                s[i][5]= r.getDouble("iva");
                s[i][6]= r.getInt("anio");
                s[i][7]= r.getInt("nedicion");
                i++;   
            }
            r.close();
        } catch(SQLException e){
            System.out.println(e);
        }
        return s;
    }
    
}
