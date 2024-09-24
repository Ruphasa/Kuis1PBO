// Peserta.java
import java.util.Scanner;

public class Peserta extends User {
    private Scanner sc = new Scanner(System.in);
    private DataBase db = new DataBase();
    private Kursus kursusDiikuti[] = new Kursus[0];

    // Constructor for Peserta
    public Peserta(String nama, String password) {
        super(nama, password); // Call the parent constructor (User)
    }

    // Method to buy a course
    public void beliKursus(Kursus kursus, int harga) {
        while (true) {
        System.out.print("Bayar " + harga + " untuk membeli " + kursus.getMataPelajaran() + ":");
        int bayar = sc.nextInt();
            if (bayar != harga) {
                System.out.println("Pembayaran gagal");
            }else{
                Kursus temp[] = new Kursus[kursusDiikuti.length + 1];
                for (int i = 0; i < kursusDiikuti.length; i++) {
                    temp[i] = kursusDiikuti[i];
                }
                temp[kursusDiikuti.length] = new Kursus();
                temp[kursusDiikuti.length] = kursus;
                kursusDiikuti = temp;
                kursusDiikuti[kursusDiikuti.length-1] = new Kursus();
                kursusDiikuti[kursusDiikuti.length-1] = kursus;
                System.out.println("Pembayaran selesai");
                break;
            }
        }
    }

    // Method to display followed courses
    public void tampilkanKursusDiikuti() {
        System.out.println("Kursus yang diikuti oleh " + nama + ":");
        for (int i = 0; i < kursusDiikuti.length; i++) {
            if (kursusDiikuti[i] != null) {
                System.out.println((i + 1) + ". " + kursusDiikuti[i].getMataPelajaran());
            }
        }
    }

    Kursus[] getKursusYangDiikuti(){
        return kursusDiikuti;
    }

    // Method to study a course
    public void belajarKursus() {
        tampilkanKursusDiikuti();
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        if (kursusDiikuti[pilih - 1] != null) {
            kursusDiikuti[pilih - 1].melihatIsiKontent();
        }
    }
}
