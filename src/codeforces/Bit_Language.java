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
public class Bit_Language {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;
        // TODO code application logic here
        for(int i=0; i<n;i++){
            String seq = sc.next();
            if(seq.contains("++")){
                X++;
                
            }else if(seq.contains("--"))
            {
                X-- ;
            }
            
        }
        
        System.out.print(X);
    }
    
}
