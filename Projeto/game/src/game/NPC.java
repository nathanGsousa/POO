package game;
import game.classes.Classes;
import game.classes.LongDistance;
import game.classes.Melee;
import game.classes.Tank;

public class NPC {


    private String nome;
    private Classes personagem; // Pode ser Melee, Tank ou LongDistance


    public NPC(){}
    
    public NPC(String nome, String tipoClasse) {
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

    //public void atacar(NPC inimigo) {
        //int distancia = Game.getDistancia(); 
        //personagem.atacar(inimigo.personagem, distancia);
    //}

    public String getNomeArma() {
        return personagem.getNomeArma();
    }
}

