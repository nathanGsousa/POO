package game.classes;

public class Tank extends Classes{

    public Tank(String nome){
        super("nome","tank");
         
        switch (this.getNomeArma().toLowerCase()) {
            case "escudo":
                this.classeCombate = "Shielder";
                this.vida = 65;
                break;
            case "martelo":
                this.classeCombate = "WarHammer";
                this.vida = 60;
                break;
            // Adicione outros casos conforme as armas
            default:
                this.classeCombate = "Tank";
                this.vida = 60;
        }

    }

}
