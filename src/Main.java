import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();

        int op = 0;

        while (op != 7) {

            System.out.println("\n===== MENU =====");

            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Atualizar preço");
            System.out.println("4 - Pesquisar produto");
            System.out.println("5 - Listar estoque");
            System.out.println("6 - Listar ordenado por nome");
            System.out.println("7 - Sair");

            System.out.print("Escolha: ");
            op = sc.nextInt();

            if (op == 1) {

                System.out.print("Código: ");
                int codigo = sc.nextInt();

                System.out.print("Nome: ");
                String nome = sc.next();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();

                Produto p = new Produto(codigo, nome, preco, quantidade);

                estoque.cadastrar(p);

            } else if (op == 2) {

                System.out.print("Código do produto: ");
                int codigo = sc.nextInt();

                estoque.remover(codigo);

            } else if (op == 3) {

                System.out.print("Código do produto: ");
                int codigo = sc.nextInt();

                System.out.print("Novo preço: ");
                double preco = sc.nextDouble();

                estoque.atualizarPreco(codigo, preco);

            } else if (op == 4) {

                System.out.print("Código do produto: ");
                int codigo = sc.nextInt();

                estoque.pesquisar(codigo);

            } else if (op == 5) {

                estoque.listar();

            } else if (op == 6) {

                estoque.listarOrdenado();

            } else if (op != 7) {

                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado.");
    }
}
