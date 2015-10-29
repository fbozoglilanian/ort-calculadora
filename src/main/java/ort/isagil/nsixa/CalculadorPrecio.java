/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.isagil.nsixa;

/**
 *
 * @author alumnoFI
 */
class CalculadorPrecio {
    private int items;
    private int precio;

    public CalculadorPrecio() {
    }

    void setItems(int items, int precio) {
        this.items = items;
        this.precio = precio;
    }
    
    int calcular(int imp, int desc) {
        return this.items * this.precio;
    }
    
}
