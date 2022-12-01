package com.example.hw4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4.databinding.FragmentOrangeBinding;

public class OrangeFragment extends Fragment {
private FragmentOrangeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOrangeBinding.inflate(
                inflater, container, false
        );

        binding.toBlackButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_orangeFragment_to_blackFragment);
        });

        return binding.getRoot();
    }
}