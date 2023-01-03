package com.example.yemekler.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.yemekler.data.entity.Yemekler;
import com.example.yemekler.data.repo.YemeklerDaoRepo;

import java.util.List;

import javax.inject.Inject;

public class AnasayfaViewModel extends ViewModel {

    private YemeklerDaoRepo krepo;
    public MutableLiveData<List<Yemekler>> yemeklerListesi = new MutableLiveData<>();

    @Inject
    public AnasayfaViewModel(YemeklerDaoRepo krepo){
        this.krepo = krepo;
        tumYemekleriGetir();
        yemeklerListesi = krepo.getYemeklerListesi();
    }

    public void sepettekiYemekleriGetir(String kullanici_adi){
        krepo.sepettekiYemekleriGetir(kullanici_adi);
    }

    public void ekle(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_sipariş_adet, String kullanici_adi){
        krepo.ekle(yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_sipariş_adet,kullanici_adi);
    }

    public void sil(int yemek_id, String kullanici_adi){
        krepo.sil(yemek_id, kullanici_adi);
    }

    public void tumYemekleriGetir(){
        krepo.tumYemekleriGetir();
    }


}
