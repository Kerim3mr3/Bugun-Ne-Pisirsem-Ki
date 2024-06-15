package com.qbaris.projectstructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Tatlilar extends Fragment {

    ListView tatliListView;

    String[] tatlilar = {"Sütlaç", "Revani", "Baklava", "Şekerpare", "Magnolia", "Etimek", "Sultan Sarması",
            "Güllaç", "Haşhaşlı Revani", "İrmik Helvası", "İzmir Bombası", "Kalburabastı", "Sade Kek",
            "Kıbrıs Tatlısı", "Muhallebili Kadayıf", "Pankek", "Piyano Kek", "Profiterol", "San Sebastian",
            "Sufle", "Sütlü İrmik", "Tavuk Göğsü Tatlısı", "Waffle"};
    int[] tatliImages = {
            R.drawable.sutlac,
            R.drawable.revani,
            R.drawable.baklava,
            R.drawable.sekerpare,
            R.drawable.magnolia,
            R.drawable.etimek,
            R.drawable.sultan_sarmasi,
            R.drawable.gullac,
            R.drawable.hashasli_revani,
            R.drawable.irmik_helvasi,
            R.drawable.izmir_bombasi,
            R.drawable.kalburabasti,
            R.drawable.sade_kek,
            R.drawable.kibris_tatlisi,
            R.drawable.muhallebili_kadayif,
            R.drawable.pankek,
            R.drawable.piyano_kek,
            R.drawable.profiterol,
            R.drawable.san_sebastian,
            R.drawable.sufle,
            R.drawable.sutlu_irmik,
            R.drawable.tavuk_gogsu_tatlisi,
            R.drawable.waffle
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tatlilar, container, false);

        tatliListView = view.findViewById(R.id.tatliListView);

        // Custom adapter
        FoodAdapter tatliAdapter = new FoodAdapter(getActivity(), tatlilar, tatliImages);
        tatliListView.setAdapter(tatliAdapter);

        // Item click listener
        tatliListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedTatli = tatlilar[position];

                // Create FoodDetailFragment instance and pass the selected tatli name
                FoodDetailFragment fragment = FoodDetailFragment.newInstance(selectedTatli);

                // Replace the current fragment with FoodDetailFragment
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return view;
    }
}