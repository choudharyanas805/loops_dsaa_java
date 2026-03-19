package loops;

import java.util.Scanner;

public class homework_part13 {
    static void main() {
        //print this series = 99,95,91,87...  4 gap decrease
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =");
        int n = sc.nextInt();

        int a=99 , d=4;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            a-=4;
        }


        // this is best methbod for all series like increasing or decreasing mai ho..
        /*     method 1= using "i" = but ismai condition pta hoo
               mrthod 2 = using "a" and "d" = starting and gap pta ho bss kyuki a= starting term and d= difference gap
         */


    }
}
