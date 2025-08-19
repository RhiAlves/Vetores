public class Quest11 {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int quantidadePares = A.length;
        
        System.out.println("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.err.println("\nNúmeros pares encontrados:");
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                System.out.print(A[i] + " ");
                quantidadePares++;
            }

        }
        
        System.out.println("\nQuantidade de elementos pares no vetor A: " + quantidadePares);
    }
}

