import java.util.Locale;
import java.util.Scanner;

public class LP_Atividade_N1_03_1_2040482612045 {
    public static void main(String[] args) {
        // Configura o Scanner para aceitar o ponto (.) como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // =========================================================================
        // 1. DECLARAÇÃO DO VETOR
        // =========================================================================
        // Leitura da quantidade e instanciação do vetor com o tamanho informado
        System.out.print("Quantidade de leituras: ");
        int quantidadeLeituras = scanner.nextInt();

        double[] leituras = new double[quantidadeLeituras];

        // Preenchimento do vetor com as temperaturas
        for (int i = 0; i < quantidadeLeituras; i++) {
            System.out.print("Temperatura (C): ");
            leituras[i] = scanner.nextDouble();
        }

        // =========================================================================
        // 2. PERCURSO NO VETOR
        // =========================================================================
        // Exibição de todas as leituras utilizando laço for tradicional (indexado)
        System.out.println("--- Leituras Registradas ---");
        for (int i = 0; i < leituras.length; i++) {
            System.out.println("Leitura [" + i + "]: " + leituras[i] + "C");
        }

        // =========================================================================
        // 3. ACESSO DIRETO
        // =========================================================================
        // Acesso direto via índice sem utilizar laços de repetição
        System.out.println("--- Acesso Direto ---");
        System.out.println("Primeira leitura (indice 0): " + leituras[0] + "C");
        System.out.println("Ultima leitura (indice " + (leituras.length - 1) + "): " + leituras[leituras.length - 1] + "C");

        // =========================================================================
        // 4. BUSCA LINEAR: EXTREMOS (MAIOR E MENOR)
        // =========================================================================
        // Varredura em um único laço inicializando candidatos com o primeiro elemento
        double maior = leituras[0];
        int indiceMaior = 0;

        double menor = leituras[0];
        int indiceMenor = 0;

        for (int i = 1; i < leituras.length; i++) {
            if (leituras[i] > maior) {
                maior = leituras[i];
                indiceMaior = i;
            }
            if (leituras[i] < menor) {
                menor = leituras[i];
                indiceMenor = i;
            }
        }

        System.out.println("--- Busca Linear: Extremos ---");
        System.out.println("Maior temperatura: " + maior + "C (indice " + indiceMaior + ")");
        System.out.println("Menor temperatura: " + menor + "C (indice " + indiceMenor + ")");

        // =========================================================================
        // 5. BUSCA LINEAR: ALERTA DE TEMPERATURA CRÍTICA
        // =========================================================================
        System.out.print("Temperatura critica de alerta (C): ");
        double temperaturaCritica = scanner.nextDouble();

        System.out.println("--- Busca Linear: Alerta ---");

        int indiceAlerta = -1;
        for (int i = 0; i < leituras.length; i++) {
            if (leituras[i] >= temperaturaCritica) {
                indiceAlerta = i;
                break; // Interrompe ao encontrar a PRIMEIRA ocorrência
            }
        }

        if (indiceAlerta != -1) {
            System.out.println("Alerta: temperatura critica atingida na leitura de indice " 
                + indiceAlerta + " (" + leituras[indiceAlerta] + "C).");
        } else {
            System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
        }

        scanner.close();
    }
}