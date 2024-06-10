import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira sua agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Insira o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Saldo atual: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "
                                                +numero+ " e seu saldo de "+saldo+" já está disponível para saque.");

        scanner.close();
    }
}
