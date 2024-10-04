import java.util.Scanner;
public class TokoBuku12{
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);

        int jml_Buku, harga;
        String jenis_Buku;
        Double hargaDsikon;

        System.out.print("Masukan jenis buku: ");
        jenis_Buku = input12.nextLine();
        System.out.print("Masukan jumlah buku: ");
        jml_Buku = input12.nextInt();
        System.out.print("Harga @ buku ");
        harga = input12.nextInt();

        if (jenis_Buku.equalsIgnoreCase("kamus")) {
           Double diskonKamus = (1.0 - 0.1) * harga * jml_Buku;
            if (jml_Buku > 2) {
                hargaDsikon = (1.0 - 0.02)*harga*jml_Buku;
            } else {
                hargaDsikon = diskonKamus;
            }
        } else if (jenis_Buku.equalsIgnoreCase("novel")){
            Double diskonNovel = (1.0 - 0.07) * harga * jml_Buku;
            if (jml_Buku >= 3){
                hargaDsikon = (1.0 - 0.2) * diskonNovel;
            } else {
                hargaDsikon = (1.0 - 0.1) * diskonNovel;
            }
        } else {
            if ( jml_Buku > 3){
               hargaDsikon = (1.0 - 0.05) * harga * jml_Buku;
            } else {
                hargaDsikon = 0.0;
            }
        }
           
    
        System.out.print("Total harga setalah diskon: " + hargaDsikon);
        Double jmlDiskon = (harga * jml_Buku) * hargaDsikon;
        System.out.println("jml diskon Rp. " + jmlDiskon);
    }
}