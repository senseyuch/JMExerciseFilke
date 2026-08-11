import  java.util.Random;
import  java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Welcome the Gussing Number Game");
        System.out.printf("Guess a number between %d-%d\n",min, max);

        do{
            System.out.print("Enter Your Guess Number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("To Low! Try Again ");

            }else if(guess > randomNumber){
                System.out.println("To High! Try Again");
            }else {
                System.out.println("Congratulation! You Guess The number :" + randomNumber);
                System.out.println("# of Attempts is : " + attempts);
            }

        }while(guess != randomNumber);





      scanner.close();
    }
}
