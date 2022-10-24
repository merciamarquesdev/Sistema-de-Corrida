package Principal;

public class CarroCorrida extends Piloto{
    private int numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(){

    }

    public CarroCorrida(int numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado){
        super(piloto.getNome(), piloto.getIdade(), piloto.getSexo(), piloto.getEquipe());
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public float acelerar(float velocidade){
        if (velocidadeAtual+velocidade <= velocidadeMaxima && ligado == true){
            return velocidadeAtual += velocidade;
        }
        else{
            System.out.println("Velocidade máxima atingida ou automóvel desligado. Não é possível acelerar.");
            return velocidadeAtual;
        }
    }

    public float frear(float velocidade) {
        if (velocidadeAtual-velocidade > 0 && ligado == true){
            return velocidadeAtual -= velocidade;
        }
        else {
            System.out.println("Automóvel parado ou desligado. Não é possível frear.");
            return velocidadeAtual;
        }
    }

    public void parar(){
        velocidadeAtual = 0;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        if(velocidadeAtual == 0){
            ligado = false;
        }
    }

    @Override
    public String toString() {
        return ("\n-------- Carro Corrida --------" +
                "\nNúmero do Carro: " + getNumeroCarro() +
                piloto +
                "\nVelocidade máxima: " + getVelocidadeMaxima() + " km/h" +
                "\nVelocidade atual: " + getVelocidadeAtual() + " km/h" +
                "\nCarro ligado: " + isLigado() +
                "\n-------------------------------");
    }
}
