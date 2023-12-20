package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Barang;
import model.DetilPenjualan;
import model.Pembeli;
import model.Penjual;
import model.Penjualan;

public class TokoController {
    HashMap<String, Barang> barangs = new HashMap();
    ArrayList<Penjualan> penjualans = new ArrayList<>();
    HashMap<String, Pembeli> pembelis = new HashMap();
    HashMap<String, Penjual> penjuals = new HashMap();

    public void setUp() {
        Barang barang1 = new Barang();
        Barang barang2 = new Barang();
        Barang barang3 = new Barang();
        Barang barang4 = new Barang();
        barang1
                .setIdBarang("01")
                .setNamBarang("Beras 3 Kg")
                .setHargaBarang(100000)
                .setIsAvailable(true);

        barang2.setNamBarang("Kecap malika 500ml").setIdBarang("02").setHargaBarang(50000).setIsAvailable(true);
        barang3.setNamBarang("Saus ABB1 500ml").setIdBarang("03").setHargaBarang(25000).setIsAvailable(true);
        barang4.setIdBarang("04").setNamBarang("tumbler").setHargaBarang(75000).setIsAvailable(false);

        barangs.put(barang1.getIdBarang(), barang1);
        barangs.put(barang2.getIdBarang(), barang2);
        barangs.put(barang3.getIdBarang(), barang3);
        barangs.put(barang4.getIdBarang(), barang4);

        Pembeli pembeli1 = new Pembeli();
        Pembeli pembeli2 = new Pembeli();
        pembeli1.setIdPembeli("01").setName("Heru").setAlamat("Bandung").setEmail("heru@gmail.com");
        pembeli2.setIdPembeli("02").setName("Budi").setAlamat("Jakarta").setEmail("budi@gmail.com");
        pembelis.put(pembeli1.getIdPembeli(), pembeli1);
        pembelis.put(pembeli2.getIdPembeli(), pembeli2);

        Penjual penjual1 = new Penjual();
        Penjual penjual2 = new Penjual();
        penjual1.setIdPenjual("01").setAlamat("Bandung").setEmail("usop@gmail.com").setName("Usop");
        penjual2.setIdPenjual("02").setAlamat("Bandung").setEmail("zoroo@gmail.com").setName("Zoro");
        penjuals.put(penjual1.getIdPenjual(), penjual1);
        penjuals.put(penjual2.getIdPenjual(), penjual2);
    }

    public void lihatDaftarBarang() {
        System.out.println();
        System.out.println("==== Daftar Barang ====");
        for (Map.Entry<String, Barang> barang : barangs.entrySet()) {
            String key = barang.getKey();
            Barang tBarang = barang.getValue();
            if (tBarang.isIsAvailable()) {
                System.out.println("Kode Barang \t :" + key);
                System.out.println("Nama \t\t :" + tBarang.getNamaBarang());
                System.out.println("Harga \t\t :" + tBarang.getHargaBarang());
                System.out.println();
            }

        }
    }

    public Barang getBarang(String idBarang) {
        return barangs.get(idBarang);
    }

    public Penjual getPenjual(String idPenjual) {
        return penjuals.get(idPenjual);
    }

    public Pembeli getPembeli(String idPembeli) {
        return pembelis.get(idPembeli);
    }

    public void belanja() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetilPenjualan> tDetilPenjualans = new ArrayList<>();
        int increment = 0;
        String lanjut = "";
        try {
            do {
                increment++;
                System.out.println();
                System.out.print("Silahkan masukkan kode barang\t: ");
                String kodeBarang = input.readLine();
                System.out.print("Jumlah yang akan dibeli\t: ");
                int jumlah = Integer.valueOf(input.readLine());
                System.out.print("Kembali berbelanja (Y/N)?\t: ");
                lanjut = input.readLine();

                DetilPenjualan dp = new DetilPenjualan();
                Barang tBarang = getBarang(kodeBarang);
                dp.setIdDetilPenjualan("dp" + increment);
                dp.setBarang(tBarang);
                dp.setHargaJual(tBarang.getHargaBarang());
                dp.setJumlahBeli(jumlah);
                dp.setSubTotal(tBarang.getHargaBarang() * jumlah);
                tDetilPenjualans.add(dp);

            } while (lanjut.equalsIgnoreCase("Y"));

            System.out.println("");
            System.out.println("===Berikut Daftar Belanjaan Anda===");
            tampilkanDaftarBelanjaan(tDetilPenjualans);
            System.out.println("TOTAL: " + hitungTotalBelanja(tDetilPenjualans));
            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Konfirmasi pembelian (Y/N)?");
            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                Penjualan penjualan = new Penjualan();
                penjualan.setDetilPenjualans(tDetilPenjualans)
                        .setIdPenjualan("P" + penjualans.size() + 1)
                        .setPembeli(getPembeli("01"))
                        .setPenjual(getPenjual("02"))
                        .setTanggal(LocalDate.now())
                        .setTotal(hitungTotalBelanja(tDetilPenjualans));
                penjualans.add(penjualan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarBelanjaan(ArrayList<DetilPenjualan> dp) {
        for (DetilPenjualan detilPenjualan : dp) {
            System.out.println("Nama Barang \t :" + detilPenjualan.getBarang().getNamaBarang());
            System.out.println("Harga \t :" + detilPenjualan.getHargaJual());
            System.out.println("Jumlah \t :" + detilPenjualan.getJumlahBeli());
            System.out.println("");
        }
    }

    public int hitungTotalBelanja(ArrayList<DetilPenjualan> dp) {
        int total = 0;
        for (DetilPenjualan detilPenjualan : dp) {
            total += detilPenjualan.getSubTotal();
        }
        return total;
    }

    public void tampilkanLaporanPenjualan() {
        for (Penjualan penjualan : penjualans) {
            System.err.println();
            System.out.println("Kode Penjualan \t :"+penjualan.getIdPenjualan());
            System.out.println("Tanggal transaksi \t :"+penjualan.getTanggal());
            System.out.println("Penjual \t \t : "+penjualan.getPenjual().getName());
            System.out.println("Pembeli \t \t : "+penjualan.getPembeli().getName());
            System.out.println("=========================");
            ArrayList<DetilPenjualan> detilPenjualans = penjualan.getDetilPenjualans();
            for (DetilPenjualan dp : detilPenjualans) {
                System.out.println("Nama barang \t \t : " + dp.getBarang().getNamaBarang());
                System.out.println("Jumlah beli \t \t : " + dp.getJumlahBeli());
                System.out.println("Subtotal \t \t : " + dp.getSubTotal());
            }
            System.out.println("=========================");
            System.out.println("Total \t \t : "+penjualan.getTotal());
        }
    }

}
