package modelo.entidad;
// Generated 04-dic-2018 22:25:21 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marca generated by hbm2java
 */
public class Marca  implements java.io.Serializable {


     private Integer idmarca;
     private String nombre;
     private Set<Modelo> modelos = new HashSet<Modelo>(0);
     private Set<Stock> stocks = new HashSet<Stock>(0);

    public Marca() {
    }

	
    public Marca(String nombre) {
        this.nombre = nombre;
    }
    public Marca(String nombre, Set<Modelo> modelos, Set<Stock> stocks) {
       this.nombre = nombre;
       this.modelos = modelos;
       this.stocks = stocks;
    }
   
    public Integer getIdmarca() {
        return this.idmarca;
    }
    
    public void setIdmarca(Integer idmarca) {
        this.idmarca = idmarca;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Modelo> getModelos() {
        return this.modelos;
    }
    
    public void setModelos(Set<Modelo> modelos) {
        this.modelos = modelos;
    }
    public Set<Stock> getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }




}

