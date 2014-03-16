
package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("O numero de entrada é: ");
        
         int x = input.nextInt();
        
        
        for(int j = 0; j < 11 ; j++){
            System.out.println("A tabuada de x é : " + x*j);
        }
    }
    
}
