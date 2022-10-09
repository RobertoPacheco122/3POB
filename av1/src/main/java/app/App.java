package app;

import java.util.Scanner;
import entities.*;

public class App {
    public static void exibirOpcoes(){
        System.out.println("1 = Adicionar produto");
        System.out.println("2 = Alterar produto");
        System.out.println("3 = Remover produto");
        System.out.println("4 = Listar todos produtos");
        System.out.println("5 = Listar um produto");
        System.out.println("6 = Encerrar execução");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produtos = new Produtos();
        int posicaoLista;
        int posicaoDado;
        
        Produto produto1 = new Produto(0, "123456", "129", "Monitor", "Monitor 27 polegadas", "Monitores", 1200.99, 3.2, "AOC");
        Produto produto2 = new Produto(1, "354876", "696", "Jurubeba Leão do Norte", "Cachaça da boa", "Bebidas", 49.99, 1.5, "Jurubeba");
        Produto produto3 = new Produto(2, "572168", "781", "Mouse", "Mouse com LED", "Mouse", 399.99, 0.2, "Razer");
        Produto produto4 = new Produto(3, "973215", "569", "Sabão em pó", "Sabão em pó azul", "Limpeza", 7.99, 1.5, "Vanish");
        
        produtos.addProduct(produto1);
        produtos.addProduct(produto2);
        produtos.addProduct(produto3);
        produtos.addProduct(produto4);
        
        System.out.printf("\n\nDigite uma opção:\n\n");
        exibirOpcoes();
        int opcao;

        opcao = sc.nextInt();

        while (opcao != 6){
            switch(opcao){
                case 1:
                    System.out.printf("\n\nDigite os dados do produto.\n\n");
                    Produto produto = new Produto(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
                    produtos.addProduct(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite a posicao do produto na lista para alterá-lo.");
                    posicaoLista = sc.nextInt();
                    System.out.println("Digite o dado que você quer alterar. 1 = Código de Barras; 2 = SKU; 3 = Nome; 4 = Descricao; 5 = Categoria; 6 = Preço; 7 = Peso; 8 = Fabricante");
                    posicaoDado = sc.nextInt();
                    produtos.changeProduct(posicaoLista, posicaoDado);
                    System.out.println("Produto alterado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite a posição do produto na lista para removê-lo");
                    produtos.removeProduct(sc.nextInt());
                    System.out.println("Produto removido com sucesso!");
                    break;
                case 4:
                    produtos.listAllProducts();
                    break;
                case 5:
                    System.out.println("Digite a posição do produto na lista para exibi-lo");
                    produtos.listProduct(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Encerrando execução.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.printf("\n\nDigite uma opção:\n\n");
            exibirOpcoes();
            opcao = sc.nextInt();
        }
        sc.close();
    }
}
