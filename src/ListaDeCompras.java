import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Produto> produtos;

    public ListaDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void mostrarLista(){
        System.out.println("Lista de compras: ");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Valor: R$" + produto.getValor());
        }
    }
}
