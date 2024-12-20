import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operator: ");
            char ch = in.next().trim().charAt(0);

            if (ch == 'x' || ch == 'X') {
                break;
            }

            if (ch == '+' || ch == '-' || ch == '%' || ch == '*' || ch == '/') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (ch == '+') {
                    ans = num1 + num2;
                } else if (ch == '-') {
                    ans = num1 - num2;
                } else if (ch == '*') {
                    ans = num1 * num2;
                } else if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                } else if (ch == '%') {
                    ans = num1 % num2;
                }

                System.out.println("The result is: " + ans);
            } else {
                System.out.println("Invalid operator. Please try again.");
            }
        }
    }
}
