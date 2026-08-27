// Justificativa: O laço 'for' é o mais adequado pois a quantidade de alunos (repetições) é 
// informada previamente, tornando o número de iterações totalmente conhecido antes do início do laço.
import java.util.Scanner;

public class LP_Atividade_N1_02_1_2040482612045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();

        double somaTotal = 0.0;
        double maiorNota = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nota do aluno: ");
            double nota = scanner.nextDouble();

            somaTotal += nota;
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        double media = somaTotal / quantidadeAlunos;

        System.out.println("Soma total das notas: " + somaTotal);
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota da turma: " + maiorNota);

        scanner.close();
    }
}