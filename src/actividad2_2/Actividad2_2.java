/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Ehuan Cisneros Monica de los A.
 */
public class Actividad2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);   
     System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Pirmer ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");  
        System.out.println(""); 
     System.out.println("suma consecutiva del 0 al 10");
      int fac=1;
      int s=1;
    while (s<10){
    s++;
    System.out.println(s);
    fac=fac*s;
        System.out.println(fac);
    }
    System.out.println("");
     System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Segundo ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");  
        System.out.println(""); 
        
        int fa=1, num, c=1;
        System.out.println("Introduzca un numero");
        num=entrada.nextInt();
        
        while (c<num){
        fa*=c;
        c++;
        }
        System.out.println("El factorial de "+num +" es: "+fa);
        
           System.out.println("");
     System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[Tercer ejercicio]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");  
        System.out.println("");

        
        System.out.print("Introduce. tu primer valor: ");
        int val = 0;
      
        val = entrada.nextInt ( );
        
        System.out.print("Introduce tu segundo valor: ");
        int val3 = 0;
 
        val3 = entrada.nextInt ( );
        
        int suma = val + val3;
        System.out.println("La suma de " + val + "  más " + val3 + " es " + suma);
        
        int promedio = suma / 2;
        
        System.out.println("Tu el promedio es: " + promedio);
        
        if (val > val3) {
            System.out.println(val + " es mayor que " + val3);
        }if (val3 > val) {
            System.out.println(val3 + " es mayor que " + val);
        }if (val == val3) {
            System.out.println("Tus valores son iguales.");
        }
       
        if (val < val3) {
            System.out.println("La distancia numerica es : ");
            int d = val;
        while (d < val3) {
            d++;
            System.out.println(d);
            
          }
        }if (val3 < val) {
            System.out.println("Distancia numerica es: ");
            int e = val3;
            while (e  < val) {
                e++;
                System.out.println(e);
        }
        }
        
        
    }
        
   }
 

