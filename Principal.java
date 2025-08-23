import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();

        //adicionando alunos
        turma.adicionarAluno(new Aluno("Amora", 001, 10.0, 8.0));
        turma.adicionarAluno(new Aluno("Peppi", 002, 5.5, 4.9));
        turma.adicionarAluno(new Aluno("Pink", 003, 8.5, 9.5));
        

        
        turma.listarAlunos();// chama o metodo listar alunos da classe turma

    
        System.out.println("\n--- Buscar Aluno ---");
        System.out.print("Digite a matrícula: ");
        int matriculaBusca = scanner.nextInt();
        
        Aluno alunoEncontrado = turma.buscarPorMatricula(matriculaBusca);
        
        if (alunoEncontrado != null) {
            System.out.println("\nAluno encontrado:");
            alunoEncontrado.exibirInfo();
        } else {
            System.out.println("Aluno com matrícula " + matriculaBusca + " não encontrado.");
        }

        scanner.close();
    }
}
