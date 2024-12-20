import java.util.Scanner;

public class CountingOcccurence {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
       //count the number that comes again
        // int n = in.nextInt();
        int n = 1222;
        int count = 0;
        while (n>0){
           int  rem = n%10;
                if(rem == 2){
                    count++;
                }
                n = n/10;
            }
        System.out.println(count);
        }
    }

