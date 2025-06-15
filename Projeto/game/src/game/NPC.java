package game;
import java.util.concurrent.ThreadLocalRandom;

import game.classes.Classes;
import game.classes.LongDistance;
import game.classes.Melee;
import game.classes.Tank;
import game.combate.Atacavel;


public class NPC implements Atacavel{


    private String nome;
    private Classes personagem; // Pode ser Melee, Tank ou LongDistance
    private Game game;
    private final int VIDA; // Testes

    public NPC(String teste){
        this.nome = "Guerreiro";
        this.personagem = new Melee(nome);
        this.VIDA = personagem.getVida();
    }
    
    public NPC() {
        

        // Lista de classes possíveis
        String[] tipos = {"melee", "tank", "longdistance"};

        // Sorteio de uma classe aleatória
        String tipoClasse = tipos[ThreadLocalRandom.current().nextInt(tipos.length)];

        // Criação do NPC com a classe sorteada
        switch (tipoClasse.toLowerCase()) {
            case "melee":
                this.nome = "Harry";
                this.personagem = new Melee(nome);
                
                break;
            case "tank":
                this.nome = "James";
                this.personagem = new Tank(nome);
                break;
            case "longdistance":
                this.nome = "Rodolfo";
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

    public boolean estaVivo() {
        return personagem.estaVivo();
    }

    public String getNomeArma() {
        return personagem.getNomeArma();
    }

    public void sofrerDano(int dano){
        personagem.sofrerDano(dano);
    }


    public String mensagemMorte(){
        return "O guerreiro inimigo está morto";
    }

    //Função de ataque
    public void atacar(Player inimigo) {
        int distancia = game.getDistancia(); 
        personagem.atacar(inimigo, distancia);
    }

    //Testes
    public void vida(){
        

        System.out.println("HP: " + getVida() + "/" + VIDA);
    }

    public void jogarTurno(Player player) {
        if (!estaVivo()) return;

        if (game.getDistancia() <= personagem.getAlcance()) {
            game.ataqueNPC();
        } else {
            moverParaPlayer(player);
        }
    }

    private void moverParaPlayer(Player player) {
        int posPlayer = game.getPosPlayer();
        int posicao = game.getPosNPC();

        if (posicao > posPlayer) {
            game.moverNPCFrente();
            //System.out.println(getNome() + " se moveu para frente.");
        } else if (posicao < posPlayer) {
            game.moverNPCTras();
            //System.out.println(getNome() + " se moveu para trás.");
        } else {
            //System.out.println(getNome() + " não conseguiu se mover.");
        }
    }

}

