package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.MovimientosDao;
import modelo.entidad.Movimientos;

@ManagedBean
@ViewScoped
public class MovimientosControl {

    private List<Movimientos> listaMovimientoss;
    private Movimientos movimiento;

    public MovimientosControl() {
    }

    public List<Movimientos> getListaMovimientoss() {
        MovimientosDao ud = new MovimientosDao();
        listaMovimientoss = ud.listarMovimientos();
        return listaMovimientoss;
    }

    public void setListaMovimientoss(List<Movimientos> listaMovimientoss) {
        this.listaMovimientoss = listaMovimientoss;
    }

    public Movimientos getMovimientos() {
        return movimiento;
    }

    public void setMovimientos(Movimientos movimiento) {
        this.movimiento = movimiento;
    }

    public void limpiarMovimientos() {
        movimiento = new Movimientos();
    }

    public void agregarMovimientos() {
        MovimientosDao ud = new MovimientosDao();
        ud.agregar(movimiento);
    }

    public void modificarMovimientos() {
        MovimientosDao ud = new MovimientosDao();
        ud.modificar(movimiento);
        limpiarMovimientos();
    }

    public void eliminarMovimientos() {
        MovimientosDao ud = new MovimientosDao();
        ud.eliminar(movimiento);
        limpiarMovimientos();
    }
}
