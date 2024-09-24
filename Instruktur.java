public class Instruktur {
    private String namaInstruktur;
    private String matapelajaran;
    private String password;

    public Instruktur(String nama, String password, String mapel) {
        namaInstruktur = nama;
        matapelajaran = mapel;
    }

    public void setNamaInstruktur(String nama) {
        namaInstruktur = nama;
    }

    public String getNamaInstruktur() {
        return namaInstruktur;
    }

    String getPassword() {
        return password;
    }

    public void setMatapelajaran(String mapel) {
        matapelajaran = mapel;
    }

    public String getMatapelajaran() {
        return matapelajaran;
    }
}