package desafioCadastroAnimais.Service.PetsServices;

import desafioCadastroAnimais.Domain.Animal;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BuscarPet {

    public static void buscarPet() throws IOException, InterruptedException {
        List<Animal> animalList;
        Scanner scanner = new Scanner(System.in);


        System.out.println(""" 
                SELECIONE O FILTRO
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
                String nome = scanner.nextLine().toUpperCase();
                animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getNome().equals(nome));
                break;
            case "2":
                String sexo = scanner.nextLine().toUpperCase();
                animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getSexoAnimal().equals(sexo));
                break;
            case "3":
                String idade = scanner.nextLine().toUpperCase();
                animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getIdade().equals(idade));
                break;
            case "4":
                String peso = scanner.nextLine().toUpperCase();
                animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getPeso().equals(peso));
                break;
            case "5":
                String raca = scanner.nextLine().toUpperCase();
                animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getRaca().equals(raca));
                break;
            case "6":
                String endereco = scanner.nextLine().toUpperCase();
                animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getEndereco().equals(endereco));
                break;
//                case "7":
//                    String dataDeCadastro = scanner.nextLine().toUpperCase();
//                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.ge().equals(dataDeCadastro));
//                    System.out.println(animalList);
//                    return;
            default:
                throw new IllegalStateException("Escolha invalida: " + escolha1);
        }

        System.out.println("Deseja colocar outro filtro (Sim/Nao)");
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

            switch (escolha2) {
                case "1":
                    String nome = scanner.nextLine().toUpperCase();
                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getNome().equals(nome));
                    System.out.println(animalList);
                    break;
                case "2":
                    String sexo = scanner.nextLine().toUpperCase();
                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getSexoAnimal().equals(sexo));
                    System.out.println(animalList);
                    return;
                case "3":
                    String idade = scanner.nextLine().toUpperCase();
                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getIdade().equals(idade));
                    System.out.println(animalList);
                    return;
                case "4":
                    String peso = scanner.nextLine().toUpperCase();
                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getPeso().equals(peso));
                    System.out.println(animalList);
                    return;
                case "5":
                    String raca = scanner.nextLine().toUpperCase();
                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getRaca().equals(raca));
                    System.out.println(animalList);
                    return;
                case "6":
                    String endereco = scanner.nextLine().toUpperCase();
                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.getEndereco().equals(endereco));
                    System.out.println(animalList);
                    return;
//                case "7":
//                    String dataDeCadastro = scanner.nextLine().toUpperCase();
//                    animalList = Filter.Filtro(Pets.getPets(), animal -> animal.ge().equals(dataDeCadastro));
//                    System.out.println(animalList);
//                    return;

                default:
                    throw new IllegalStateException("Escolha invalida: " + escolha2);
            }
        }
        else {
            System.out.println(animalList);
        }
    }
}

