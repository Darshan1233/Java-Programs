import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        int ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Your Choice:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multipication");
        System.out.println("4.Division");
        System.out.println("5.Remainder");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                ans = a + b;
                System.out.println("Your Answer is " + ans);
                break;
            case 2:
                ans = a - b;
                System.out.println("Your Answer is " + ans);
                break;
            case 3:
                ans = a * b;
                System.out.println("Your Answer is " + ans);
                break;
            case 4:
                ans = a / b;
                System.out.println("Your Answer is " + ans);
                break;
            case 5:
                ans = a % b;
                System.out.println("Your Answer is " + ans);
                break;
            default:
                System.out.println("Invalid Choice!!");
                break;
        }
        sc.close();
    }
}