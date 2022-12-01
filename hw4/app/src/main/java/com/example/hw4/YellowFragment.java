package com.example.hw4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4.databinding.FragmentYellowBinding;

public class YellowFragment extends Fragment {
    private FragmentYellowBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentYellowBinding.inflate(
                inflater, container, false);


        binding.backButton.setOnClickListener(view -> {
            Navigation
            .findNavController(view)
                    .navigate(R.id.action_yellowFragment_to_mainPageFragment);
        });

        return binding.getRoot();
    }
}