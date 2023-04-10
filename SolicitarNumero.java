
package com.mycompany.ejercicios_inicios;

import java.util.Scanner;

public class SolicitarNumero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num= input.nextInt();
        
        if (num> 0) {
            System.out.println("El número es positivo ");
        }
        else if (num < 0) {
            System.out.println("El número es negativo ");
        }
        else{
            System.out.println("El número es cero ");
        }
    }
    
}
