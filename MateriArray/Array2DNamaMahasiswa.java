package MateriArray;
public class Array2DNamaMahasiswa {
    public static void main(String[] args) {
        String[][] mahasiswa = {
            {"NIM", "Nama", "Jurusan"},
            {"001", "Andi", "Teknik Informatika"},
            {"002", "Budi", "Sistem Informasi"},
            {"003", "Citra", "Teknik Elektro"}
        };

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.print(mahasiswa[i][j] + "\t");
            }
            System.out.println();
        }
    }
}