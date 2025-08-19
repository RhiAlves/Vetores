public class Quest3 {
    public static void main(String args[]) {
        int A[] = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 14, 15, 16, 17};
        int B[] = new int[A.length];

        System.out.println("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        System.out.println("\nElementos do vetor B (quadrado de A):");
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] * A[i];
            System.out.println(B[i]);
        }
    }
}
