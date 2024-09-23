import java.util.Scanner;

public class DataBase {
    private Peserta Peserta[] = new Peserta[0];
    private Instruktur instruktur[] = new Instruktur[0];
    private Kursus kursus[] = new Kursus[0];

    void tambahInstruktur(String nama, String mapel) {
        Instruktur temp[] = new Instruktur[instruktur.length + 1];
        for (int i = 0; i < instruktur.length; i++) {
            temp[i] = instruktur[i];
        }
        instruktur = temp;
        instruktur[instruktur.length - 1] = new Instruktur(nama, mapel);
    }

    void tambahPeserta(String nama) {
        Peserta temp[] = new Peserta[Peserta.length + 1];
        for (int i = 0; i < Peserta.length; i++) {
            temp[i] = Peserta[i];
        }
        Peserta = temp;
        Peserta[Peserta.length - 1] = new Peserta(nama);
    }

    void tambahKontent(String matapelajaran, String bentukKontent) {
        Scanner sc = new Scanner(System.in);
        Kursus temp[] = new Kursus[kursus.length + 1];
        for (int i = 0; i < kursus.length; i++) {
            temp[i] = kursus[i];
        }
        kursus = temp;
        kursus[kursus.length-1] = new Kursus();
        if (bentukKontent.equals("materi")) {
            System.out.println("Masukkan judul materi: ");
            String judulMateri = sc.nextLine();
            System.out.println("Masukkan isi materi: ");
            String isiMateri = sc.nextLine();
            kursus[kursus.length - 1].setMateriPembelajaran(judulMateri, isiMateri);
        } else if (bentukKontent.equals("video")) {
            System.out.println("Masukkan judul video: ");
            String judulVideo = sc.nextLine();
            System.out.println("Masukkan URL video: ");
            String urlVideo = sc.nextLine();
            System.out.println("Masukkan durasi video (dalam detik): ");
            int durasi = sc.nextInt();
            sc.nextLine();
            kursus[kursus.length - 1].setVideo(judulVideo, urlVideo, durasi);
        } else if (bentukKontent.equals("artikel")) {
            System.out.println("Masukkan judul artikel: ");
            String judulArtikel = sc.nextLine();
            System.out.println("Masukkan isi artikel: ");
            String isiArtikel = sc.nextLine();
            kursus[kursus.length - 1].setArtikel(judulArtikel, isiArtikel);
        } else if (bentukKontent.equals("kuis")) {
            System.out.println("Masukkan judul kuis: ");
            String judulKuis = sc.nextLine();
            System.out.println("Masukkan banyak pertanyaan: ");
            int banyakPertanyaan = sc.nextInt();
            sc.nextLine();
            String[] pertanyaan = new String[banyakPertanyaan - 1];
            String[] jawaban = new String[banyakPertanyaan - 1];
            for (int i = 0; i < banyakPertanyaan; i++) {
                System.out.println("Masukkan pertanyaan " + (i + 1) + ": ");
                pertanyaan[i] = sc.nextLine();
                System.out.println("Masukkan jawaban " + (i + 1) + ": ");
                jawaban[i] = sc.nextLine();
            }
            kursus[kursus.length - 1].setKuis(judulKuis, banyakPertanyaan, pertanyaan, jawaban);;
        }
    }

    void tampilSemuaKontent(){
        for (int i = 0; i < kursus.length; i++) {
            kursus[i].tampilKontent();
        }
    }

    int getKursusLength(){ 
        return kursus.length;
    }

    String getNamaKontent(int index) {
        return kursus[index].getMataPelajaran();
    }

    int getHargaKontent(int index) {
        return kursus[index].getHarga();
    }
}