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
public class Tram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int min_capacity = 0;
         int nbr = 0 ;
         int n = sc.nextInt();
         for(int i=0;i<n;i++)
         {
             int a = sc.nextInt();  int b = sc.nextInt();
            
          
             nbr-=a ;
             nbr+=b ;
             if(nbr>min_capacity)
             {
                 min_capacity=nbr ;
             }
            
             
    
         }
       
          System.out.println(min_capacity);
        
    }
    
}
