package entities;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private List<Produto> listaProdutos = new ArrayList<>();
    
    public Produto getProduto(int posicaoLista){
        return listaProdutos.get(posicaoLista);
    }
    
    public void addProduct(Produto produto){
        listaProdutos.add(produto);
    }
    
    public void changeProduct(int posicaoLista){
        System.out.println("Hello Wordl");
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
        System.out.printf("DADOS DO PRODUTO %d\n", posicaoLista + 1);
        System.out.printf("Id: %s\n", listaProdutos.get(posicaoLista).getId());
        System.out.printf("Código de Barras: %s\n", listaProdutos.get(posicaoLista).getCodigoBarras());
        System.out.printf("Sku: %s\n", listaProdutos.get(posicaoLista).getSku());
        System.out.printf("Nome: %s\n", listaProdutos.get(posicaoLista).getNome());
        System.out.printf("Descrição: %s\n", listaProdutos.get(posicaoLista).getDescricao());
        System.out.printf("Categoria: %s\n", listaProdutos.get(posicaoLista).getCategoria());
        System.out.printf("Preço: %.2f\n", listaProdutos.get(posicaoLista).getPreco());
        System.out.printf("Peso: %.2f\n", listaProdutos.get(posicaoLista).getPeso());
        System.out.printf("Fabricante: %s\n\n", listaProdutos.get(posicaoLista).getFabricante());
    }
}
