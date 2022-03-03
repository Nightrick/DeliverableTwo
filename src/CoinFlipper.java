import java.util.Scanner;

public class CoinFlipper {
	
	

	public static void main(String[] args) {
		
		int correctCount = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Hello! Guess which will have more: heads or tails?");
		String headsOrTailsGuess = scnr.next().toLowerCase();
		
		System.out.print("How many times shall we flip a coin?");
		int numberOfFlips = scnr.nextInt();
		
		System.out.print("\n");
		
		for (int i = 0; i < numberOfFlips; i++) {
			if(Math.random() > 0.5) {
				System.out.println("heads");
				if(headsOrTailsGuess.matches("heads")) {
					correctCount++;
				}
			} else {
				System.out.println("tails");
				if(headsOrTailsGuess.matches("tails")) {
					correctCount++;
				}
			}
		}
						
		System.out.print("\n");
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s)!");
		System.out.print("That's ");
		System.out.printf("%.2f", (double) correctCount/numberOfFlips * 100);
		System.out.print("%!");

	}

}
