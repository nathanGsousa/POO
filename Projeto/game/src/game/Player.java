package game;

import game.classes.Classes;
import game.classes.LongDistance;
import game.classes.Melee;
import game.classes.Tank;

public class Player {

    private String nome;
    private Classes personagem; // Pode ser Melee, Tank ou LongDistance
    private final int VIDA;

    public Player(String nome, String tipoClasse) {
        this.nome = nome;

        switch (tipoClasse.toLowerCase()) {
            case "melee":
                this.personagem = new Melee(nome);
                break;
            case "tank":
                this.personagem = new Tank(nome);
                break;
            case "longdistance":
                this.personagem = new LongDistance(nome);
                break;
            default:
                throw new IllegalArgumentException("Classe inválida: " + tipoClasse);
        }
        this.VIDA = personagem.getVida();
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return personagem.getClasse();
    }

    public String getClasseCombate() {
        return personagem.getClasseCombate();
    }

    public int getVida() {
        return personagem.getVida();
    }

    public int getAlcance(){
        return personagem.getAlcance();
    }

    public int getDano(){
        return personagem.getDano();
    }

    public void dano(){
        personagem.dano();
    }



    public void vida(){
        

        System.out.println("HP: " + getVida() + "/" + VIDA);
    }

    public boolean estaVivo() {
        return personagem.estaVivo();
    }

    // public void atacar(NPC inimigo) {
    //     int distancia = Game.getDistancia(); 
    //     personagem.atacar(inimigo.personagem, distancia);
    // }

    public String getNomeArma() {
        return personagem.getNomeArma();
    }

    public static void main(String[] args) {
        
        Player player = new Player("nath", "melee"); 
        int cont = 10;
        System.out.println(player.personagem.getClasseCombate());
        while (true) {

            player.vida();

            player.dano();
            

            cont--;



            if (cont <= 0){
                break;
            }
            
        }
    }
}