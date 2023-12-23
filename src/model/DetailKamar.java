package model;

public class DetailKamar {

    private String idKamar;
    private Penyewaan penyewaan;
    private Kamar Kamar;
    private int hargaSewa;
    private int subTotal;

    public String getIdKamar() {
        return this.idKamar;
    }

    public void setIdKamar(String idKamar) {
        this.idKamar = idKamar;
    }

    public Penyewaan getPenyewaan() {
        return this.penyewaan;
    }

    public void setPenyewaan(Penyewaan penyewaan) {
        this.penyewaan = penyewaan;
    }

    public Kamar getKamar() {
        return this.Kamar;
    }

    public void setKamar(Kamar Kamar) {
        this.Kamar = Kamar;
    }

    public int getHargaSewa() {
        return this.hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    public int getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
}
