/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan29;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        Scanner input = new Scanner(System.in);

        // ANSI Escape Codes untuk mengatur warna teks
        String merah = "\u001B[31m";
        String hijau = "\u001B[32m";
        String kuning = "\u001B[33m";
        String biru = "\u001B[34m";
        String ungu = "\u001B[35m";

        String resetWarna = "\u001B[0m";

        System.out.println(merah + "YUK" + hijau + " CEK" + kuning + " KEPRIBADIANMU" + biru + " DARI" + ungu + " WARNA" + biru + " FAVORITMU" + resetWarna);

        System.out.print("PILIH NAMA FAVORITMU : ");
        String warnaFavorit = input.nextLine().toUpperCase();

        System.out.print("NAMA KAMU : ");
        String nama = input.nextLine();

        System.out.println("\n=====HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "=====");
        System.out.println("Warna Favoritmu adalah " + biru + warnaFavorit + resetWarna);
        
        switch (warnaFavorit) {
            case "MERAH" -> {
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
            }
            case "HIJAU" -> {
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
            }
            case "KUNING" -> {
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
            }
            case "BIRU" -> {
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cendenrung mencari jalan damai.");
            }
            case "UNGU" -> {
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
            }
            default -> System.out.println("Warna Favoritmu tidak dikenali");
        }

        System.out.println("\nDeveloped by: Salsa Nurul Laeli");

     
    }
    
}
