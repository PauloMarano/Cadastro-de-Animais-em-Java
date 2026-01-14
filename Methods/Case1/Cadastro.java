package desafioCadastroAnimais.Methods.Case1;

import desafioCadastroAnimais.Domain.Animal;
import desafioCadastroAnimais.Regexs.RegexsCase1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Cadastro {
    public static void Perguntas() throws IOException {
        SalvandoInformacoes salvandoInformacoes = new SalvandoInformacoes();
        VerificadorDeRegras verificadorDeRegras = new VerificadorDeRegras();
        File file_Perguntas = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\Perguntas.txt");
        FileReader fileReader = new FileReader(file_Perguntas);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[7];
        String linha;

        int i = 0;

        try {
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                String resposta = scanner.nextLine().toUpperCase();
                respostas[i] = resposta.toUpperCase();
                if (RegexsCase1.naoInformado(respostas[i])){
                    respostas[i] = Animal.NAO_INFORMADO;
                }
                i += 1;
            }


        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            salvandoInformacoes.salvamento_respostas(respostas);
        }

    }
}

