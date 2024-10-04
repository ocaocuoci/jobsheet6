import java.util.Scanner;
public class Bil_Terbesar12{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;

        if (bil1 > bil2){
            if (bil1 > bil3)
           System.out.print("Bilangan terbesar: " + bil1); 
        } else if (bil2 > bil3){
            System.out.print("Bilangan terbesar: " + bil2);
        } else {
            System.out.print("Bilangan Terbesar: " + bil3);
        }


    }   
}