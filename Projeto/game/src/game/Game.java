package game;


//Local onde o player encontra o npc
public class Game {

    private final int tamanho;
    private int posPlayer;
    private int posNPC;
    private Player player;
    private NPC npc;
    private Boolean turno; //Lógica simples para turno Player = true / NPC = false

    public Game(int tamanho, int posPlayerInicial, int posNPCInicial) {
        this.tamanho = tamanho;
        this.posPlayer = posPlayerInicial;
        this.posNPC = posNPCInicial -1;
        this.turno = true;

        this.player.setGame(this);
        this.npc.setGame(this);
    }

    public Game(Player player, NPC npc){
        this.tamanho = 10;
        this.posPlayer = 0;
        this.posNPC = tamanho -1;
        this.player = player;
        this.npc = npc;
        this.turno = true;

        this.player.setGame(this);
        this.npc.setGame(this);
    }

    public int getPosPlayer() {
        return posPlayer;
    }

    public int getPosNPC() {
        return posNPC;
    }

    public Player getPlayer(){
        return player;
    }

    public NPC getNPC(){
        return npc;
    }

    // Retorna uma string visual simples do ambiente com player e npc
    public String mostrarCampo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            if (i == posPlayer) {
                sb.append("[P]");
            } else if (i == posNPC) {
                sb.append("[N]");
            } else {
                sb.append("[ ]");
            }
        }
        return sb.toString(); //Saida esperada: [P][ ][ ][ ][ ][ ][ ][ ][ ][N]
    }

    public int getDistancia(){
        return Math.abs(posNPC - posPlayer);
    }

    public boolean getTurnoPlayer(){
        return turno;
    }

    public void trocaTurno(){
        this.turno = !this.turno;
    }

    public void moverPlayerFrente() {
        if (getTurnoPlayer()){

            if (posPlayer < tamanho - 1 && posPlayer + 1 != posNPC) {
                posPlayer++;
                
            } else if (posPlayer + 1 == posNPC && posPlayer + 2 < tamanho) {
                posPlayer += 2; // Pula o NPC
            }

            trocaTurno();
        }
    }

    public void moverPlayerTras() {
        if (getTurnoPlayer()){

            if (posPlayer > 0 && posPlayer - 1 != posNPC) {
                posPlayer--;
            } else if (posPlayer - 1 == posNPC && posPlayer - 2 >= 0) {
                posPlayer -= 2; // Pula o NPC
            }

            trocaTurno();
        }
    }

    public void moverNPCTras() {
        if (!getTurnoPlayer()){

            if (posNPC < tamanho - 1 && posNPC + 1 != posPlayer) {
                posNPC++;
            } else if (posNPC + 1 == posPlayer && posNPC + 2 < tamanho) {
                posNPC += 2; // Pula o player
            }

            trocaTurno();
        }
    }

    public void moverNPCFrente() {
        if(!getTurnoPlayer()){

            if (posNPC > 0 && posNPC - 1 != posPlayer) {
                posNPC--;
            } else if (posNPC - 1 == posPlayer && posNPC - 2 >= 0) {
                posNPC -= 2; // Pula o player
            }
            trocaTurno();
        }    
    }

    public void ataquePlayer(){
        if (getTurnoPlayer()){
            player.atacar(npc);
            trocaTurno();
        }
    }

    public void ataqueNPC(){
        if(!getTurnoPlayer()){
            npc.atacar(player);
            trocaTurno();
        }    
    }
}