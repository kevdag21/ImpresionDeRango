package impresionentrerangos;

import java.util.Scanner;

/**
 *
 * @author kevindominguez
 */

/**
 * Esta clase permite obtener los números en un rango específico, excluyendo los límites del rango.
 */
public class ImpresionEntreRangos {
    
     /**
     * Método principal que lee dos números desde la consola, obtiene los números en el rango especificado
     * y los imprime.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el rango menor: ");
        int rangoMenor = scanner.nextInt();

        System.out.print("Ingrese el rango mayor: ");
        int rangoMayor = scanner.nextInt();

        int[] numerosEnRango = imprimirNumeros(rangoMenor, rangoMayor);

        System.out.println("Los números entre " + rangoMenor + " y " + rangoMayor + " son:");
        for (int numero : numerosEnRango) {
            System.out.println(numero);
        }
        
    }
    
    /**
     * Método que devuelve un arreglo de enteros con los números en el rango especificado,
     * excluyendo los límites del rango.
     *
     * @param rangoMenor El número menor del rango.
     * @param rangoMayor El número mayor del rango.
     * @return Un arreglo de enteros con los números en el rango especificado.
     */
        
      public static int[] imprimirNumeros ( int rangoMenor, int rangoMayor ){
        int[] numeros;
        if (rangoMenor > rangoMayor) {
            int temp = rangoMenor;
            rangoMenor = rangoMayor;
            rangoMayor = temp;
        }

        // Validar si no hay números en el rango
        if (rangoMenor + 1 >= rangoMayor) {
            return new int[0]; 
        }

        // Crear el arreglo con los números en el rango
        numeros = new int[rangoMayor - rangoMenor - 1];
        for (int i = rangoMenor + 1; i < rangoMayor; i++) {
            numeros[i - rangoMenor - 1] = i;
        }

        return numeros;
    }
}
