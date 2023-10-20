package programa;

import mercadinho.Bebidas;
import mercadinho.Produto;
import mercadinho.TipoBebida;

public class Programa1 {
    public static void main(String[] args) {
        Produto agua = new Produto("Agua", 2, 1.50, 1);
        agua.adicionarProduto(3);
        System.out.println(agua.getQuantidade());
        Bebidas suco = new Bebidas("suco de uva", 3, 3.48, 5685, TipoBebida.SUCO);
        suco.adicionarProduto(45);
        System.out.println(suco.getPreco());
        System.out.println(suco.getQuantidade());
    }
}
