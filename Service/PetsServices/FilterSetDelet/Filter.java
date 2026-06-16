package desafioCadastroAnimais.Service.PetsServices.FilterSetDelet;


import desafioCadastroAnimais.Domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static List <Animal> Filtro (List<Animal> animals, Predicate <Animal> animalPredicate){
        List<Animal> animalList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animalPredicate.test(animal)){
                animalList.add(animal);
            }
        }
        return animalList;
    }
}

