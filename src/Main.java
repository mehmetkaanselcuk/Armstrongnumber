import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sayi = scanner.nextInt();
        int orijinalSayi = sayi;
        int basamakSayisi = String.valueOf(sayi).length();
        int toplam = 0;

        while (sayi > 0) {
            int basamak = sayi % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            sayi /= 10;
        }

        if (toplam == orijinalSayi) {
            System.out.println(orijinalSayi + " is an Armstrong number.");
        } else {
            System.out.println(orijinalSayi + " is not an Armstrong number.");
        }
    }
}
