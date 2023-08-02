import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter A Number(for exit enter 0): ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }
        } while (num != 0);
        if (num == 0) {
            System.out.println("Exit");
        }
        sc.close();
    }
}