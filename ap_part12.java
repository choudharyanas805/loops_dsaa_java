package loops;

import java.util.Scanner;

public class ap_part12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =");
        int n = sc.nextInt();

        // ak aur method hai brother ap kai like 2,5,8,11,14.... 3 ka gap hai.
        int a=2, d=3;// d=3 mean addotion or difference
        int i;
        for ( i=1; i<=n; i++) {  // mean loop toh bss jitna tum n dogai utna times chalaiga
            System.out.print(a + " ");
            a += d;
        }
        // this program work jab tum ap ka 3n-1 wla formula bhul jao but 3 change hota difference kai hisab sai
        // wha program without formulai wla hai.. simplilyy agr ap chaiyai like 4,10,16,22.. etc toh a=4 and d=6 krdio..

    }
}
