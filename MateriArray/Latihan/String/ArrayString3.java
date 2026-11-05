package MateriArray.Latihan.String;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String kataPertama = input.nextLine();
        System.out.print("Masukkan kata kedua: ");
        String kataKedua = input.nextLine();

        char[] hurufPertama = kataPertama.replaceAll("\\s+", "")
                .toLowerCase().toCharArray();
        char[] hurufKedua = kataKedua.replaceAll("\\s+", "")
                .toLowerCase().toCharArray();

        Arrays.sort(hurufPertama);
        Arrays.sort(hurufKedua);

        if (Arrays.equals(hurufPertama, hurufKedua)) {
            System.out.println("Kedua kata merupakan anagram.");
        } else {
            System.out.println("Kedua kata bukan anagram.");
        }

        input.close();
    }
}
