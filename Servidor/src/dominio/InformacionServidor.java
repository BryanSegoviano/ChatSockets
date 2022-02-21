package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class InformacionServidor implements Serializable {
    
    private ArrayList<Usuario> listaUsuarios;
    private Usuario usuario;

    public InformacionServidor() {
    }

    public InformacionServidor(ArrayList<Usuario> listaUsuarios, Usuario usuario) {
        this.listaUsuarios = listaUsuarios;
        this.usuario = usuario;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "InformacionServidor{" + "listaUsuarios=" + listaUsuarios + ", usuario=" + usuario + '}';
    }
    
}
