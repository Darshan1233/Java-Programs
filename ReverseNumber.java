import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {
        int n, remainder, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
        while (n > 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        System.out.print("Reverse Number = " + reverse);
        sc.close();
    }
}