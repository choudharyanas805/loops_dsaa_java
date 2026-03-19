package loops;

import java.util.Scanner;

public class ap_part11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =");
        int n = sc.nextInt();
        // ap print krni like 4,10,16,22 ... upto to n terms like 10 dala hai tgh 10 term print print of ap and 6 ka gapp hai brother
        for (int i= 4 ;i<=6*n-1; i+=6 ){
            System.out.print(i+ " ");
        }

        // ab kuch ab kuch ap mil jaiaa mean series tu kar skta hbai
    }
}
