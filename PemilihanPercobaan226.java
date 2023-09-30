import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah nilai: ");
        int nilai = scanner.nextInt();
        String grade;

        switch (nilai) {
            case 90:
                grade = "A (Sangat Baik)";
                break;
            case 80:
                grade = "B+ (Lebih dari Baik)";
                break;
            case 70:
                grade = "B (Baik)";
                break;
            case 65:
                grade = "C+ (Lebih dari Cukup)";
                break;
            case 50:
                grade = "C (Cukup)";
                break;
            default:
                grade = "E (Gagal)";
                break;
        }

        System.out.println("Nilai Anda: " + grade);
    }
}