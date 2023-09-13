package Structural_Patterns.Decorator;

public class Futebolista extends JogadorDecorator {
    Futebolista(JogadorInterface jogador) {
        super(jogador);
    }

    @Override
    public void joga() {
        super.joga();
        System.out.print("futebol ");
    }
    public void remata() { System.out.println("--Remata!"); }
}
