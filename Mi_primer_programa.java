package com.mycompany.ejercicios_inicios;

public class Mi_primer_programa {
    //metodo principal
    public static void main(String[] args) {
        //llama al objeto
        Ejemplo_while();
        Ejemplo_do_while();
        Ejemplo_for();   
        ForBreak();
        ForContinua();
    }
    
    //funcion
    public static void Ejemplo_while() {
        int i= 1;
        
        while(i<=5) {
            System.out.println(i);
            i++;
            
        }
    }
    
        public static void Ejemplo_do_while() {
            int j= 1;
            do {
                System.out.println(j);
                j++;
            } while (j<=5);
    }
     
    
        public static void Ejemplo_for() {
        System.out.println("For");
        for (int k=1; k<= 5; k++){
            System.out.println(k);
            k++;
            
        }
    }
    public static void ForBreak() {
        System.out.println("ForBreak");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println(i);
                break;
            }

        }
    }
       
    public static void ForContinua() {
        System.out.println("ForBreak");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
    }
    
    
    

    
    
    
}
