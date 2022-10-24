package Principal;

public class Piloto {
    private String nome;
    private int idade;
    private Sexo sexo;
    private String equipe;

    public Piloto(){

    }

    public Piloto(String nome, int idade, Sexo sexo, String equipe){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String toString() {
        return ("\n------ Piloto ------" +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade() + " anos" +
                "\nSexo: " + getSexo() +
                "\nEquipe: " + getEquipe() +
                "\n---------------------");
    }
}
