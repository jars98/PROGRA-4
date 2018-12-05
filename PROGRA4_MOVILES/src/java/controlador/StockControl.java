/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Ismael
 */
@Named(value = "stockControl")
@Dependent
public class StockControl {

    /**
     * Creates a new instance of StockControl
     */
    public StockControl() {
    }
    
}
