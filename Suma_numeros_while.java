package com.mycompany.ejercicios_inicios;

import java.util.Scanner;

public class Suma_numeros_while {

    public static void main(String[] args) {
        /*
Suma de números. Programa que utilice un bucle while para sumar números enteros 
positivos ingresados por el usuario. El bucle termina cuando se ingresa un número negativo.        
         */

        Scanner teclado = new Scanner(System.in);
        int num1;
        int sum = 0;

        while (sum >= 0) {
            System.out.println("Introduzca el número: ");
            num1 = teclado.nextInt();
            sum += num1;
            System.out.println("La suma es:  " + sum);

            if (num1 == 0) {
                break;
            }
        }

    }

}
