package mercadinho;

public class Produto {
    protected String nome;
    protected int estoque;
    protected double preco;
    protected int codigo;

    public Produto(String nome, int estoque, double preco, int codigo) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.codigo = codigo;
    }

    public void adicionarProduto(int quantidade){
        if(quantidade > 0){
            this.estoque += quantidade;
        }
    }

    public void removerProduto(int quantidade){
        if(quantidade > 0){
            this.estoque -= quantidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return estoque;
    }

    public void setQuantidade(int quantidade) {
        this.estoque = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
