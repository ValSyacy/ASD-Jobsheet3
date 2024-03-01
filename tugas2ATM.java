import java.util.Scanner;

public class tugas2ATM {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan jumlah user: ");
        int jumlahUser = input02.nextInt();

        User[] users = new User[jumlahUser];

        for (int i = 0; i < jumlahUser; i++) {
            System.out.println("\nMasukkan data user ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input02.next();

            System.out.print("User ID: ");
            String userId = input02.next();

            System.out.print("PIN: ");
            String pin = input02.next();

            System.out.print("Saldo: Rp");
            double saldo = input02.nextDouble();

            users[i] = new User(nama, userId, pin, saldo);
        }

        for (int i = 0; i < jumlahUser; i++) {
            System.out.println("\nData User ke-" + (i + 1));
            System.out.println("Nama: " + users[i].nama);
            System.out.println("User ID: " + users[i].userId);
            System.out.println("PIN: " + users[i].pin);
            System.out.println("Saldo: Rp" + users[i].saldo);
        }
    }
}

class User {
    public String nama;
    public String userId;
    public String pin;
    public double saldo;

    public User(String nama, String userId, String pin, double saldo) {
        this.nama = nama;
        this.userId = userId;
        this.pin = pin;
        this.saldo = saldo;
    }
}
