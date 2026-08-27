import java.util.Scanner;

public class LP_Atividade_N1_3_2040482612045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer idade = null;

        System.out.println("Tentando realizar operação aritmética com Integer nulo...");

        try {
            // Força unboxing de um valor null, disparando a exceção NullPointerException
            int proximoAno = idade + 1;
            System.out.println("Idade no próximo ano: " + proximoAno);
        } catch (NullPointerException e) {
            System.out.println("Erro Capturado com sucesso: Não foi possível calcular porque a idade não foi informada (null).");
            System.out.println("Detalhe da exceção: " + e.getClass().getName());
        }

        System.out.print("Informe uma idade válida: ");
        int novaIdade = scanner.nextInt();

        idade = novaIdade;

        System.out.println("Reatribuindo valor válido para a variável...");
        System.out.println("Operação bem-sucedida! Idade atual: " + idade + " Idade no próximo ano: " + (idade + 1));

        scanner.close();
    }
}