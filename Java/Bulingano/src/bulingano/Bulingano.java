
package bulingano;

import java.util.Scanner;

public class Bulingano{
    
    public static void main(String[] args){
        
        int f;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um valor para x: ");
        int x = input.nextInt();
        
        if(x<0){
            x = -x;
        }
        
        f = x % 2;
        
        if(f == 0){
            System.out.println("Par");
        }
        else
            System.out.println("Ímpar");
            
               
    }
}