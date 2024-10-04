import java.util.Scanner;
public class Sepatu12{
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);

        int ukuran, harga;
        String merk, kategori;

        System.out.println("==============================================");
        System.out.println("masukkan merk (converse/skatcher/nike)");
        merk  = input12.nextLine();
        System.out.println("Masukkan kategori");
        System.out.println("converse = slip on/high top");
        System.out.println("skatcher = woman/man");
        System.out.println("nike + kids/adult");
        System.out.println("----------------------------------------------");
        System.out.print("kategori");
        kategori = input12.nextLine();
        System.out.println("masukkan ukuran");
        System.out.println("slip on = 36 - 40");
        System.out.println("high top = 40 - 44");
        System.out.println("woman = 36 - 41");
        System.out.println("man = 41 - 44");
        System.out.println("kids = 36 - 41");
        System.out.println("adult = 40 - 44");
        System.out.println("ukuran = ");
        ukuran = input12.nextInt();
        

        if (merk.equals("converse")){
            if (kategori.equals("slip on")){
                if (ukuran >= 39){
                    if (ukuran <= 40){
                        harga = 800000;
                        System.out.print("harga: " + harga);
                    }
                }
            } else if (kategori.equals("high top")){
                if (ukuran >=40){
                    if (ukuran <= 44){
                        harga = 1200000;
                        System.out.print("harga: " +harga);
                    }
                }
            }
        } else if (merk.equals("sketcher")) {
            if (kategori.equals("woman")){
                if (ukuran >= 36){
                    if (ukuran <= 41){
                        harga = 1000000;
                        System.out.print("harga: " + harga);
                    }
                }
            } else if (kategori.equals("man")){
                if (ukuran >=41){
                    if (ukuran <= 44){
                        harga = 1800000;
                        System.out.print("harga: " +harga);
                    }
                }
            }
        } else if (merk.equals("nike")) {
            if (kategori.equals("kids")){
                if (ukuran >= 36){
                    if (ukuran <= 40){
                        harga = 750000;
                        System.out.print("harga: " + harga);
                    }
                }
            } else if (kategori.equals("adult")){
                if (ukuran >=40){
                    if (ukuran <= 44){
                        harga = 1500000;
                        System.out.print("harga: " +harga);
                    }
                }
            }
        }            
                
    }
}        