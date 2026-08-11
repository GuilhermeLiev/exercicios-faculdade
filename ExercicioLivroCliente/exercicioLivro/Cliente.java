package exercicioLivro;
public class Cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;
    private Livro livroCliente;

    public Cliente(Livro livroCliente) {
        this.livroCliente = livroCliente;
    }

    public Cliente(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public Cliente (String nome, int idade, char sexo, String email, String senha, Livro livroCliente){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livroCliente = livroCliente;
    }

    public void imprimeInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Livro: " + livroCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", Livro=" + livroCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Livro getLivroCliente() {
        return livroCliente;
    }

    public void setLivroCliente(Livro livroCliente) {
        this.livroCliente = livroCliente;
    }
}


