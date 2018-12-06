package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.UsuarioDao;
import modelo.entidad.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioControl {

    private List<Usuario> listaUsuarios;
    private Usuario usuario;

    public UsuarioControl() {
    }

    public List<Usuario> getListaUsuarios() {
        UsuarioDao ud = new UsuarioDao();
        listaUsuarios = ud.listarUsuarios();
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void limpiarUsuario() {
        usuario = new Usuario();
    }

    public void agregarUsuario() {
        UsuarioDao ud = new UsuarioDao();
        ud.agregar(usuario);
    }

    public void modificarUsuario() {
        UsuarioDao ud = new UsuarioDao();
        ud.modificar(usuario);
        limpiarUsuario();
    }

    public void eliminarUsuario() {
        UsuarioDao ud = new UsuarioDao();
        ud.eliminar(usuario);
        limpiarUsuario();
    }
}
