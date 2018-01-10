/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

import java.util.Scanner;

/**
 *
 * @author ahmed
 * *********Not Accepted***********
 */
public class Nearly_Lucky_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
         Scanner sc = new Scanner(System.in);
         String word = sc.next();
         
         if(!word.contains("4") || !word.contains("7"))
         {
             System.out.println("NO");
         }else{
               int nb_digits = 0;
         for(int i=0;i<word.length();i++)
         {
             if(word.charAt(i)=='4' || word.charAt(i)=='7' )
             {
                 nb_digits++ ;
             }
         }//********end for********//
         
         if(nb_digits==4 || nb_digits==7)
         {
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
        
         }
         
         
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
