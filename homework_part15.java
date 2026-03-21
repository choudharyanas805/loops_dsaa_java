import java.util.Scanner;

public class homework_part15 {
    static void main() {
        // take "n" as input from user and print the following sequence = 1 n,2 n-1, 3 n-2, 4 n-3.....
        //thoda galat hai brother .. concept ..

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
            for (int i=1;i<=n;i++){
                System.out.println(i);
                System.out.println(n);
                n=n-i;
            }
    }
}
