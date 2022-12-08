package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.example.hw5.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        binding.buttonTopla.setOnClickListener(view -> {
            if (TextUtils.isEmpty(binding.editT.getText()) && TextUtils.isEmpty(binding.editT2.getText())){
                Snackbar.make(view, "Lütfen bir değer giriniz", Snackbar.LENGTH_SHORT).show();
            }

            else if ( !(TextUtils.isEmpty(binding.editT.getText()))
                    && TextUtils.isEmpty(binding.editT2.getText())){
                int sayı1 = Integer.parseInt(String.valueOf(binding.editT.getText()));
                binding.editT2.setText("0");
                binding.sonucT.setText("" + (sayı1));
            }

            else if ( TextUtils.isEmpty(binding.editT.getText())
                    && !(TextUtils.isEmpty(binding.editT2.getText())))
            {
                int sayı2 = Integer.parseInt(String.valueOf(binding.editT2.getText()));
                binding.editT.setText(  Integer.toString(sayı2));
                binding.editT2.getText().clear();
                binding.sonucT.setText(""+sayı2);
            }

            else {
                int sayı1 = Integer.parseInt(String.valueOf(binding.editT.getText()));
                int sayı2 = Integer.parseInt(String.valueOf(binding.editT2.getText()));
                binding.sonucT.setText("" + (sayı1 + sayı2));
                binding.editT.setText(  Integer.toString(sayı1+sayı2));
                binding.editT2.getText().clear();
            }
        });

        binding.buttonReset.setOnClickListener(view -> {
            binding.sonucT.setText("0");
            binding.editT.getText().clear();
            binding.editT2.getText().clear();
        });

    }
}