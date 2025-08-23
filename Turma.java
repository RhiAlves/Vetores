public class Turma {
    private Aluno[] alunos = new Aluno[5]; // vetor de tamanho 5
    private int quantidade = 0; // contador de alunos cadastrados

    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) { // há espaço?
            alunos[quantidade] = aluno; // adiciona no próximo indice livre
            quantidade++; // incrementa o contador
            System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Turma cheia! Não é possível adicionar mais alunos.");
        }
    }

    public void listarAlunos() {
        System.out.println("\n=== Lista de Alunos ===");
        if (quantidade == 0) { // verifica se não há alunos na turma
            System.out.println("Nenhum aluno cadastrado.");
            return; // não executa o loop
        }
        
        for (int i = 0; i < quantidade; i++) { // pecorre indices ocupados
            alunos[i].exibirInfo(); // chama o metod de exibição para cada aluno
        }
    }

    public Aluno buscarPorMatricula(int matricula) { // recebe a matricula procurada como parametro
        for (int i = 0; i < quantidade; i++) { //pecorre os alunos cadatrados
            if (alunos[i].getMatricula() == matricula) { // compara as matriculas
                return alunos[i]; // retorna o aluno encontrado
            }
        }
        return null;
    }
}