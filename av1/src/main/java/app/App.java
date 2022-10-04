package app;

import entities.*;

public class App {
    public static void main(String[] args) {
        Produtos produtos = new Produtos();
        
        Produto produto1 = new Produto(0, "123456", "129", "Monitor", "Monitor 27 polegadas", "Monitores", 1200.99, 3.2, "AOC");
        Produto produto2 = new Produto(1, "354876", "696", "Jurubeba Leão do Norte", "Cachaça da boa", "Bebidas", 49.99, 1.5, "Jurubeba");
        Produto produto3 = new Produto(2, "572168", "781", "Mouse", "Mouse com LED", "Mouse", 399.99, 0.2, "Razer");
        Produto produto4 = new Produto(3, "973215", "569", "Sabão em pó", "Sabão em pó azul", "Limpeza", 7.99, 1.5, "Vanish");
        
        produtos.addProduct(produto1);
        produtos.addProduct(produto2);
        produtos.addProduct(produto3);
        produtos.addProduct(produto4);
        
        //produtos.listAllProducts();
        
        produtos.changeProduct(1, 3);
        
        produtos.removeProduct(3);
        
        produtos.listProduct(1);
        
        produtos.listAllProducts();
        
        
    }
    
}
