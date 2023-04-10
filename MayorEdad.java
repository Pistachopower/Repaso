/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios_inicios;

import java.util.Scanner;

/**
 *
 * @author alumnado
 */
public class MayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int num = input.nextInt();

        if (num >= 18) {
            System.out.println("Eres mayor de edad ");
        } else if (num < 18) {
            System.out.println("Eres menor edad");
        }
    }

}
