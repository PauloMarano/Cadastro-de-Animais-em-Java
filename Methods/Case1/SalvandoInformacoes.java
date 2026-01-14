package desafioCadastroAnimais.Methods.Case1;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Domain.GatoOuCachorro;
import desafioCadastroAnimais.Domain.SexoAnimal;
import desafioCadastroAnimais.Regexs.RegexsCase1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalvandoInformacoes {
    public void salvamento_respostas(String[] respostas) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy'T'HHmm-");
        String dataHora = localDateTime.format(dateTimeFormatter);
        VerificadorDeRegras verificadorDeRegras = new VerificadorDeRegras();

        RegexsCase1 regexs = new RegexsCase1();
        Animal animal = new Animal();

        animal.setNome(respostas[0]);
        animal.setRaca(respostas[6]);
        animal.setSexoAnimal(SexoAnimal.valueOf(respostas[2].toUpperCase()));
        animal.setEndereco(respostas[3]);
        animal.setGatoOuChachorro(GatoOuCachorro.valueOf(respostas[1].toUpperCase()));
        animal.setPeso(respostas[4]);
        animal.setIdade(respostas[5]);

        if (verificadorDeRegras.verificador(animal)) return;
        else {
            String nomeArquivo = dataHora + RegexsCase1.removerEspacos(animal.getNome()) + ".txt";
            String[] animalFinal = {"Nome: " + animal.getNome(), "Endereco: " + animal.getEndereco(), ("Idade: ") + animal.getIdade(), "Peso: " + animal.getPeso(), "Sexo: " + animal.getSexoAnimal(), "Tipo: " + animal.getGatoOuChachorro(), "Raca: " + animal.getRaca()};

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
                    bufferedWriter.write(string + "\n");
                    bufferedWriter.flush();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (FileWriter fileWriter = new FileWriter("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados\\animaisCadastradosJuntos.txt", true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                for (String string : animalFinal) {
                    bufferedWriter.write(string + "\n");
                    bufferedWriter.flush();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



