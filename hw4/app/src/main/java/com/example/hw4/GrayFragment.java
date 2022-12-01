package com.example.hw4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4.databinding.FragmentGrayBinding;
import com.example.hw4.databinding.FragmentOrangeBinding;

public class GrayFragment extends Fragment {
private FragmentGrayBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGrayBinding.inflate(
                inflater, container, false
        );

        binding.toYellowButtonFromGray.setOnClickListener(view -> {
            Navigation.findNavController(view)
                    .navigate(
                            R.id.action_grayFragment_to_yellowFragment);
        });

        return binding.getRoot();
    }
}