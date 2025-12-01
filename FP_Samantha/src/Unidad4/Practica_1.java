
package Unidad4;

import java.util.Scanner;


public class Practica_1 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        float c1, c2, c3, promedio;
        System.out.println("Dame tres calificaciones");
        c1=leer.nextFloat();
        c2=leer.nextFloat();
        c3=leer.nextFloat();
        
        promedio = (c1+c2+c3)/3;
        if (promedio>=70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Complementacion");
        }
        
    }
    
}
