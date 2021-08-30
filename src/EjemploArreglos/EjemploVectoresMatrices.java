/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploArreglos;

/**
 *
 * @author jairo
 */
public class EjemploVectoresMatrices {
    public static void main(String[] args) {
        
        int [] numeros = new int[10]; // definicion de vector de tamaño 10, de tipo entero
        
        int[] digitos = {0,1,2,3,4,5,6,7,8,9}; // inicializador de arreglo
        System.out.print("Vector de digitos: ");
        imprimirArreglo(digitos);
        
        int[] numerosImpares = new int[10];
        inicializarArreglo(numerosImpares);
        System.out.print("Vector de impares: ");
        imprimirArreglo(numerosImpares);
        
        String[][] nombres = {{"Jairo", "Seoanes", "Leon"},
                              {"Luis", "Diaz"},
                              {"Radamel", "Falcao"}
                             };
        imprimirMatriz(nombres);
    }
    
    public static void imprimirMatriz(String[][] lista){
        for(int i=0; i<lista.length;i++){
            for(int j=0; j<lista[i].length;j++){
                System.out.print(lista[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
    public static void inicializarArreglo(int[] lista){
        for(int i=0; i<lista.length;i++){
            int n = (int)(Math.random()*100);
            lista[i] = 2*(n) - 1;
        }
    }
    
    public static void imprimirArreglo(int[] lista){
        for(int i=0; i<lista.length; i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println("");
    }
    
}
