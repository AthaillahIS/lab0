import java.util.Scanner;

public class PangkatFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan bilangan utama (n): ");
        int n = input.nextInt();
        input.nextLine();
        System.out.print("masukkan pemangkatan (m): ");
        int m = input.nextInt();
        input.close();

        int hasilFact = 1;
        int tempN = n;
        while (tempN >= 1){
            hasilFact = hasilFact * tempN;
            --tempN;
        }

        int hasilPangkat = 1;
        for (int i = 0; i < m; i++) {
            hasilPangkat = hasilPangkat * n;
        }
        System.out.println("n factorial = " + hasilFact);
        System.out.println("n pangkat m = " + hasilPangkat);
    }
}