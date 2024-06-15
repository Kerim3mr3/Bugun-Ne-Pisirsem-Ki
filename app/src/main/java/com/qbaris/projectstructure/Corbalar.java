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

public class Corbalar extends Fragment {

    String[] soups = {"Tarhana Çorbası", "Mercimek Çorbası", "Arabaşı Çorbası", "Ayranlı Çorba",
            "Yayla Çorbası", "Domates Çorbası", "Ezogelin Çorbası", "Aş Çorbası", "Brokoli Çorbası",
            "Cennet Çorbası", "Ekşili Köfte Çorbası","Eristeli Mercimek Çorbası", "Kabak Çorbası",
            "Lebeniye Çorbası", "Mantar Çorbası", "Patates Çorbası", "Şehriyeli Tavuk Suyu Çorbası",
            "Sütlü Domates Çorbası", "Tutmaç Çorbası"};
    int[] soupImages = {
            R.drawable.tarhana_corbasi,
            R.drawable.mercimek_corbasi,
            R.drawable.arabasi_corbasi,
            R.drawable.ayranli_corba,
            R.drawable.yayla_corbasi,
            R.drawable.domates_corbasi,
            R.drawable.ezogelin_corbasi,
            R.drawable.as_corbasi,
            R.drawable.brokoli_corbasi,
            R.drawable.cennet_corbasi,
            R.drawable.eksili_kofte_corbasi,
            R.drawable.eristeli_mercimek,
            R.drawable.kabak_corbasi,
            R.drawable.lebeniye_corbasi,
            R.drawable.mantar_corbasi,
            R.drawable.patates_corbasi,
            R.drawable.sehriyeli_tavuksuyu_corbasi,
            R.drawable.sutlu_domates_corbasi,
            R.drawable.tutmac_corbasi,
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_corbalar, container, false);

        ListView soupListView = rootView.findViewById(R.id.foodListView);

        // Çorbalar menüsü için adapter oluştur
        FoodAdapter soupAdapter = new FoodAdapter(requireContext(), soups, soupImages);
        soupListView.setAdapter(soupAdapter);

        soupListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Seçilen çorbanın detay sayfasını göster
                String selectedSoup = soups[position];

                // FoodDetailFragment'ı çağır
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, FoodDetailFragment.newInstance(selectedSoup));
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return rootView;
    }
}