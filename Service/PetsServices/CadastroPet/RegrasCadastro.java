package desafioCadastroAnimais.Service.PetsServices.CadastroPet;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Regexs.RegexsValidacao;


public class RegrasCadastro {

    public static boolean verificador(Animal animal) {
        RegexsValidacao regexs = new RegexsValidacao();
        boolean verifique = false;

        try {
            if (!animal.getPeso().equals("NAO_INFORMADO")) {
                if (Double.parseDouble(animal.getIdade()) > 20.0) {
                    System.out.println("Idade Invalida do seu pet invalida");
                    verifique = true;
                }
                if (Double.parseDouble(animal.getPeso()) > 60.0 || Double.parseDouble(animal.getPeso()) < 0.5) {
                    System.out.println("Peso do seu pet Invalido");
                    verifique = true;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Idade/Peso invalido! Digite somente numeros nesses campos!");
            verifique = true;
        }
        if (!regexs.nomeComposto(animal.getNome()) || !regexs.apenasLetras(animal.getNome())) {
            System.out.println("Nome do pet Invalido, Tente novamente");
            verifique = true;
        }
        if (regexs.filtroRaca(animal.getRaca())) {
            System.out.println("Raca Invalida, Tente novamente");
            verifique = true;
        }
        return verifique;
    }
}





