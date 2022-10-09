package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {
    private List<Produto> listaProdutos = new ArrayList<>();
    
    public Produto getProduto(int posicaoLista){
        return listaProdutos.get(posicaoLista);
    }
    
    public void addProduct(Produto produto){
        listaProdutos.add(produto);
    }
    
    public void changeProduct(int posicaoLista, int posicaoDado){
        Scanner sc = new Scanner(System.in);
        switch(posicaoDado){
            case 1:
                System.out.println("Digite o novo Código de Barras:");
                listaProdutos.get(posicaoLista).setCodigoBarras(sc.next());
                break;
            case 2:
                System.out.println("Digite o novo SKU:");
                listaProdutos.get(posicaoLista).setSku(sc.next());
                break;
            case 3:
                System.out.println("Digite o novo Nome:");
                listaProdutos.get(posicaoLista).setNome(sc.next());
                break;
            case 4:
                System.out.println("Digite a nova Descricao:");
                listaProdutos.get(posicaoLista).setDescricao(sc.next());
                break;
            case 5:
                System.out.println("Digite a nova Categoria:");
                listaProdutos.get(posicaoLista).setCategoria(sc.next());
                break;
            case 6:
                System.out.println("Digite o novo Preço:");
                listaProdutos.get(posicaoLista).setPreco(sc.nextDouble());
                break;
            case 7:
                System.out.println("Digite o novo Peso:");
                listaProdutos.get(posicaoLista).setPeso(sc.nextDouble());
                break;
            case 8:
                System.out.println("Digite o novo Fabricante:");
                listaProdutos.get(posicaoLista).setFabricante(sc.next());
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    
    public void removeProduct(int posicaoLista){
        listaProdutos.remove(posicaoLista);
    }
    
    public void listAllProducts(){
        for(int i = 0; i < listaProdutos.size(); i++){
            listProduct(i);
        }
    }
    
    public void listProduct(int posicaoLista){
        System.out.printf("\n\nDADOS DO PRODUTO %d\n", posicaoLista);
        System.out.printf("Id: %s\n", listaProdutos.get(posicaoLista).getId());
        System.out.printf("Código de Barras: %s\n", listaProdutos.get(posicaoLista).getCodigoBarras());
        System.out.printf("Sku: %s\n", listaProdutos.get(posicaoLista).getSku());
        System.out.printf("Nome: %s\n", listaProdutos.get(posicaoLista).getNome());
        System.out.printf("Descrição: %s\n", listaProdutos.get(posicaoLista).getDescricao());
        System.out.printf("Categoria: %s\n", listaProdutos.get(posicaoLista).getCategoria());
        System.out.printf("Preço: %.2f\n", listaProdutos.get(posicaoLista).getPreco());
        System.out.printf("Peso: %.2fKg\n", listaProdutos.get(posicaoLista).getPeso());
        System.out.printf("Fabricante: %s\n\n", listaProdutos.get(posicaoLista).getFabricante());
    }
}
