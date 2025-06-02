package game;

import game.classes.Classes;
import game.classes.LongDistance;
import game.classes.Melee;
import game.classes.Tank;
import game.combate.Atacavel;

public class Player implements Atacavel{

    private String nome;
    private Classes personagem; // Pode ser Melee, Tank ou LongDistance
    private final int VIDA;
    private Game game;

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

    public void setGame(Game game){
        this.game = game;
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

    public String getMensagem(){
        return personagem.mensagem();
    }

    public void sofrerDano(int dano){
        personagem.sofrerDano(dano);
    }

    public void vida(){
        

        System.out.println("HP: " + getVida() + "/" + VIDA);
    }

    public boolean estaVivo() {
        return personagem.estaVivo();
    }

    public void atacar(NPC inimigo) {
        int distancia = game.getDistancia(); 
        personagem.atacar(inimigo, distancia);
    }

    public String getNomeArma() {
        return personagem.getNomeArma();
    }

    public String mensagemMorte(){
        return "Você morreu";
    }

    public void pocao(){
        personagem.pocao(5);
    }
    
}