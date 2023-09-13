package Creational_Patterns.Factory_Method;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo: Factory Method pattern");
        Arvore pomar[] = {
            Viveiro.factory("Figueira"),
            Viveiro.factory("Pessegueiro"),
            Viveiro.factory("Limoeiro")
        };

        for(Arvore arvore : pomar) {
            arvore.regar();
        }
        for(Arvore arvore : pomar) {
            arvore.colherFruta();
        }

        System.out.println("Factory Method pattern: Reflection");
        Arvore pomar2[] = {
            Viveiro.factory2("Figueira"),
            Viveiro.factory2("Pessegueiro"),
            Viveiro.factory2("Limoeiro")
        };

        for(Arvore arvore : pomar2) {
            arvore.regar();
        }
        for(Arvore arvore : pomar2) {
            arvore.colherFruta();
        }

        // Output:
        // Demo: Factory Method pattern
        // Regando a Figueira
        // Regando o Pessegueiro
        // Regando o Limoeiro
        // Colhendo figos
        // Colhendo pêssegos
        // Colhendo limões
        // Factory Method pattern: Reflection
        // Regando a Figueira
        // Regando o Pessegueiro
        // Regando o Limoeiro
        // Colhendo figos
        // Colhendo pêssegos
        // Colhendo limões

    }
}

