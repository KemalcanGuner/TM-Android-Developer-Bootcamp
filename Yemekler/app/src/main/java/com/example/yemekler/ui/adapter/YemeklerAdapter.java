package com.example.yemekler.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemekler.data.entity.Yemekler;
import com.example.yemekler.ui.viewmodel.AnasayfaViewModel;
import com.example.yemekler.R;
import com.example.yemekler.databinding.CardTasarimBinding;
import com.example.yemekler.ui.fragment.AnasayfaFragmentDirections;
import com.squareup.picasso.Picasso;

import java.util.List;

public class YemeklerAdapter extends RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Yemekler> yemeklerListesi;
    private AnasayfaViewModel viewModel;

    public YemeklerAdapter(Context mContext, List<Yemekler> yemeklerListesi, AnasayfaViewModel viewModel) {
        this.mContext = mContext;
        this.yemeklerListesi = yemeklerListesi;
        this.viewModel = viewModel;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;
        public CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.card_tasarim,parent,false);
        return new CardTasarimTutucu(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Yemekler yemek = yemeklerListesi.get(position);
        CardTasarimBinding t = holder.binding;

        t.setYemekNesnesi(yemek);

      //  String url = "http://kasimadalan.pe.hu/yemekler/resimler/" + yemek.getYemek_resim_adi();
       // Picasso.get().load(url).into(t.imageViewYemek);

        t.buttonDetay.setOnClickListener(view -> {
            AnasayfaFragmentDirections.MaintoDetay gecis =
                    AnasayfaFragmentDirections.maintoDetay(yemek);
            Navigation.findNavController(view).navigate(gecis);
        });
/*
        t.imageViewSil.setOnClickListener(view -> {
            Snackbar.make(view,kisi.getKisi_ad()+" silinsin mi?",Snackbar.LENGTH_LONG)
                    .setAction("EVET",view1 -> {
                        viewModel.sil(kisi.getKisi_id());
                    }).show();
        });
        */
    }

    @Override
    public int getItemCount() {
        return yemeklerListesi.size();
    }






}
