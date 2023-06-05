import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0; //	Inteiro	1021
        String agencia = ""; //	Texto	067-8
        String nomeCliente = ""; //	Texto	MARIO ANDRADE
        float saldo = 0f; //	Decimal	237.48

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("--- Dados da Conta Corrente ---\n");

        System.out.println("Por favor, informe a seguir:\n");

        System.out.println("Nome do Cliente: ");
        nomeCliente = reader.readLine();

        System.out.println("Agência: ");
        agencia = reader.readLine();

        System.out.println("Número da Conta: ");
        numero = Integer.parseInt(reader.readLine());

        System.out.println("Saldo R$: ");
        saldo = Float.parseFloat(reader.readLine());

        String msg = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", 
            nomeCliente,agencia,numero,saldo);

        System.out.println(msg);

        reader.close();
    }
}
