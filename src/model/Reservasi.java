package model;

public class Reservasi extends Akun {

    private String idReservasi;
    private String jenisKelamin;
    //private String noTelp;

    public Reservasi setIdReservasi(String idReservasi) {
        this.idReservasi = idReservasi;
        return this;
    }

    public String getIdReservasi() {
        return idReservasi;
    }

    public Reservasi setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    //public Reservasi setNoTelp(String noTelp) {
    //    this.noTelp = noTelp;
    //    return this;
    //}

    //public String getNoTelp() {
    //    return noTelp;
    //}
    
    public Object getIdNama() {
        return null;
    }

    public String getma() {
        return null;
    }
}
