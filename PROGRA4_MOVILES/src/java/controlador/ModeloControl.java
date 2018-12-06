package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.ModeloDao;
import modelo.entidad.Modelo;

@ManagedBean
@ViewScoped
public class ModeloControl {

    private List<Modelo> listaModelos;
    private Modelo modelos;

    public ModeloControl() {
    }

    public List<Modelo> getListaModelos() {
        ModeloDao ud = new ModeloDao();
        listaModelos = ud.listarModelo();
        return listaModelos;
    }

    public void setListaModelo(List<Modelo> listaModelo) {
        this.listaModelos = listaModelo;
    }

    public Modelo getModelos() {
        return modelos;
    }

    public void setModelos(Modelo modelos) {
        this.modelos = modelos;
    }

    public void limpiarModelos() {
        modelos = new Modelo();
    }

    public void agregarModelos() {
        ModeloDao ud = new ModeloDao();
        ud.agregar(modelos);
    }

    public void modificarModelos() {
        ModeloDao ud = new ModeloDao();
        ud.modificar(modelos);
        limpiarModelos();
    }

    public void eliminarModelos() {
        ModeloDao ud = new ModeloDao();
        ud.eliminar(modelos);
        limpiarModelos();
    }
}
