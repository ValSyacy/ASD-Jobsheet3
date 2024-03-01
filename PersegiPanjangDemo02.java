public class PersegiPanjangDemo02 {
    public static void main(String[] args) {
        PersegiPanjang02[] arrayOfPersegiPanjang02 = new PersegiPanjang02[3];

        arrayOfPersegiPanjang02[0] = new PersegiPanjang02();
        arrayOfPersegiPanjang02[0].panjang = 110;
        arrayOfPersegiPanjang02[0].lebar = 30;

        arrayOfPersegiPanjang02[1] = new PersegiPanjang02();
        arrayOfPersegiPanjang02[1].panjang = 80;
        arrayOfPersegiPanjang02[1].lebar = 40;

        arrayOfPersegiPanjang02[2] = new PersegiPanjang02();
        arrayOfPersegiPanjang02[2].panjang = 100;
        arrayOfPersegiPanjang02[2].lebar = 20;

        System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang02[0].panjang + ", lebar: " + arrayOfPersegiPanjang02[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang02[1].panjang + ", lebar: " + arrayOfPersegiPanjang02[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang02[2].panjang + ", lebar: " + arrayOfPersegiPanjang02[2].lebar);
    }
}
