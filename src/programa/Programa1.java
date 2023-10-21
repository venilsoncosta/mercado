package programa;

import mercadinho.*;

public class Programa1 {
    public static void main(String[] args) {
        Bebidas suco = new Bebidas(TipoBebida.SUCO);
        suco.adicionarProduto(45);
        suco.removerProduto(4);
        suco.setPreco(3.48);
        System.out.println(suco.getPreco());
        System.out.println(suco.getQuantidade());

        Frutas banana = new Frutas(TiposDeFrutas.BANANA);
        banana.setPreco(1.57);
        System.out.println("Preço da banana sem desconto " + banana.getPreco());
        banana.aplicarDesconto();
        System.out.println("Preço da banana com desconto " + banana.getPreco());
    }
}
