package com.mycompany.ejercicios_inicios;

import java.util.Random;
import java.util.Scanner;

public class Adivinar_numero {

    public static void main(String[] args) {
        /*
Adivinar un número. Programa que utilice un bucle while 
para que el usuario adivine un número generado 
aleatoriamente entre 1 y 100. El programa le da pistas 
al usuario indicando si el número ingresado es mayor o 
menor que el número secreto.
         */

        Random constructor_random = new Random();
        int numeroAleatorio = constructor_random.nextInt(100) + 1;
        Scanner teclado= new Scanner(System.in);
        //System.out.println(numeroAleatorio);

        while (numeroAleatorio != 0) {
            System.out.println("Introduce el número: ");
            int valorUsuario= teclado.nextInt();
            
            //condicional 
            
            
        }
    }

}
