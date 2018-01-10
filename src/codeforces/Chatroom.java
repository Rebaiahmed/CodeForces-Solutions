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
public class Chatroom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
         Scanner sc = new Scanner(System.in);
         String word = sc.next();
       boolean result = word.matches(".*h[h|e]*e+l+o+.*");
        
        
        if(result==true)
        {
            System.out.println("YES");
        }else{
           System.out.println("NO");   
        }
        
        
        
        
    }
    
}
