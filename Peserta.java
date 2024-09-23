import java.util.ArrayList;
import java.util.List;

class Peserta {
    private String nama;
    private List<String> kursusDiikuti;

    public Peserta(String nama) {
        this.nama = nama;
        this.kursusDiikuti = new ArrayList<>();
    }

    public void beliKursus(String namaKursus) {
        if (namaKursus != null && !namaKursus.trim().isEmpty()) {
            kursusDiikuti.add(namaKursus);
            System.out.println("Kursus " + namaKursus + " berhasil dibeli oleh " + nama);
        } else {
            System.out.println("Nama kursus tidak valid.");
        }
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

