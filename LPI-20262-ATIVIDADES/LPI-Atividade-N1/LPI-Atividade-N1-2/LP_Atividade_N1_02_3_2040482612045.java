// Justificativa: O laço 'do-while' é o mais adequado pois a solicitação do PIN deve ser executada 
// obrigatoriamente ao menos uma vez antes da verificação da condição de parada.
import java.util.Scanner;

public class LP_Atividade_N1_02_3_2040482612045 {
    public static final int PIN_CORRETO = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinDigitado;
        int tentativas = 0;

        do {
            System.out.print("Informe o PIN de acesso: ");
            pinDigitado = scanner.nextInt();
            tentativas++;

            if (pinDigitado != PIN_CORRETO) {
                System.out.println("PIN incorreto. Tente novamente.");
            }
        } while (pinDigitado != PIN_CORRETO);

        System.out.println("Acesso concedido! Você utilizou " + tentativas + " tentativa(s).");

        scanner.close();
    }
}