import java.util.Scanner;
public class FaktorMeth {
    int angka, hasil, i;
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan angka");
        angka = scan.nextInt();
        out(angka,hasil);
    }

    public static int out (int angka,int hasil){
        hasil = 1;
        for (int i = 1; i<= angka; i++){
            hasil *= i;
        }
        int hasil1 = hasil;
        System.out.println("hasil dari " + angka + "🤞 = ✌" + hasil);
        return hasil1;
    }
}
