package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.StockDao;
import modelo.entidad.Stock;

@ManagedBean
@ViewScoped
public class StockControl {

    private List<Stock> listaStock;
    private Stock stock;

    public StockControl() {
    }

    public List<Stock> getListaStock() {
        StockDao ud = new StockDao();
        listaStock = ud.listarStock();
        return listaStock;
    }

    public void setListaStock(List<Stock> listaStock) {
        this.listaStock = listaStock;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void limpiarStock() {
        stock = new Stock();
    }

    public void agregarStock() {
        StockDao ud = new StockDao();
        ud.agregar(stock);
    }

    public void modificarStock() {
        StockDao ud = new StockDao();
        ud.modificar(stock);
        limpiarStock();
    }

    public void eliminarStock() {
        StockDao ud = new StockDao();
        ud.eliminar(stock);
        limpiarStock();
    }
}
