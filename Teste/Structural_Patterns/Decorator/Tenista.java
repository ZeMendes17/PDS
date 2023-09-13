package Structural_Patterns.Decorator;

public class Tenista extends JogadorDecorator {
    Tenista(JogadorInterface jogador) {
        super(jogador);
    }

    @Override
    public void joga() {
        super.joga();
        System.out.print("tenis ");
    }
    public void serve() { System.out.println("--Serve!"); }
}
