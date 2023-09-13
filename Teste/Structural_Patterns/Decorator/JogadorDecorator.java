package Structural_Patterns.Decorator;

public abstract class JogadorDecorator implements JogadorInterface {
    protected JogadorInterface jogador;

    public JogadorDecorator(JogadorInterface jogador) {
        this.jogador = jogador;
    }

    @Override
    public void joga() {
        jogador.joga();
    }
}
