package Strategy;

public class Demo {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new Sum());
        System.out.println("10 + 5 = " + contexto.executeStrategy(10, 5));

        contexto = new Contexto(new Sub());
        System.out.println("10 - 5 = " + contexto.executeStrategy(10, 5));

        contexto = new Contexto(new Mult());
        System.out.println("10 * 5 = " + contexto.executeStrategy(10, 5));

        contexto = new Contexto(new Div());
        System.out.println("10 / 5 = " + contexto.executeStrategy(10, 5));

        // Output:
        // 10 + 5 = 15
        // 10 - 5 = 5
        // 10 * 5 = 50
        // 10 / 5 = 2
    }
}
