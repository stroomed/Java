
package BD;

import Clases.cCategoria;
import java.sql.*;

public class Categoria extends cCategoria{
    Conexion con;
    
    public Categoria(){
        con = new Conexion();
    }
    
    public void agregarCategoria(cCategoria cc){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("INSERT INTO CATEGORIA (ncategoria) VALUES (?)");
            p.setString(1, cc.getNcategoria());
            p.execute();
            p.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public Object [][] getDatos(){
        int x = 0;
        try{
            con.conectar();
            PreparedStatement p = con.mostrar().prepareStatement("SELECT count(1) cid, ncategoria FROM CATEGORIA");
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
            PreparedStatement p = con.mostrar().prepareStatement("SELECT cid, ncategoria FROM CATEGORIA ORDER BY cid");
            ResultSet r = p.executeQuery();
            int i = 0;
            while (r.next()){
                s[i][0]= r.getString("cid");
                s[i][1]= r.getString("ncategoria");
                i++;   
            }
            r.close();
        } catch(SQLException e){
            System.out.println(e);
        }
        return s;
    }
}
