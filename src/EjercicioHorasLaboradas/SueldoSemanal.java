/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioHorasLaboradas;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class SueldoSemanal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Registra las horas laboradas en la semana: ");
        int n = entrada.nextInt();
        double salario= sueldoSemanal(n);
        System.out.println("Salario Semanal: " + salario);
        
    }
    
    public static double sueldoSemanal(int nHorasLaboradas){
        final int nHorasJornadaTrabajo = 40;
        final double pagoHoraNormal = 20;
        final double pagoHoraExtra = 25;
        
        int horasExtras = 0;
        if(nHorasLaboradas>nHorasJornadaTrabajo){
            horasExtras = nHorasLaboradas - nHorasJornadaTrabajo;
        }
        
        double valorHorasExtras = horasExtras * pagoHoraExtra;
        double valorHorasNormal = (nHorasLaboradas - horasExtras) * pagoHoraNormal;
        
        return valorHorasNormal + valorHorasExtras;
    }
}
