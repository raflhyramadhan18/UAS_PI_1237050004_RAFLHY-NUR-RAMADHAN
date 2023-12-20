package model;
public class Pembeli extends Akun{
    private String idPembeli;

    public Pembeli setIdPembeli(String idPembeli){
        this.idPembeli = idPembeli;
        return this;
    }
    public String getIdPembeli(){
        return this.idPembeli;
    }
}
