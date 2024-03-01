public class PersegiPanjang02 {
    public int panjang;
    public int lebar;
    
    public static void cetakInfo(PersegiPanjang02[] array) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + array[i].panjang + ", lebar: " + array[i].lebar);
        }
    }
}