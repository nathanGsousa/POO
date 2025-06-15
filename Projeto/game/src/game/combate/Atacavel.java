package game.combate;

public interface Atacavel {

    //Garante que todo Atacavel sofre dano
    void sofrerDano(int dano);

    //Garante um método para saber se está vivo
    boolean estaVivo();

    //Get para saber o nome do atacavel
    String getNome();

}
