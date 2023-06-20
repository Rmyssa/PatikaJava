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
public class VucutKitleİndeksi {
      public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Boyunuzu girin(cm) : ");
    double b = scanner.nextDouble();
    
    System.out.print("Kilonuzu girin(cm) : ");
    double k = scanner.nextDouble();
    
    
    b=b/100;
    double endeks  = k/(b*b);
    
    System.out.println(b);
    System.out.println(k);
    if(endeks <18)
    {
       System.out.print(String.format("ZAYIF vki: %f", endeks));
    }   
    else if(endeks >= 18 && endeks <25)
    {
        System.out.print(String.format("NORMAL vki %f", endeks));
    }
    else if(endeks >= 25 && endeks <30)
    {
        System.out.print(String.format("KİLOLU vki: %f", endeks));        
    }
    else if(endeks >= 30 && endeks <35)
    {
        System.out.print(String.format("OBEZ vki: %f", endeks));
    }
    else
    {
        System.out.print(String.format("CİDDİ OBEZ vki: %f", endeks));
    }     
    }  
}
