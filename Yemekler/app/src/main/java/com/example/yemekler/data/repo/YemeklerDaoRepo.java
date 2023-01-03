package com.example.yemekler.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.yemekler.data.entity.CRUDCevap;
import com.example.yemekler.data.entity.Yemekler;
import com.example.yemekler.data.entity.YemeklerCevap;
import com.example.yemekler.retrofit.YemeklerDao;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class YemeklerDaoRepo {
    private MutableLiveData<List<Yemekler>> yemeklerListesi;
    private YemeklerDao kdao;

    public YemeklerDaoRepo(YemeklerDao kdao) {
        this.yemeklerListesi = yemeklerListesi;
        this.kdao = kdao;
    }

    public MutableLiveData<List<Yemekler>> getYemeklerListesi(){
        return yemeklerListesi;
    }

    public void tumYemekleriGetir(){
        kdao.tumYemekleriGetir().enqueue(new Callback<YemeklerCevap>() {
            @Override
            public void onResponse(Call<YemeklerCevap> call, Response<YemeklerCevap> response) {
                List<Yemekler> liste = response.body().getYemekler();
                yemeklerListesi.setValue(liste);
            }
            @Override
            public void onFailure(Call<YemeklerCevap> call, Throwable t) {}
        });
    }

    public void ekle(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_sipariş_adet, String kullanici_adi){
        kdao.ekle(yemek_adi,yemek_resim_adi, yemek_fiyat,yemek_sipariş_adet,kullanici_adi).enqueue(new Callback<YemeklerCevap>() {
            @Override
            public void onResponse(Call<YemeklerCevap> call, Response<YemeklerCevap> response) {

            }
            @Override
            public void onFailure(Call<YemeklerCevap> call, Throwable t) {}
        });
    }

    public void sepettekiYemekleriGetir(String kullanici_adi){
        kdao.sepettekiYemekleriGetir(kullanici_adi).enqueue(new Callback<YemeklerCevap>() {
            @Override
            public void onResponse(Call<YemeklerCevap> call, Response<YemeklerCevap> response) {

            }
            @Override
            public void onFailure(Call<YemeklerCevap> call, Throwable t) {}
        });
    }



    public void sil(int yemek_id, String kullanici_adi){
        kdao.sil(yemek_id,kullanici_adi).enqueue(new Callback<YemeklerCevap>() {
            @Override
            public void onResponse(Call<YemeklerCevap> call, Response<YemeklerCevap> response) {

            }
            @Override
            public void onFailure(Call<YemeklerCevap> call, Throwable t) {}
        });
    }






}
