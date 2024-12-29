import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    static Scanner scan = new Scanner(System.in);
    static int stack[] = new int[3];
    static int top = -1;

    // method to check is stack empty or not 
    static Boolean isEmpty() {
        return top == -1;
    }

    // method to check is stack full or not 
    static boolean isFull() {
        return top == stack.length-1;
    }

    // method to push value to stack and check whether stack full or not 
    static void push(int value) {
        if (isFull()) {
            System.out.println("this stack is full");
        } else {
            stack[++top] = value;
            System.out.println(Arrays.toString(stack));
        }
    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            stack[top--] = 0;
            System.out.println(Arrays.toString(stack));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < stack.length; i++) {
            System.out.print( "top is "+ (top +1) +", add value : ");
            int addValue = scan.nextInt();
            push(addValue);
        }
    }

    

}