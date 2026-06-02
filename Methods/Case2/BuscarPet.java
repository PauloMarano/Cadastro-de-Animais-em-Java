package desafioCadastroAnimais.Methods.Case2;

import java.io.IOException;
import java.util.Scanner;

public class BuscarPet {
    public static void buscarPet() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Filtros filtros = new Filtros();

        System.out.println(""" 
                SELECIONE PELO OQUE VOCE ACHAR O PET
                1- Nome ou sobrenome
                2- Sexo
                3- Idade
                4- Peso
                5- Raça
                6- Endereço
                7- Data de Cadastro""");
        

        String escolha1 = scanner.nextLine();

        switch (escolha1) {
            case "1":
                filtros.nomeOuSobrenome();
                break;
            case "2":
                filtros.sexoPet();
                return;
            case "3":
                filtros.idadePet();
                return;
            case "4":
                filtros.pesoPet();
                return;
            case "5":
                filtros.racaPet();
                return;
            case "6":
                filtros.enderecoPet();
                return;
            case "7":
                filtros.dataDeCadastroPet();
                return;

        }

        System.out.println("Deseja colocar outro critério (S/N)");
        String escolhaOutroCriterio = scanner.nextLine().toUpperCase();

        if (escolhaOutroCriterio.equals("S") || escolhaOutroCriterio.equals("SIM")){
            System.out.println(""" 
                1- Nome ou sobrenome
                2- Sexo
                3- Idade
                4- Peso
                5- Raça
                6- Endereço
                7- Data de Cadastro""");
            String escolha2 = scanner.nextLine();

        }
        else {

        }
    }
}
