import java.util.*;

public class primeNum
{
    public boolean check(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }

        if(count <= 2) return true;

        return false;
    }

    public static void main(String[] args) {
// 		int n=4;
// 		double d = n;

// 		System.out.println(d);
// 		int x = (int)d;
// 		System.out.println(x);
// 		float f = 4.5F;

        Scanner obj = new Scanner(System.in);
// 		int n = obj.nextInt();
// 		String s = obj.next();
// 		String ss = obj.nextLine();

        // int arr[] = {2,3,4,5};
        // int n=5;
        // int sol[] = new int[n];
        // for(int i=0;i<n;i++){
        //     sol[i] = obj.nextInt();
        // }

        // sol.length // for. array

        // System.out.println(arr[3]);
        // System.out.println(sol[3]);

        // String s = "Rohit";
        // int n= s.length();

        // for(int i=0;i<n;i++){
        //     System.out.print(s.charAt(i));
        // }

        // int x = 6;
        // int y = 8;
        // int mx = Math.max(x,y);
        // int mn = Math.min(x,y);

        // System.out.println(mx);
        // System.out.println(mn);

        // int ran = (int)(Math.random()*10);
        // System.out.println(ran);

        // int srt = (int)Math.sqrt(ran);
        // System.out.println(srt);

        int n=obj.nextInt();
        Main mn = new Main();
        System.out.println(mn.check(n));
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0) count++;
        // }

        // if(count <= 2) System.out.println("true");
        // else System.out.println("false");


    }
}