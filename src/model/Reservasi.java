package model;

public class Reservasi extends Akun {

    private String idReservasi;
    private String idNama;
    private String noTelp;
    private String jenisKelamin;


    public Reservasi setIdReservasi(String idReservasi) {
        this.idReservasi = idReservasi;
        return this;
    }

    public String getIdReservasi() {
        return idReservasi;
    }

    public Reservasi setIdNama(String idNama) {
        this.idNama = idNama;
        return this;

    }

    public String getIdNama() {
        return idNama;
    }

    public Reservasi setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public Reservasi setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        return this;
    }

    public String getNoTelp() {
        return noTelp;
    }
    
    

   /*  public String getma() {
        return null;
    }
    /* */
}

