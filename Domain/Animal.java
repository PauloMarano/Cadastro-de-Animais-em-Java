package desafioCadastroAnimais.Domain;

public class Animal {

    private String nome;
    private String endereco;
    private String raca;
    private String  idade;
    private String peso;
    private SexoAnimal sexoAnimal;
    private GatoOuCachorro gatoOuChachorro;
    public static String NAO_INFORMADO = "NAO_INFORMADO";

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public SexoAnimal getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(SexoAnimal sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public GatoOuCachorro getGatoOuChachorro() {
        return gatoOuChachorro;
    }

    public void setGatoOuChachorro(GatoOuCachorro gatoOuChachorro) {
        this.gatoOuChachorro = gatoOuChachorro;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", raca='" + raca + '\'' +
                ", idade='" + idade + '\'' +
                ", peso='" + peso + '\'' +
                ", sexoAnimal=" + sexoAnimal +
                ", gatoOuChachorro=" + gatoOuChachorro +
                '}';
    }

    public final void animalFinal(String [] strings){
        if (strings[0] != null) setNome(strings[0]); else setNome(NAO_INFORMADO);
        if (strings[6] != null) setRaca(strings[6]); else setRaca(NAO_INFORMADO);
        if (strings[2] != null) setSexoAnimal(SexoAnimal.valueOf(strings[2].toUpperCase())); else setSexoAnimal(SexoAnimal.valueOf(NAO_INFORMADO));
        if (strings[3] != null) setEndereco(strings[3]); else setEndereco(NAO_INFORMADO);
        if (strings[1] != null)  setGatoOuChachorro(GatoOuCachorro.valueOf(strings[1].toUpperCase())); else setGatoOuChachorro(GatoOuCachorro.valueOf(NAO_INFORMADO));
        if (strings[4] != null) setIdade((strings[4])); else setIdade(NAO_INFORMADO);
        if (strings[5] != null) setPeso((strings[5])); else setPeso(NAO_INFORMADO);
    }
}
