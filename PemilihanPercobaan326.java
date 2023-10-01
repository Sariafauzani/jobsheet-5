import java.util.Scanner;

public class PemilihanPercobaan326 {
    public static void main(String[] args) {
        
        double angka1, angka2, hasil;
        char operator;

        Scanner input26 = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        angka1 = input26.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input26.nextDouble();
        System.out.println("Masukkan operator (+ - + * /): ");
        operator = input26.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
       }
   }

}