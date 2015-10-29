package ort.isagil.nsixa;

import static org.junit.Assert.*;
import cucumber.api.java.es.*;
// agregando un comentario
public class OrderValueStepDef {
    
    private CalculadorPrecio calc;
    int result;
    
    @Dado("^la cantidad de items (\\d+) y su precio (\\d+)$")
    public void dadasLaCantidadDeItemsYSuPrecio(int items,
                                                int precio) throws Throwable {
        calc = new CalculadorPrecio();
        calc.setItems(items, precio);
    }

    @Cuando("^calculo el valor de orden sin impuestos (\\d+) ni descuentos (\\d+)$")
    public void calculo(int imp , int desc) throws Throwable {        
        result = calc.calcular(imp, desc);
    }

    @Entonces("^retorno (\\d+)$")
    public void retornoTotal(int montoEsperado) throws Throwable {
        assertEquals(montoEsperado , result);
    }
}