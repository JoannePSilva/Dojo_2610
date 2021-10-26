package View;

import java.util.Scanner;

import Controller.PessoaController;
import Model.Pessoa;

public class PessoaView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaController pessoaController1 = new PessoaController();
        int opcao;
        do{
            opcao = menu(sc);
            menuOpcoes(sc, opcao, pessoaController1);
        }
        while(opcao !=0 && continuar(sc));
    }
    private static boolean continuar(Scanner sc){
        boolean valido;
        do{
            System.out.print("\n\tDeseja continuar? S/N");
            char op = sc.nextLine().toUpperCase().charAt(0);
            if(op == 'S' || op == 'N'){
                valido = true;
                if(op =='S'){
                    return true;
                }                
            }else{
                System.out.println("\n\tDigite apenas S ou N");
                valido = false;
            }
        }while(!valido);
        return false;
    }
    private static void menuOpcoes(Scanner sc,  int opcao, PessoaController pessoaController1) {
        
        Pessoa pessoa1;
        
        switch (opcao) {
            case 1:
                pessoa1 = new Pessoa();
                System.out.print("\tDigite o ID da pessoa: ");
                pessoa1.id = Integer.parseInt(sc.nextLine());
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
                    System.out.println(p);
                }
                break;

            case 3:
                pessoa1 = new Pessoa();
                System.out.print("\tDigite o ID da pessoa: ");
                pessoa1.id = Integer.parseInt(sc.nextLine());
                System.out.print("\tDigite o nome: ");
                pessoa1.nome = sc.nextLine();
                System.out.print("\tDigite o sobrenome: ");
                pessoa1.sobrenome = sc.nextLine();
                System.out.print("\tDigite a idade: ");
                pessoa1.idade = Integer.parseInt(sc.nextLine());
                pessoaController1.update(pessoa1);
                break;

            case 4:
                pessoa1 = new Pessoa();
                System.out.print("\tDigite o ID da pessoa: ");
                pessoa1.id = Integer.parseInt(sc.nextLine());
                pessoaController1.delete(pessoa1);
                break;
        
            case 0:
                System.out.println("\tAté Breve!");
                break;
        }
    }

    private static int menu(Scanner sc) {
        System.out.println("\t|========== Cadastro de Pessoas ==========|");

        System.out.println("\n\t1-Cadastrar \t2-Listar \t3-Alterar \t4-Deletar \t0-Sair");
        System.out.print("\n\tDigite uma das opções do menu acima: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }
    
}
