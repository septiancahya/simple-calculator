import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner myObj = new Scanner(System.in);

        int menu = 0;
        System.out.println("TUGAS PEKAN 1 - KALKULATOR SEDERHANA");
        System.out.println("MENU");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa bagi (Modulus)");
        System.out.println("");

        System.out.print("Pilih nomor menu operasi perhitungan yang mau dipilih: ");
        // Error handling (Mengatasi input menu yang bukan angka)
        boolean isNumericMenu = false;
        while(!isNumericMenu)
        try {
            menu = myObj.nextInt();
            isNumericMenu = true;
        } catch (InputMismatchException ime){
            System.out.print("Tidak ada menu yang tersedia. Pilih kembali: ");
            myObj.nextLine();
        }

        // loop untuk mengatasi pilihan menu yang tidak ada
        while(menu < 1 || menu > 5){
            System.out.print("Tidak ada menu yang tersedia. Pilih kembali: ");
            menu = myObj.nextInt();
        }

        float firstNumber = 0;
        float secondNumber = 0;

        System.out.print("Masukkan bilangan pertama: ");
        // Error handling (Mengatasi input bilangan pertama yang bukan float)
        boolean isNumericFirst = false;
        while(!isNumericFirst)
        try {
            firstNumber = myObj.nextInt();
            isNumericFirst = true;
        } catch (InputMismatchException ime) {
            System.out.print("Bukan bilangan. Masukan bilangan pertama: ");
            myObj.nextLine();
        }

        System.out.print("Masukkan bilangan kedua: ");
        // Error handling (Mengatasi input bilangan kedua yang bukan float)
        boolean isNumericSecond = false;
        while(!isNumericSecond)
        try {
            secondNumber = myObj.nextInt();
            isNumericSecond = true;
        } catch (InputMismatchException ime) {
            System.out.print("Bukan bilangan. Masukan bilangan kedua: ");
            myObj.nextLine();
        }

        System.out.println("");

        float result = 0;
        // Eksekusi yang dilakukan sesuai kondisi input menu
        switch (menu){
            case 1:
                result = firstNumber + secondNumber;
                System.out.println("Hasil penjumlahan "+ firstNumber+ " + " + secondNumber + " = " + result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println("Hasil pengurangan "+ firstNumber+ " - " + secondNumber + " = " + result);
                break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println("Hasil perkalian "+ firstNumber+ " x " + secondNumber + " = " + result);
                break;
            case 4:
                result = firstNumber / secondNumber;
                System.out.println("Hasil pembagian "+ firstNumber+ " / " + secondNumber + " = " + result);
                break;
            case 5:
                result = firstNumber % secondNumber;
                System.out.println("Hasil sisa bagi "+ firstNumber+ " % " + secondNumber + " = " + result);
                break;
        }

        // Memasukan hasil operasi perhitungan ke dalam file result.txt
        try {
            FileWriter myWriter = new FileWriter("result.txt");
            myWriter.write("Hasil = " + result);
            myWriter.close();
            System.out.println("Hasil perhitungan berhasil disimpan ke " + myWriter);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
            e.printStackTrace();
        }

    }
}