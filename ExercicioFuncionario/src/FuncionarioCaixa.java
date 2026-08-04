public class FuncionarioCaixa {
    private String nome;
    private String endereco;
    private char sexo;
    private Calculadora calculadora;

    public FuncionarioCaixa(){
        this.nome  = "Sem nome";
        this.endereco = "Sem endereço";
        this.sexo = 'M';
        this.calculadora = new Calculadora("Preto");
    }

    public FuncionarioCaixa(String nome, String endereco, char sexo, Calculadora calculadora){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;

    }

    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //calculadora
    public Calculadora getCalculadora() {
        return calculadora;
    }
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double soma(double a, double b){
        return calculadora.soma(a, b);
    }

    public double subtrai(double a, double b){
        return calculadora.subtrai(a, b);
    }
    
    public double multiplica(double a, double b){
        return calculadora.multiplica(a, b);
    }

    public double divide(double a, double b) {
        return calculadora.divide(a, b);
    }

    public int elevarAoQuadrado(int valor) {
        return calculadora.elevarAoQuadrado(valor);
    }

    public int elevarAoCubo(int valor){
        return calculadora.elevarAoCubo(valor);
    }

    //imprimir informações

    public void imprimeInfo(){
        System.out.println("INFORMAÇÕES FUNCIONÁRIO CAIXA:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco );
        System.out.println("Sexo: " + sexo);
        calculadora.imprimeInfo();
        System.out.println("===========================");
    }

    
}
