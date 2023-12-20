package model;
public class Penjual extends Akun{
    private String idPenjual;

    public Penjual setIdPenjual(String idPenjual){
        this.idPenjual = idPenjual;
        return this;
    }
    public String getIdPenjual(){
        return this.idPenjual;
    }
    
}
