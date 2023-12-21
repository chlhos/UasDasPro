package model;

public class Kamar {

    private String noKamar;
    private String jenisKamar;
    private int hargaSewa;
    private int hari;

    public Kamar setNoKamar(String noKamar) {
        this.noKamar = noKamar;
        return this;
    }

    public String getNoKamar() {
        return noKamar;
    }

    public Kamar setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
        return this;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public Kamar setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
        return this;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public Kamar setHari(int hari) {
        this.hari = hari;
        return this;
    }

    public int getHari() {
        return hari;
    }

    public Kamar setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    private boolean isAvailable;
}
