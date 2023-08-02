import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        int n, sum = 0, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
        while (n > 0) {
            remainder = n % 10;
            sum = sum + remainder;
            n = n / 10;
        }
        System.out.print("Sum of Digit = " + sum);
        sc.close();
    }
}
