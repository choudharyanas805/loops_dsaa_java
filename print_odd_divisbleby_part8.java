public class print_odd_divisbleby_part8 {
    static void main() {
        // write a program  to print all odd number divisible by 3 from 1 to 100..
        for (int i = 1; i <= 100; i = i + 2) {  // i+=2 same woprk do..
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
