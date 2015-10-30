package ort.isagil.nsixa;

import static org.junit.Assert.*;
import cucumber.api.java.es.*;
// agregando un comentario
public class OrderTaxesStepDef {
    
    private CalculadorPrecio calc;
    int result;
    
    @Dado("^la cantidad de items (\\d+) y su precio (\\d+)$")
    public void dadasLaCantidadDeItemsYSuPrecio(int items,
                                                int precio) 
            throws Throwable {
        calc = new CalculadorPrecio();
        calc.setItems(items, precio);
    }
    
    @Cuando("^el valor de orden con impuestos para \"(.*?)\" y descuentos (\\d+)$")
    public void calculo(String pais , int desc) throws Throwable {
        int imp = calc.obtenerImpuesto(pais);
        result = calc.calcular(imp, desc);
    }

    @Entonces("^retorno (\\d+)$")
    public void retornoTotal(int montoEsperado) throws Throwable {
        assertEquals(montoEsperado , result);
    }
}