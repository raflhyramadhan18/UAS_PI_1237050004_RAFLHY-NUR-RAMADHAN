package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Penjualan {
    private String idPenjualan;
    private Pembeli pembeli;
    private Penjual penjual;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetilPenjualan> detilPenjualans;
    
    

    /**
     * @return String return the idPenjualan
     */
    public String getIdPenjualan() {
        return idPenjualan;
    }

    /**
     * @param idPenjualan the idPenjualan to set
     */
    public Penjualan setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
        return this;
    }

    /**
     * @return Pembeli return the pembeli
     */
    public Pembeli getPembeli() {
        return pembeli;
    }

    /**
     * @param pembeli the pembeli to set
     */
    public Penjualan setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
        return this;
    }

    /**
     * @return Penjual return the penjual
     */
    public Penjual getPenjual() {
        return penjual;
    }

    /**
     * @param penjual the penjual to set
     */
    public Penjualan setPenjual(Penjual penjual) {
        this.penjual = penjual;
        return this;
    }

    /**
     * @return int return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public Penjualan setTotal(int total) {
        this.total = total;
        return this;
    }

    /**
     * @return LocalDate return the tanggal
     */
    public LocalDate getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public Penjualan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }


    /**
     * @return ArrayList<DetilPenjualan> return the detilPenjualans
     */
    public ArrayList<DetilPenjualan> getDetilPenjualans() {
        return detilPenjualans;
    }

    /**
     * @param detilPenjualans the detilPenjualans to set
     */
    public Penjualan setDetilPenjualans(ArrayList<DetilPenjualan> detilPenjualans) {
        this.detilPenjualans = detilPenjualans;
        return this;
    }

}
