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
        {
            binding.button1.setOnClickListener(view -> {
                binding.editT.append("1");
            });
            binding.button2.setOnClickListener(view -> {
                binding.editT.append("2");
            });
            binding.button3.setOnClickListener(view -> {
                binding.editT.append("3");
            });
            binding.button4.setOnClickListener(view -> {
                binding.editT.append("4");
            });
            binding.button5.setOnClickListener(view -> {
                binding.editT.append("5");
            });
            binding.button6.setOnClickListener(view -> {
                binding.editT.append("6");
            });
            binding.button7.setOnClickListener(view -> {
                binding.editT.append("7");
            });
            binding.button8.setOnClickListener(view -> {
                binding.editT.append("8");
            });
            binding.button9.setOnClickListener(view -> {
                binding.editT.append("9");
            });
            binding.button0.setOnClickListener(view -> {
                binding.editT.append("0");
            });
        }

        binding.buttonTopla.setOnClickListener(view -> {
            if (TextUtils.equals(binding.sonucT1.getText(), "_")) {
                int a = Integer.parseInt(String.valueOf(binding.editT.getText()));
                binding.sonucT1.setText("" + a);
                binding.editT.getText().clear();
            }
            else if (!(TextUtils.equals(binding.sonucT1.getText(), "_")) && TextUtils.equals(binding.sonucT2.getText(),"_") ){
                int a = Integer.parseInt(String.valueOf(binding.editT.getText()));
                binding.sonucT2.setText("" +a);
                binding.sonucT3.setText("" +
                        (Integer.parseInt(String.valueOf(binding.sonucT1.getText()))
                + a));
                binding.sonucT2.setText("_");
                binding.sonucT1.setText("" + (Integer.parseInt(String.valueOf(binding.sonucT1.getText()))
                        + a));
                binding.editT.getText().clear();
            }
            else {

            }

            /*if (TextUtils.isEmpty(binding.editT.getText()) && TextUtils.isEmpty(binding.editT2.getText())){
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
            }*/
        });

        binding.buttonReset.setOnClickListener(view -> {
            binding.sonucT3.setText("_");
            binding.sonucT1.setText("_");
            binding.sonucT2.setText("_");
            binding.editT.getText().clear();
            //binding.editT2.getText().clear();
        });

    }
}