package contabancaria;

import java.util.Scanner;

public class programa {

    private static int saldo;

    public static void main(String[] args) {
        int x = 0;
        Scanner input = new Scanner(System.in);
        ContaBancaria minhaConta1 = new ContaBancaria();
        ContaBancaria minhaConta2 = new ContaBancaria(2014, "Jennifer");

        System.out.println(minhaConta2.nome);
        System.out.println(minhaConta2.saldo);
        while (x != 2) {
            System.out.println("Deseja realizar alguma operação? ");
            System.out.println("Para sim digite 1 e para não digite 2");

            x = input.nextInt();

            if (x == 1) {

                System.out.println("1 - Saque");
                System.out.println("2 - Depósito");
                System.out.println("3 - Saldo");
                System.out.println("4 - Transferencia");

                System.out.println("Qual o operação selecionada ?");

                int y = input.nextInt();

                if (y == 1) {
                    System.out.println("Digite a quantia que deseja sacar: ");
                    int s = input.nextInt();
                    minhaConta2.saldo = saldo - s;

                    if (minhaConta2.saldo < 0) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Seu saldo é de :" + minhaConta2.saldo);
                    }
                }
                if (y == 2) {
                    System.out.println("Digite a quantia que deseja depositar: ");
                    int d = input.nextInt();
                    minhaConta2.saldo = saldo + d;

                    System.out.println("Saldo de : " + minhaConta2.saldo);

                }
                if( y == 3)
                {
                    System.out.println("Seu saldo é de : " + minhaConta2.saldo);
                    
                }
            } 
           
        }
        
                System.out.println("Operação realizada");
                System.out.println("Obrigada por sua preferência");
            

    }

}
