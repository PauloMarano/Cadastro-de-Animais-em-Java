package desafioCadastroAnimais.Methods.Case2;

import desafioCadastroAnimais.Regexs.RegexsCase2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Filtros {
    RegexsCase2 regexsCase2 = new RegexsCase2();
    Scanner scanner = new Scanner(System.in);

    public void nomeOuSobrenome() throws IOException {
        System.out.print("Digite o nome ou sobrenome do Pet: ");
        String texto = scanner.nextLine();
        if (!regexsCase2.nomeSobrenome(texto)){

        }
    }

    public final void sexoPet() {
        System.out.print("Digite o nome ou sobrenome do Pet: ");
        String texto = scanner.nextLine();
    }

    public final void idadePet() {
        System.out.println("Digite o nome ou sobrenome do Pet: ");
        String texto = scanner.nextLine();
    }

    public final void pesoPet() {
        System.out.println("Digite o nome ou sobrenome do Pet: ");
        String texto = scanner.nextLine();
    }

    public final void racaPet() {
        System.out.println("Digite o nome ou sobrenome do Pet: ");
        String texto = scanner.nextLine();
    }

    public final void enderecoPet() {
        System.out.println("Digite o nome ou sobrenome do Pet: ");
        String texto = scanner.nextLine();
    }

    public final void dataDeCadastroPet() {
        System.out.println("Digite o nome ou sobrenome do Pet: ");
        String texto = scanner.nextLine();
    }
}

