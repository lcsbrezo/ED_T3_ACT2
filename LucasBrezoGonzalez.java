/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejemplos;

import java.util.Scanner;

/**
 *
 * @author bregonlu
 */
public class DiasDelMes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Escriba el numero de mes y le dire cuantos dias tiene: ");
        int numeroMes=sc.nextInt();
        int diasMeses = (numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) ? 31
                :(numeroMes == 4 || numeroMes == 6 || numeroMes == 9|| numeroMes == 11) ? 30 
                :(numeroMes == 2)? 28
                :-1;
        
        String mensajeSalida = (numeroMes == -1) ? "Mes fuera del rango (1,12)." : "Este mes tiene " + diasMeses + " dias.";
        
        System.out.println(mensajeSalida);
    }
}
