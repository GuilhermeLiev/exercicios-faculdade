public class Empresa {
    private String nome;
    private FuncionarioCaixa funcionario1;
    private FuncionarioCaixa funcionario2;

    public Empresa(String nome, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2){
        this.nome = nome;
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
    }

    public Empresa(String nome){
        this.nome = nome;
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    public Empresa(){
        this.nome = "Sem nome";
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    //getters e setters
    public FuncionarioCaixa getFuncionario1() {
        return funcionario1;
    }
    public void setFuncionario1(FuncionarioCaixa funcionario1) {
        this.funcionario1 = funcionario1;
    }
    public FuncionarioCaixa getFuncionario2() {
        return funcionario2;
    }
    public void setFuncionario2(FuncionarioCaixa funcionario2) {
        this.funcionario2 = funcionario2;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeInfo() {
    System.out.println("=== INFORMAÇÕES EMPRESA ===");
    System.out.println("Nome: " + nome);
    
    
    if (funcionario1 != null) {
        System.out.println("\n--- Funcionário 1 ---");
        funcionario1.imprimeInfo();
    } else {
        System.out.println("\nFuncionário 1: Não cadastrado");
    }
    
    // Funcionário 2
    if (funcionario2 != null) {
        System.out.println("\n--- Funcionário 2 ---");
        funcionario2.imprimeInfo();
    } else {
        System.out.println("\nFuncionário 2: Não cadastrado");
    }
    
    System.out.println("==========================");
}


}
