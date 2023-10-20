package mercadinho;

public class Bebidas extends Produto{
    protected TipoBebida tipoDeBebida;

    public Bebidas(String nome, int estoque, double preco, int codigo, TipoBebida tipoDeBebida) {
        super(nome, estoque, preco, codigo);
        this.tipoDeBebida = tipoDeBebida;
    }

    public TipoBebida getTipoDeBebida() {
        return tipoDeBebida;
    }

    public void setTipoDeBebida(TipoBebida tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }
}