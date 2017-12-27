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
public class Dominopiling {
    
    
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         int[] integers = new int[3];
          for(int i = 0; i < 2; i++)
{
    integers[i] = sc.nextInt();
    //System.out.println(integers[i]);
}
          
        int max = (int)( (integers[0]* integers[1]) / 2 );
        System.out.println(max);
          
        
        
    }
    
    
}
