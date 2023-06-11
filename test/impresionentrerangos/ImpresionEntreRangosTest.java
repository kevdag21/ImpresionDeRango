package impresionentrerangos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author kevindominguez
 */
public class ImpresionEntreRangosTest {

    /**
     * Test of main method, of class ImpresionEntreRangos.
     */
    @org.junit.Test
    public void testMain() {
        int[] resultado = ImpresionEntreRangos.imprimirNumerosPares(3, 8);
        int[] esperado = {4, 6};
        Assertions.assertArrayEquals(esperado, resultado);
        
        int[] resultado2 = ImpresionEntreRangos.imprimirNumerosPares(9,10);
        int[] esperado2 = {};
        Assertions.assertArrayEquals(esperado2, resultado2);
    }

}
