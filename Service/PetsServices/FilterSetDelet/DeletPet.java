package desafioCadastroAnimais.Service.PetsServices.FilterSetDelet;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Service.PetsServices.Pets;

import java.util.List;
import java.util.Scanner;

public class DeletPet {
    Scanner scanner = new Scanner(System.in);
    List<Animal> pets = Pets.getPets();

    public void Delet_Pet(Animal animal) {

        System.out.println("Deseja excluir realmente este animal: (Sim/Nao");
        System.out.println("0- para sair ");

        String respostaConfirmacao = scanner.nextLine();

        if (respostaConfirmacao.toUpperCase().equals("SIM")) {
            pets.remove(animal);
            System.out.println("Pet removido com sucesso");
            Pets.setPets(pets);
        } else {
            System.out.println("Voltando Para o menu");
        }
    }
}



