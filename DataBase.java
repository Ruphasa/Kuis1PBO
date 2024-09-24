import java.util.ArrayList;

public class DataBase {
    private ArrayList<Instruktur> daftarInstruktur = new ArrayList<>();
    private ArrayList<Peserta> daftarPeserta = new ArrayList<>();
    private ArrayList<Kursus> daftarKursus = new ArrayList<>();

    // Method untuk menambah instruktur baru
    public void tambahInstruktur(String nama, String password, String mataPelajaran) {
        Instruktur instruktur = new Instruktur(nama, password, mataPelajaran);
        daftarInstruktur.add(instruktur);
        System.out.println("Instruktur berhasil ditambahkan.");
    }

    // Method untuk menambah peserta baru
    public void tambahPeserta(String nama, String password) {
        Peserta peserta = new Peserta(nama, password);
        daftarPeserta.add(peserta);
        System.out.println("Peserta berhasil ditambahkan.");
    }

    // Method untuk cek login instruktur
    public boolean cekLoginInstruktur(String username, String password) {
        for (Instruktur instruktur : daftarInstruktur) {
            if (instruktur.getNamaInstruktur().equals(username) && instruktur.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Method untuk cek login peserta
    public boolean cekLoginPeserta(String username, String password) {
        for (Peserta peserta : daftarPeserta) {
            if (peserta.getNama().equals(username) && peserta.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Method untuk menambah konten kursus oleh instruktur
    public void tambahKontent(String mataPelajaran, String bentukKontent) {
        Kursus kursus = new Kursus();
        kursus.setKursus(mataPelajaran, bentukKontent, 100000); // Misal harga 100000
        daftarKursus.add(kursus);
        System.out.println("Kursus berhasil ditambahkan.");
    }

    // Method untuk menampilkan semua konten yang tersedia (kursus)
    public void tampilSemuaKontent() {
        System.out.println("Daftar kursus yang tersedia:");
        for (int i = 0; i < daftarKursus.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKursus.get(i).getMataPelajaran() + " - Harga: " + daftarKursus.get(i).getHarga());
        }
    }

    // Method untuk mendapatkan panjang array kursus (jumlah kursus yang ada)
    public int getKursusLength() {
        return daftarKursus.size();
    }

    // Method untuk mendapatkan kursus berdasarkan index
    public Kursus getKursus(int index) {
        return daftarKursus.get(index - 1); // Index dikurangi 1 karena array mulai dari 0
    }

    // Method untuk mendapatkan harga konten (kursus)
    public int getHargaKontent(int index) {
        return daftarKursus.get(index - 1).getHarga(); // Index dikurangi 1 karena array mulai dari 0
    }

    // Method untuk menampilkan kursus yang diikuti peserta
    public void tampilkanKursusDiikuti() {
        System.out.println("Menampilkan kursus yang diikuti.");
    }

    // Method untuk belajar kursus (dapat diimplementasikan lebih lanjut)
    public void belajarKursus(String mataPelajaran) {
        System.out.println("Memulai belajar kursus: " + mataPelajaran);
    }
}
