public class Quest10 {
     public static void main(String args[]){
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int B[] = new int[A.length];

        System.out.println("Elementos de A:");
         for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println("Elementos do vetor C(Soma de A e B):");
        for (int i = 0; i < B.length; i++){
            B[i] = A[i] % 2;
            System.err.println(B[i]);
        }
    }
}
