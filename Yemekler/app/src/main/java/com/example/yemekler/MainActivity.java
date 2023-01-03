package com.example.yemekler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.yemekler.databinding.ActivityMainBinding;
import com.example.yemekler.databinding.CardTasarimBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //http://kasimadalan.pe.hu/yemekler/resimler/ayran.png
       /*
        resimGoster("ayran.png");
        binding.buttonResim1.setOnClickListener(view -> {
            resimGoster("tiramisu.png");
        });

        binding.buttonResim2.setOnClickListener(view -> {
            resimGoster("pizza.png");
        });*/
    }
}