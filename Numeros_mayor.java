package com.mycompany.ejercicios_inicios;

import java.util.Scanner;
public class Numeros_mayor {

    public static void main(String[] args) {
        /*
Programa que solicita tres números al usuario y determina cuál es el mayor.
        
        
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1= teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2=teclado.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3=teclado.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " es mayor que " + num2 + ' ' + num3);
        
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " es mayor que " + num1 + ' ' + num3);
        
        }else if (num3 > num1 && num3 > num1){
            System.out.println(num3 + " es mayor que " + num1 + ' '  + num2);
        
        }
   

    }

}
