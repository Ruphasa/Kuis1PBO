import java.util.Scanner;

public class main {
    public static void main(String[] args) {
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
            if (username.equals("admin") && password.equals("admin")) {
                while (true) {
                    System.out.println("+-----------------------------------------+");
                    System.out.println("|               Menu Admin                |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| 1. Tambah Peserta                        |");
                    System.out.println("| 2. Tambah Instruktur                     |");
                    System.out.println("| 3. Exit                                  |");
                    System.out.println("+-----------------------------------------+");
                    System.out.print("Pilih: ");
                    int pilih = sc.nextInt();
                    sc.nextLine();
                    if (pilih == 1) {
                        System.out.print("Username : ");
                        String newUsername = sc.nextLine();
                        System.out.print("Password : ");
                        String newPassword = sc.nextLine();
                        db.tambahPeserta(newUsername, newPassword);
                    } else if (pilih == 2) {
                        System.out.print("Username : ");
                        String newUsername = sc.nextLine();
                        System.out.print("Password : ");
                        String newPassword = sc.nextLine();
                        System.out.print("Mata pelajaran : ");
                        String newMataPelajaran = sc.nextLine();
                        db.tambahInstruktur(newUsername, newPassword, newMataPelajaran);
                    } else if (pilih == 3) {
                        break;
                    }
                }
            } else if (db.cekLoginInstruktur(username, password)) {
                while (true) {
                    System.out.println("+-----------------------------------------+");
                    System.out.println("|               Menu Instruktur            |");
                    System.out.println("+-----------------------------------------+");
                    System.out.println("| 1. Tambah Kursus                         |");
                    System.out.println("| 2. Exit                                  |");
                    System.out.println("+-----------------------------------------+");
                    System.out.print("Pilih: ");
                    int pilih = sc.nextInt();
                    sc.nextLine();
                    if (pilih == 1) {
                        System.out.print("Mata pelajaran : ");
                        String newMataPelajaran = sc.nextLine();
                        System.out.print("Bentuk konten : ");
                        String newBentukKontent = sc.nextLine();
                        db.tambahKontent(newMataPelajaran, newBentukKontent);
                    } else if (pilih == 2) {
                        break;
                    }
                }
            } else if (db.cekLoginPeserta(username, password)) {
                while (true) {
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
                        db.tampilSemuaKontent();
                        System.out.print("Pilih : ");
                        int pilihKursus = sc.nextInt();
                    } else if (pilih == 2) {
                        db.tampilkanKursusDiikuti();
                    } else if (pilih == 3) {
                        System.out.print("Mata pelajaran : ");
                        String newMataPelajaran = sc.nextLine();
                        db.belajarKursus(newMataPelajaran);
                    } else if (pilih == 4) {
                        break;
                    }
                }
            } else {
                System.out.println("Username atau password salah");
            }
        }
    }
}
