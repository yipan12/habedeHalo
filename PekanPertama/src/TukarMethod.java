import java.util.Scanner;
public class TukarMethod {
    int nilai1, nilai2;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan nilai pertama");
        nilai1 = scan.nextInt();
        System.out.println("masukan nilai kedua");
        nilai2 = scan.nextInt();
        System.out.println("sebelum ditukar");
        System.out.println("pertama" + nilai1);
        System.out.println("kedua" + nilai2);
        tukar(nilai1,nilai2);
    }

    public static int tukar (int nilai1 ,int nilai2){
        int z;
        z = nilai1;
        nilai1 = nilai2;
        nilai2 = z;
        System.out.println("setelah ditukar");
        System.out.println("nilai1 adalah" + nilai1);
        System.out.println("nilai2 adalah" + nilai2);
        int tot = nilai1 + nilai2;
        return tot;
    }

}
