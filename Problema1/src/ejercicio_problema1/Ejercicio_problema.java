/*Escriba un algoritmo que lea un número entero y determine si es par o impar. Si es par,
que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero. Si
es impar, que escriba todos los impares de manera descendiente desde si sí mismo
hasta el uno. Utilice la instrucción LEER NUMERO al inicio del programa para cargar un
número en la variable NUMERO.*/
package ejercicio_problema;

import java.util.Scanner;


public class Ejercicio_problema {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Leer número: ");
        numero = entrada.nextInt();

       
        if(numero % 2 == 0){
	        System.out.println(numero + " es par" );
            for(int i=numero; i>=0; i-=2) {
                System.out.println(numero-2);
            }
        }
	    else{
	        printf(numero + " es impar");
            for(int i=numero; i>=0; i-=2) {
                System.out.println(numero-2);
            }
        }
    }
    
}
