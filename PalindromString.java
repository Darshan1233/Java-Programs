import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = sc.next();
        String org = a;
        int len = a.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        if (org.equals(rev)) {
            System.out.println("Given String is a Palindrome");
        } else {
            System.out.println("Given String is Not a Palindrome");
        }
        sc.close();
    }
}
