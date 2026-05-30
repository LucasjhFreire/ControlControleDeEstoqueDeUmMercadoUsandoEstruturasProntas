import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Estoque {

    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    // cadastrar produto
    public void cadastrar(Produto p) {

        produtos.add(p);

        System.out.println("Produto cadastrado!");
    }

    // remover produto
    public void remover(int codigo) {

        for (Produto p : produtos) {

            if (p.getCodigo() == codigo) {

                produtos.remove(p);

                System.out.println("Produto removido!");
                return;
            }
        }

        System.out.println("Produto não encontrado!");
    }

    // atualizar preço
    public void atualizarPreco(int codigo, double novoPreco) {

        for (Produto p : produtos) {

            if (p.getCodigo() == codigo) {

                p.setPreco(novoPreco);

                System.out.println("Preço atualizado!");
                return;
            }
        }

        System.out.println("Produto não encontrado!");
    }

    // pesquisar produto
    public void pesquisar(int codigo) {

        for (Produto p : produtos) {

            if (p.getCodigo() == codigo) {

                System.out.println(p);
                return;
            }
        }

        System.out.println("Produto não encontrado!");
    }

    // listar estoque
    public void listar() {

        if (produtos.isEmpty()) {

            System.out.println("Estoque vazio!");
            return;
        }

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    // listar ordenado por nome
    public void listarOrdenado() {

        ArrayList<Produto> copia = new ArrayList<>(produtos);

        Collections.sort(copia, Comparator.comparing(Produto::getNome));

        for (Produto p : copia) {
            System.out.println(p);
        }
    }
}
