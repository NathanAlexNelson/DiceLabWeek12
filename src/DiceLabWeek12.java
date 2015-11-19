import java.util.Scanner;

public class DiceLabWeek12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int bounces;
		int dices;
		int DThrow;
		
		System.out.println("How many dice would you like to throw?");
		dices = input.nextInt();
		
		System.out.println("How many bounces did your dice make?");
		bounces = input.nextInt();
		
		

		Dice Roll = new Dice();
		
		if (bounces == 0){
		DThrow = Roll.Throw(dices);
		}
		else {
		DThrow = Roll.Throw(dices,bounces);
		}
		
		System.out.println("The total of your dice is: " + DThrow);
		
	}
}
