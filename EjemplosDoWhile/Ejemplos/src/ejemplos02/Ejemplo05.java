/*
 Este programa genera el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia = 3

 Agregar los cambios necesarios para que tanto número y potencia 
 sean ingresados por teclado por el usuario.
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        int potencia;
        int resultado;      
        int contador = 1;
        
        System.out.println("Ingrese el numero base");
            numero = entrada.nextInt();
            System.out.println("Ingrese la potencia");
            potencia = entrada.nextInt();
        do {  
            resultado = numero * potencia;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("\nEL RESULTADO ES :%d\n", resultado);
    }
}
