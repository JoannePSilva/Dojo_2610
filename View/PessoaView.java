package View;

import java.util.Scanner;

import Controller.PessoaController;
import Model.Pessoa;

public class PessoaView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1;
        PessoaController pessoaController1 = new PessoaController();

        System.out.println("\t|========== Cadastro de Pessoas ==========|");

        System.out.println("\n\t1-Cadastrar \t2-Listar \t3-Alterar \t4-Deletar \t0-Sair");
        System.out.print("\n\tDigite uma das opções do menu acima: ");
        int opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                pessoa1 = new Pessoa();
                System.out.print("\tDigite o nome: ");
                pessoa1.nome = sc.nextLine();
                System.out.print("\tDigite o sobrenome: ");
                pessoa1.sobrenome = sc.nextLine();
                System.out.print("\tDigite a idade: ");
                pessoa1.idade = Integer.parseInt(sc.nextLine());
                pessoaController1.create(pessoa1);
                break;
            case 2:
                for (Pessoa p : pessoaController1.read()) {
                    System.out.printf("\tNome: %s - Sobrenome: %s - Idade: %d ", p.nome, p.sobrenome, p.idade);
                }
                break;

            case 3:
                pessoa1 = new Pessoa();
                System.out.print("\tDigite a idade: ");
                pessoa1.idade = Integer.parseInt(sc.nextLine());
                pessoaController1.update(pessoa1);
                break;

            case 4:
                pessoa1 = new Pessoa();
                System.out.print("\tDigite o ID da pessoa: ");
                int id = Integer.parseInt(sc.nextLine());
                break;
        
            case 0:
            System.out.println("\tAté Breve!");
                break;
        }
    }
    
}
