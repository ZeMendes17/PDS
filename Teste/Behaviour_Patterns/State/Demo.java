package State;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        while (true) {
            System.out.print("Press ");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            chain.pull();
        }

        // Output:
        // Press
        //   low speed
        // Press
        //   medium speed
        // Press
        //   high speed
        // Press
        //   turn off
        // Press
        //   low speed
        // ...
    }
}
