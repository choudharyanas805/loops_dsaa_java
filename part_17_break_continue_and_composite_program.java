package loops;

import java.util.Scanner;

public class part_17_break_continue_and_composite_program {
    static void main() {
        // break= it is used to terminate the loop irteration or conditiion . whole looop
        // continue = it is used to skip particular iteration .  and it is rarely used in  program

        //   WAP TO PRINT IF NUMBER IS COMPOSITE OR NOT...
        // composite number woh hotai hai jis kai atleast 2 fACTOR hotai hai n.. like example let n = 1 or n factor hota hai.
        // again we example = 2 to n-1 tak kio factor mile 'n' ka to 'n' composite hojaiga
        /*
        for example = 60= 1,2,3,4,5,6,10,12,15,20,30,60
        "i" is fACTOR of "n" if n%i==0 . this condition mean i factor hoja n ka toh done
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =");
        int n = sc.nextInt();

       // for (int i=2 ; i<=n-1; i++){
          //  if (n%i==0) { // agr 'i' to 'n' ka ek factor nikla toh composite hai
           //     System.out.println("composite number");
           // }// toh ismai agr mai 60 koh karu toh approx 12 bar composite likha arha hai bai waja ak bar sai bhi kaam chal skta tha and agr 12 lu yh compsaite but loop kai chakr mai 4 bar likhja aya..
            // to solve this problem we need or use break stgatementr ak bhi number n ka factor hojaiga yh ak condn right hojaiga toh break loop toh .=niche line mai
            // like 12 mai 4 bar likha arha tgha ab 1 bar aiga chaihai kio sa bhi number hoo
       // }


        for (int i=2 ; i<=n-1; i++){
            if (n%i==0) { // agr 'i' to 'n' ka ek factor nikla toh composite hai
                System.out.println("composite number");
                break;  // ak bhi number i ka n ka factor nikla yh condn ture toh composite likh diya jaiga fir bar bar condn check nhi hogi and upper wlai code ki tarah nhi chalaigai ki nbar  bar composite likha arha hai output mai
            } // yh loops bss ak bar chalaiga jha condn true wha break ho jaiga . so, time save karaiga running process ka
    }   }
}
