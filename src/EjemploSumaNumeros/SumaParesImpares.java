/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSumaNumeros;

/**
 *
 * @author jairo
 */
public class SumaParesImpares {
    public static void main(String[] args) {
        int n=5;
        sumaParesImpares(n);
        
    }
    
    public static void sumaParesImpares(int n){
        
        int sumaPares = 0;
        int sumaImpares=0;
        int i = 1;
        while(i<=n){
            sumaPares = sumaPares +  2*(i - 1);
            sumaImpares+= 2*i - 1;
            i++;
        }
        
        System.out.println("Suma Pares: " + sumaPares);
        System.out.println("Suma Impares: " + sumaImpares);
        
    }
}
