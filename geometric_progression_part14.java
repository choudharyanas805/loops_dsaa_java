import java.util.Scanner;

public class geometric_progression_part14 {
    static void main() {
        // display this GP 1,2,4,8... upto n terms.
        //yh gp hai and n terms hai toh a,d wla method use .
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();

        int a=1, r=2;  // d ki jagah r liya hai
        for (int i =1; i<=n; i++){
            System.out.print(a+" ");
            a*=r;  // har number mean a toh ussai bar bar 2 sai multiply kro series dekh kai pta chal rha hai voh toh ..
        }
    }
}
