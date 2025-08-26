public class Turma {
    private Aluno[] alunos = new Aluno[5]; 
    private int quantidade = 0; 

    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) { 
            alunos[quantidade] = aluno; 
            quantidade++; 
            System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Turma cheia! Não é possível adicionar mais alunos.");
        }
    }

    public void listarAlunos() {
        System.out.println("\n=== Lista de Alunos ===");
        if (quantidade == 0) { 
            System.out.println("Nenhum aluno cadastrado.");
            return; 
        }
        
        for (int i = 0; i < quantidade; i++) { 
            alunos[i].exibirInfo(); 
        }
    }

    public Aluno buscarPorMatricula(int matricula) { 
        for (int i = 0; i < quantidade; i++) { 
            if (alunos[i].getMatricula() == matricula) { 
                return alunos[i]; 
            }
        }
        return null;
    }

}
