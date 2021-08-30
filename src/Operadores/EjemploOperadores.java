
package Operadores;

import java.util.Scanner;

public class EjemploOperadores {
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Lea un numero: ");
        int x=entrada.nextInt();
        System.out.print("Lea otro numero: ");
        int y=entrada.nextInt();
        
        System.out.printf("La suma de %d y %d = %d%n",x, y,  suma(x,y));
        System.out.printf("La resta de %d y %d = %d%n",x, y,  resta(x,y));
        System.out.printf("La multiplicacion de %d y %d = %d%n",x, y,  multiplicacion(x,y));
        System.out.printf("La division de %d y %d = %d%n",x, y,  divisionEntera(x,y));               
        System.out.printf("La division de %d y %d = %.2f%n",x, y,  divisionExacta(x,y));    
        System.out.printf("El numero mayor entre  %d y %d es %d%n",x, y,  numeroMayor(x,y));    
        System.out.printf("El numero %d es %s al numero %d%n",x, compararNumeros(x,y),y );     
    }
    
    public static int suma(int a, int b){
        return a + b;
    }
    
    public static int resta(int a, int b){
        return a - b;
    }
    
    public static int multiplicacion(int a, int b){
        return a * b;
    }
    
    public static int divisionEntera(int a, int b){
        return a / b;
    }
    
    public static double divisionExacta(int a, int b){
        return (double)a / b; // casting
    }
    
    public static int numeroMayor(int a, int b){
        
        int mayor = (a>=b)? a:b; // ternario
        return mayor;
    }
    
    public static String compararNumeros(int a, int b){
        String res = (a==b)?"Igual":"Diferente";
        return res;
    }
    
}
