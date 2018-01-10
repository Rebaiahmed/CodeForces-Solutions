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
public class Soldier_and_Bananas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int k ,n, w = 0;
         k = sc.nextInt();
         n = sc.nextInt();
         w = sc.nextInt();
       
        int sum = 0;
        for(int i =1;i<=w;i++)
        {
            sum+= i*k;
        }
        if(sum>n)
        {
        System.out.println(sum-n);
        }else{
            System.out.println(0);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
