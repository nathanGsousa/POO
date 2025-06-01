package game.classes;

import java.util.Map;

import game.NPC;
import game.combate.Atacavel;
import game.combate.Combate;

public abstract class Classes implements Combate{

    protected String nome;
    protected String classe;     // Nome da classe concreta (ex: Guerreiro, Mago)
    protected int vida;          // Vida atual do personagem
    protected String nomeArma;   // Nome da arma equipada
    protected int dano;          // Dano da arma equipada
    protected int alcance;       // Alcance da arma equipada
    protected String classeCombate;

    

    //  Construtor recebe nome e vida inicial
    public Classes(String nome, String classe) {

        this.nome = nome; // Nome padrão
        this.vida = 50; // Valor padrão, pode variar por classe

        this.classe = classe.toLowerCase(); // Ex: "melee", "tank", etc.

        // Obtem arma aleatória
        Map.Entry<String, int[]> arma = Armas.getDadosArmas(this.classe);

        this.nomeArma = arma.getKey();
        this.dano = arma.getValue()[0];
        this.alcance = arma.getValue()[1];
    }

    public String getClasseCombate(){
        return classeCombate;
    }

    @Override
    public String getClasse() {
        return classe;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public String getNomeArma() {
        return nomeArma;
    }

    @Override
    public int getDano() {
        return dano;
    }

    @Override
    public int getAlcance() {
        return alcance;
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }
    //Teste de funcionamento:
    public void dano(){
        this.vida -= getDano();
        if (this.vida < 0) this.vida = 0;
    }

    @Override
    public void sofrerDano(int danoRecebido) {
        this.vida -= danoRecebido;
        if (vida < 0) vida = 0;  // vida nunca negativa
    }

    @Override
    public void atacar(Atacavel inimigo, int distancia) {
        // Só ataca se estiver vivo e inimigo vivo
        if (this.estaVivo() && inimigo.estaVivo()) {
            if (distancia <= this.alcance) {
                inimigo.sofrerDano(this.dano);
                System.out.println(this.nome + " atacou " + inimigo.getNome() + " causando " + dano + " de dano!"); 



            } else {
                System.out.println(this.nome + " tentou atacar, mas está fora de alcance."); 
            }
        }
    }
    
    public String mensagem(){
        return          "                                             _______________________\n" + //
                        "   _______________________-------------------                       `\\\n" + //
                        " /:--__                                                              |\n" + //
                        "||< > |                                   ___________________________/\n" + //
                        "| \\__/_________________-------------------                         |\n" + //
                        "|                                                                  |\n" + //
                        " |                                                                 |\n" + //
                        "  |                                              ____________________|_\n" + //
                        "  |  ___________________-------------------------                      `\\\n" + //
                        "  |/`--_                                                                 |\n" + //
                        "  ||[ ]||                                            ___________________/\n" + //
                        "   \\===/___________________--------------------------";
    }
}
