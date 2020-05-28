
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list){
            sum += number;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        int numOfNumbers = 0;
        for (double number : list){
            numOfNumbers++;
        }
        double average = sum(list) / (double)(numOfNumbers);
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
