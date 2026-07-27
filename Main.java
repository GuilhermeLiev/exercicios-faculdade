package exercicioLivro;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //create 3 clients
        int i;
        for (i = 1; i <= 3; i++) {
            System.out.println("\n======== CLIENTE " + i + " =========");

            // dados dos clientes
            System.out.print("Nome: " );
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Sexo (M/F): ");
            char sexo = sc.nextLine().charAt(0);

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();


            //dados do livro
            System.out.println("\n--- Dados do Livro ---");
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Ano de Publicação: ");
            int ano = Integer.parseInt(sc.nextLine());

            System.out.print("Preço: R$: ");
            double preco = Double.parseDouble(sc.nextLine());

            System.out.print("Quantidade de páginas: ");
            int paginas = Integer.parseInt(sc.nextLine());

            // Criando Livro
            Livro livro = new Livro(titulo, autor, ano, preco, paginas);

            //Criando os clientes
            Cliente cliente = new Cliente(nome, idade, sexo, email, senha, livro);

            // Imprimindo preço por página
            double precoPorPagina = livro.calcularPrecoPorPagina();
            System.out.print("\n📊 O cliente " + cliente.getNome() +
                    " está com o livro " + livro.getTitulo() +
                    ", e o preço por página deste livro é R$" +
                    String.format("%.2f", precoPorPagina));

            System.out.println("\n📋 Informações completas:");
            System.out.println(cliente);



        }




        sc.close();

    }
}
