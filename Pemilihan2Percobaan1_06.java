import java.util.Scanner;

public class Pemilihan2Percobaan1_06{
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input06.nextInt();
        if ((tahun % 4) == 0){
            if ((tahun % 100) !=0)
                if ((tahun % 400) ==0)
            System.out.println("Tahun Kabisat");
                else {
            System.out.println("Bukan Tahun kabisat");    
            }
            else
            System.out.println("Tahun Kabisat");
        }
        else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}