public class MateriPembelajaran {
    private String judulMateri;
    private String mataPelajaran;
    private String isiMateri;
    MateriPembelajaran(String judulMateri, String isiMateri) {
        this.judulMateri = judulMateri;
        this.isiMateri = isiMateri;
    }

    void pelajariMateri() {
        System.out.println(judulMateri);
        System.out.println(isiMateri);
    }
}
