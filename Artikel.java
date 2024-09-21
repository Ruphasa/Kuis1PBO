public class Artikel {
    private String judulArtikel;
    private String isiArtikel;

    // Constructor
    public Artikel(String judulArtikel, String isiArtikel) {
        this.judulArtikel = judulArtikel;
        this.isiArtikel = isiArtikel;
    }

    // Method untuk membaca artikel
    public void bacaArtikel() {
        System.out.println("Judul Artikel: " + judulArtikel);
        System.out.println("Isi Artikel: \n" + isiArtikel);
    }

    // Getter dan Setter
    public String getJudulArtikel() {
        return judulArtikel;
    }

    public void setJudulArtikel(String judulArtikel) {
        this.judulArtikel = judulArtikel;
    }

    public String getIsiArtikel() {
        return isiArtikel;
    }

    public void setIsiArtikel(String isiArtikel) {
        this.isiArtikel = isiArtikel;
    }
}
