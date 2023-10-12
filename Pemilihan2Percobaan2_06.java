import java.util.Scanner;

public class Pemilihan2Percobaan2_06 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.print("Masukkan sudut 1: ");
        sudut1 = input06.nextFloat();
        System.out.print("Masukkan sudut 2: ");
        sudut2 = input06.nextFloat();
        System.out.print("Masukkan sudut 3: ");
        sudut3 = input06.nextFloat();
        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) ||  (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == 70) || (sudut2 == 70) || (sudut3 == 40))
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else
            System.out.println("Segitiga tersebut adalah segitiga sembarang"); 
        }
        else
        System.out.println("Bukan Segitiga");
    }
    
}
