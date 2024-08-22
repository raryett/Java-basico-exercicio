
import java.util.Scanner;




public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        //int numero
        //String agencia
        //String nomeCliente
        //Double saldo
     

        Scanner sc = new Scanner(System.in);

        String[] informacoes = new String [4];

        System.out.println("Por favor, digite o nome do usuario!");
        informacoes[0] = sc.next();

        System.out.println("Por favor, digite o número da Agência!");
        informacoes[1] = sc.next();

        System.out.println("Por favor, digite o numero da conta!");
        informacoes[2] = String.valueOf(sc.nextInt());

        System.out.println("Por favor, digite o saldo da conta!");
        informacoes[3] = sc.next();


        System.out.println("Olá " + informacoes[0] + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + informacoes[1] + ",conta "+ informacoes[2] + " e seu saldo "+ informacoes[3] + " já está disponível para saque.");

        

        
        sc.close();

        





    }
}
