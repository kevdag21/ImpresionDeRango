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
        int[] resultado = ImpresionEntreRangos.imprimirNumeros(2, 6);
        int[] esperado = {3, 4, 5};
        Assertions.assertArrayEquals(esperado, resultado);
    }

}
