//import inputan
import java.util.Scanner;

public class hitungGaji {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi nilai tetap
        float nilai_bonus = 10/100f;
        float nilai_pajak = 5/100f;

        //judul
        System.out.println("==================================================");
        System.out.println("Aplikasi Perhitungan Gaji");
        System.out.println("==================================================");
        System.out.println("");

        //input jml jam kerja dan upah/jam
        System.out.print("Masukkan jumlah jam kerja\t : ");
        int jamKerja = input.nextInt();

        System.out.print("Masukkan upah per jam\t\t : ");
        double upah = input.nextDouble();

        //logic
        double total_gaji = jamKerja * upah;
        double gaji_bonus = (total_gaji * nilai_bonus) + total_gaji;
        double pajak = gaji_bonus * nilai_pajak;
        double gaji_akhir = gaji_bonus - pajak;

        //output
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("Gaji akhir setelah bonus dan pajak : Rp " + gaji_akhir);


    }

}
