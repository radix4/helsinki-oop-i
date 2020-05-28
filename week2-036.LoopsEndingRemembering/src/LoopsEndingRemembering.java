import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int num = 0;
        int sum = 1;
        int counter = -1;
        double average = 0;
        int evenCounter = -1;
        int oddCounter = 0;

        while (num != -1){
            num = Integer.parseInt(reader.nextLine());
            if (num % 2 == 1){
                oddCounter++;
            } else {
                evenCounter++;
            }
            sum += num;
            counter++;
        }

        average = (double)(sum)/counter;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCounter);
        System.out.println("Odd numbers: " + oddCounter);
    }
}
