/*Desarrolle un algoritmo para el cálculo del salario de un trabajador. El importe
liquidado (sueldo) depende la una tarifa o precio por hora establecida y de un
condicionante sobre las horas trabajadas: si la cantidad de horas trabajadas es mayor a
40 horas, la tarifa se incrementa en un 50% para las horas extras. Calcular el sueldo
recibido por el trabajador en base las horas trabajadas y la tarifa. Utilice las
instrucciones LEER HORASTRABAJADAS y LEER TARIFA al inicio del programa para
cargar los valores en las variables HORASTRABAJADAS y TARIFA.*/
package ejercicio_problema;

import java.util.Scanner;


public class Ejercicio_problema {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        System.out.println("Leer horas trabajadas: ");
        horas = entrada.nextInt();

        float tarifa;
        System.out.println("Leer tarifa: ");
        tarifa = entrada.nextFloat();

        float sueldo;
       
        if(horas > 40 == 0){
            int horasExtra = horas - 40;
            float nuevaTarifa;
            nuevaTarifa = tarifa + (tarifa * 0.50);
            sueldo = horas * tarifa + horasExtra * nuevaTarifa;
            System.out.println("Sueldo trabajador: " + sueldo);

            }
        
        else{
            sueldo = horas * tarifa;
            System.out.println("Sueldo trabajador: " + sueldo);
        }
    }
}
    

