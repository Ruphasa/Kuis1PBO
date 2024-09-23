import java.util.Scanner;

public class DataBase {
    private Peserta Peserta[] = new Peserta[0];
    private Instruktur instruktur[] = new Instruktur[0];
    private Kursus kursus[] = new Kursus[0];

    void tambahInstruktur(String nama, String mapel) {
        Instruktur temp[] = new Instruktur[instruktur.length + 1];
        for (int i = 0; i < instruktur.length; i++) {
            temp[i] = instruktur[i];
        }
        instruktur = temp;
        instruktur[instruktur.length - 1] = new Instruktur(nama,mapel);
    }

    void lihatInstruktur(){
        for (int i = 0; i < instruktur.length; i++) {
            System.out.println("Nama : " + instruktur[i].getNamaInstruktur());
            System.out.println("Mata Pelajaran : "+ instruktur[i].getMatapelajaran());
        }
        
    }

}
