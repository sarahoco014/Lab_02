public class GuessingGame {

    public static void main(String[] args) {

        int secretNumber = 4;
        int guess = 2;

        if(guess == secretNumber) {
            System.out.println("You guess was correct!");
        } else if(guess > secretNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("Your guess was too low!");
        }
    }
}
