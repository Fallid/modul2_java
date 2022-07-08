package com.pbo.kegiatan2b;
//Import java scanner untuk mendapatkan nilai input dari user
import java.util.Scanner;

public class Kegiatan2 {
    //Atribut class dengan modifier public untuk bisa di akses class lainnya
    private int nilaiDigaonal1, nilaiDigonal2, nilaiSisi,inputMenu;
    //Scanner untuk input nilai user
    Scanner inputData = new Scanner(System.in);

    public void setNilaiDigonal2(int nilaiDigonal2) {
        this.nilaiDigonal2 = nilaiDigonal2;
    }

    public void setNilaiDigaonal1(int nilaiDigaonal1) {
        this.nilaiDigaonal1 = nilaiDigaonal1;
    }

    public void setNilaiSisi(int nilaiSisi) {
        this.nilaiSisi = nilaiSisi;
    }

    public int getNilaiSisi() {
        return nilaiSisi;
    }

    public int getNilaiDigaonal1() {
        return nilaiDigaonal1;
    }

    public int getNilaiDigonal2() {
        return nilaiDigonal2;
    }

    void mainMenu (){
        System.out.println("=== Kalkulator Belah Ketupat ===");
        System.out.print("\n[1] Menghitung Luas Belah Ketupat \n[2] Menghitung Keliling Belah Ketupat \nPilih   : ");
        inputMenu = inputData.nextInt();
    }
    public static void main(String[] args) {
        //String breakout;
        int sisi, diagonal1, diagonal2;
        Kegiatan2 objek = new Kegiatan2();
        menghitungKeliling methodKeliling = new menghitungKeliling(objek);
        menghitungLuas methodLuas = new menghitungLuas(objek);
        objek.mainMenu();
        switch (objek.inputMenu) {
            case 1 -> {
                System.out.println("\n=== Menghitung Luas ===");
                System.out.print("Nilai Diagonal 1  : ");
                diagonal1= objek.inputData.nextInt();
                objek.setNilaiDigaonal1(diagonal1);
                System.out.print("Nilia Diagonal 2  : ");
                diagonal2= objek.inputData.nextInt();
                objek.setNilaiDigonal2(diagonal2);
                System.out.println("Hasil           : " + methodLuas.luas());
            }
            case 2 -> {
                System.out.println("\n=== Menghitung Keliling ===");
                System.out.print("Nilai Sisi    : ");
                sisi = objek.inputData.nextInt();
                objek.setNilaiSisi(sisi);
                System.out.println("Hasil       : " + methodKeliling.keliling());
            }
            default -> objek.mainMenu();
        }
    }
}