public class Produto {
    private int nome;
    private int preco;
    private Data dataValidade;


    public Produto(int nome, int preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //getters and setters
    public Data getDataValidade() {
        return dataValidade;
    }

    public int getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean verificaProdutoVencido(Data dataAtual) {
        if (dataAtual.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() == dataValidade.getAno() &&
                dataAtual.getMes() > dataValidade.getMes()) {
            return true;
        } else if (dataAtual.getAno() == dataValidade.getAno() &&
                dataAtual.getMes() == dataValidade.getMes() &&
                dataAtual.getDia() > dataValidade.getDia()) {
            return true;
        }
        return false;

    }


    @Override
    public String toString() {
        return "=== INFORMAÇÕES PRODUTO ===\n" +
                "Data de Validade: " + dataValidade + "\n" +
                "Nome: " + nome + "\n" +
                "Preço: " + preco;
    }
}
