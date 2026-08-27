import java.util.Scanner;

public class LP_Atividade_N1_9_2040482612045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();

        // Abordagem 1: Estrutura Tradicional (if-else)
        String situacaoIfElse;
        if (notaFinal >= 6.0) {
            situacaoIfElse = "Aprovado";
        } else {
            situacaoIfElse = "Reprovado";
        }

        System.out.println("\n--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        System.out.println("Situação (if-else): " + situacaoIfElse);

        // Abordagem 2: Operador Ternário
        String situacaoTernario = (notaFinal >= 6.0) ? "Aprovado" : "Reprovado";

        System.out.println("\n--- Abordagem 2: Operador Ternário Simples ---");
        System.out.println("Situação (Ternário): " + situacaoTernario);

        /*
         * Demonstração de ternário encadeado (Evitar na prática):
         * String situacao = (notaFinal >= 6.0) ? "Aprovado" : (notaFinal >= 4.0) ? "Exame" : "Reprovado";
         *
         * Por que evitar: Ternários encadeados prejudicam severamente a legibilidade e a manutenibilidade do código,
         * tornando a verificação de fluxo propensa a bugs de interpretação visual.
         */

        scanner.close();
    }
}