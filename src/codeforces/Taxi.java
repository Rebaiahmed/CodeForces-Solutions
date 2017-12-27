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
public class Taxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner(System.in);
        int nbr_groups  = sc.nextInt() ;
        String  input = sc.nextLine();    
      int sum = 0 ;
        //String[] strs = input.split(" ");
        //System.out.print(strs[0]);

        /*for (int i = 0; i < strs.length; i++) {
         sum += Integer.parseInt(strs[i]);
         }
        
        System.out.println(sum/4);*/
        
        for (int i = 0; i < nbr_groups; i++) {
            
            sum += sc.nextInt();
        }
        
         System.out.println(sum/4);
        
        
        
        
        
        
        
        
        
    }
    
}
