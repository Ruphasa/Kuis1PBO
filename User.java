public class User {
    protected String nama;
    protected String password;

    // Constructor for User
    public User(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    // Getters and setters for nama and password
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
