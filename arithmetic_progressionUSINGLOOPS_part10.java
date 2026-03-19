package loops;

import java.util.Scanner;

public class arithmetic_progressionUSINGLOOPS_part10 {
    static void main() {
        // ap mean jismai difference constant ho like 2,5,8.. ismai 3 ka difference common hai..
        // display this AP= 2,5,8,11....... upto n terms   we need n terms tk print mean let n=10 so your mind say 2,5,8 bss but mai chata hu ki 10 terms print ho ... ex 2,5,8,11,14,17,20,23,26,29
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =");
        int n = sc.nextInt();

        //for(int i = 2; i<=n ; i+=3){
          //  System.out.print(i +" "); // yh bhi shi hai but we need n range print hyo
        //}

        /*
        smjhnai wali baat hai ki:
              i<= itna thik hai condition but kab tk chaliag last point smjho
              an= a+(n-1)d
                = 2+(n-1)3
                = 2+3n-3
                =  3n-1.
                i<=3n-1  yh theek hai condition..
         */
        int i;
        for( i=2; i<= 3*n-1 ;i+=3) {  // bar bar verror becoz of 3n-1 mean 3n kuch nhi hota iskoh aisai likho 3*n-1 yh correct
            System.out.print(i+" ");
        }
    }
}
