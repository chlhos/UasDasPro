package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Penyewaan {

    private String idPenyewaan;
    private Tamu tamu;
    private Reservasi reservasi;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetailKamar> detailKamars;

    public Penyewaan setIdPenyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
        return this;
    }

    public String getIdPenyewaan() {
        return this.idPenyewaan;
    }

    public Penyewaan setTamu(Tamu tamu) {
        this.tamu = tamu;
        return this;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public Penyewaan setReservasi(Reservasi reservasi) {
        this.reservasi = reservasi;
        return this;
    }

    public Reservasi getReservasi() {
        return reservasi;
    }

    public Penyewaan setTotal(int total) {
        this.total = total;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Penyewaan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public Penyewaan setDetailKamars(ArrayList<DetailKamar> detailKamars) {
        this.detailKamars = detailKamars;
        return this;
    }

    public ArrayList<DetailKamar> getDetailKamars() {
        return detailKamars;
    }
}
