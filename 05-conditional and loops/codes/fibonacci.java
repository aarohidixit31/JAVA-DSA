import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
          //find the nth fibonacci number
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
        int n = in.nextInt();
        int p= 0;
        int i = 1;
        int count =  2;
        while(count<=n){
            int temp = i;
            i = i+p;
            p = temp;
            count++ ;

        }
        System.out.println(i);

    }
}
