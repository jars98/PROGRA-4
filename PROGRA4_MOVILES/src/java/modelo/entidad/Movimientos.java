package modelo.entidad;
// Generated 04-dic-2018 22:25:21 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Movimientos generated by hbm2java
 */
public class Movimientos  implements java.io.Serializable {


     private Integer idmovimiento;
     private Stock stock;
     private Usuario usuario;
     private String tipo;
     private Date fecha;

    public Movimientos() {
    }

    public Movimientos(Stock stock, Usuario usuario, String tipo, Date fecha) {
       this.stock = stock;
       this.usuario = usuario;
       this.tipo = tipo;
       this.fecha = fecha;
    }
   
    public Integer getIdmovimiento() {
        return this.idmovimiento;
    }
    
    public void setIdmovimiento(Integer idmovimiento) {
        this.idmovimiento = idmovimiento;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}


