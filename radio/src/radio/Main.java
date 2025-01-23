package radio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your goal of sales: ");
		int number = scanner.nextInt();
		
		System.out.print("How many days to complete goal: ");
		int total = scanner.nextInt();
		
		int numberPerDay = number / total;
		
		System.out.println("You will need to make " + numberPerDay + " sales each day to reach your goal of " + number + " in " + total + " days ");

	}

}
