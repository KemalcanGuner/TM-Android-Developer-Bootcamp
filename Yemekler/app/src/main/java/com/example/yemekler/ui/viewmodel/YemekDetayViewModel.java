package com.example.yemekler.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.yemekler.data.repo.YemeklerDaoRepo;

import javax.inject.Inject;

public class YemekDetayViewModel extends ViewModel {
    private YemeklerDaoRepo krepo;

    @Inject
    public YemekDetayViewModel(YemeklerDaoRepo krepo){
        this.krepo = krepo;
    }

    public void ekle(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_sipariş_adet, String kullanici_adi){
        krepo.ekle(yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_sipariş_adet,kullanici_adi);
    }

}
