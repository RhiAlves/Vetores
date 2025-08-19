import static java.lang.Math.sqrt;

public class Quest4 {
    public static void main(String[] args) {
        int A[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225};
        int B[] = new int [A.length];

        System.out.println("Elementos do vetor A:");
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }

        System.out.println("\nElementos do vetor B (raiz quadrada de A):");
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) sqrt(A[i]);
            System.out.println(B[i]);

    }
}
}