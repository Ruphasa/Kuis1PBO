public class main {
    public static void main(String[] args) {
        DataBase db = new DataBase();

        db.tambahInstruktur("Rizqi", "PBO");
        db.tambahInstruktur("Rizqoy", "WEB");

        db.tambahPeserta("Raul");

        db.tambahKontent("PBO", "materi");
        db.tambahKontent("PBO", "video");
        db.tambahKontent("PBO", "artikel");
        db.tambahKontent("WEB", "materi");
        db.tambahKontent("WEB", "video");
        db.tambahKontent("WEB", "kuis");
        db.tampilSemuaKontent();
    }
}
