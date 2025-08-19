public class Quest8 {
    public static void main(String args[]){
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int B[] = {50, 52, 43, 44, 65, 16, 7, 8, 19, 2};
        int C[] = new int[10];

        System.out.println("Elementos de A e B:");
        System.out.println("A\tB");
         for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] +"\t" + B[i]);
        }
        System.out.println("Elementos do vetor C(Soma de A e B):");
        for (int i = 0; i < C.length; i++){
            C[i] = A[i] * B[i];
            System.err.println(C[i]);
        }
    }
}




