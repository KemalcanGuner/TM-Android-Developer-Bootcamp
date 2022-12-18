package com.example.hw6;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hw6.databinding.ActivityFullscreenBinding;

public class FullScreenActivity extends AppCompatActivity {
    private ActivityFullscreenBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFullscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Posts post = (Posts) getIntent().getSerializableExtra("nesne");

        binding.imageView6.setImageResource(getResources()
                .getIdentifier(post.getImgName()
                        , "drawable"
                        , getPackageName()));

    }
}
