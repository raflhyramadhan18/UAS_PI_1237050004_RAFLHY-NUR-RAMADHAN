package model;

public class DetilPenjualan {
    private String idDetilPenjualan;
    private Penjualan penjualan;
    private Barang barang;
    private int hargaJual;
    private int jumlahBeli;
    private int subTotal;

    
    /**
     * @return String return the idDetilPenjualan
     */
    public String getIdDetilPenjualan() {
        return idDetilPenjualan;
    }

    /**
     * @param idDetilPenjualan the idDetilPenjualan to set
     */
    public void setIdDetilPenjualan(String idDetilPenjualan) {
        this.idDetilPenjualan = idDetilPenjualan;
    }

    /**
     * @return Penjualan return the penjualan
     */
    public Penjualan getPenjualan() {
        return penjualan;
    }

    /**
     * @param penjualan the penjualan to set
     */
    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    /**
     * @return Barang return the barang
     */
    public Barang getBarang() {
        return barang;
    }

    /**
     * @param barang the barang to set
     */
    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    /**
     * @return int return the hargaJual
     */
    public int getHargaJual() {
        return hargaJual;
    }

    /**
     * @param hargaJual the hargaJual to set
     */
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    /**
     * @return int return the jumlahBeli
     */
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    /**
     * @param jumlahBeli the jumlahBeli to set
     */
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    /**
     * @return int return the subTotal
     */
    public int getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

}
