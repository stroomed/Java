
package BD;

import Clases.cIdioma;
import java.sql.*;
import java.util.*;

public class Idioma extends cIdioma{
    Conexion con;
    
    public Idioma(){
        con = new Conexion();
    }
    
    public void agregarIdioma(cIdioma i){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("INSERT INTO IDIOMA (nidioma) VALUES (?)");
            p.setString(1, i.getNidioma());
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
            PreparedStatement p = con.mostrar().prepareStatement("SELECT count(1) iid, nidioma FROM IDIOMA");
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
            PreparedStatement p = con.mostrar().prepareStatement("SELECT iid, nidioma FROM IDIOMA ORDER BY iid");
            ResultSet r = p.executeQuery();
            int i = 0;
            while (r.next()){
                s[i][0]= r.getString("iid");
                s[i][1]= r.getString("nidioma");
                i++;   
            }
            r.close();
        } catch(SQLException e){
            System.out.println(e);
        }
        return s;
    }
    
}
