package day1_stacks_assignment_14_oct_2024;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StackClass obj = new StackClass();
		StackClass obj1 = new StackClass();
		System.out.println("Enter the size of stack");
		int size = in.nextInt();
		obj.create_stack(size);
		obj1.create_stack1(size);

		System.out.println("Enter the choice");
		int choice, e;
		do {
			System.out.println("1.Push to Stack 1");
			System.out.println("2.Pop from Stack 1");
			System.out.println("3.Peek at Stack 1");
			System.out.println("4.Check if Stack 1 is empt");
			System.out.println("5.Push to Stack 2");
			System.out.println("6.Pop from Stack 2");
			System.out.println("7.Peek at Stack 2");
			System.out.println("8.Check if Stack 2 is empty");
			System.out.println("9.Exit");
			System.out.println("choice");
			choice = in.nextInt();

			switch (choice) {
			case 1:
				if (obj.isFull() != true) {
					System.out.println("enter a number");
					e = in.nextInt();
					obj.push(e);
				} else {
					System.out.println("Stack is full");
				}
				break;

			case 2:
				if (obj.isempty() != true) {
					System.out.println("Stack element is poped" + obj.pop());
				} else
					System.out.println("Stack is empty");
				break;

			case 3:
				if (obj.isempty() != true) {
					System.out.println("Element peek is  " + obj.peek());
				} else {
					System.out.println("Stack Empty");
				}
				break;

			case 4:
				if (obj.isempty() != true) {
					System.out.println("Elements in stack are present\n");

				} else {
					System.out.println("Stack Empty");
				}
				break;

			case 5:
				if (obj1.isFull1() != true) {
					System.out.println("enter a number");
					e = in.nextInt();
					obj1.push1(e);
				} else {
					System.out.println("Stack is full");
				}
				break;

			case 6:
				if (obj1.isempty1() != true) {
					System.out.println("Stack element is poped" + obj1.pop1());
				} else
					System.out.println("Stack is empty");
				break;

			case 7:
				if (obj1.isempty1() != true) {
					System.out.println("Element peek is  " + obj1.peek1());
				} else {
					System.out.println("Stack Empty");
				}
				break;

			case 8:
				if (obj1.isempty() != true) {
					System.out.println("Elements in stack are present\n");

				} else {
					System.out.println("Stack Empty");
				}
				break;

			case 9:
				System.out.println("Exit");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid chioce");
				System.exit(0);
				break;
			}

		} while (choice != 0);

	}

}
