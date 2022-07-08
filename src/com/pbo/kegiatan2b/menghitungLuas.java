package com.pbo.kegiatan2b;

public class menghitungLuas {
    private Kegiatan2 objek;
    menghitungLuas(Kegiatan2 objek){
        this.objek = objek;
    }
    protected double luas(){
        double hasil;
        int diagonal1 = objek.getNilaiDigaonal1();
        int diagonal2 = objek.getNilaiDigonal2();
        hasil = (diagonal1 * diagonal2)/2;
        return hasil;
    }
}
