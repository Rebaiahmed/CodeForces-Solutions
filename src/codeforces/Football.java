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
public class Football {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner(System.in);
           String players = sc.next();
           if(players.contains("0000000") || players.contains("1111111") )
           {
               System.out.print("YES");
           }else{
               System.out.print("NO");
           }
    }
    
}
