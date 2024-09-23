import java.util.Scanner;

public class Database {
    Instruktur instruktur[]=new Instruktur[0];
    Kursus kursus[]=new Kursus[0];

    void tambahKontent(String matapelajaran, String bentukKontent){
        Scanner sc = new Scanner(System.in);
        if (matapelajaran.equals(temp.mataPelajaran)) {
            if (bentukKontent.equals("materi")) {
                    temp.materiPembelajaran = new MateriPembelajaran();
                }else if (bentukKontent.equals("video")) {
                    System.out.println("Masukkan judul video: ");
                    String judulVideo = sc.nextLine();
                    System.out.println("Masukkan URL video: ");
                    String urlVideo = sc.nextLine();
                    System.out.println("Masukkan durasi video (dalam detik): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    temp.video = new Video(judulVideo, urlVideo, durasi);
                }else if (bentukKontent.equals("artikel")) {
                    System.out.println("Masukkan judul artikel: ");
                    String judulArtikel = sc.nextLine();
                    System.out.println("Masukkan isi artikel: ");
                    String isiArtikel = sc.nextLine();
                    temp.artikel = new Artikel(judulArtikel, isiArtikel);
                }else if (bentukKontent.equals("kuis")) {
                    System.out.println("Masukkan judul kuis: ");
                    String judulKuis = sc.nextLine();
                    System.out.println("Masukkan banyak pertanyaan: ");
                    int banyakPertanyaan = sc.nextInt();
                    sc.nextLine();
                    String[] pertanyaan = new String[banyakPertanyaan-1];
                    String[] jawaban = new String[banyakPertanyaan-1];
                    for (int i = 0; i < banyakPertanyaan; i++) {
                        System.out.println("Masukkan pertanyaan " + (i+1) + ": ");
                        pertanyaan[i] = sc.nextLine();
                        System.out.println("Masukkan jawaban " + (i+1) + ": ");
                        jawaban[i] = sc.nextLine();
                    }
                    temp.kuis = new Kuis(judulKuis, pertanyaan, jawaban);
                }
            }
    }
}
