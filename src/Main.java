import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("TUGAS PEKAN 1 - KALKULATOR SEDERHANA");
        System.out.println("MENU");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa bagi (Modulus)");
        System.out.println("");

        System.out.print("Pilih nomor menu operasi perhitungan yang mau dipilih: ");
        int menu = myObj.nextInt();

        if(menu < 1 || menu > 5){
            System.out.print("Tidak ada menu yang tersedia. Pilih kembali: ");
            menu = myObj.nextInt();
        }

        System.out.print("Masukkan bilangan pertama: ");
        int firstNumber = myObj.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int secondNumber = myObj.nextInt();
        System.out.println("");

        Integer result = 0;
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

        try {
            FileWriter myWriter = new FileWriter("result.txt");
            myWriter.write("Hasil = " + result.toString());
            myWriter.close();
            System.out.println("Hasil perhitungan berhasil disimpan ke " + myWriter);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
            e.printStackTrace();
        }

    }
}