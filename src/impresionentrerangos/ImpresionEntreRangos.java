package impresionentrerangos;

import java.util.Scanner;

/**
 *
 * @author kevindominguez
 */

/**
 * Esta clase permite obtener los números en un rango específico, excluyendo los
 * límites del rango.
 */
public class ImpresionEntreRangos {

    /**
     * Método principal que lee dos números desde la consola, obtiene los
     * números en el rango especificado y los imprime.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el rango menor: ");
        int rangoMenor = scanner.nextInt();

        System.out.print("Ingrese el rango mayor: ");
        int rangoMayor = scanner.nextInt();

        int[] numerosEnRango = imprimirNumerosPares(rangoMenor, rangoMayor);

        if (numerosEnRango.length == 0) {
            System.out.println("Sin rango");
            return;
        }

        System.out.println("Los números entre " + rangoMenor + " y " + rangoMayor + " son:");
        for (int numero : numerosEnRango) {
            System.out.println(numero);
        }

    }

    /**
     * Método que devuelve un arreglo de pares enteros con los números en el
     * rango especificado, excluyendo los límites del rango.
     *
     * @param rangoMenor El número menor del rango.
     * @param rangoMayor El número mayor del rango.
     * @return Un arreglo de enteros con los números pares en el rango
     * especificado.
     */
    public static int[] imprimirNumerosPares(int rangoMenor, int rangoMayor) {
        int[] numeros;
        if (rangoMenor > rangoMayor) {
            int temp = rangoMenor;
            rangoMenor = rangoMayor;
            rangoMayor = temp;
        }

        // Validar si no hay números pares en el rango
        if (rangoMenor % 2 != 0) {
            rangoMenor++;
        }
        if (rangoMenor >= rangoMayor) {
            return new int[0]; // Retorna un arreglo vacío
        }

        // Calcular la cantidad de números pares en el rango
        int cantidadNumerosPares = (rangoMayor - rangoMenor) / 2;

        // Crear el arreglo con los números pares en el rango
        int[] numerosPares = new int[cantidadNumerosPares];
        for (int i = 0; i < cantidadNumerosPares; i++) {
            numerosPares[i] = rangoMenor + 2 * i;
        }

        return numerosPares;
    }
}
