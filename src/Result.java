import java.io.BufferedReader;
import java.io.InputStreamReader;

import controller.HotelController;

public class Result {
    public static void main(String[] args) throws Exception {
        HotelController hotelController = new HotelController();
        hotelController.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        hotelController.logReser();
        hotelController.dataTamu();

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
        System.out.println("Sistem ");
    }

    public static void tampilkanMenu() {
        System.out.println();
        System.out.println("======== Menu Pemesanan ==========");
        System.out.println("");
        System.out.println("1. Lihat daftar kamar tersedia");
        System.out.println("2. Lakukan Pemesanan Kamar");
        System.out.println("3. Histori Pemesanan Kamar");
        System.out.println("4. Keluar");
    }

    
}
