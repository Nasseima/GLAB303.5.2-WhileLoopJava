import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an interger between 0 and 100");
        int input = -1;

        while (input != num){
            System.out.println("\n Enter your guess: ");
            input = sc.nextInt();
            if (input == num){
                System.out.println("Yes the number is " + num);
            } else if (input > num) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }

        }




        input = 0;


    }
}