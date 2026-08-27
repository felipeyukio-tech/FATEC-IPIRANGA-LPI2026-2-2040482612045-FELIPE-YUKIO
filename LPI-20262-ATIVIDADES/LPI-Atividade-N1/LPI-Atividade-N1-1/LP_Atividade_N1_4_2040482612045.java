import java.util.Scanner;

public class LP_Atividade_N1_4_2040482612045 {

    // Constantes institucionais da classe
    public static final String NOME_INSTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO_DIAS = 14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de dias do empréstimo: ");
        final int diasEmprestimo = scanner.nextInt();

        // Tentativa invalida de reatribuir variavel final gera erro de compilacao:
        // diasEmprestimo = 15; // Erro: cannot assign a value to final variable diasEmprestimo

        exibirInformacoesEmprestimo(diasEmprestimo);

        scanner.close();
    }

    public static void exibirInformacoesEmprestimo(final int dias) {
        System.out.println("Instituição: " + NOME_INSTITUICAO);
        System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_DIAS + " dias.");
        System.out.println("Dias calculados para devolução: " + dias);
    }
}