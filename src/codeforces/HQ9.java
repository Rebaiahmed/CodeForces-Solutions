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
public class HQ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         String word = sc.next();
         if(word.contains("H") || word.contains("Q") || word.contains("9") )
         {
             System.out.println("YES");
             
         }else{
             System.out.println("NO");
         }
        
        
        
        
        
    }
    
}
