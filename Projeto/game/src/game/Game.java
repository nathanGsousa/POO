package game;


//Local onde o player encontra o npc
public class Game {

    private final int tamanho;
    private int posPlayer;
    private int posNPC;

    public Game(int tamanho, int posPlayerInicial, int posNPCInicial) {
        this.tamanho = tamanho;
        this.posPlayer = posPlayerInicial;
        this.posNPC = posNPCInicial;
    }

    public Game(){
        this.tamanho = 10;
        this.posPlayer = 0;
        this.posNPC = tamanho -1;
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

    public int getDistancia() {
        return Math.abs(posNPC - posPlayer);
    }

    public void moverPlayerFrente() {
        if (posPlayer < tamanho - 1 && posPlayer + 1 != posNPC) {
            posPlayer++;
        } else if (posPlayer + 1 == posNPC && posPlayer + 2 < tamanho) {
            posPlayer += 2; // Pula o NPC
        }
    }

    public void moverPlayerTras() {
        if (posPlayer > 0 && posPlayer - 1 != posNPC) {
            posPlayer--;
        } else if (posPlayer - 1 == posNPC && posPlayer - 2 >= 0) {
            posPlayer -= 2; // Pula o NPC
        }
    }

    public void moverNPCFrente() {
        if (posNPC < tamanho - 1 && posNPC + 1 != posPlayer) {
            posNPC++;
        } else if (posNPC + 1 == posPlayer && posNPC + 2 < tamanho) {
            posNPC += 2; // Pula o player
        }
    }

    public void moverNPCTras() {
        if (posNPC > 0 && posNPC - 1 != posPlayer) {
            posNPC--;
        } else if (posNPC - 1 == posPlayer && posNPC - 2 >= 0) {
            posNPC -= 2; // Pula o player
        }
    }

    public int getPosPlayer() {
        return posPlayer;
    }

    public int getPosNPC() {
        return posNPC;
    }
}

