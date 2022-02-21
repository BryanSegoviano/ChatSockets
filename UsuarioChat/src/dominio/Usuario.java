package dominio;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre;
    private String mensaje;
    private String destinatario;
    private int puerto;

    public Usuario() {
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String mensaje, String destinatario) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    public Usuario(String nombre, String mensaje, String destinatario, int puerto) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.puerto = puerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", mensaje=" + mensaje + ", destinatario=" + destinatario + ", puerto=" + puerto + '}';
    }

}
