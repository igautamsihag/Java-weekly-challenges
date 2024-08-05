package weekOnepractice;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {
		int randomNumber = (int)(Math.random()*101);
		int guessNumber = -1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Please enter a number to guess between 0 and 100:");
			guessNumber = scan.nextInt();
			
			if (guessNumber > randomNumber) {
				System.out.println("Guess is too high. Try again!");
			} else if (guessNumber < randomNumber) {
				System.out.println("Guess is too low. Try again!");
			} else {
				System.out.println("Congratulations, You guessed it right!");
			}
		} while (guessNumber != randomNumber);
		
		scan.close();
	}
}
