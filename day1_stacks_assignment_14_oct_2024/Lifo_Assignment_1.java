package day1_stacks_assignment_14_oct_2024;

public class Lifo_Assignment_1 {
	private int stack[], MaxSize, top1, top2;

   public void create_Stack(int size) {
        MaxSize = size;
        stack = new int[MaxSize];
        top1 = -1; 
        top2 = MaxSize; 
    }

   public void create_Stack2(int size) {
       MaxSize = size;
       stack = new int[MaxSize];
       top1 = -1; 
       top2 = MaxSize; 
   }

   
    void push1(int e) {
        if (top1 < top2 - 1) { 
            top1++;
            stack[top1] = e;
            System.out.println("Element " + e + " pushed to Stack 1.");
        } else {
            System.out.println("Stack Overflow! Cannot push to Stack 1.");
        }
    }

  
    void push2(int e) {
        if (top1 < top2 - 1) { 
            top2--;
            stack[top2] = e;
            System.out.println("Element " + e + " pushed to Stack 2.");
        } else {
            System.out.println("Stack Overflow! Cannot push to Stack 2.");
        }
    }

  
    int pop1() {
        if (top1 >= 0) {
            int temp = stack[top1];
            top1--;
            System.out.println("Element " + temp + " popped from Stack 1.");
            return temp;
        } else {
            System.out.println("Stack Underflow! Stack 1 is empty.");
            return -1;
        }
    }

   
    int pop2() {
        if (top2 < MaxSize) {
            int temp = stack[top2];
            top2++;
            System.out.println("Element " + temp + " popped from Stack 2.");
            return temp;
        } else {
            System.out.println("Stack Underflow! Stack 2 is empty.");
            return -1;
        }
    }

   
    int peek1() {
        if (top1 >= 0) {
            return stack[top1];
        } else {
            System.out.println("Stack 1 is empty.");
            return -1;
        }
    }

    int peek2() {
        if (top2 < MaxSize) {
            return stack[top2];
        } else {
            System.out.println("Stack 2 is empty.");
            return -1;
        }
    }

   
    boolean is_Empty1() {
        return top1 == -1;
    }

    
    boolean is_Empty2() {
        return top2 == MaxSize;
    }

   
    void print_Stack1() {
        System.out.println("Stack 1 contains:");
        for (int i = top1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    void print_Stack2() {
        System.out.println("Stack 2 contains:");
        for (int i = top2; i < MaxSize; i++) {
            System.out.println(stack[i]);
        }
    }
}