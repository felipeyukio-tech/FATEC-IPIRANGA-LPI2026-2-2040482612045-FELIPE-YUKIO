import java.util.Scanner;

/*
 * Tipos Primitivos em Java:
 * byte: 8 bits, intervalo de -128 a 127
 * short: 16 bits, intervalo de -32.768 a 32.767
 * int: 32 bits, intervalo de -2.147.483.648 a 2.147.483.647
 * long: 64 bits, intervalo de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
 * float: 32 bits, precisao simples IEEE 754
 * double: 64 bits, precisao dupla IEEE 754
 * char: 16 bits (Unicode), de '\u0000' (0) a '\uffff' (65.535)
 * boolean: 1 bit (conceitual), valores true ou false
 */

public class LP_Atividade_N1_1_2040482612045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade do Aluno: ");
        byte idade = scanner.nextByte();

        System.out.print("Número de Faltas: ");
        short faltas = scanner.nextShort();

        System.out.print("Matrícula ID: ");
        int matriculaId = scanner.nextInt();

        System.out.print("Código Nacional do Estudante: ");
        long codigoNacional = scanner.nextLong();

        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = scanner.nextFloat();

        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = scanner.nextDouble();

        System.out.print("Conceito Final do Aluno: ");
        char conceitoFinal = scanner.next().charAt(0);

        System.out.print("Aluno está Aprovado (true/false): ");
        boolean aprovado = scanner.nextBoolean();

        System.out.println("\nDados do Aluno Fictício");
        System.out.println("Idade do Aluno: " + idade + " anos");
        System.out.println("Número de Faltas: " + faltas);
        System.out.println("Matricula ID: " + matriculaId);
        System.out.println("Código Nacional do Estudante: " + codigoNacional);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova Final: " + notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " + conceitoFinal);
        System.out.println("Aluno está Aprovado? " + aprovado);

        scanner.close();
    }
}