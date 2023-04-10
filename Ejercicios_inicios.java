package com.mycompany.ejercicios_inicios;

import java.util.Scanner;

public class Ejercicios_inicios {

    public static void main(String[] args) {
        /*
        Para cada uno de los siguientes problemas escribir e implementar en python el 
        pseudocódigo y el diagrama de flujo de un programa que lo resuelva.

        1- Pedir la base y la altura de un triángulo y escribir su superficie

        2- Pedir cuatro números enteros y escribir su producto, suma y media aritmética

        3- Pedir el peso de un hombre en libras y escribirlo en kilogramos

        */
        
        //base=3, altura= 2.6
        Scanner teclado= new Scanner(System.in);
        float base; 
        float altura;
        
        System.out.println("Introduce el primer valor: ");
        base= teclado.nextFloat();
        System.out.println("Introduce el segundo valor: ");
        altura= teclado.nextFloat();
        
        float superficie= (base * altura) /2;
        System.out.println("El resultado es " + superficie);
        
        
       
        
        //System.out.println("La superficie es " + resultado);
        
        
    }
}
