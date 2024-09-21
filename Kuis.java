public class Kuis {
    private String judulKuis;
    private String[] pertanyaan;
    private String[] jawaban;

    // Constructor
    public Kuis(String judulKuis, String[] pertanyaan, String[] jawaban) {
        this.judulKuis = judulKuis;
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
    }

    // Method untuk mengerjakan kuis
    public void kerjakanKuis() {
        System.out.println("Judul Kuis: " + judulKuis);
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println("Pertanyaan " + (i+1) + ": " + pertanyaan[i]);
            System.out.println("Jawaban: " + jawaban[i]);
        }
    }

    // Getter dan Setter
    public String getJudulKuis() {
        return judulKuis;
    }

    public void setJudulKuis(String judulKuis) {
        this.judulKuis = judulKuis;
    }

    public String[] getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String[] pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String[] getJawaban() {
        return jawaban;
    }

    public void setJawaban(String[] jawaban) {
        this.jawaban = jawaban;
    }
}
