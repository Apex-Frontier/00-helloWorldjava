/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;
import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        //System.out.println("ligne 1");
        //System.out.println("ligne 2");
        //exo 4
        Scanner sc = new Scanner(System.in);
        
        System.out.print("x : ");
        int x = sc.nextInt();
        
        System.out.print("y : ");
        int y = sc.nextInt();
        System.out.println("avant l'echange : x = " +x +" y: " +y );
        
        int z =0;
        z=x;
        x=y;
        y=z;
        
        System.out.println("apres l'echange : x = " +x +" y: " +y );
        
                   
    
    }
}
