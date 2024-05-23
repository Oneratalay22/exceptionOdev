public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int indeks = 5; // Örnek olarak indeks 5 aldık

        System.out.println(dizidenElemanGetir(dizi, indeks));
    }

    public static String dizidenElemanGetir(int[] dizi, int indeks) {
        try {
            return "İndeksteki eleman: " + dizi[indeks];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Hata: Geçersiz indeks, lütfen 0 ile " + (dizi.length - 1) + " arasında bir değer girin.";

        }

    }
}
