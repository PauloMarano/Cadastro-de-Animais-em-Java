package desafioCadastroAnimais.Domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeitorAnimais {
    public static String leituraAnimais() throws IOException {
        File fileAnimais = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados\\animaisCadastradosJuntos.txt");
        FileReader fileReaderAnimais = new FileReader(fileAnimais);
        BufferedReader bufferedReaderAnimais = new BufferedReader(fileReaderAnimais);
        String linha;
        String texto = "";
        while ((linha = bufferedReaderAnimais.readLine()) != null){
            texto += linha +
                    """
                    
                    """;
        }
        return texto;
    }
}
