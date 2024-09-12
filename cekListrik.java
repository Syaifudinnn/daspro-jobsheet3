//import inputan
import java.util.Scanner;

public class cekListrik {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable tetap
        double tarif_per_kWh = 1500.0;


        System.out.println("==================================================");
        System.out.println("Aplikasi Cek Tagihan Listrik");
        System.out.println("==================================================");
        System.out.println("");

        //input penggunaan listrik
        System.out.print("Masukkan jml penggunaan listrik (kWh)\t : ");
        int penggunaan = input.nextInt();

        //logic
        double tagihan = penggunaan * tarif_per_kWh;

        //output
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("Total tagihan anda\t\t\t : Rp " + tagihan);

        boolean check = penggunaan > 500;
        System.out.println("Apakah penggunaan listrik melebihi 500 kWh? " + check);

    }

}
