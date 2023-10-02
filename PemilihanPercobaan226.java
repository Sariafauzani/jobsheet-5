import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah nilai: ");
        int nilai = scanner.nextInt();

        if (nilai > 80){
            System.out.println("Nilai Huruf : A");
        }else if (nilai>73){
           System.out.println("Nilai Huruf : B+");
        }else if (nilai>65){
            System.out.println("Nilai Huruf : B");
        }else if (nilai>60){
            System.out.println("Nilai Huruf : C+");
        }else if(nilai>50){
            System.out.println("Nilai Huruf : C");
        }else if (nilai>39){
           System.out.println("Nilai Huruf : D");
        }else {
            System.out.println("Nilai HUruf : E");
        }

        System.out.println("Grade kamu adalah : " + nilai);
    }
}