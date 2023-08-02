import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int no = sc.nextInt();
        int temp1 = no;
        int len = 0;
        while (temp1 != 0) {
            temp1 = temp1 / 10;
            len = len + 1;
        }
        int temp2 = no;
        int rem, arm = 0;
        while (temp2 != 0) {
            rem = temp2 % 10;
            int mul = 1;
            for (int i = 1; i <= len; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            temp2 = temp2 / 10;
        }
        if (no == arm) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
        sc.close();
    }
}
