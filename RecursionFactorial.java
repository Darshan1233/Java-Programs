import java.util.Scanner;

public class RecursionFactorial {
    int fact = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        RecursionFactorial f = new RecursionFactorial();
        int result = f.Factorial(num);
        System.out.println("Factorial : " + result);
        sc.close();
    }

    int Factorial(int no) {
        if (no > 1) {
            fact = fact * no;
            Factorial(no - 1);
        }
        return fact;
    }
}
