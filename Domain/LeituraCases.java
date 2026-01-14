package desafioCadastroAnimais.Domain;

import java.io.*;


public class LeituraCases {
    public void leitura_Cases() throws IOException {
        File file_Cases = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\Cases.txt");
        System.out.println("================= Bem vindo ao menu =================");
        FileReader fileReader_Cases = new FileReader(file_Cases);
        BufferedReader bufferedReader_Cases = new BufferedReader(fileReader_Cases);
        String linha;
        while ((linha = bufferedReader_Cases.readLine()) != null){
            System.out.println(linha);
        }
    }
}
