package MateriArray.Latihan.StringBuilder;

import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            if (!Character.isWhitespace(kalimat.charAt(i))) {
                hasil.append(kalimat.charAt(i));
            }
        }

        System.out.println("Kalimat tanpa spasi: " + hasil);
        input.close();
    }
}
