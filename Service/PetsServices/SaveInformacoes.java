package desafioCadastroAnimais.Service.PetsServices;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Service.PetsServices.CadastroPet.RegrasCadastro;
import desafioCadastroAnimais.Regexs.RegexsCase1;

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
    RegrasCadastro verificadorDeRegras = new RegrasCadastro();

    public void salvamento_respostas(String[] respostas) {
        //Salvando o Animal
        Animal animal = new Animal();
        animal.animalFinal(respostas);



        if (verificadorDeRegras.verificador(animal)){
            System.out.println("Erro ao criar arquivo. Tente novamente!");
        }
        else {
            //salvando animal na List
            Pets.SaveAnimal(animal);

            //criando arquivo animal
            String nomeArquivo = dataHora + RegexsCase1.removerEspacos(animal.getNome()) + ".txt";
            String[] animalFinal = {"Nome: " + animal.getNome(),
                    "Endereco: " + animal.getEndereco(),
                    "Idade: " + animal.getIdade(),
                    "Peso: " + animal.getPeso(),
                    "Sexo: " + animal.getSexoAnimal(),
                    "Tipo: " + animal.getGatoOuChachorro(),
                    "Raca: " + animal.getRaca()};

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
}



