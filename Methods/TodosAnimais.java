package desafioCadastroAnimais.Methods;

import java.io.*;


public class TodosAnimais {
    public static void todosOsAnimais() {
        File file = new File("C:\\Users\\Paulin\\IdeaProjects\\Projetin Java\\src\\desafioCadastroAnimais\\AnimaisCadastrados\\animaisCadastradosJuntos.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while (bufferedReader.readLine() != null){
                System.out.println(bufferedReader.readLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
