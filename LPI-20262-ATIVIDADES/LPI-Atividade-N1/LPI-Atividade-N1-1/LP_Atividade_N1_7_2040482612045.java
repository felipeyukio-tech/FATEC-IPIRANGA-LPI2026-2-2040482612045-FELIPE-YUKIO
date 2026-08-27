import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LP_Atividade_N1_7_2040482612045{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor A (ex.: 1.00): ");
        String valorA = scanner.next();

        System.out.print("Informe o valor B (ex.: 0.90): ");
        String valorB = scanner.next();

        System.out.print("Informe o valor total da compra: ");
        String valorCompra = scanner.next();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        // Demostração de erro IEEE 754 com double
        double doubleA = Double.parseDouble(valorA);
        double doubleB = Double.parseDouble(valorB);
        double subtracaoDouble = doubleA - doubleB;

        System.out.println("\n--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria 0.10");
        System.out.println("Resultado real obtido com double: " + subtracaoDouble);

        // Solução exata com BigDecimal
        BigDecimal bdA = new BigDecimal(valorA);
        BigDecimal bdB = new BigDecimal(valorB);
        BigDecimal subtracaoBd = bdA.subtract(bdB);

        System.out.println("\n--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + subtracaoBd);

        // Divisão de parcelas com escala e arredondamento
        BigDecimal bdTotal = new BigDecimal(valorCompra);
        BigDecimal valorParcela = bdTotal.divide(new BigDecimal(numeroParcelas), 2, RoundingMode.HALF_UP);

        System.out.println("\n--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + bdTotal + " dividida em " + numeroParcelas + "x: R$ " + valorParcela + " por parcela.");

        scanner.close();
    }
}