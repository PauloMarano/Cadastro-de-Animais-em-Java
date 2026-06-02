package desafioCadastroAnimais.Methods;


import desafioCadastroAnimais.Domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pets {
    private static List<Animal> pets = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void SaveAnimal(Animal animal) {
        pets.add(animal);
    }

    public static void TodosPets() {
        int i = 0;
        for (Animal pet : pets) {
            i += 1;
            System.out.println(i + "- " + pet.getNome());
        }
    }

    public final void DeletPet() {
        int i = 0;
        for (Animal pet : pets) {
            i += 1;
            System.out.println(i + "- " + pet.getNome());
        }
        if (pets.isEmpty()) {
            System.out.println("Nenhum animal cadastrado");

        } else {
            while (true) {
                System.out.println("-Qual animal voce deseja excluir, pela numeração: ");
                System.out.println("0- para sair ");
                int resposta_Numeracao = scanner.nextInt();
                resposta_Numeracao -= 1;
                if (resposta_Numeracao == -1) {
                    System.out.println("Saindo....");
                    break;
                }
                if (i > resposta_Numeracao) {
                    System.out.println("Voce tem certeza que deseja excluir o animal: " + pets.get(resposta_Numeracao).getNome()
                            + " da raça " + pets.get(resposta_Numeracao).getRaca() + " (Sim/Não)");

                    String resposta_Confirmacao = scanner.next();

                    if (resposta_Confirmacao.toUpperCase().equals("SIM")) {
                        pets.remove(resposta_Numeracao);
                        System.out.println("Pet removido com sucesso");
                        break;
                    } else {
                        System.out.println("Tente Novamente");
                    }
                } else {
                    System.out.println("Resposta Invalida! Digite a numeração correta");
                }
            }
        }
    }
}
