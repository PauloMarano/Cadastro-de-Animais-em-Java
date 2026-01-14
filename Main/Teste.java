package desafioCadastroAnimais.Main;

import desafioCadastroAnimais.Domain.LeitorAnimais;

import java.io.IOException;

public class Teste {
    public static void main(String[] args) {
        try {
            LeitorAnimais.leituraAnimais();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



