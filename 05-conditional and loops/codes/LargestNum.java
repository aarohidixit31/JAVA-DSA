import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //find the largest of the three numbers
//        int max = a;
//        if(b>max){
//           max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        int max;
//        if(a>b){
//           max=a;
//        }
//        else{
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println("max number is: " + max);


    }
}
