import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Peserta {
    Scanner sc = new Scanner(System.in);
    private String nama;
    private List<String> kursusDiikuti;
    DataBase db = new DataBase();

    public Peserta(String nama) {
        this.nama = nama;
        this.kursusDiikuti = new ArrayList<>();
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
        kursusDiikuti.add(db.getNamaKontent(pilih));
        System.out.println("Pembayaran selesai");
    }

    public void tampilkanKursusDiikuti() {
        System.out.println("Kursus yang diikuti oleh " + nama + ":");
        if (kursusDiikuti.isEmpty()) {
            System.out.println("Belum ada kursus yang diikuti.");
        } else {
            for (String kursus : kursusDiikuti) {
                System.out.println("- " + kursus);
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public List<String> getKursusDiikuti() {
        return kursusDiikuti;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}