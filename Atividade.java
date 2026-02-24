
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // 1. Declaração e preenchimento da matriz 3x3
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os 9 valores inteiros da matriz 3x3:\n");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Posição [%d][%d]: ", i, j);
                while (!entrada.hasNextInt()) {
                    System.out.println("Erro: Digite apenas números inteiros!");
                    entrada.next(); // descarta entrada inválida
                    System.out.printf("Posição [%d][%d]: ", i, j);
                }
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        // Mostrar a matriz completa
        System.out.println("\nMatriz 3×3 digitada:");
        exibirMatriz(matriz);
        
        // 2. Diagonal principal
        System.out.println("\n2. Elementos da DIAGONAL PRINCIPAL:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        
        // 3. Diagonal secundária
        System.out.println("\n3. Elementos da DIAGONAL SECUNDÁRIA:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        System.out.println();
        
        // 4. Elementos ACIMA da diagonal principal
        System.out.println("\n4. Elementos ACIMA da diagonal principal:");
        boolean temElemento = false;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                temElemento = true;
            }
        }
        if (!temElemento) {
            System.out.print("Nenhum elemento acima da diagonal");
        }
        System.out.println();
        
        // 5. Elementos ABAIXO da diagonal principal
        System.out.println("\n5. Elementos ABAIXO da diagonal principal:");
        temElemento = false;
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
                temElemento = true;
            }
        }
        if (!temElemento) {
            System.out.print("Nenhum elemento abaixo da diagonal");
        }
        System.out.println();
        
        entrada.close();
    }
    
    // Método auxiliar para exibir a matriz formatada
    public static void exibirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }
    }
}
