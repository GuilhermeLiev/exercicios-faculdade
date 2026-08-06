import java.util.Scanner;

public class Teste {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Criando funcionario
        System.out.println("Criando primeiro Funcionario:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Sexo (M/F): ");
        char sexo = sc.nextLine().charAt(0);

        System.out.print("Cor da caculadora: ");
        String corCalc = sc.nextLine();

        //Criando calculadora
        Calculadora calculadora = new Calculadora(corCalc);

        //Criando funcionario
        FuncionarioCaixa funcionario = new FuncionarioCaixa(nome, endereco, sexo, calculadora);

        //Resultado das operações
        System.out.println("2 + 2 = " + funcionario.soma(2, 2));
        System.out.println("5 - 4 = " + funcionario.subtrai(5, 4));
        System.out.println("2 x 3 = " + funcionario.multiplica(2, 3));
        System.out.println("6 / 3 = " + funcionario.divide(6, 3));
        System.out.println("7² = " + funcionario.elevarAoQuadrado(7));
        System.out.println("8³ = " + funcionario.elevarAoCubo(8));

        //Segundo funcionário
        System.out.println("Criando segundo funcionário: ");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco2 = sc.nextLine();

        System.out.print("Sexo (M/F): ");
        char sexo2 = sc.nextLine().charAt(0);

        System.out.println("Cor da calculadora: ");
        String cor2 = sc.nextLine();

         Calculadora calc2 = new Calculadora(cor2);

          FuncionarioCaixa funcionario2 = new FuncionarioCaixa(nome2, endereco2, sexo2, calc2);

        System.out.println("Cadastro Empresa: ");
        
        System.out.print("Nome da empresa: ");
        String nomeEmpresa = sc.nextLine();
        
        // Criando a empresa com o nome + os dois funcionários
        Empresa empresa1 = new Empresa(nomeEmpresa, funcionario, funcionario2);
        
        //imprimir
        empresa1.imprimeInfo();
        



        sc.close();

    }

}
