import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import controller.HotelController;
import model.Kamar;
import model.Reservasi;
import model.Tamu;

public class Result {
    public static void main(String[] args) throws Exception {
        HotelController hotelController = new HotelController();
        hotelController.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //hotelController.logReser();
        //hotelController.dataTamu();

        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    hotelController.lihatDaftarKamar();
                    break;
                case "2":
                    hotelController.pemesanan();
                    break;
                case "3":
                    hotelController.tampilkanLaporanPemesanan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }
        System.out.println("Terimakasih Telah Datang");
    }

    public static void tampilkanMenu() {
        System.out.println("1. Lihat daftar kamar tersedia");
        System.out.println("2. Lakukan pemesanan");
        System.out.println("3. Laporan Pemesanan");
        System.out.println("4. Keluar");
    }

    // public static void masukanNama() {
    //     System.out.print("Masukan Nama Pewnyewa : ");
    //     System.out.print("Masukan Email Pewnyewa : ");
    //     System.out.print("Masukan No Telp Pewnyewa : ");
    // }
}
