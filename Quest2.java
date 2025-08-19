import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] A = new int[8];
        int[] B = new int[8];

        // Leitura dos elementos do vetor A
        System.out.println("Digite os 8 elementos do vetor A:");
        for(int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
        System.out.println(A[i]);
        }

        // Elementos de B sendo o dobro de A
        System.out.println("\nElementos do vetor B (dobro de A):");
        for(int i = 0; i < B.length; i++) {
            B[i] = A[i] * 2;
            System.out.println(B[i]);
        }
    }
}