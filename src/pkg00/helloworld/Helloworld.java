
package pkg00.helloworld;
import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        //System.out.println("ligne 1");
        //System.out.println("ligne 2");
        
        //exo 4
        //Scanner sc = new Scanner(System.in);
        
        //System.out.print("x : ");
        //int x = sc.nextInt();
        
        //System.out.print("y : ");
        //int y = sc.nextInt();
        //System.out.println("avant l'echange : x = " +x +" y: " +y );
        
        //int z =0;
        //z=x;
        //x=y;
        //y=z;
        
        //System.out.println("apres l'echange : x = " +x +" y: " +y );
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a : ");
        float a = sc.nextFloat();
        
        System.out.print("b : ");
        float b = sc.nextFloat();
        float resultat = (a+b)*2;
        
        System.out.print("Resultat " + resultat);
                 
    
    }
}
