import java.util.Scanner;

public class LP_Atividade_N1_6_2040482612045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome de usuário: ");
        String texto = scanner.nextLine();

        /*
         * O operador de curto-circuito (&&) avalia a primeira condicao.
         * Se 'texto' for null, a segunda expressao (texto.length() > 0) NEM é executada,
         * prevenindo uma NullPointerException.
         *
         * Se usássemos o operador bitwise '&' simples, ambas as expressoes seriam avaliadas
         * independentemente do resultado da primeira, resultando em NullPointerException
         * caso 'texto' fosse null ao tentar chamar 'texto.length()'.
         */

        if (texto != null && !texto.trim().isEmpty()) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        scanner.close();
    }
}