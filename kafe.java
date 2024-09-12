//import inputan
import java.util.Scanner;

public class kafe {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable dgn nilai tetap
        double hargaKopi = 12000 , hargaTeh = 7000 , hargaRoti = 20000;
        float nilai_diskon = 10 / 100f;

        //judul
        System.out.println("========================================");
        System.out.println("Aplikasi Kafe");
        System.out.println("========================================");

        //input keanggotaan dan jumlah pembelian
        System.out.println("");

        System.out.print("Masukkan keanggotaan (true / false)\t : ");
        boolean keanggotaan = input.nextBoolean();

        System.out.print("Masukkan jml pembelian kopi\t\t : ");
        int jmlKopi = input.nextInt();

        System.out.print("Masukkan jml pembelian teh\t\t : ");
        int jmlTeh = input.nextInt();

        System.out.print("Masukkan jml pembelian roti\t\t : ");
        int jmlRoti = input.nextInt();

        //logic
        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        double diskon = totalHarga * nilai_diskon;
        double nominalBayar = totalHarga - diskon;

        //Casting
        int nominalInt = (int) nominalBayar;
        byte totalByte = (byte) totalHarga;

        //output
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");

        System.out.println("Keanggotaan pelanggan\t : " + keanggotaan);
        System.out.println("Item Pembelian\t : ");
        System.out.println(jmlKopi + " kopi");
        System.out.println(jmlTeh + " teh");
        System.out.println(jmlRoti + " roti");

        System.out.println("");
        System.out.println("========================================");
        System.out.println("Nominal Bayar\t\t : Rp " +nominalBayar);
        System.out.println("Nominal Bayar (int)\t : Rp " +nominalInt);
        System.out.println("Total Harga (byte)\t : Rp " +totalByte);
        System.out.println("========================================");

    }

}
