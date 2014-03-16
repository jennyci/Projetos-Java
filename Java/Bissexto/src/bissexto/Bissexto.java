package bissexto;

import java.util.Scanner;

public class Bissexto {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        
        int x = input.nextInt();
        
        int b = x % 4;
        
        if(b == 0)
        {
            System.out.println("0,Bissexto");
        }
        else
        {
            System.out.println("1,Não é Bissexto");
        }
    }
    
}
