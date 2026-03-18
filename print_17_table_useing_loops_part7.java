public class print_17_table_useing_loops_part7 {
    static void main() {
        System.out.println("table of 17:");
        for ( int i = 17; i<=170 ; i=i+17) {    // yh 187 pai break hoga kyuki  170 pai correct print  fir 17 add hojaiga toh islie 187 pai break hoga..
            System.out.print(i+" ");  // ln ka system hai brother
        }

        /* for (int i=17; i<=170; i++){
                if (i%17==0)  sout(i + " ")  // 170- pai break kyuki 171 pai break kyyuki loop i++ laga hua hai mean 170 coorect print hogya fir 171 cjeck fail break hojaiga ..
                }
                but ismai total loop chahyai 17 sai 170 tk chalga and usmai sai 17 table print but not preferred this is method .. upper and niche  wla best hai.

                and i++ mean i=i+1 toh mainai i=i+17 krdiya
         */

        /* best way this
        for (i=1; i<=10;i++){
              sout(i*17 + " ")   yh bhi best haiiii  and loop will work only 10 times   and you will print any table
          }

         */
    }
}
