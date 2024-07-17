package com.calculator;

public class SubModule extends Module {

	void allCalculation() {
		Module module = new Module();
		while (true) {
			System.out.println("Enter a Choice which Operation You Perform");
			System.out.println("1. Addition of two number \r\n" + "2. Subtraction of two number \r\n"
					+ "3. Multiplication of two number \r\n" + "4. Division of two number \r\n"
					+ "5. Modulus of two number \r\n" + "6. Square of number \r\n" + "7. Cube of number \r\n"
					+ "8. Average of numbers \r\n" + "9. Factors of numbers \r\n" + "10.Find out even or odd number ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				module.addition();
				break;
			case 2:
				module.subtraction();
				break;
			case 3:
				module.multiplication();
				break;
			case 4:
				module.divition();
				break;
			case 5:
				module.modulus();
				break;
			case 6:
				module.square();
				break;
			case 7:
				module.cube();
				break;
			case 8:
				module.average();
				break;
			case 9:
				module.factors();
				break;
			case 10:
				module.evenOrOddNumber();
				break;
			default:
				System.out.println("You Enter Wrong Input....");
			}
			System.out.print("Do you want to continue? (y/n): ");
			char userInput = sc.next().charAt(0);
			if (userInput == 'n' || userInput == 'N') {
				break;
			}
		}
		System.out.println("Thank you !!!!!!!!!");
		sc.close();
	}
}
