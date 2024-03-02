package tasks;


	import javax.swing.*;
	import java.util.Random;

	public class randomnumber {

	    public static void main(String[] args) {
	       
	        Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1;

	        
	        int attempts = 0;
	        int guess;
	        boolean guessedCorrectly = false;

	        while (!guessedCorrectly) {
	            String input = JOptionPane.showInputDialog(null, "Guess the number between 1 and 100:");
	            guess = Integer.parseInt(input);
	            attempts++;

	            if (guess == randomNumber) {
	                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
	                guessedCorrectly = true;
	            } else if (guess < randomNumber) {
	                JOptionPane.showMessageDialog(null, "Try a higher number!");
	            } else {
	                JOptionPane.showMessageDialog(null, "Try a lower number!");
	            }
	        }
	    }
	}


