
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Looping;

/**
 *
 * @author akmal
 */
public class ukl1 {
    public static void main(String[] args) {
        
        int a = 8;//nilai awal
        int b = 10;//increment

        int e = 0;
         //suku ke 3 - 10
         
         for ( int i = 3; i <= 10; i++){
             
           //-System.out.println("Suku ke-"+i);

             a+=b;
             if (i >= 4 && i <= 10){
             System.out.println("Suku ke- "+i+" = "+a);
             e+=a;
             
             
             }
         }
         System.out.println("total : "+e);
    }
    
}
