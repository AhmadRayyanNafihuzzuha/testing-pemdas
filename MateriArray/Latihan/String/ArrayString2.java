package MateriArray.Latihan.String;

import java.util.Scanner;

public class ArrayString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();
        String[] kataKata = kalimat.split("(\\s+)");
        StringBuilder hasil = new StringBuilder();

        for (String kata : kataKata) {
            if (kata.isEmpty()) {
                continue;
            }

            if (hasil.length() > 0) {
                hasil.append(' ');
            }
            hasil.append(Character.toUpperCase(kata.charAt(0)));
            hasil.append(kata.substring(1));
        }

        System.out.println("Hasil: " + hasil);
        input.close();
    }
}
