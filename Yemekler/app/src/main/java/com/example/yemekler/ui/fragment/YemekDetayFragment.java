package com.example.yemekler.ui.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yemekler.R;
import com.example.yemekler.data.entity.Yemekler;
import com.example.yemekler.databinding.FragmentYemekDetayBinding;
import com.example.yemekler.ui.viewmodel.YemekDetayViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class YemekDetayFragment extends Fragment {
 private FragmentYemekDetayBinding binding;
 private YemekDetayViewModel viewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(YemekDetayViewModel.class);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_yemek_detay, container, false);


        YemekDetayFragmentArgs bundle = YemekDetayFragmentArgs.fromBundle(getArguments());
        Yemekler gelenYemek = bundle.getYemek();


        //binding.setYemekDetayFragment(this);
        return binding.getRoot(); }


}