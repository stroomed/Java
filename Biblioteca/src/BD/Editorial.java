
package BD;
import Clases.cEditorial;
import java.sql.*;
import java.util.*;

public class Editorial extends cEditorial{
    Conexion con;
    public Editorial(){
        con = new Conexion();
    }
    
    public void agregarEditorial (cEditorial e){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("INSERT INTO EDITORIAL (neditorial) VALUES (?)");
            p.setString(1, e.getNeditorial());
            p.execute();
            p.close();
        } catch (SQLException se){
            System.out.println(se);
        }
    }
    
    public Object [][] getDatos(){
        int x = 0;
        try{
            con.conectar();
            PreparedStatement p = con.mostrar().prepareStatement("SELECT count(1) eid, neditorial FROM EDITORIAL");
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
            PreparedStatement p = con.mostrar().prepareStatement("SELECT eid, ncategoria FROM EDITORIAL ORDER BY eid");
            ResultSet r = p.executeQuery();
            int i = 0;
            while (r.next()){
                s[i][0]= r.getString("eid");
                s[i][1]= r.getString("neditorial");
                i++;   
            }
            r.close();
        } catch(SQLException e){
            System.out.println(e);
        }
        return s;
    }
    
}
