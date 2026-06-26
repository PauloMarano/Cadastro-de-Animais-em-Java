package desafioCadastroAnimais.Service.PetsServices.CadastroPet;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Regexs.RegexsValidacao;
import desafioCadastroAnimais.Service.PetsServices.Pets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveInformacoes {

    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy'T'HHmm-");
    String dataHora = localDateTime.format(dateTimeFormatter);

    public void salvamento_respostas(String[] respostas) {Animal animal = new Animal();
        animal.animalFinal(respostas);


        if (RegrasCadastro.verificador(animal)) {
            System.out.println("Erro ao criar arquivo. Tente novamente!");
            return;
        }

        //salvando animal na List
        Pets.SaveAnimal(animal);

        //criando arquivo animal
        String nomeArquivo = dataHora + RegexsValidacao.removerEspacos(animal.getNome()) + ".txt";
        String[] animalFinal = {"Nome: " + animal.getNome(),
                "Endereco: " + animal.getEndereco(),
                "Idade: " + animal.getIdade(),
                "Peso: " + animal.getPeso(),
                "Sexo: " + animal.getSexoAnimal(),
                "Tipo: " + animal.getGatoOuChachorro(),
                "Raca: " + animal.getRaca(),
                "Data de Criação: " + animal.getDate()};

        File file = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados\\file.txt");
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File fileRename = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados", nomeArquivo);
        boolean fileNome = file.renameTo(fileRename);
        System.out.println("Cadastro Realizado: " + fileNome);

        try (FileWriter fileWriter = new FileWriter(fileRename);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (String string : animalFinal) {
                bufferedWriter.write(
                        string + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



