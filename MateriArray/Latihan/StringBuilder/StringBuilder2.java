package MateriArray.Latihan.StringBuilder;

import java.util.Scanner;

public class StringBuilder2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka bulat: ");
        long angka = input.nextLong();
        StringBuilder hasil = new StringBuilder(Long.toString(angka));
        int awalDigit = angka < 0 ? 1 : 0;

        for (int i = hasil.length() - 3; i > awalDigit; i -= 3) {
            hasil.insert(i, '.');
        }

        System.out.println("Angka dengan pemisah ribuan: " + hasil);
        input.close();
    }
}
