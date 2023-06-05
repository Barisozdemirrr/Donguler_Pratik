import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        double toplam = 0, sayac = 0, ortalama = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;

            }
            ortalama = toplam / sayac;
        }
        System.out.println(ortalama);

    }
}