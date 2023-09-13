package Structural_Patterns.Decorator;

public class Jogador implements JogadorInterface {
    private String name;
    Jogador(String name) {
        this.name = name;
    }

    @Override
    public void joga() {
        System.out.print("\n"+name+" joga ");
    }
}
