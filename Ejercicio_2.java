
package com.mycompany.ejercicios_inicios;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*
                2- Pedir cuatro números enteros y escribir su producto, suma y media aritmética
        */
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int a= teclado.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        int b= teclado.nextInt();
        
        
        System.out.println("Introduce el tercero número: ");
        int c= teclado.nextInt();
        
        System.out.println("Introduce el cuarto número: ");
        int d= teclado.nextInt();
        
        int producto= a * b * c * d;
        
        int suma= a * b * c * d;
        
        int mediaAritmetica= a + b + c + d / 4;
        
        System.out.println("El producto: " + producto + '\n' + "La suma es: " + suma + '\n' + "La media aritmetica es: " + mediaAritmetica );
    }
}
