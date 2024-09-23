public class Instruktur {
    private String namaInstruktur;
    private String matapelajaran;

    public Instruktur(String nama, String mapel) {
        namaInstruktur = nama;
        matapelajaran = mapel;
    }

    public void setNamaInstruktur(String nama) {
        namaInstruktur = nama;
    }

    public String getNamaInstruktur() {
        return namaInstruktur;
    }

    public void setMatapelajaran(String mapel) {
        matapelajaran = mapel;
    }

    public String getMatapelajaran() {
        return matapelajaran;
    }
}