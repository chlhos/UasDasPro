package model;

public class Tamu extends Akun {

    private String idTamu;
    private String jenisKelamin;
    private String noTelp;

    public Tamu setIdTamu(String idTamu) {
        this.idTamu = idTamu;
        return this;
    }

    public String getIdTamu() {
        return idTamu;
    }

    public Tamu setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public Tamu setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        return this;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getIdNama() {
        return null;
    }
}
