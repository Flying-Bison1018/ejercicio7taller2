/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.vectores;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Ejercicio7Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int [10];
        int mayor,contador=0,numero=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese numeros al vector[Max <- 10]");
        mayor = vector[0];
        for (int i=0; i<10; i++)
        {
            vector[i]= entrada.nextInt();
            contador = contador+1;
            numero = vector[i];
            
             if (vector[i]>mayor)
             {
                 mayor = vector[i];
             }
        }

        for (int i=0; i<10; i++)
        {
            System.out.print(vector[i]+" ");
        }
         System.out.println("el mayor es: " +mayor);
         System.out.println("contador: "+contador);
         System.out.println("el numero mas reciente es:"+numero);
       
        // TODO code application logic here
    }
    
}
