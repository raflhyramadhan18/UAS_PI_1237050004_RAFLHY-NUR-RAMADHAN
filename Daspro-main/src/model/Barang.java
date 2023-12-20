package model;
public class Barang {
    private String idBarang;
    private String namaBarang;
    private int hargaBarang;
    private boolean isAvailable;

    public Barang setIdBarang(String idBarang){
        this.idBarang = idBarang;
        return this;
    }
    public Barang setNamBarang(String namaBarang){
        this.namaBarang = namaBarang;
        return this;
    }
    public Barang setHargaBarang(int hargaBarang){
        this.hargaBarang = hargaBarang;
        return this;
    }
    public Barang setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
        return this;
    }


    /**
     * @return String return the idBarang
     */
    public String getIdBarang() {
        return idBarang;
    }

    /**
     * @return String return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @return int return the hargaBarang
     */
    public int getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @return boolean return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

}
