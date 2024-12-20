import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the temp in c: ");
        float tempC = input.nextFloat();

        float tempF = (tempC*9/5)+32;

        System.out.println(tempF);
    }
}
