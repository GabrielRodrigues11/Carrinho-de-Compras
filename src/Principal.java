import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        ListaDeCompras listaDeCompras = new ListaDeCompras();

        System.out.println("Vamos as compras!\n");

        int continua = 1;
        double valorTotal = 0;

        while (continua != 0){
            System.out.println("Digite o nome do produto: ");
            String nome = digita.next();

            System.out.println("Qual o valor do produto?");
            double valor = digita.nextDouble();
            valorTotal += valor;

            Produto produto = new Produto(nome, valor);
            listaDeCompras.adicionarProduto(produto);

            System.out.println("Digite 1 para adicionar mais produtos e 0 para encerrar e ir para o caixa!");
            continua = digita.nextInt();
        }
        System.out.println("\nCOMPRA ENCERRADA!");

        System.out.println("\n*********************************");

        listaDeCompras.mostrarLista();
        System.out.println("\nValor total da compra: R$" + valorTotal);
    }
}