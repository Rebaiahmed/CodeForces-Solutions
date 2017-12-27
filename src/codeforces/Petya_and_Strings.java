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
public class Petya_and_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Scanner sc = new Scanner(System.in);
        String word1 = sc.next() ;
        String word2 = sc.next() ;
        int result = 0;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        
        for(int i=0;i<word1.length();i++)
        {
            if(word1.charAt(i)<word2.charAt(i))
            {
                result=-1;
                break ;
            }else if(word1.charAt(i)>word2.charAt(i))
            {
                 result=1;
                 break ;
            }
        }
        
        
        System.out.print(result);
        
    }
    
}
