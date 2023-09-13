package Creational_Patterns.Factory_Method;

public class Viveiro {
    public static Arvore factory(String pedido){
        if (pedido.equalsIgnoreCase("figueira")) {
            return new Figueira();
        } else if (pedido.equalsIgnoreCase("pessegueiro")) {
            return new Pessegueiro();
        } else if (pedido.equalsIgnoreCase("limoeiro")) {
            return new Limoeiro();
        } else {
            throw new IllegalArgumentException(pedido + " não existente!");
        }
    }

    // with reflection
    public static Arvore factory2(String pedido){
        Arvore arvore = null;
        try {
            arvore = (Arvore) Class.forName("Creational_Patterns.Factory_Method." + pedido).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException(pedido + " não existente!");
        }
        return arvore;
    }
}
