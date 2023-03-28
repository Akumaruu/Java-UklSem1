/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Looping;

/**
 *
 * @author akmal
 */
public class ukl4 {
    public static void main(String[] args) {
        /*
        
        **
        ***
        ****
        *****
        ******
        
        *****
        ****
        
        *****
        ****
        ***
        **
        *
        
        */
        
        //pertama
        for ( int i = 2 ; i <= 6 ; i++){
           for( int j = 0 ; j < i ; j++){
               System.out.print("*");
           }
           System.out.println("");  
        }
        
        //kedua
        for ( int i = 0 ; i < 2 ; i++){
            for ( int j = 5 ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //ketiga
        for ( int i = 0 ; i < 5 ; i++){
            for ( int j = 5 ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
       
    }
    
}
