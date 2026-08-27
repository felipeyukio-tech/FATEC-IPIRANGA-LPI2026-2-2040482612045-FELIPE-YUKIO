import java.util.Locale;
import java.util.Scanner;

public class LP_Atividade_N1_8_2040482612045 {
    /*
     * Vantagens da abordagem escalar (centavos em long):
     * - Alta performance em cálculos computacionais massivos.
     * - Evita imprecisão do ponto flutuante sem sobrecarga de memória de objetos.
     *
     * Desvantagens em relação ao BigDecimal:
     * - Risco de estouro de limite (overflow) em transações bilionárias.
     * - Suporte limitado para divisão precisa com casas decimais complexas ou juros compostos sem arredondamento manual.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = scanner.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        // Conversão e mapeamento para escala inteira (centavos)
        long totalCentavos = Math.round(valorTotalReais * 100);
        long parcelaCentavos = totalCentavos / numeroParcelas;
        double valorExibicao = parcelaCentavos / 100.0;

        System.out.println("\n--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + totalCentavos + " centavos.");
        System.out.printf(Locale.US, "Divisão de R$%.2f por %d em centavos: %d centavos por parcela.\n", valorTotalReais, numeroParcelas, parcelaCentavos);
        System.out.printf(Locale.US, "Valor convertido para exibição: R$ %.2f\n", valorExibicao);

        scanner.close();
    }
}