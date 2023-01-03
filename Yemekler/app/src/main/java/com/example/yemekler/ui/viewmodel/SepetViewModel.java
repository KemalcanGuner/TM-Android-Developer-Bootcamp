package com.example.yemekler.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.yemekler.data.repo.YemeklerDaoRepo;

import javax.inject.Inject;

public class SepetViewModel extends ViewModel {
    private YemeklerDaoRepo krepo;

    @Inject
    public SepetViewModel(YemeklerDaoRepo krepo){
        this.krepo = krepo;
    }

    public void sepettekiYemekleriGetir(String kullanici_adi){
        krepo.sepettekiYemekleriGetir(kullanici_adi);
    }

}
