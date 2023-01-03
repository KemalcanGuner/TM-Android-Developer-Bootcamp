package com.example.yemekler.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuProvider;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.yemekler.R;
import com.example.yemekler.databinding.FragmentAnasayfaBinding;
import com.example.yemekler.ui.adapter.YemeklerAdapter;
import com.example.yemekler.ui.viewmodel.AnasayfaViewModel;

public class AnasayfaFragment extends Fragment implements SearchView.OnQueryTextListener{
    private FragmentAnasayfaBinding binding;
    private AnasayfaViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(AnasayfaViewModel.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false);

        binding.setAnasayfaToolbarBaslik("Yemekler");
        ((AppCompatActivity)getActivity()).setSupportActionBar(binding.toolbarAnasayfa);

        viewModel.yemeklerListesi.observe(getViewLifecycleOwner(),yemeklerListesi -> {
            YemeklerAdapter adapter = new YemeklerAdapter(requireContext(),yemeklerListesi,viewModel);
            binding.setYemeklerAdapter(adapter);
        });

        binding.setAnasayfaFragment(this);

        return binding.getRoot();
    }

    public void fabTikla(View view){
        Navigation.findNavController(view).navigate(R.id.MaintoSepet);
    }



    @Override
    public void onResume() {
        super.onResume();
        viewModel.tumYemekleriGetir();
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}