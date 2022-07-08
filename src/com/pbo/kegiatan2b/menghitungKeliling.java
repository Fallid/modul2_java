package com.pbo.kegiatan2b;

public class menghitungKeliling {
    private Kegiatan2 objek;
    menghitungKeliling(Kegiatan2 objek){
        this.objek=objek;
    }
    protected double keliling(){
        int sisi = objek.getNilaiSisi();
        return 4 * sisi;
    }
}
