public class Kursus {
    private Kursus next;
    private Kursus prev;
    private Kursus head;
    private String mataPelajaran;
    private String bentukKontent;
    private MateriPembelajaran materiPembelajaran;
    private Video video;
    private Artikel artikel;
    private Kuis kuis;

    void melihatIsiKontent(){
        if (bentukKontent.equals("materi")) {
            materiPembelajaran.pelajariMateri();
        }else if (bentukKontent.equals("video")) {
            video.putarVideo();
        }else if (bentukKontent.equals("artikel")) {
            artikel.bacaArtikel();
        }else if (bentukKontent.equals("kuis")) {
            kuis.kerjakanKuis();
        }
    }

    void melihatSemuaKursus(){
        Kursus temp = head;
        while (temp != null) {
            System.out.println(temp.mataPelajaran);
            temp = temp.prev;
        }
    }

    void tambahKontent(String matapelajaran, String bentukKontent){
        Kursus temp=head;
        while (temp!=null) {
            if (matapelajaran.equals(temp.mataPelajaran)) {
                while (temp!=null) {
                    temp = temp.next;
                }
                if (bentukKontent.equals("materi")) {
                    temp.materiPembelajaran = new MateriPembelajaran();
                }else if (bentukKontent.equals("video")) {
                    temp.video = new Video();
                }else if (bentukKontent.equals("artikel")) {
                    temp.artikel = new Artikel();
                }else if (bentukKontent.equals("kuis")) {
                    temp.kuis = new Kuis();
                }
            }
            temp = temp.prev;
        }
    }
}
