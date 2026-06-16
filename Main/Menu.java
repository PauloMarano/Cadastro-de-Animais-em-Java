package desafioCadastroAnimais.Main;

import desafioCadastroAnimais.Service.PetsServices.Pets;
import desafioCadastroAnimais.Service.PetsServices.FilterSetDelet.BuscarPet;
import desafioCadastroAnimais.Service.QuestionsReading.LeituraCases;
import desafioCadastroAnimais.Service.PetsServices.CadastroPet.Cadastro;

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
                escolha = scanner.next();
                switch (escolha) {
                    case "1":
                        Cadastro.Perguntas();
                        break;
                    case "2":
                        BuscarPet.buscarPet();
                        break;
                    case "3":
                        Pets.TodosPets();
                        break;
                    case "4":
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

