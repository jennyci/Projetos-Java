

package multiplicacaousuario;

import java.util.Scanner;

public class MultiplicacaoUsuario {   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("O valor para x é : ");
       
       int x = input.nextInt();
       
       System.out.println("O resultado é : " + x*x);
    }
    
}
