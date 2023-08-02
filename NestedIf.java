import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is Greater");
            } else {
                System.out.println("C is Greater");
            }
        } else if (b > c) {
            System.out.println("B is Greater");
        } else {
            System.out.println("C is Greater");
        }
        sc.close();
    }
}
