/*Escriba un algoritmo que visualice una clasificación de 50 personas según edad y sexo.
Deberá mostrar los siguientes resultados:
a. Cantidad de personas mayores de edad (18 años o más).
b. Cantidad de personas menores de edad.
c. Cantidad de personas masculinas mayores de edad.
d. Cantidad de personas femeninas menores de edad.
e. Porcentaje que representan las personas mayores de edad respecto al total de
personas.
f. Porcentaje que representan las mujeres respecto al total de personas.
Utilice la instrucción LEER PERSONAS al inicio del programa para cargar los datos de las
50 personas en un variable, PERSONAS, que actúa como un vector de 50 posiciones.
Cada elemento de PERSONAS es de un tipo estructurado que dispone dos campos:
SEXO y EDAD.*/

package ejercicio_problema;

import java.util.Scanner;


public class Ejercicio_problema {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double kg;
        string sexo;
        int edad;
        int[] sexoPersonas = new int [50];
        int[] edadPersonas = new int [50];

        System.out.println("Leer personas: ");

        System.out.println("Sexo:");
        System.out.println("1. Masculino");
        System.out.println("2. Femenino");
        for(int i=0; i<= 50; i++){
            sexoPersonas[i] = entrada.nextInt();
            switch (sexoPersonas){
                case 1:
                    sexoPeronas = 1;
                    break;
                case 2:
                    sexoPeronas = 2;
                    break;
                default: System.out.println("El numero digitado no es correcto. ");    
            }
        }

        System.out.println("Edad:");
        for(int i=0; i<= 50; i++){
            edadPersonas[i] = entrada.nextInt();
        }
        
        int contMayorEdadMasc = 0;
        int contMenorEdadFem = 0;
        int contMayoresEdad = 0;
        int contFem = 0;

        for(int i=0; i<= 50; i++){
            if(edadPersonas[i] >= 18){
                contMayoresEdad++;
                if(sexoPersonas[i] = 1){
                    contMayorEdadMasc++;
                }
            }
            else{
                if(sexoPersonas[i] = 2){
                    contMenorEdadFem++;
                }
            }
            if(sexoPersonas[i] = 2){
                contFem++;
            }
        }


        System.out.println("Cantidad de personas mayores de edad (18 anyos o mas): " + contMayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + (50-contMayoresEdad));
        System.out.println("Cantidad de personas masculinas mayores de edad: " + contMayorEdadMasc);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + contMenorEdadFem);
        System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + (contMayoresEdad/50)*100 + " %");
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas: " + (contFem/50)*100 + " %");
        
    }
    
}
