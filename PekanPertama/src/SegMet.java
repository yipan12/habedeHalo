import java.util.Scanner;
public class SegMet {
    int alas1,sisi;
    public void input (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan sisi");
        sisi = scan.nextInt();
        System.out.println("masukan alas");
        alas1 = scan.nextInt();
        SegitigaAlas(alas1 , sisi);
    }
    public static int SegitigaAlas(int si, int a1){
        int si2 = a1;
        int tot = si + si2 + a1;
        System.out.println(tot);
        return tot;
    }

}
