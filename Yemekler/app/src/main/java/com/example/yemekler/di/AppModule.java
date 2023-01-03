package com.example.yemekler.di;

import com.example.yemekler.data.repo.YemeklerDaoRepo;
import com.example.yemekler.retrofit.YemeklerDao;
import com.example.yemekler.retrofit.ApiUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

    @Module
    @InstallIn(SingletonComponent.class)
    public class AppModule {
        @Provides
        @Singleton
        public YemeklerDaoRepo provideYemeklerDaoRepo(YemeklerDao kdao){
            return new YemeklerDaoRepo(kdao);
        }

        @Provides
        @Singleton
        public YemeklerDao provideYemeklerDao(){
            return ApiUtils.getYemeklerDao();
        }


    }
