import java.util.Scanner;
public class PrincipalPessoa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[2];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite o nome: ");
            String nome = teclado.nextLine();

            System.out.println("Digite a idade: ");
            int idade = teclado.nextInt();
            teclado.nextLine();

            pessoas[i] = new Pessoa(nome, idade);
        }

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }

        teclado.close();
    }
}
