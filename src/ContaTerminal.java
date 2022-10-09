import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Instacia do objeto Scanner pra fazer a leitura do teclado
        Scanner input = new Scanner(System.in);

        // Atributos e valores registrados em banco de dados, por exemplo.
        int numero = 1010;
        String agencia = "123-0";
        String nomeCliente = "ANDRÉ ALVES";
        double saldo = 5000.000;
        
        // Variáveis auxiliares
        int numeroInput;
        String agenciaInput; 
        
        // Validação da conta
        do {
            System.out.println( "Por favor, digite o número da Conta !");
            numeroInput = input.nextInt(); // Atribui o valor digitado pelo teclado
            System.out.println( "Por favor, digite o número da Agência !");
            agenciaInput = input.next(); // Atribui o valor digitado pelo teclado
        } 
        while(numeroInput != numero && agenciaInput != agencia);
        
        // Resposta do programa
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque %n", nomeCliente, agencia, numero, saldo);
    }
}
