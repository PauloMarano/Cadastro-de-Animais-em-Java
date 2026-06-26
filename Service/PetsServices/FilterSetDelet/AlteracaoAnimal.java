package desafioCadastroAnimais.Service.PetsServices.FilterSetDelet;

import desafioCadastroAnimais.Domain.Animal;

import java.util.Scanner;

public class AlteracaoAnimal {
    Scanner scanner = new Scanner(System.in);

    public final void alteracao(Animal animal) {
        System.out.println("""
                Oque Deseja Alterar:
                1- Nome
                2- Endereço
                3- Raça
                4- Idade
                5- Peso
                0- Sair para o menu""");

        String escolha = scanner.nextLine();

        if (escolha.equals("0")) {
            System.out.println("Voltando para o menu");
            return;
        }

        System.out.println("Digite para alterar: ");
        String novoDado = scanner.nextLine();

        System.out.println("Confirmar Alteração: (Sim/Não");
        String confirmacao = scanner.nextLine().toUpperCase();

        if (confirmacao.equals("NAO") || confirmacao.equals("N")) return;

        try {
            switch (escolha) {
                case "1" -> animal.setNome(novoDado);
                case "2" -> animal.setEndereco(novoDado);
                case "3" -> animal.setRaca(novoDado);
                case "4" -> animal.setIdade(novoDado);
                case "5" -> animal.setPeso(novoDado);
            }

            System.out.println("Alteração concluída");
            System.out.println(animal);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Valor inválido para o tipo/sexo do animal. Alteração não realizada.");

        }
    }
}
