package model;
public class Akun {

    private String name;
    private String email;
    private String alamat;

    public Akun setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Akun setAlamat(String alamat) {
        this.alamat = alamat;
        return this;
    }

    public String getAlamat() {
        return this.alamat;
    }

}
