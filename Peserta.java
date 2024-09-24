// Peserta.java
import java.util.Scanner;

public class Peserta extends User {
    Scanner sc = new Scanner(System.in);
    DataBase db = new DataBase();
    private Kursus kursusDiikuti[] = new Kursus[db.getKursusLength()];

    // Constructor for Peserta
    public Peserta(String nama, String password) {
        super(nama, password); // Call the parent constructor (User)
    }

    // Method to buy a course
    public void beliKursus(String namaKursus) {
        for (int i = 0; i < db.getKursusLength(); i++) {
            System.out.print((i+1) + ". ");
            db.tampilSemuaKontent();
        }
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        System.out.println("Bayar " + db.getHargaKontent(pilih));
        int bayar = sc.nextInt();
        kursusDiikuti[pilih] = new Kursus();
        kursusDiikuti[pilih] = db.getKursus(pilih);
        System.out.println("Pembayaran selesai");
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
