
package Clases;

public class Correo {
    
    private int rut;
    private String email;

    public Correo(int rut, String digV, String email) {
        this.rut = rut;

        this.email = email;
    }

    public Correo() {
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
