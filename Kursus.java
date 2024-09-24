import java.util.Scanner;

public class Kursus {
    private String mataPelajaran;
    private String bentukKontent;
    private Materi materiPembelajaran;
    private Video video;
    private Artikel artikel;
    private Kuis kuis;
    private int harga;

    void melihatIsiKontent() {
        if (bentukKontent.equals("materi")) {
            materiPembelajaran.pelajariMateri();
        } else if (bentukKontent.equals("video")) {
            video.putarVideo();
        } else if (bentukKontent.equals("artikel")) {
            artikel.bacaArtikel();
        } else if (bentukKontent.equals("kuis")) {
            kuis.kerjakanKuis();
        }
    }

    void setKursus(String mataPelajaran, String bentukKontent, int harga) {
        this.mataPelajaran = mataPelajaran;
        this.bentukKontent = bentukKontent;
        this.harga = harga;
    }

    void setMateriPembelajaran(String judul, String isiMateri) {
        Materi materi = new Materi(judul, isiMateri);
    }

    void setVideo(String judulVideo, String urlVideo, int durasi) {
        Video video = new Video(judulVideo, urlVideo, durasi);
    }

    void setArtikel(String judulArtikel, String isiArtikel) {
        Artikel artikel = new Artikel(judulArtikel, isiArtikel);
    }

    void setKuis(String judulKuis, int banyakPertanyaan, String[] pertanyaan, String[] jawaban) {
        Kuis kuis = new Kuis(judulKuis, banyakPertanyaan, pertanyaan, jawaban);
    }

    void tampilKontent() {
        System.out.println("Mata pelajaran: " + mataPelajaran);
        System.out.println("Bentuk konten: " + bentukKontent);
    }

    String getMataPelajaran() {
        return mataPelajaran;
    }

    int getHarga() {
        return harga;
    }
}