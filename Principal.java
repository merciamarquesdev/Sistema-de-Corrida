package Principal;

public class Principal {
    public static void main(String[] args) {
        //Instanciando piloto e corrida
        Piloto piloto = new Piloto("Joao Pedro",30,Sexo.MASCULINO,"Tecnologia");
        CarroCorrida corrida = new CarroCorrida(10,piloto,100,50,true);

        //Exibindo informacoes originais sobre piloto e corrida
        System.out.println("\n--------* Informações originais *--------");
        System.out.println(corrida);

        //Modificacoes
        piloto.setNome("Joao Pedro Gomes"); //Altera nome do piloto para Joao Pedro Gomes
        piloto.setEquipe("Operacional"); //Altera equipe do piloto para Operacional
        corrida.acelerar(20); //Velocidade atual passa a ser 50+20 = 70 km/h
        corrida.setNumeroCarro(15); //Altera número do carro para 15
        corrida.parar(); //Para o automóvel
        corrida.frear(10); //Exibe mensagem de erro, pois nao é possivel frear se o automovel está parado
        corrida.desligar(); //Desliga o automóvel
        corrida.acelerar(30); //Exibe mensagem de erro, pois nao é possível acelerar com o automóvel desligado
        corrida.ligar(); //Liga o automovel
        corrida.acelerar(120); //Exibe mensagem de erro, pois a velocidade informada ultrapassa o limite de velocidade máxima;
        corrida.acelerar(60); //Velocidade atual passa a ser 60 km/h
        corrida.parar(); //Para o automovel
        corrida.desligar(); //Desliga o automóvel

        //Exibindo informacoes modificadas sobre piloto e corrida
        System.out.println("\n--------* Informações modificadas *--------");
        System.out.println(corrida);
    }
}
