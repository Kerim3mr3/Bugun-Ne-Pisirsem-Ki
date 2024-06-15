package com.qbaris.projectstructure;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.shrikanthravi.customnavigationdrawer2.data.MenuItem;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SNavigationDrawer sNavigationDrawer;
    Class aClass;

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

    String[] soups = {"Tarhana Çorbası", "Mercimek Çorbası", "Arabaşı Çorbası", "Ayranlı Çorba",
            "Yayla Çorbası", "Domates Çorbası", "Ezogelin Çorbası", "Aş Çorbası", "Brokoli Çorbası",
            "Cennet Çorbası","Ekşili Köfte Çorbası"	, "Erişteli Mercimek Çorbası", "Kabak Çorbası",
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
            R.drawable.tutmac_corbasi
    };
    String[] tatlilar = {"Sütlaç", "Revani", "Baklava", "Şekerpare", "Magnolia", "Etimek",
            "Sultan Sarması", "Güllaç", "Haşhaşlı Revani", "İrmik Helvası", "İzmir Bombası", "Kalburabastı", "Sade Kek",
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getWindow().setNavigationBarColor(Color.parseColor("#C46C00"));
        getWindow().setStatusBarColor(Color.parseColor("#C46C00"));

        sNavigationDrawer = findViewById(R.id.navigationDrawer);

        List<MenuItem> items = new ArrayList<>();

        items.add(new MenuItem("Ana Sayfa",R.drawable.anasayfa));
        items.add(new MenuItem("Yemekler",R.drawable.anasayfa));
        items.add(new MenuItem("Çorbalar",R.drawable.anasayfa));
        items.add(new MenuItem("Tatlılar",R.drawable.anasayfa));

        sNavigationDrawer.setMenuItemList(items);
        sNavigationDrawer.setAppbarTitleTV("Ana Sayfa");

        aClass = Anasayfa.class;

        FragmentOlustur();

        sNavigationDrawer.setOnMenuItemClickListener(new SNavigationDrawer.OnMenuItemClickListener() {
            @Override
            public void onMenuItemClicked(int position) {
                switch (position){
                    case 0:
                        aClass = Anasayfa.class;
                        break;
                    case 1:
                        aClass = Yemekler.class;
                        break;
                    case 2:
                        aClass = Corbalar.class;
                        break;
                    case 3:
                        aClass = Tatlilar.class;
                        break;
                }
            }
        });

        sNavigationDrawer.setDrawerListener(new SNavigationDrawer.DrawerListener() {
            @Override
            public void onDrawerOpening() {

            }

            @Override
            public void onDrawerClosing() {
                FragmentOlustur();
            }

            @Override
            public void onDrawerOpened() {

            }

            @Override
            public void onDrawerClosed() {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    private void FragmentOlustur() {
        try {
            Fragment fragment = (Fragment) aClass.newInstance();
            getSupportFragmentManager().
                    beginTransaction().
                    setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).
                    replace(R.id.frameLayout,fragment).
                    commit();
        }catch (IllegalAccessException | InstantiationException e){
            throw new RuntimeException(e);
        }
    }
}