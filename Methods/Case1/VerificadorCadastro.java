package desafioCadastroAnimais.Methods.Case1;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Regexs.RegexsCase1;


public class VerificadorCadastro {
    public boolean verificador(Animal animal) {
        RegexsCase1 regexs = new RegexsCase1();
        boolean verifique = false;
        for (int i = 0; i < 1; i++) {
            if (!animal.getPeso().equals("NAO_INFORMADO")) {
                if (Double.valueOf(animal.getIdade()) > 20.0) {
                    System.out.println("Idade Invalida do seu pet invalida");
                    verifique = true;
                }
                if (Double.valueOf(animal.getPeso()) > 60.0 || Double.valueOf(animal.getPeso()) < 0.5) {
                    System.out.println("Peso do seu pet Invalido");
                    verifique = true;
                }
            }
            if (!regexs.nomeComposto(animal.getNome())) {
                System.out.println("Nome do pet Invalido, Tente novamente");
                verifique = true;
            }
            if (regexs.filtroRaca(animal.getRaca())) {
                System.out.println("Raca Invalida, Tente novamente");
                verifique = true;
            }
        }
        return verifique;
    }
}



