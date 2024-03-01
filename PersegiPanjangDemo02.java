import java.util.Scanner;

public class PersegiPanjangDemo02 {
    public static void main(String[] args) {
        Scanner Input02 = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegi = Input02.nextInt();

        PersegiPanjang02[] arrayOfPersegiPanjang02 = new PersegiPanjang02[jumlahPersegi];
        int panjang, lebar;

        for (int i = 0; i < jumlahPersegi; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = Input02.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = Input02.nextInt();
            arrayOfPersegiPanjang02[i] = new PersegiPanjang02(panjang, lebar);
        }

        PersegiPanjang02.cetakInfo(arrayOfPersegiPanjang02);
    }
}
