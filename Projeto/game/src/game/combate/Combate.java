package game.combate;

public interface Combate {

    // Retorna o nome da arma equipada
    String getNomeArma();

    // Retorna o dano da arma equipada
    int getDano();

    // Retorna o alcance da arma equipada
    int getAlcance();

    // Atacar o inimigo (se estiver no alcance, causa dano)
    void atacar(Combate inimigo, int distancia);

    // Sofrer dano recebido em um ataque
    void sofrerDano(int dano);

    // Retorna se o personagem ainda está vivo
    boolean estaVivo();

    // Retorna o nome do personagem (ex: "Guerreiro", "Mago")
    String getClasse();

    // Retorna a vida atual do personagem
    int getVida();
}
