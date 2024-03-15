import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Persegi Panjang");
        System.out.println("2.Bujur Sangkar");
        System.out.print("Isikan Pilihan : ");

        Scanner sc = new Scanner(System.in);
        int Pilihan = sc.nextInt();

        if(Pilihan == 1){
            BujurSangkar bs = new BujurSangkar(10);
            System.out.println(bs);

        }
        if ( Pilihan == 2 ) {
            PersegiPanjang pp = new PersegiPanjang (10,7);
            System.out.println(pp);
            
        }
        
    }

}
