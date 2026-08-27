// Justificativa: O laço 'while' é o mais adequado pois o número de repetições é incerto e 
// a condição de parada (valor 0) precisa ser testada antes do processamento, podendo ocorrer o encerramento imediato.
import java.util.Scanner;
import java.util.Locale;

public class LP_Atividade_N1_02_2_2040482612045 {
    public static void main(String[] args) {
        // Garantindo que a leitura/impressão use o ponto decimal para valores monetários
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double totalVendido = 0.0;
        int quantidadeVendas = 0;

        System.out.print("Valor da venda (ou 0 para encerrar): ");
        double valorVenda = scanner.nextDouble();

        while (valorVenda != 0) {
            totalVendido += valorVenda;
            quantidadeVendas++;

            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = scanner.nextDouble();
        }

        if (quantidadeVendas > 0) {
            double valorMedio = totalVendido / quantidadeVendas;
            System.out.printf(Locale.US, "Total vendido no turno: R$ %.2f%n", totalVendido);
            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.printf(Locale.US, "Valor médio por venda: R$ %.2f%n", valorMedio);
        } else {
            System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
        }

        scanner.close();
    }
}