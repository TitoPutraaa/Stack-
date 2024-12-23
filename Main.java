import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static int jumlahStack = maxStakc(scan);

    static int top = -1;
    static int[] stack = new int[jumlahStack];

    // check the stack empty or not 
    static boolean isKosong() {
        return top == -1;
    }

    // check the stack full or not 
    static boolean isFull(int top, int[] stack) {
        return top == stack.length-1;
    }

    // method to push value 
    static void push(int value) {
        if (isFull(top, stack)) {
            System.out.println("stack full, tidak dapat menambahkan value baru");
        } else {
            stack[++top] = value;
            System.out.println("menambahkan value " + value + " top menjadi : " + top);
        }
    }

    // method to delete value
    static void pop() {
        if(isKosong()) {
            System.out.println("stack kosong, tidak dapat menghapus stack");
        } else {
            System.out.println("menghapus value stack " + stack[top]);
            stack[top--] = 0;
            System.out.println("top menjadi " + top);
        }
    }


    // add maximal stack 
    static int maxStakc(Scanner scan) {
        System.out.print("masukan maksimal jumlah stack : ");
        int jml = scan.nextInt();
        return jml;
    }

    // add maximal value in stack
    static void addValue() {
        for (int i = 0; i < jumlahStack; i++) {
            System.out.print("value stack ke " + i + " : ");
            stack[i] = scan.nextInt();
        }
    }
    
    public static void main(String[] args) {
        addValue();
        System.out.println(Arrays.toString(stack));
    }
}