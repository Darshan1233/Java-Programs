import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: " + a);
        System.out.println("B :" + b);
        sc.close();
    }
}
