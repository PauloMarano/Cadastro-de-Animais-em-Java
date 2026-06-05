package desafioCadastroAnimais.Service.PetsServices;

import desafioCadastroAnimais.Domain.Animal;
import java.util.ArrayList;
import java.util.List;

public class Pets {
    private static List<Animal> pets = new ArrayList<>();

    public static void SaveAnimal(Animal animal) {
        pets.add(animal);
    }

    public static List<Animal> TodosPets() {
        int i = 0;
        for (Animal pet : pets) {
            i += 1;
            System.out.println(i + "- " + pet.getNome());
        }
        return pets;
    }

    public static List<Animal> getPets() {
        return pets;
    }
}
