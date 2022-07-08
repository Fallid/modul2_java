package com.pbo.kegiatan2bv2;
import java.util.Scanner;
public class Terstruktur {
    public static void main(String[] args){
        int nilaiDiagonal1,nilaiDiagonal2,nilaiSisi, inputMenu, hasil;
        Scanner inputData = new Scanner(System.in);
        System.out.println("== Kalkulator Belah Ketupat ==");
        System.out.print("\n[1] Menghitung Keliling \n[2] Menghitung Luas \nPilih     : ");inputMenu = inputData.nextInt();
        switch (inputMenu) {
            case 1 -> {
                System.out.println("\n== Menghitung Keliling ==");
                System.out.print("Nilai Sisi          : "); nilaiSisi = inputData.nextInt();
                hasil = nilaiSisi * 4;
                System.out.printf("Hasil   : %d", hasil);
            }
            case 2 -> {
                System.out.println("\n== Menghitung Luas ==");
                System.out.print("Nilai Diagonal 1    : "); nilaiDiagonal1 = inputData.nextInt();
                System.out.print("Nilai Diagonal 2    : "); nilaiDiagonal2 = inputData.nextInt();
                hasil = (nilaiDiagonal1 * nilaiDiagonal2) / 2;
                System.out.printf("Hasil   : %d", hasil);
            }
            default -> System.out.println("Pilihan yang Anda masukkan tidak ada!");
        }
    }
}
