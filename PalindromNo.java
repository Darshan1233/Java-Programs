import java.util.Scanner;

public class PalindromNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        int org = a;
        int rem, rev = 0;
        while (a > 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        if (org == rev) {
            System.out.println("Number is Palindrom");
        } else {
            System.out.println("Number is not Palindrom");
        }
        sc.close();
    }
}
