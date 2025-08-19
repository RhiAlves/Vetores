import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];

        for(int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();  
            System.out.println(A[i]);
        }

        // Cópia de A para B 
        System.out.println("\n Elementos do vetor B:");
        for(int i = 0; i < B.length; i++) {
            B[i] = A[i];
            System.out.println(B[i]);
        }

        teclado.close();
    }
}


