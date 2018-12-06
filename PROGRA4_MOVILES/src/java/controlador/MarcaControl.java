package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.MarcaDao;
import modelo.entidad.Marca;

@ManagedBean
@ViewScoped
public class MarcaControl {

    private List<Marca> listaMarcas;
    private Marca marca;

    public MarcaControl() {
    }

    public List<Marca> getListaMarcas() {
        MarcaDao ud = new MarcaDao();
        listaMarcas = ud.listarMarcas();
        return listaMarcas;
    }

    public void setListaMarcas(List<Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void limpiarMarca() {
        marca = new Marca();
    }

    public void agregarMarca() {
        MarcaDao ud = new MarcaDao();
        ud.agregar(marca);
    }

    public void modificarMarca() {
        MarcaDao ud = new MarcaDao();
        ud.modificar(marca);
        limpiarMarca();
    }

    public void eliminarMarca() {
        MarcaDao ud = new MarcaDao();
        ud.eliminar(marca);
        limpiarMarca();
    }
}