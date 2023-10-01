import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "2341";
        String password = "2341";
        System.out.println("Masukkan Username dan Password Anda");
        System.out.println("Username : ");
        String Username = input.nextLine();
        
        System.out.println("Password : ");
        String Password = input.nextLine();

        if (Username==username && Password==password) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Username atau Password salah");
        }
    }
}