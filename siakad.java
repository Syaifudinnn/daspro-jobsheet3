//import inputan
import java.util.Scanner;

public class siakad {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //judul
        System.out.println("========================================");
        System.out.println("Aplikasi SiAkad");
        System.out.println("========================================");

        //input nama, nim, kelas, no absen
        System.out.println("");

        System.out.print("Masukkan nama mahasiswa\t\t : ");
        String nama = input.nextLine();

        System.out.print("Masukkan nim\t\t\t : ");
        String nim = input.nextLine();

        System.out.print("Masukkan kelas\t\t\t : ");
        char kelas = input.next().charAt(0);

        System.out.print("Masukkan no. absen\t\t : ");
        byte absen = input.nextByte();

        //input kuis, tugas, ujian
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");

        System.out.print("Masukkan nilai kuis\t\t : ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai tugas\t\t : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS\t\t : ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS\t\t : ");
        double nilaiUAS = input.nextDouble();

        //logic
        double nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        //output
        System.out.println("");
        System.out.println("========================================");
        System.out.println("");

        System.out.println("Nama\t : " + nama + "\t\t NIM\t : " + nim);
        System.out.println("Kelas\t : " + kelas + "\t\t Absen\t : " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);

    }
    
}