public class Quest7 {
     public static void main(String args[]){
        int A[] = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int B[] = {12, 10, 23, 23, 12, 19, 4, 15, 9, 2};
        int C[] = new int[10];

        System.out.println("Elementos de A e B:");
        System.out.println("A\tB");
         for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] +"\t" + B[i]);
        }
        System.out.println("Elementos do vetor C(Subtração de A e B):");
        for (int i = 0; i < C.length; i++){
            C[i] = A[i] - B[i];
            System.err.println(C[i]);
        }
    }
}


