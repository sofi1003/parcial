package model;

public class Trabajador {
    
    private String nombre;
    private String correo;
    private String documento;
    private String password;

    public Trabajador(String userName, String email, String documento, String password) {
        this.documento = documento;
        this.password = password;
    }

    public Trabajador() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    @Override
    public String toString() {
        return "Trabajador{" + "documento=" + documento + ", password=" + password + '}';
    }

    
    
   
}