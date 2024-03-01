import java.util.Scanner;

public class PersegiPanjangDemo02 {
    public static void main(String[] args) {
        Scanner Input02 = new Scanner(System.in);

        PersegiPanjang02[] arrayOfPersegiPanjang02 = new PersegiPanjang02[3];

        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang02[i] = new PersegiPanjang02();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            arrayOfPersegiPanjang02[i].panjang = Input02.nextInt();
            System.out.print("Masukkan lebar: ");
            arrayOfPersegiPanjang02[i].lebar = Input02.nextInt();
        
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang02[i].panjang + ", lebar: " + arrayOfPersegiPanjang02[i].lebar);
        }
    }
}
