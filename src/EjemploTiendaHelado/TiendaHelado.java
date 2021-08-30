/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploTiendaHelado;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class TiendaHelado {
    public static void main(String[] args) {
       
      Scanner entrada = new Scanner(System.in);  
      System.out.print("Valor Compra: ");
      double valorCompra = entrada.nextDouble();
      System.out.print("Tipo membresia: ");
      char membresia = entrada.next().toUpperCase().charAt(0);
      double valorDescuento = calcularDescuento(valorCompra, membresia);
      System.out.println("Descuento: " + valorDescuento);
      System.out.println("Valor final compra: " + (valorCompra - valorDescuento));
        
    }
    
    public static double calcularDescuento(double valorCompra, char membresia){
        double descuento=0;
        switch(membresia){
            case 'A': descuento = valorCompra*0.1; 
                      break;
            case 'B': descuento = valorCompra*0.15; 
                      break;
            case 'C': descuento = valorCompra*0.2; 
                      break;
        }
        return descuento;
    }
}
