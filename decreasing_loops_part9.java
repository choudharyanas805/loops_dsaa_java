import java.util.Scanner;

public class decreasing_loops_part9 {
    static void main() {
        // abhi tk hamai increasing loops padhai hai i++ aur ab decreasing loops seekh rhai hai
        /* decreasing loops concept

         for (int i=n ; i>=1; i--){
             sout(i)}
         */

        // print  numbers from n to 1
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number= ");
        int n = sc.nextInt();

        for(int i =n ; i>=1 ;  i--){
            System.out.print(i+" ");
        }
    }
}
