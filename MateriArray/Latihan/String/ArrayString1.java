package MateriArray.Latihan.String;

import java.util.Scanner;

public class ArrayString1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine().trim();

        int jumlahKata = kalimat.isEmpty() ? 0 : kalimat.split("\\s+").length;
        System.out.println("Jumlah kata: " + jumlahKata);

        input.close();
    }
}