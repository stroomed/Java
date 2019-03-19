
package BD;


import Clases.cAutor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Autor extends cAutor{

    Conexion con;
    
    public Autor(){
        con = new Conexion();
    }
    
    public void agregarAutor(cAutor a){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("INSERT INTO AUTOR(nautor, ap, am) VALUES (?, ?, ?)");
            p.setString(1, a.getNombre());
            p.setString(2, a.getAp());
            p.setString(3, a.getAm());
            p.execute();
            p.close();
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void modificarAutor (cAutor a){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("UPDATE AUTOR SET nautor = ?, SET ap = ?, SET am = ? WHERE aid = ?");
            p.setString(1, a.getNombre());
            p.setString(2, a.getAp());
            p.setString(3, a.getAm());
            p.setInt(4, a.getAid());
            p.execute();
            p.close();
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void eliminarAutor (cAutor a){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("DELETE FROM AUTOR WHERE aid = ?");
            p.setInt(1, a.getAid());
            p.execute();
            p.close();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    
    public Object [][] getDatos(){
        int x = 0;
        try{
            con.conectar();
            PreparedStatement p = con.mostrar().prepareStatement("SELECT count(1) aid, nautor, ap, am FROM AUTOR");
            ResultSet r = p.executeQuery();
            r.next();
            x = r.getInt("total");
            r.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        Object[][] s = new String[x][4];
        
        try{
            con.conectar();
            PreparedStatement p = con.mostrar().prepareStatement("SELECT aid, nautor, ap, am FROM AUTOR ORDER BY aid");
            ResultSet r = p.executeQuery();
            int i = 0;
            while (r.next()){
                s[i][0]= r.getString("aid");
                s[i][1]= r.getString("nautor");
                s[i][2]= r.getString("ap");
                s[i][3]= r.getString("am");
                i++;   
            }
            r.close();
        } catch(SQLException e){
            System.out.println(e);
        }
        return s;
    }
    
    
}
