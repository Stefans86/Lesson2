package exercises;

/*
 * Count down a rocket launch!
 
 * Print the numbers from 10 to 1, then print â€œblastoffâ€�. 
 */

public class NASACountdown {
	public static void main(String[] args) {

		System.out.println("Counting down, starting in ");

		for (int i = 10; i > 0; i--) {

			System.out.println(i);

		}
		System.out.println("Blastoff !!! weeeeeeeeee !!! ");
	}
}