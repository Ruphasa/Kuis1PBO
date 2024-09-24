import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        Kursus newKursus = new Kursus();
        if (bentukKontent.equalsIgnoreCase("materi")) {
            System.out.print("Masukkan judul materi: ");
            String judulMateri = sc.nextLine();
            System.out.print("Masukkan isi materi: ");
            String isiMateri = sc.nextLine();
            System.out.print("Masukkan harga: ");
            int harga = sc.nextInt();
            sc.nextLine();
            newKursus.setKursus(mataPelajaran, bentukKontent, harga);
            newKursus.setMateriPembelajaran(judulMateri, isiMateri);
        } else if (bentukKontent.equalsIgnoreCase("video")) {
            System.out.print("Masukkan judul video: ");
            String judulVideo = sc.nextLine();
            System.out.print("Masukkan URL video: ");
            String urlVideo = sc.nextLine();
            System.out.print("Masukkan durasi video (dalam detik): ");
            int durasi = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan harga: ");
            int harga = sc.nextInt();
            sc.nextLine();
            newKursus.setKursus(mataPelajaran, bentukKontent, harga);
            newKursus.setVideo(judulVideo, urlVideo, durasi);
        } else if (bentukKontent.equalsIgnoreCase("artikel")) {
            System.out.print("Masukkan judul artikel: ");
            String judulArtikel = sc.nextLine();
            System.out.print("Masukkan isi artikel: ");
            String isiArtikel = sc.nextLine();
            System.out.print("Masukkan harga: ");
            int harga = sc.nextInt();
            sc.nextLine();
            newKursus.setKursus(mataPelajaran, bentukKontent, harga);
            newKursus.setArtikel(judulArtikel, isiArtikel);
        } else if (bentukKontent.equalsIgnoreCase("kuis")) {
            System.out.print("Masukkan judul kuis: ");
            String judulKuis = sc.nextLine();
            System.out.print("Masukkan banyak pertanyaan: ");
            int banyakPertanyaan = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan harga: ");
            int harga = sc.nextInt();
            sc.nextLine();
            newKursus.setKursus(mataPelajaran, bentukKontent, harga);
            String[] pertanyaan = new String[banyakPertanyaan];
            String[] jawaban = new String[banyakPertanyaan];
            for (int i = 0; i < banyakPertanyaan; i++) {
                System.out.print("Masukkan pertanyaan " + (i + 1) + ": ");
                pertanyaan[i] = sc.nextLine();
                System.out.print("Masukkan jawaban " + (i + 1) + ": ");
                jawaban[i] = sc.nextLine();
            }
            newKursus.setKuis(judulKuis, banyakPertanyaan, pertanyaan, jawaban);
        }
        daftarKursus.add(newKursus);
        System.out.println("Kursus berhasil ditambahkan.");
    }

    // Method untuk menampilkan semua konten yang tersedia (kursus)
    public void tampilkanSemuaKontent() {
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
        System.out.println("Kursus yang diikuti:");
        for (int i = 0; i < daftarKursus.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKursus.get(i).getMataPelajaran());
        }
    }

    String getMataPelajaran(int index) {
        return daftarInstruktur.get(index).getMataPelajaran();
    }

    int getIndex(String username, String password) {
        for (int i = 0; i < daftarInstruktur.size(); i++) {
            if (daftarInstruktur.get(i).getNama().equals(username) && daftarInstruktur.get(i).getPassword().equals(password)) {
                return i;
            }
        }
        return -1;
    }

    Peserta getPeserta(String username, String password) {
        for (int i = 0; i < daftarPeserta.size(); i++) {
            if (daftarPeserta.get(i).getNama().equals(username) && daftarPeserta.get(i).getPassword().equals(password)) {
                return daftarPeserta.get(i);
            }
        }
        return null;
    }
}
