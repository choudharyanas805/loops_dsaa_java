package loops;

public class part18_another_exOF_break {
    static void main() {
        for(int i=1; i<=10;i++){
            System.out.println("anas");
            break; // yhy sirf one time chala fir break hogya mean terminate hogya
        }
        System.out.println("  ");
        for (int i =1; i<=10;i++){
            if(i%2==0){
                System.out.println(i);
                System.out.println("even");
                break; // yh loop chjala ak bar condn true fir last mai break likha toh terminate hogya bss running process time bach gya kaisai like 4 ,6,8,10 check hi nhi kara.
            }
        }
    }
}
