package com.qbaris.projectstructure;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

public class Yemekler extends Fragment {

    String[] foods = {"Pirinç Pilavı", "Spaghetti", "Mantar Sote", "Taze Fasulye", "Nohut", "Brokoli",
            "Barbunya", "Tavada Antrikot", "Bahar Pilavı", "Bulgur Pilavı", "Çıtır Patates",
            "Çıtır Tavuk", "Kıymalı Patates Tava", "Piliç Izgara", "Izgara Köfte", "Fırın Makarna",
            "Mercimekli Ispanak", "Patlıcan Kavurma", "Tavada Pizza", "Tavuk Döner"};
    int[] foodImages = {
            R.drawable.pilav,
            R.drawable.spaghetti,
            R.drawable.mantarsote,
            R.drawable.taze_fasulye,
            R.drawable.nohut,
            R.drawable.brokoli,
            R.drawable.barbunya,
            R.drawable.antrikot,
            R.drawable.baharpilavi,
            R.drawable.bulgur,
            R.drawable.citir_patates,
            R.drawable.citir_tavuk,
            R.drawable.kiymali_patates_tava,
            R.drawable.pilic_izgara,
            R.drawable.izgara_kofte,
            R.drawable.firin_makarna,
            R.drawable.mercimekli_ispanak,
            R.drawable.patlican_kavurma,
            R.drawable.tavada_pizza,
            R.drawable.tavuk_doner
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_yemekler, container, false);

        ListView foodListView = rootView.findViewById(R.id.foodListView);

        // Yemekler menüsü için adapter oluşturur
        FoodAdapter foodAdapter = new FoodAdapter(requireContext(), foods, foodImages);
        foodListView.setAdapter(foodAdapter);

        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Seçilen yemeğin detay sayfasını göster
                String selectedFood = foods[position];

                // FoodDetailFragment'ı çağır
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, FoodDetailFragment.newInstance(selectedFood));
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return rootView;
    }
}