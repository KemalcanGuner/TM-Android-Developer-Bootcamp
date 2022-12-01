package com.example.hw4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4.databinding.FragmentMainPageBinding;

public class MainPageFragment extends Fragment {
    private FragmentMainPageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainPageBinding.inflate(
                inflater, container,false
        );
        binding.toOrangeButton.setOnClickListener(view ->{
        MainPageFragmentDirections.MainToOrange a=
                MainPageFragmentDirections.mainToOrange();

        Navigation.findNavController(view).navigate(a);
        });

        binding.toGrayButton.setOnClickListener(view ->{
            MainPageFragmentDirections.MainToGray b=
                    MainPageFragmentDirections.mainToGray();

            Navigation.findNavController(view).navigate(b);
        });

        return binding.getRoot();
    }
}