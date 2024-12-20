import java.util.Scanner;

public class typecasting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);


        //typecasting
//        int num = (int)(67.45);
//        System.out.println(num );
//        byte b= 98;
//        byte s = 39;
//        byte g= 34;
//        int a = b*s/g;
//        System.out.println(a);

//        int num = 'F';
//        System.out.println(num);

        //rules of type promotion -
        //all the byte,short and char values are promoted to integer, if any of the operands is long whole operation will be promoted to long.
        byte b = 34;
        char c='e';
        short s = 1223;
        int i = 398;
        float f = 3.874f;
        double d = 0.29373;
        double result = (f*b) +(i/c) +(d*s);
        System.out.println((f*b) + " buu " +(i/c) + " bubu " +(d*s));
        System.out.println(result);
    }
}