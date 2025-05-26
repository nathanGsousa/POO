package game.classes;

public class Melee extends Classes{


    public Melee(String nome) {
        super(nome,"melee");

        switch (this.getNomeArma().toLowerCase()) {
            case "espada":
                this.classeCombate = "Swordman";
                break;
            case "machado":
                this.classeCombate = "AxeWarrior";
                break;
            case "lança":
                this.classeCombate = "Lanceiro";
                break;
            // Adicione outros casos conforme as armas disponíveis
            default:
                this.classeCombate = "Melee";
        }

    }

}


