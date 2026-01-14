package desafioCadastroAnimais.Regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexsCase1 {

    public boolean apenasLetras(String texto) {
        if (texto != null) {
            String regex = "([A-Za-z])";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(texto);
            return matcher.find();
        }
        return false;
    }

    public boolean nomeComposto(String texto) {
        if (texto == null) {
            return true;
        }
        String regex = "^\\s*[a-zA-Z]+\\s+[a-zA-Z]+\\s*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    public boolean filtroRaca(String texto) {
        if (texto == null) {
            return true;
        }
        String regex = "^\\s*[a-zA-Z]+\\s+[a-zA-Z]+\\s*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    public static boolean naoInformado(String texto) {
        if (texto == null) {
            return true;
        }
        String regex = "^\\s*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    public static String removerEspacos(String texto) {
        return texto.replaceAll("\\s+", "");
    }
}
