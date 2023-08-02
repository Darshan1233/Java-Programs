import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String a = sc.next();
        int len = a.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        System.out.println("Reverse of String = " + rev);
        sc.close();
    }
}