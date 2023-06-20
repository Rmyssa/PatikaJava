/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikaaa;

import java.util.Scanner;

/**
 *
 * @author Rumeysa
 */
public class ManavKasa {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
       double patlican=5.00;
       
        System.out.println("armut kac kilo?");
        double armutKilo=scan.nextDouble();
        
        System.out.println("elma kac kilo?");
        double elmaKilo=scan.nextDouble();
        
        System.out.println("domates kac kilo?");
        double domatesKilo=scan.nextDouble();
        
        System.out.println("muz kac kilo?");
        double muzKilo=scan.nextDouble();
        
        System.out.println("patlican kac kilo?");
        double patlicanKilo=scan.nextDouble();
        
        double tutar=(armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("tutar"+tutar);
        
    }
    
}
