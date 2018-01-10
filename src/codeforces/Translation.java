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
public class Translation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         Scanner sc = new Scanner(System.in);
         String word1 = sc.next();
         String word2 = sc.next() ;
         boolean equal = true ;
         for(int i=0;i<word1.length();i++)
         {
             if(word1.charAt(i)!=word2.charAt(word2.length()-i-1))
             { 
                
                 equal=false;
                 break;
                 
             }
         }
         if(equal)
         System.out.println("YES");
         else
             System.out.println("NO");
         
    }
    
}

