package com.example.hw4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4.databinding.FragmentBlackBinding;
import com.example.hw4.databinding.FragmentOrangeBinding;


public class BlackFragment extends Fragment {
private FragmentBlackBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBlackBinding.inflate(
                inflater, container, false
        );

        binding.toYellowButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_blackFragment_to_yellowFragment);
        });

        return binding.getRoot();
    }


    }
