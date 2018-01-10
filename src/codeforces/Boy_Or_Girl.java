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
 */
public class Boy_Or_Girl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
         Scanner sc = new Scanner(System.in);
         String word = sc.next();
         String tmp =""  ;
         
         tmp+=word.charAt(0);
         int nb_diff_chars=1;
         for(int i=1;i<word.length();i++)
         {
            
             
             if(tmp.indexOf(word.charAt(i))==-1)
             {
                 nb_diff_chars++ ;
                 tmp+=word.charAt(i);
             }
         }
        
         if(nb_diff_chars%2==0)
         {
            System.out.println("CHAT WITH HER!"); 
         }else{
            System.out.println("IGNORE HIM!"); 
         }
         
        
    }
    
}
