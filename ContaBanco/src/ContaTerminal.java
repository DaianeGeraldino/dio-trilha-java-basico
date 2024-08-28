import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner usuario = new Scanner(System.in);

        int numero, agencia;
        String nomeCliente;
        float saldo;

        System.out.print("Insira seu usuario: ");
        nomeCliente = usuario.next();

        System.out.print("Digite o numero do banco: ");
        numero = usuario.nextInt();

        System.out.print("Digite o numero da agencia: ");
        agencia = usuario.nextInt();

        System.out.print("Digite o saldo do banco: ");
        saldo = usuario.nextFloat();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");


    }
}
