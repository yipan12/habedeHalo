import java.util.Scanner;
public class MenMax {
    int a1,b1,c1;
    public void input () {
        Scanner scan = new Scanner(System.in);
        System.out.println("nilai a");
        a1 = scan.nextInt();
        System.out.println("nilai b");
        b1 = scan.nextInt();
        System.out.println("nilai c");
        c1 = scan.nextInt();
        menmac(a1,b1,c1);
    }

    public static int menmac (int a1, int b1, int c1){
        int tot;
        if(a1 >= b1 && a1 >= c1){
            System.out.println("nilai " + a1 + " lebih besar");
            tot = a1;
        } else if (b1 >= a1 && b1 >= c1) {
            System.out.println("nilai " + b1 + " lebih besar");
            tot = b1;
        } else {
            System.out.println("nilai " + c1 + " lebih besar");
            tot = c1;
        }
        return tot;
    }
}
