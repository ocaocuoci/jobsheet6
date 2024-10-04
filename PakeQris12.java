import java.util.Scanner;

public class PakeQris12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        String member, metodePembayaran;
        int pilihan_menu, harga;
        double total_Bayar, diskon;

        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("---------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input12.nextInt();
        input12.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        member = input12.nextLine();
        
        System.out.print("Metode pembayaran (Qris/Lainnya) ? = ");
        metodePembayaran = input12.nextLine();

        System.out.println("----------------------------------------");

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            total_Bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_Bayar);
        } else if (member.equalsIgnoreCase("n")) {
            total_Bayar = harga;
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (metodePembayaran.equalsIgnoreCase("Qris")) {
            System.out.println("Potongan harga Qris = Rp 1000");
            total_Bayar -= 1000;
        }

        System.out.println("Total Bayar: " + total_Bayar);
        System.out.println("------------------------------------------------");
    }
}