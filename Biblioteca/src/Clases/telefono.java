
package Clases;

public class telefono {
    
    private int rut;
    private String digV;
    private int telefono;

    public telefono(int rut, String digV, int telefono) {
        this.rut = rut;
        this.digV = digV;
        this.telefono = telefono;
    }

    public telefono() {
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDigV() {
        return digV;
    }

    public void setDigV(String digV) {
        this.digV = digV;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
