import java.util.Scanner;

public class InformasiMahasiswa02 {

    public static void main(String[] args) {
        Scanner Input02 = new Scanner(System.in);

        int jumlahMahasiswa;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = Input02.nextInt();

        Mahasiswa02[] mahasiswas = new Mahasiswa02[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            mahasiswas[i] = new Mahasiswa02(); 

            System.out.print("Masukkan nama: ");
            mahasiswas[i].nama = Input02.next();

            System.out.print("Masukkan NIM: ");
            mahasiswas[i].nim = Input02.next();

            System.out.print("Masukkan jenis kelamin : ");
            mahasiswas[i].jenisKelamin = Input02.next().charAt(0);

            System.out.print("Masukkan IPK: ");
            mahasiswas[i].ipk = Input02.nextFloat();
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswas[i].nama);
            System.out.println("NIM: " + mahasiswas[i].nim);
            System.out.println("Jenis Kelamin: " + mahasiswas[i].jenisKelamin);
            System.out.println("Nilai IPK: " + mahasiswas[i].ipk);
        }

        float totalIpk = 0;
        for (Mahasiswa02 mahasiswa : mahasiswas) {
            totalIpk += mahasiswa.ipk;
        }
        float rataRataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("\nRata-rata IPK: " + rataRataIpk);
    }
}

class Mahasiswa02 {
    public String nama;
    public String nim;
    public char jenisKelamin;
    public float ipk; 
}
