import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarak;

        System.out.println("Masukkan jarak: ");
        jarak = input.nextInt();
        if (jarak <= 5){
            System.out.println("Masukkan Melee weapon");
        } else if (jarak > 5){
            System.out.println("Gunakan Ranged weapon");
        }
    }
}