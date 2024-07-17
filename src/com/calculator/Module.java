package com.calculator;

import java.util.Scanner;

public class Module implements ICalculator {
	Scanner sc = new Scanner(System.in);
	static int num1;
	static int num2;
	static int num3;
	static int num4;
	static int num5;
	static float sum;
	static float average;

	@Override
	public void addition() {

		getUserInput();
		System.out.println("Addition of Two Number is : " + (num1 + num2));
	}

	@Override
	public void subtraction() {
		getUserInput();
		System.out.println("substraction of Two Number is : " + (num1 - num2));

	}

	@Override
	public void multiplication() {
		getUserInput();
		System.out.println("multiplication of Two Number is : " + (num1 * num2));
	}

	@Override
	public void divition() {
		getUserInput();
		System.out.println("divition of Two Number is : " + (num1 / num2));

	}

	@Override
	public void modulus() {
		getUserInput();
		System.out.println("Modulus of Two Number is : " + (num1 % num2));

	}

	@Override
	public void square() {
		getOneUserInput();
		System.out.println("Square of " + num1 + " " + "is : " + (num1 * num1));
	}

	@Override
	public void cube() {
		getOneUserInput();
		System.out.println("Cube of " + num1 + " " + "is : " + (num1 * num1 * num1));
		System.out.println();
	}

	@Override
	public void factors() {
		getOneUserInput();
		System.out.print("The Factor of " + num1 + " is :  ");
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	@Override
	public void evenOrOddNumber() {
		getOneUserInput();
		if (num1 % 2 == 0) {
			System.out.println("Given Number is Even");
		} else {
			System.out.println("Given Number is Odd");
		}

	}

	@Override
	public void average() {
		System.out.println("Enter a first number");
		num1 = sc.nextInt();
		System.out.println("Enter a Second number");
		num2 = sc.nextInt();
		System.out.println("Enter a Third number");
		num3 = sc.nextInt();
		System.out.println("Enter a Fourth number");
		num4 = sc.nextInt();
		System.out.println("Enter a Fifth number");
		num5 = sc.nextInt();
		sum = (num1 + num2 + num3 + num4 + num5);
		System.out.println("The sum of five Number is : " + sum);
		average = (sum / 5);
		System.out.println("The average of five number is : " + average);
	}

	public void getUserInput() {
		System.out.println("Enter a first number");
		num1 = sc.nextInt();
		System.out.println("Enter a second number");
		num2 = sc.nextInt();

	}

	public void getOneUserInput() {
		System.out.println("Enter a number");
		num1 = sc.nextInt();
	}
}
