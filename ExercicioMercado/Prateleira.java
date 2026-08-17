public class Prateleira {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;


    public Prateleira(Produto produto1, Produto produto2, Produto produto3) {
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }

    public Prateleira() {
        this.produto1 = null;
        this.produto2 = null;
        this.produto3 = null;
    }

    //getters and setters

    public Produto getProduto1() {
        return produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public Produto getProduto3() {
        return produto3;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }

    public void setProduto3(Produto produto3) {
        this.produto3 = produto3;
    }


    public Produto produtoMaisCaro() {
        Produto maisCaro = null;
        double maiorPreco = -1;
        if (produto1 != null && produto1.getPreco() > maiorPreco) {
            maisCaro = produto1;
            maiorPreco = produto1.getPreco();
        }

        if (produto2 != null && produto2.getPreco() > maiorPreco) {
            maisCaro = produto2;
            maiorPreco = produto2.getPreco();
        }

        if (produto3 != null && produto3.getPreco() > maiorPreco) {
            maisCaro = produto3;
            maiorPreco = produto3.getPreco();
        }
        return maisCaro;
    }

}
