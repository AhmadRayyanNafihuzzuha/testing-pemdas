package MateriArray.Latihan.StringBuilder;

public class StringBuilder3 {
    public static void main(String[] args) {
        int jumlahAngka = 100_000;

        String hasilString = "";
        long mulaiString = System.nanoTime();
        for (int i = 1; i <= jumlahAngka; i++) {
            hasilString += i;
        }
        long waktuString = System.nanoTime() - mulaiString;

        StringBuilder hasilStringBuilder = new StringBuilder();
        long mulaiStringBuilder = System.nanoTime();
        for (int i = 1; i <= jumlahAngka; i++) {
            hasilStringBuilder.append(i);
        }
        long waktuStringBuilder = System.nanoTime() - mulaiStringBuilder;

        System.out.println("Jumlah angka: " + jumlahAngka);
        System.out.println("Waktu String +=: " + waktuString + " ns ("
                + waktuString / 1_000_000_000.0 + " detik)");
        System.out.println("Waktu StringBuilder.append(): " + waktuStringBuilder + " ns ("
                + waktuStringBuilder / 1_000_000_000.0 + " detik)");
        System.out.println("Hasil sama: " + hasilString.contentEquals(hasilStringBuilder));
    }
}
