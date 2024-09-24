// main.java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        clear();
        DataBase db = new DataBase();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("+-----------------------------------------+");
            System.out.println("|                 Login                   |");
            System.out.println("+-----------------------------------------+");
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            clear();
            if (username.equals("admin") && password.equals("admin")) {
                while (true) {
                    System.out.println("+-----------------------------------------+");
                    System.out.println("|               Menu Admin                |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| 1. Tambah Peserta                       |");
                    System.out.println("| 2. Tambah Instruktur                    |");
                    System.out.println("| 3. Exit                                 |");
                    System.out.println("+-----------------------------------------+");
                    System.out.print("Pilih: ");
                    int pilih = sc.nextInt();
                    sc.nextLine();
                    clear();
                    if (pilih == 1) {
                        System.out.print("Username : ");
                        String newUsername = sc.nextLine();
                        System.out.print("Password : ");
                        String newPassword = sc.nextLine();
                        clear();
                        db.tambahPeserta(newUsername, newPassword);
                    } else if (pilih == 2) {
                        System.out.print("Username : ");
                        String newUsername = sc.nextLine();
                        System.out.print("Password : ");
                        String newPassword = sc.nextLine();
                        System.out.print("Mata pelajaran : ");
                        String newMataPelajaran = sc.nextLine();
                        clear();
                        db.tambahInstruktur(newUsername, newPassword, newMataPelajaran);
                    } else if (pilih == 3) {
                        break;
                    }
                }
            } else if (db.cekLoginInstruktur(username, password)) {
                int index = db.getIndex(username, password);
                String newMataPelajaran = db.getMataPelajaran(index);
                while (true) {
                    System.out.println("+-----------------------------------------+");
                    System.out.println("|               Menu Instruktur           |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| 1. Tambah Kursus                        |");
                    System.out.println("| 2. Exit                                 |");
                    System.out.println("+-----------------------------------------+");
                    System.out.print("Pilih: ");
                    int pilih = sc.nextInt();
                    sc.nextLine();
                    if (pilih == 1) {
                        System.out.print("Bentuk konten (Materi/Video/Artikel/Kuis): ");
                        String newBentukKontent = sc.nextLine();
                        db.tambahKontent(newMataPelajaran, newBentukKontent);
                    } else if (pilih == 2) {
                        break;
                    }
                }
            } else if (db.cekLoginPeserta(username, password)) {
                while (true) {
                    Peserta peserta = db.getPeserta(username, password);
                    System.out.println("+-----------------------------------------+");
                    System.out.println("|               Menu Peserta              |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| 1. Beli Kursus                          |");
                    System.out.println("| 2. Tampilkan Kursus Diikuti             |");
                    System.out.println("| 3. Belajar Kursus                       |");
                    System.out.println("| 4. Exit                                 |");
                    System.out.println("+-----------------------------------------+");
                    System.out.print("Pilih: ");
                    int pilih = sc.nextInt();
                    sc.nextLine();
                    if (pilih == 1) {
                        db.tampilkanSemuaKontent();
                        System.out.print("Pilih : ");
                        int pilihKursus = sc.nextInt();
                        clear();
                        db.beliKursus(db.getKursus(pilihKursus - 1).getHarga());
                    } else if (pilih == 2) {
                        db.tampilkanKursusDiikuti();
                        pause();
                        clear();
                    } else if (pilih == 3) {
                        clear();
                        peserta.belajarKursus();
                    } else if (pilih == 4) {
                        break;
                    }
                }
            } else {
                System.out.println("Username atau password salah");
            }
        }
    }

    static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
}