
package BD;

import Clases.cDistribuidor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Distribuidor extends cDistribuidor{
    Conexion con;
    
    public Distribuidor(){
        con = new Conexion();
    }
    
    public void agregarDistribuidor (cDistribuidor d){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("INSERT INTO DISTRIBUIDOR(rdistribuidor, ndistribuidor, ddistribuidor, tdistribuidor, adistribuidor) VALUES (?, ?, ?, ?, ?)");
            p.setString(1, d.getRut());
            p.setString(2, d.getNombre());
            p.setString(3, d.getDireccion());
            p.setInt(4, d.getTelefono());
            p.setInt(5, d.getAnio());
            p.execute();
            p.close();
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void modificarDistribuidor (cDistribuidor d){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("UPDATE DISTRIBUIDOR SET ndistribuidor = ?, SET ddistribuidor = ?, SET tdistribuidor = ?, SET adistribuidor WHERE rdistribuidor = ?");
            p.setString(1, d.getNombre());
            p.setString(2, d.getDireccion());
            p.setInt(3, d.getTelefono());
            p.setInt(4, d.getAnio());
            p.setString(5, d.getRut());
            p.execute();
            p.close();
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void eliminarDistribuidor (cDistribuidor d){
        try{
            PreparedStatement p = con.mostrar().prepareStatement("DELETE FROM DISTRIBUIDOR WHERE rdistribuidor = ?");
            p.setString(1, d.getRut());
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
            PreparedStatement p = con.mostrar().prepareStatement("SELECT count(1) rdistribuidor, ndistribuidor, ddistribuidor, tdistribuidor, adistribuidor FROM DISTRIBUIDOR");
            ResultSet r = p.executeQuery();
            r.next();
            x = r.getInt("total");
            r.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        Object[][] s = new String[x][5];
        
        try{
            con.conectar();
            PreparedStatement p = con.mostrar().prepareStatement("SELECT rdistribuidor, ndistribuidor, ddistribuidor, tdistribuidor, adistribuidor FROM DISTRIBUIDOR ORDER BY rdistribuidor");
            ResultSet r = p.executeQuery();
            int i = 0;
            while (r.next()){
                s[i][0]= r.getString("rdistribuidor");
                s[i][1]= r.getString("ndistribuidor");
                s[i][2]= r.getString("ddistribuidor");
                s[i][3]= r.getString("tdistribuidor");
                s[i][4]= r.getString("adistribuidor");
                i++;   
            }
            r.close();
        } catch(SQLException e){
            System.out.println(e);
        }
        return s;
    }
    
    
}
