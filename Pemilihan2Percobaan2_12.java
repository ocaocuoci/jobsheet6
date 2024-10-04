import java.util.Scanner;
public class Pemilihan2Percobaan2_12 {
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);

        String member;
        int pilihan_menu, jumlah_beli, harga;
        Double total_Bayar, diskon;

        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2.  Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("---------------------");
        System.out.println("Masukkan angka dari menu yang dipilih = ");
         pilihan_menu = input12.nextInt();
         input12.nextLine();

         System.out.println("Apakah punya member (y/n) ? = ");
         member = input12.nextLine();
        
        System.out.println("----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.print("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
            }
            else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea =" + harga);
            }
            else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }
            else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_Bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon =" + total_Bayar);
        } 

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } 
            else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } 
            else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga Bundling" + harga);
            } 
            else {
                System.out.println("Masukkan pilihan menu dengan banar");
                return;
            }
            System.out.print("Total Bayar = " + harga);
        }     
        else {
            System.out.print("Member tidak valid");
        }
        System.out.println("------------------------------------------------");
    }
}