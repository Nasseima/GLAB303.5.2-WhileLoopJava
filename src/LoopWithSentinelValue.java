import java.util.Scanner;

public class LoopWithSentinelValue {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an int value: ");
        int input = sc.nextInt();

        int sum = 0;

        while (input != 0){
            sum += input;

            System.out.println("The sum is " + sum);

            input = sc.nextInt();
        }

    }
}
