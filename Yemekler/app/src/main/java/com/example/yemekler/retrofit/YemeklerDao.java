package com.example.yemekler.retrofit;

import com.example.yemekler.data.entity.YemeklerCevap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface YemeklerDao {

    @GET("yemekler/tumYemekleriGetir.php")
    Call<YemeklerCevap> tumYemekleriGetir();

    @POST("yemekler/sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    Call<YemeklerCevap> sepettekiYemekleriGetir(@Field("kullanici_adi") String kullanici_adi);

    @POST("yemekler/sepettenYemekSil.php")
    @FormUrlEncoded
    Call<YemeklerCevap> sil(@Field("yemek_id") int yemek_id,
    @Field("kullanici_adi") String kullanici_adi);

    @POST("yemekler/sepeteYemekEkle.php")
    @FormUrlEncoded
    Call<YemeklerCevap> ekle(@Field("yemek_adi") String yemek_adi,
                             @Field("yemek_resim_adi") String yemek_resim_adi,
                             @Field("yemek_fiyat") int yemek_fiyat,
                             @Field("yemek_siparis_adet") int yemek_siparis_adet,
                           @Field("kullanici_adi") String kullanici_adi);


}
