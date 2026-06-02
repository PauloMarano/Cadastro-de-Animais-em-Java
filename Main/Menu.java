package desafioCadastroAnimais.Main;

import desafioCadastroAnimais.Methods.Pets;
import desafioCadastroAnimais.Methods.Case2.BuscarPet;
import desafioCadastroAnimais.Domain.LeituraCases;
import desafioCadastroAnimais.Methods.Case1.Cadastro;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        LeituraCases leituraArquivo = new LeituraCases();
        String escolha;
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                leituraArquivo.leitura_Cases();
                escolha = scanner.nextLine();
                switch (escolha) {
                    case "1":
                        Cadastro.Perguntas();
                        break;
                    case "2":
                        BuscarPet.buscarPet();
                        break;
                    case "3":
                        System.out.println("Alterar os dados do pet cadastrado");
                        break;
                    case "4":
                        Pets.TodosPets();
                        break;
                    case "5":
                        new Pets().DeletPet();
                        break;
                    case "6":
                        System.out.println("Saindo Do Menu, Obrigado");
                        return;
                    default:
                        System.out.println("Não existe essa opção, tente novamente");
                        break;
                }
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}

