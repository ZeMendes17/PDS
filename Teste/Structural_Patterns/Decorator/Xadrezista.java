package Structural_Patterns.Decorator;

public class Xadrezista extends JogadorDecorator {
    Xadrezista(JogadorInterface jogador) {
        super(jogador);
    }

    @Override
    public void joga() {
        super.joga();
        System.out.print("xadrez ");
    }
}
