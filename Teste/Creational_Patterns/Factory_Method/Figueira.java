package Creational_Patterns.Factory_Method;

public class Figueira implements Arvore {
    protected Figueira() {
        System.out.println("Figueira plantada");
    }

    public void regar() {
        System.out.println("Figueira: Regar muito pouco");
    }

    public void colherFruta() {
        System.out.println("Hum.. figos!");
    }
}
