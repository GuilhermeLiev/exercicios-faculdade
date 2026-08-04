public class Calculadora {
    private double memoria;
    private String cor;

    public Calculadora(String cor) {
        this.memoria = 0.00;
        this.cor = cor;
    }
     
    //SETTERS AND GETTERS
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double getMemoria() {
        return memoria;
    }

    public double soma(double a, double b){
        return a + b;
    }

    public double subtrai(double a, double b){
        return a - b;
    }

    public double multiplica(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;

    }

    // Operações especiais com valor inteiro
    public int elevarAoQuadrado(int valor) {
        return valor * valor;
    }

    public int elevarAoCubo(int valor) {
        return valor * valor * valor;
    }

     // Método para imprimir informações
    public void imprimeInfo() {
        System.out.println("=== CALCULADORA ===");
        System.out.println("Cor: " + cor);
        System.out.println("Memória: " + memoria);
        System.out.println("===================");
    }
    
}