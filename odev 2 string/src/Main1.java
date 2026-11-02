public class Main1 {
    public static void main(String[] args) {
        String ogrenciAdi = "Ahmet Mert";
        String ogrenciSoyadi = "Yanoğlu";

        double vize1 = 60.0;
        double vize2 = 70.0;
        double finalN = 75.0;

        double ort = (vize1 / 4) + (vize2 / 4) + (finalN / 2);

        System.out.println("Öğrenci: " + ogrenciAdi + " " + ogrenciSoyadi);
        System.out.println("Ders Ortalaması: " + ort);
    }
}