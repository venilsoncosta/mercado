package mercadinho;

public class Frutas extends Produto{
    private TiposDeFrutas tiposDeFrutas;

    public Frutas(TiposDeFrutas tiposDeFrutas) {
        this.tiposDeFrutas = tiposDeFrutas;
    }

    public TiposDeFrutas getTiposDeFrutas() {
        return tiposDeFrutas;
    }

    public void setTiposDeFrutas(TiposDeFrutas tiposDeFrutas) {
        this.tiposDeFrutas = tiposDeFrutas;
    }

    @Override
    public void aplicarDesconto() {
        double precoAtual = getPreco();
        double desconto = precoAtual * 0.01;
        setPreco(precoAtual - desconto);
    }
}
