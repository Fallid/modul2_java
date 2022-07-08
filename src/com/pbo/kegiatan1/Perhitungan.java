package com.pbo.kegiatan1;
//Import Java Scanner untuk mengambil input user
import java.util.Scanner;
public class Perhitungan {
    //Atribut matakuliah
    private int nilaiProgdas, nilaiKalkulus, nilaiOrkom;
    private double hasil;
    //Method setter Matkul Progdas
    public void setNilaiProgdas(int nilaiUser){this.nilaiProgdas = nilaiUser;}
    //Method setter Matkul Kalkulus
    public void setNilaiKalkulus(int nilaiUser){this.nilaiKalkulus = nilaiUser;}
    //Method setter Matkul Orkom
    public void setNilaiOrkom(int nilaiUser){this.nilaiOrkom = nilaiUser;}

    //Method getter Matkul Progdas dengan nilai return sesuai nilai mata kuliah yang user masukkan
    public int getNilaiProgdas(){ return nilaiProgdas;}
    //Method getter Matkul Kalkulus
    public int getNilaiKalkulus(){return nilaiKalkulus;}
    //Method getter Matkul Orkom
    public int getNilaiOkrom(){return nilaiOrkom;}

    public double hitungRata(){
        //Atribut untuk menyimpan total nilai matakuliah
        this.hasil = (double) (nilaiProgdas + nilaiOrkom + nilaiKalkulus) / 3;
        return hasil;
    }
    public void cekNilai(){
        if (hitungRata()> 70) {
            System.out.printf("Rata - rata  = %.2f\n", hitungRata());
            System.out.println("Status      = LULUS");
        }else{
            System.out.println("Rata - rata = " + hitungRata());
            System.out.println("Status      = TIDAK LULUS");
        }
    }

    public static void main(String[] args) {
        Perhitungan menghitungNilai = new Perhitungan();
        Scanner inputData = new Scanner(System.in);
        //Input nilai mata kuliah
        do {
            System.out.print("Nilai Progdas   : ");
            menghitungNilai.nilaiProgdas = inputData.nextInt();
            if (menghitungNilai.nilaiProgdas > 100 || menghitungNilai.nilaiProgdas < 0) {
                System.out.println("Nilai yang Anda masukkan tidak valid!\n");
                System.out.print("Nilai Progdas   : ");menghitungNilai.nilaiProgdas = inputData.nextInt();
            } else {
                menghitungNilai.setNilaiProgdas(menghitungNilai.nilaiProgdas);
            }
        }while (menghitungNilai.nilaiProgdas > 100 || menghitungNilai.nilaiProgdas < 0);

        do {
            System.out.print("Nilai Orkom     : ");menghitungNilai.nilaiOrkom = inputData.nextInt();
            if (menghitungNilai.nilaiOrkom > 100 || menghitungNilai.nilaiOrkom < 0) {
                System.out.println("Nilai yang Anda masukkan tidak valid!\n");
                System.out.print("Nilai Orkom    : ");menghitungNilai.nilaiOrkom = inputData.nextInt();
            } else {
                menghitungNilai.setNilaiOrkom(menghitungNilai.nilaiOrkom);
            }
        }while (menghitungNilai.nilaiOrkom > 100 || menghitungNilai.nilaiOrkom < 0);

        do {
            System.out.print("Nilai Kalkulus  : "); menghitungNilai.nilaiKalkulus = inputData.nextInt();
            if (menghitungNilai.nilaiKalkulus > 100 || menghitungNilai.nilaiKalkulus < 0){
                System.out.println("Nilai yang Anda masukkan tidak valid!\n");
                System.out.print("Nilai Kalkulus  : "); menghitungNilai.nilaiKalkulus = inputData.nextInt();
            }else {
                menghitungNilai.setNilaiKalkulus(menghitungNilai.nilaiKalkulus);
            }
        } while (menghitungNilai.nilaiOrkom < 0);
        System.out.println("\n\nNilai Anda:");
        System.out.println("Progdas     : " + menghitungNilai.getNilaiProgdas());
        System.out.println("Orkom       : " + menghitungNilai.getNilaiOkrom());
        System.out.println("Kalkulus    : " + menghitungNilai.getNilaiKalkulus() + "\n\n");
        menghitungNilai.cekNilai();
    }
}