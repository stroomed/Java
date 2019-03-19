
package BD;

import java.sql.*;

public class Conexion {
    
    static String bd = "biblior";
    static String login = "admin";
    static String password = "user";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection conn;
    
    public void conectar(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
        } catch (SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
    }

    public void desconexion(){
        conn = null;
        System.out.println("Conexión a " + bd + " ha finalizado.");
    }
    
    public Connection mostrar(){
        return conn;
    }
    
}
