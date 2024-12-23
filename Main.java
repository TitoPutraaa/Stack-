import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static int top = -1;
    static int[] stack = new int[6];

    static boolean isKosong() {
        return top == -1;
    }

    static boolean isFull(int top, int[] stack) {
        return top == stack.length-1;
    }

    static void push(int value) {
        if (isFull(top, stack)) {
            System.out.println("stack full, tidak dapat menambahkan value baru");
        } else {
            stack[++top] = value;
            System.out.println("menambahkan value " + value + " top menjadi : " + top);
        }
    }

    static void pop() {
        if(isKosong()) {
            System.out.println("stack kosong, tidak dapat menghapus stack");
        } else {
            System.out.println("menghapus value stack " + stack[top]);
            stack[top--] = 0;
            System.out.println("top menjadi " + top);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stack));
    }
}