package mercadinho;

public abstract class Produto {
    private String nome;
    private int estoque;
    private double preco;
    private int codigo;

    public Produto() {
    }

    public Produto(String nome, int estoque, double preco, int codigo) {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido!");
        }
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

    public abstract void aplicarDesconto();

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
