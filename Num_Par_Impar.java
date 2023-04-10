package com.mycompany.ejercicios_inicios;

import java.util.Scanner;

public class Num_Par_Impar {

    public static void main(String[] args) {
        /*
Contador de números pares e impares. Programa que 
utilice un bucle while para contar cuántos números 
pares e impares hay en una lista de números enteros 
ingresados por el usuario. El bucle termina cuando 
se ingresa un cero.   
        
         */
        Scanner teclado = new Scanner(System.in);
        int num1 = 1;
        int par = 0;
        int impar = 0;

        while (num1 != 0) {
            System.out.println("Introduzca el número: ");
            num1 = teclado.nextInt();

            if (num1 % 2 == 0) {
                par += num1;
            } else {
                impar += num1;
            }

            System.out.println("La suma par es :  " + par + " .La suma impar es : " + impar);
        }
    }
}
