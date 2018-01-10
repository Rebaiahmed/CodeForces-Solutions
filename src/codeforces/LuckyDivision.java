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
public class LuckyDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
         String word = sc.next();
         
         
         if(word.matches("[47]*"))
         {
             System.out.print("YES");
         }else{
             int a = Integer.parseInt(word);
             if(a%4 == 0 || a%7==0 || a%47==0 || a%74==0)
             {
                 System.out.print("YES");
             }else{
                 System.out.print("NO");
             }
             
         }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
