// Instruktur.java
public class Instruktur extends User {
    private String matapelajaran;

    // Constructor for Instruktur
    public Instruktur(String nama, String password, String matapelajaran) {
        super(nama, password); // Call the parent constructor (User)
        this.matapelajaran = matapelajaran;
    }

    // Getter and setter for matapelajaran
    public void setNamaInstruktur(String nama) {
        this.nama = nama; // Using the 'nama' from the User class
    }

    public String getNamaInstruktur() {
        return nama; // Accessing the 'nama' from the User class
    }

    public void setMatapelajaran(String matapelajaran) {
        this.matapelajaran = matapelajaran;
    }

    public String getMatapelajaran() {
        return matapelajaran;
    }

    public String getPassword() {
        return password; // Access the password from the User class
    }
}
