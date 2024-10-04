import java.util.Scanner;
public class Pemilihan2Percobaan3_12{
    public static void main(String[] args) {
        Scanner input12 =new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        Double pajak = 0.0;
        
        System.out.print("Masukkan kategori =");
        kategori = input12.nextLine();
        System.out.println("Masukkan besarnya penghasilan = ");
        penghasilan = input12.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000)
            pajak = 0.1;
            else if (penghasilan <= 3000000)
            pajak = 0.15;
            else 
            pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil bersih : " + gajiBersih);

        } else if (kategori.equals("pebisnis")){
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));   
            System.out.println("Penghasilan Bersih : " + gajiBersih);

        } else {
            System.out.print("Masukkan kategori salah");
        }
        
    }
}