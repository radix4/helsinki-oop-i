import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int factorial = 1;

        for (int i = 1; i <= number; i++){
            factorial *= i;
        }

        System.out.println("Factorial is " + factorial);
    }
}
