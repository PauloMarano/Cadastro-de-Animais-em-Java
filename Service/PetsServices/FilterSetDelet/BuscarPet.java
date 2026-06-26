package desafioCadastroAnimais.Service.PetsServices.FilterSetDelet;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Service.PetsServices.Pets;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BuscarPet {

    public static void buscarPet() throws IOException, InterruptedException {
        List<Animal> animalList = Pets.getPets();
        Scanner scanner = new Scanner(System.in);
        boolean continuarFiltrando = true;
        int i = 0;

        while (continuarFiltrando) {
            System.out.println(""" 
                    SELECIONE O FILTRO
                    1- Nome ou sobrenome
                    2- Sexo
                    3- Idade
                    4- Peso
                    5- Raça
                    6- Endereço
                    7- Data de Cadastro
                    0- Sair""");

            String escolha1 = scanner.nextLine();

            if (escolha1.equals("0")) {
                break;
            }

            System.out.println("Digite: ");
            String filtro = scanner.nextLine().toUpperCase();

            switch (escolha1) {
                case "1" -> animalList = Filter.Filtro(animalList, animal -> animal.getNome().toUpperCase().contains(filtro));
                case "2" -> animalList = Filter.Filtro(animalList, animal -> animal.getSexoAnimal().equals(filtro));
                case "3" -> animalList = Filter.Filtro(animalList, animal -> animal.getIdade().equals(filtro));
                case "4" -> animalList = Filter.Filtro(animalList, animal -> animal.getPeso().equals(filtro));
                case "5" -> animalList = Filter.Filtro(animalList, animal -> animal.getRaca().toUpperCase().equals(filtro));
                case "6" -> animalList = Filter.Filtro(animalList, animal -> animal.getEndereco().toUpperCase().contains(filtro));
                case "7" -> animalList = Filter.Filtro(animalList, animal -> animal.getDate().contains(filtro));

                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("Deseja aplicar mais um filtro? (Sim/Nao)");
            String resposta = scanner.nextLine().toUpperCase();

            if (resposta.equals("N") || resposta.equals("NAO")) {
                continuarFiltrando = false;
            }
        }

        if (animalList.isEmpty()) {
            System.out.println("Nenhum animal foi encontrado com os filtros, voltando para o menu!");
            return;
        }

        for (Animal animal : animalList) {
            i += 1;
            System.out.println(i + " " + animal);
        }

        System.out.println("Selecione o Animal: ");

        int escolhaAnimal = scanner.nextInt() - 1;
        scanner.nextLine();

        if (escolhaAnimal < 0 || escolhaAnimal >= animalList.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Animal animalEscolhido = animalList.get(escolhaAnimal);
        System.out.println(animalEscolhido);

        System.out.println("""
                1- Alterar alguma informação do animal
                2- Excluir Animal
                0- Voltar para o menu""");

        String escolhaEdit = scanner.nextLine();

        switch (escolhaEdit) {
            case "1" -> {
                AlteracaoAnimal alteracaoAnimal = new AlteracaoAnimal();
                alteracaoAnimal.alteracao(animalEscolhido);
            }
            case "2" -> {
                DeletPet deletPet = new DeletPet();
                deletPet.Delet_Pet(animalEscolhido);
                System.out.println("Animal excluído com sucesso!");
            }
            default -> System.out.println("Voltando para o menu principal");
        }
    }
}



