public class Video {
    private String judulVideo;
    private String urlVideo;
    private int durasi; // dalam detik

    // Constructor
    public Video(String judulVideo, String urlVideo, int durasi) {
        this.judulVideo = judulVideo;
        this.urlVideo = urlVideo;
        this.durasi = durasi;
    }

    // Method untuk memutar video
    public void putarVideo() {
        System.out.println("Memutar video: " + judulVideo);
        System.out.println("URL: " + urlVideo);
        System.out.println("Durasi: " + durasi + " detik");
    }

    // Getter dan Setter 
    public String getJudulVideo() {
        return judulVideo;
    }

    public void setJudulVideo(String judulVideo) {
        this.judulVideo = judulVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}
