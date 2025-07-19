package helper;

import java.util.Scanner;

/**
 * AppHelper - Kumpulan utilitas umum untuk input, validasi, dan tampilan console.
 * Bisa digunakan di berbagai proyek Java tanpa modifikasi.
 */
public class AppHelper {
    /**
     * Mencari index pertama yang kosong (null) dalam array.
     * @param array array yang akan dicek
     * @return index kosong pertama, -1 jika penuh
     */
     public static <T> int cariIndex(T[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Membaca input integer dengan validasi Tidak boleh kosong dan Harus angka (jika tidak, catch NumberFormatException).
     * @param message pesan yang ditampilkan
     * @param input Scanner
     * @return nilai integer valid
     */
    public static int inputInt(Scanner input) {
        boolean valid = false;
        int angka = -1;

        while (!valid) {
            try {
                String bukanNomor = input.nextLine();

                if (bukanNomor.trim().isEmpty()) {
                    System.out.println("Input tidak boleh kosong");
                } else {
                    angka = Integer.parseInt(bukanNomor);
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harus berupa angka.");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }

        }

        return angka;
    }

    /**
     * Membaca input string dengan validasi Tidak boleh kosong dan Harus angka (jika tidak, catch NumberFormatException).
     * @param message pesan yang ditampilkan
     * @param input Scanner
     * @return nilai string valid
     */
    public static String inputStr(Scanner input) {
        boolean valid = false;
        String stringInput = "";

        while (!valid) {
            stringInput = input.nextLine();
            if (stringInput.trim().isEmpty()) {
                System.out.println("Input tidak boleh kosong");
            } else {
                valid = true;
            }
        }

        return stringInput;
    }

    /**
     * Membersihkan layar console (Windows/Linux/Mac).
     */
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.err.println("Gagal membersihkan layar.");
        }
    }

    /**
     * Pause hingga user menekan Enter.
     * @param input Scanner
     */
    public static void enterToContinue(Scanner input) {
        System.out.println("\nTekan enter untuk kembali ke menu..");
        input.nextLine();
    }

}
