public class Quest12 {
    public static void main(String[] args) {
        int A[] = {2, 2, 2, 3, 3, 3, 4, 4, 4, 10};
        int soma = 0;

         System.out.println("Elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        for (int i = 0; i < A.length; i++) {
            soma += A[i]; 
        }
        
        System.out.println("\n\nSoma de todos os elementos: " + soma);
        }
    }

