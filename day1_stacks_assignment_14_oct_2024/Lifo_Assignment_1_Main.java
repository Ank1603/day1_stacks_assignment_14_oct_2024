package day1_stacks_assignment_14_oct_2024;

import java.util.Scanner;

public class Lifo_Assignment_1_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lifo_Assignment_1 stacks = new Lifo_Assignment_1();
		Lifo_Assignment_1 stacks2 = new Lifo_Assignment_1();
		System.out.println("Enter the size");
		int size = sc.nextInt();
		stacks.create_Stack(size);
		stacks2.create_Stack2(size);
		System.out.println("Enter the choice: ");
		int choice, value;
		choice = sc.nextInt();

		do {
			System.out.println("\nStack Menu");
			System.out.println("-----------");
			System.out.println("1. Push to Stack 1");
			System.out.println("2. Pop from Stack 1");
			System.out.println("3. Peek at Stack 1");
			System.out.println("4. Check if Stack 1 is empty");
			System.out.println("5. Push to Stack 2");
			System.out.println("6. Pop from Stack 2");
			System.out.println("7. Peek at Stack 2");
			System.out.println("8. Check if Stack 2 is empty");
			System.out.println("9. Display Stack 1");
			System.out.println("10. Display Stack 2");
			System.out.println("11. Exit");
			System.out.println("-----------");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to push to Stack 1: ");
				value = sc.nextInt();
				stacks.push1(value);
				break;
			case 2:
				stacks.pop1();
				break;
			case 3:
				System.out.println("Top of Stack 1: " + stacks.peek1());
				break;
			case 4:
				System.out.println("Stack 1 is empty: " + stacks.is_Empty1());
				break;
			case 5:
				System.out.print("Enter value to push to Stack 2: ");
				value = sc.nextInt();
				stacks.push2(value);
				break;
			case 6:
				stacks.pop2();
				break;
			case 7:
				System.out.println("Top of Stack 2: " + stacks.peek2());
				break;
			case 8:
				System.out.println("Stack 2 is empty: " + stacks.is_Empty2());
				break;
			case 9:
				stacks.print_Stack1();
				break;
			case 10:
				stacks.print_Stack2();
				break;
			case 11:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
				break;
			}
		} while (choice != 11);

		sc.close();
	}
}
