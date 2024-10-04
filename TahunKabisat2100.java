import java.util.Scanner;
public class TahunKabisat2100 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = input.nextInt();

        if ((tahun % 4) == 0){
            if ((tahun % 100) != 0){
                System.out.print("Tahun Kabisat");
            } else {
                System.out.print("Bukan tahun Kabisat");
            } 
        }   else {
            System.out.print("Bukan tahun Kabisat");
        } 
    }
}         


        
