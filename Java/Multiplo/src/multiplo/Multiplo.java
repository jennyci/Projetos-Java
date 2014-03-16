package multiplo;

import java.util.Scanner;

public class Multiplo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero numero: ");        
        int x = input.nextInt();
        System.out.println("Digite outro numero: ");
        int y = input.nextInt();
        
        if(x < 0 )
        {
            x = -x;
        }
        if( y < 0)
        {
            y = -y;
        }
      
        int m = y%x;
        
        if(m == 0)
        {
            System.out.println("0,Múltiplo");
        }
        else
        {
            System.out.println("1,Não Múltiplo");
        }
    
     }
}
