package desafioCadastroAnimais.Regexs;

import desafioCadastroAnimais.Domain.LeitorAnimais;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexsCase2 {
    RegexsCase1 regexsCase1 = new RegexsCase1();

    public boolean nomeSobrenome(String texto) throws IOException {
        if (regexsCase1.apenasLetras(texto)) {
            Pattern pattern = Pattern.compile(texto.toUpperCase());
            Matcher matcher = pattern.matcher(LeitorAnimais.leituraAnimais());
            System.out.println(matcher.find());
        }
        return false;
    }
}

