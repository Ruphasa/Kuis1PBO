import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Peserta {
    Scanner sc = new Scanner(System.in);
    private String nama;
    private String password;
    DataBase db = new DataBase();
    private Kursus kursusDiikuti[] = new Kursus[db.getKursusLength()];

    public Peserta(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    String getUsername(){
        return nama;
    }

    String getPassword(){
        return password;
    }

    public void beliKursus(String namaKursus) {
        for (int i = 0; i < db.getKursusLength(); i++) {
            System.out.print((i+1)+". ");
            db.tampilSemuaKontent();
        }
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        System.out.println("Bayar "+db.getHargaKontent(pilih));
        int bayar = sc.nextInt();
        kursusDiikuti[pilih] = new Kursus();
        kursusDiikuti[pilih] = db.getKursus(pilih);
        System.out.println("Pembayaran selesai");
    }

    public void tampilkanKursusDiikuti() {
        System.out.println("Kursus yang diikuti oleh " + nama + ":");
        for (int i = 0; i < kursusDiikuti.length; i++) {
            if (kursusDiikuti[i] != null) {
                System.out.println((i + 1) + ". " + kursusDiikuti[i].getMataPelajaran());
            }
        }
    }

    void belajarKursus() {
        tampilkanKursusDiikuti();
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        if (kursusDiikuti[pilih - 1] != null) {
            kursusDiikuti[pilih - 1].melihatIsiKontent();
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}