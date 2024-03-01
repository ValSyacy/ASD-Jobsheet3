public class PersegiPanjang02 {
    public int panjang;
    public int lebar;
    
    public PersegiPanjang02(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public static void cetakInfo(PersegiPanjang02[] array) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + array[i].panjang + ", lebar: " + array[i].lebar + ", luas: " + array[i].hitungLuas() + ", keliling: " + array[i].hitungKeliling());
        }
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
