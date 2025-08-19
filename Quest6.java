public class Quest6 {
    public static void main(String args[]){
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int B[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int C[] = new int[10];

        System.out.println("Elementos de A e B:");
        System.out.println("A\tB");
         for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] +"\t" + B[i]);
        }
        System.out.println("Elementos do vetor C(Soma de A e B):");
        for (int i = 0; i < A.length; i++){
            C[i] = A[i] + B[i];
            System.err.println(C[i]);
        }
    }
}
