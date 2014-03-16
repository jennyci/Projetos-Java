
package valor;

import java.util.Scanner;

public class Valor {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        
        int x = input.nextInt();
        
        if(x < 0){
            x = -x; 
            System.out.println("O valor absoluto de x é: " +x);  
        }
        else{            
            System.out.println("O valor absoluto de x é: " +x);
        }
    }
    
}


