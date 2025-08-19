public class Quest9 {
    public static void main(String args[]){
        int A[] = {10, 9 , 8, 4, 5, 16, 21, 16, 45, 10};
        int B[] = {2, 3, 4, 2, 5, 4, 7, 8, 9, 5};
        int C[] = new int[10];

        System.out.println("Elementos de A e B:");
        System.out.println("A\tB");
         for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] +"\t" + B[i]);
        }
        System.out.println("Elementos do vetor C(Soma de A e B):");
        for (int i = 0; i < C.length; i++){
            C[i] = A[i] / B[i];
            System.err.println(C[i]);
        }
    }
}
