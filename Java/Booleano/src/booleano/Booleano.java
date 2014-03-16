
package booleano;

import java.util.Scanner;

public class Booleano {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        
        int x = input.nextInt();
        
        if(x < 0){
            x = -x;            
        }          
        
        int f = x % 2; 
                  
        if(f == 0)
        {
           System.out.println("0,Par");
        }
        if(f  == 1)
        {
            System.out.println("1,Ímpar");
        }     
      
    
    }
}
