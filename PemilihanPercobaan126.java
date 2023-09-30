import java.util.Scanner;
/**
 * PemilihanPercobaan126
 */
public class PemilihanPercobaan126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int angka = input26.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? " bilangan genap " : " bilangan ganjil ";
        System.out.println("Angka " + angka + hasil);
}
}