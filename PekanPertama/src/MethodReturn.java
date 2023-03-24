import java.util.Scanner;
public class MethodReturn {
    int masuk_jml, bulat, pecahan;
    double[] bil = new double[100];


    public void input(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Jumlah bilangan yang akan dimasukan : ");
        masuk_jml = scan.nextInt();


        for(int i=1; i<=masuk_jml; i++){
            System.out.print("Bilangan ke "+i+" : ");
            bil[i] = scan.nextDouble();
        }
        ProsesOutput(bil, bulat, pecahan, masuk_jml);
    }


    public static int ProsesOutput(double[] a, int b, int p, int in){
        for(int i=1;i<=in;i++){
            if(a[i] != 0 ){
                if(a[i]%1 != 0){
                    p = p+1;
                }
                else{
                    b = b+1;
                }
            }
        }
        System.out.println("\nOutput");
        System.out.println("Jumlah bilangan bulat   : "+b);
        System.out.println("Jumlah bilangan pecahan : "+p);
        return in;
    }
}