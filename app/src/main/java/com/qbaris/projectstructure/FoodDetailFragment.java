package com.qbaris.projectstructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class FoodDetailFragment extends Fragment {

    private static final String ARG_FOOD_NAME = "foodName";

    public static FoodDetailFragment newInstance(String foodName) {
        FoodDetailFragment fragment = new FoodDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_FOOD_NAME, foodName);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_detail, container, false);

        TextView foodNameTextView = view.findViewById(R.id.foodNameTextView);
        ImageView foodImageView = view.findViewById(R.id.foodImageView);
        TextView foodRecipeTextView = view.findViewById(R.id.foodRecipeTextView);

        if (getArguments() != null) {
            String foodName = getArguments().getString(ARG_FOOD_NAME);
            foodNameTextView.setText(foodName);

            int imageResId = getFoodImageResId(foodName);
            Glide.with(this).load(imageResId).into(foodImageView);

            String foodRecipe = getFoodRecipe(foodName);
            foodRecipeTextView.setText(foodRecipe);
        }

        return view;
    }

    private int getFoodImageResId(String foodName) {
        switch (foodName) {
            case "Pirinç Pilavı":
                return R.drawable.pilav;
            case "Spaghetti":
                return R.drawable.spaghetti;
            case "Mantar Sote":
                return R.drawable.mantarsote;
            case "Taze Fasulye":
                return R.drawable.taze_fasulye;
            case "Nohut":
                return R.drawable.nohut;
            case "Brokoli":
                return R.drawable.brokoli;
            case "Barbunya":
                return R.drawable.barbunya;
            case "Tavada Antrikot":
                return R.drawable.antrikot;
            case "Bahar Pilavı":
                return R.drawable.baharpilavi;
            case "Bulgur Pilavı":
                return R.drawable.bulgur;
            case "Çıtır Patates":
                return R.drawable.citir_patates;
            case "Çıtır Tavuk":
                return R.drawable.citir_tavuk;
            case "Kıymalı Patates Tava":
                return R.drawable.kiymali_patates_tava;
            case "Piliç Izgara":
                return R.drawable.pilic_izgara;
            case "Izgara Köfte":
                return R.drawable.izgara_kofte;
            case "Fırın Makarna":
                return R.drawable.firin_makarna;
            case "Mercimekli Ispanak":
                return R.drawable.mercimekli_ispanak;
            case "Patlıcan Kavurma":
                return R.drawable.patlican_kavurma;
            case "Tavada Pizza":
                return R.drawable.tavada_pizza;
            case "Tavuk Döner":
                return R.drawable.tavuk_doner;
            case "Tarhana Çorbası":
                return R.drawable.tarhana_corbasi;
            case "Mercimek Çorbası":
                return R.drawable.mercimek_corbasi;
            case "Arabaşı Çorbası":
                return R.drawable.arabasi_corbasi;
            case "Ayranlı Çorba":
                return R.drawable.ayranli_corba;
            case "Yayla Çorbası":
                return R.drawable.yayla_corbasi;
            case "Domates Çorbası":
                return R.drawable.domates_corbasi;
            case "Ezogelin Çorbası":
                return R.drawable.ezogelin_corbasi;
            case "Aş Çorbası":
                return R.drawable.as_corbasi;
            case "Brokoli Çorbası":
                return R.drawable.brokoli_corbasi;
            case "Cennet Çorbası":
                return R.drawable.cennet_corbasi;
            case "Ekşili Köfte Çorbası":
                return R.drawable.eksili_kofte_corbasi;
            case "Sütlaç":
                return R.drawable.sutlac;
            case "Revani":
                return R.drawable.revani;
            case "Baklava":
                return R.drawable.baklava;
            case "Şekerpare":
                return R.drawable.sekerpare;
            case "Magnolia":
                return R.drawable.magnolia;
            case "Etimek":
                return R.drawable.etimek;
            case "Sultan Sarması":
                return R.drawable.sultan_sarmasi;
            case "Güllaç":
                return R.drawable.gullac;
            case "Haşhaşlı Revani":
                return R.drawable.hashasli_revani;
            case "İrmik Helvası":
                return R.drawable.irmik_helvasi;
            case "İzmir Bombası":
                return R.drawable.izmir_bombasi;
            case "Kalburabastı":
                return R.drawable.kalburabasti;
            case "Sade Kek":
                return R.drawable.sade_kek;
            case "Kıbrıs Tatlısı":
                return R.drawable.kibris_tatlisi;
            case "Muhallebili Kadayıf":
                return R.drawable.muhallebili_kadayif;
            case "Pankek":
                return R.drawable.pankek;
            case "Piyano Kek":
                return R.drawable.piyano_kek;
            case "Profiterol":
                return R.drawable.profiterol;
            case "San Sebastian":
                return R.drawable.san_sebastian;
            case "Sufle":
                return R.drawable.sufle;
            case "Sütlü İrmik":
                return R.drawable.sutlu_irmik;
            case "Tavuk Göğsü Tatlısı":
                return R.drawable.tavuk_gogsu_tatlisi;
            case "Waffle":
                return R.drawable.waffle;
            case "Eristeli Mercimek Çorbası":
                return R.drawable.eristeli_mercimek;
            case "Kabak Çorbası":
                return R.drawable.kabak_corbasi;
            case "Lebeniye Çorbası":
                return R.drawable.lebeniye_corbasi;
            case "Mantar Çorbası":
                return R.drawable.mantar_corbasi;
            case "Patates Çorbası":
                return R.drawable.patates_corbasi;
            case "Şehriyeli Tavuk Suyu Çorbası":
                return R.drawable.sehriyeli_tavuksuyu_corbasi;
            case "Sütlü Domates Çorbası":
                return R.drawable.sutlu_domates_corbasi;
            case "Tutmaç Çorbası":
                return R.drawable.tutmac_corbasi;

            default:
                return R.drawable.anasayfa; // Resim olmadığında hata almamak için default resim bu görüntülenir
        }
    }

    private String getFoodRecipe(String foodName) {
        switch (foodName) {
            case "Pirinç Pilavı":
                return "Malzemeler:\n- 1 su bardağı pirinç\n- 2 su bardağı su\n- 1 yemek kaşığı tereyağı\n- Tuz\n\nYapılışı:\n1. Pirinçleri yıkayın.\n2. Tereyağını tencerede eritin.\n3. Pirinçleri ekleyin ve kavurun.\n4. Suyu ve tuzu ekleyin.\n5. Kısık ateşte suyunu çekene kadar pişirin.";
            case "Spaghetti":
                return "Malzemeler:\n- 200 gr spaghetti\n- 2 yemek kaşığı zeytinyağı\n- 2 diş sarımsak\n- 400 gr domates sosu\n- Tuz ve karabiber\n\nYapılışı:\n1. Spaghettiyi haşlayın.\n2. Zeytinyağında sarımsakları soteleyin.\n3. Domates sosunu ekleyin ve pişirin.\n4. Spaghettiyi sosla karıştırın ve servis edin.";
            case "Mantar Sote":
                return "Malzemeler:\n- 500 gram mantar\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 yemek kaşığı zeytinyağı\n- Tuz\n- Karabiber\n- Maydanoz\n\nYapılışı:\n1. Mantarları dilimleyin.\n2. Soğanı ve sarımsağı doğrayın.\n3. Zeytinyağında soğan ve sarımsağı kavurun.\n4. Mantarları ekleyin ve suyunu çekene kadar pişirin.\n5. Tuz ve karabiber ekleyin.\n6. Üzerine doğranmış maydanoz serpip servis yapın.";
            case "Taze Fasulye":
                return "Malzemeler:\n- 500 gram taze fasulye\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 yemek kaşığı zeytinyağı\n- 2 adet domates\n- Tuz\n- Karabiber\n\nYapılışı:\n1. Taze fasulyeleri temizleyin ve doğrayın.\n2. Soğanı ve sarımsağı doğrayın.\n3. Zeytinyağında soğan ve sarımsağı kavurun.\n4. Doğranmış domatesleri ekleyin ve pişirin.\n5. Fasulyeleri ekleyin ve yumuşayana kadar pişirin.\n6. Tuz ve karabiber ekleyin.";
            case "Nohut":
                return "Malzemeler:\n- 2 su bardağı nohut\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 yemek kaşığı zeytinyağı\n- Tuz\n- Karabiber\n\nYapılışı:\n1. Nohutları bir gece önceden suda bekletin ve haşlayın.\n2. Soğanı ve sarımsağı doğrayın.\n3. Zeytinyağında soğan ve sarımsağı kavurun.\n4. Haşlanmış nohutları ekleyin ve kavurun.\n5. Tuz ve karabiber ekleyin.";
            case "Brokoli":
                return "Malzemeler:\n- 1 baş brokoli\n- 2 diş sarımsak\n- 2 yemek kaşığı zeytinyağı\n- Tuz\n- Karabiber\n- Limon\n\nYapılışı:\n1. Brokoliyi küçük parçalara ayırın ve yıkayın.\n2. Sarımsakları ezin.\n3. Zeytinyağında sarımsakları kavurun.\n4. Brokoliyi ekleyin ve karıştırın.\n5. Tuz ve karabiber ekleyin, üzerine limon sıkın.\n6. Suyunu çekene kadar pişirin ve servis yapın.";
            case "Barbunya":
                return "Malzemeler:\n- 500 gram barbunya\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 yemek kaşığı zeytinyağı\n- 2 adet domates\n- Tuz\n- Karabiber\n\nYapılışı:\n1. Barbunyaları temizleyin ve doğrayın.\n2. Soğanı ve sarımsağı doğrayın.\n3. Zeytinyağında soğan ve sarımsağı kavurun.\n4. Doğranmış domatesleri ekleyin ve pişirin.\n5. Barbunyaları ekleyin ve yumuşayana kadar pişirin.\n6. Tuz ve karabiber ekleyin.";
            case "Tavada Antrikot":
                return "Malzemeler:\n- 4 dilim antrikot\n- Tuz\n- Karabiber\n- Zeytinyağı\n\nYapılışı:\n1. Antrikotları oda sıcaklığında bekletin.\n2. Tavayı iyice kızdırın ve antrikotları tavaya yerleştirin.\n3. Her iki tarafını da istediğiniz pişme derecesine gelene kadar pişirin.\n4. Tuz ve karabiberle tatlandırın ve servis yapın.";
            case "Bahar Pilavı":
                return "Malzemeler:\n- 2 su bardağı pirinç\n- 1 adet havuç\n- 1 adet patates\n- 1 adet kuru soğan\n- 2 yemek kaşığı tereyağı\n- 4 su bardağı su\n- Tuz\n\nYapılışı:\n1. Pirinci yıkayın ve süzün.\n2. Havuç, patates ve soğanı küp şeklinde doğrayın.\n3. Tereyağını tencerede eritin.\n4. Doğranmış sebzeleri tereyağında kavurun.\n5. Pirinci ekleyin ve kavurmaya devam edin.\n6. Su ve tuzu ekleyin, pilavı pişirin.";
            case "Bulgur Pilavı":
                return "Malzemeler:\n- 2 su bardağı pilavlık bulgur\n- 2 yemek kaşığı tereyağı\n- 3 su bardağı su\n- Tuz\n\nYapılışı:\n1. Bulguru yıkayın ve süzün.\n2. Tereyağını tencerede eritin.\n3. Bulguru tereyağında kavurun.\n4. Su ve tuzu ekleyin, kapağı kapalı olarak bulgur suyunu çekene kadar pişirin.";
            case "Çıtır Patates":
                return "Malzemeler:\n- 4 adet patates\n- 2 yemek kaşığı mısır nişastası\n- 2 yemek kaşığı un\n- 1 çay kaşığı toz kırmızı biber\n- Tuz\n- Karabiber\n- Zeytinyağı\n\nYapılışı:\n1. Patatesleri soyun ve doğrayın.\n2. Patatesleri su ile yıkayın ve kurulayın.\n3. Mısır nişastası, un, toz kırmızı biber, tuz ve karabiberi karıştırın.\n4. Patatesleri bu karışıma bulayın.\n5. Fırın tepsisine yağlı kağıt serin, patatesleri tek sıra halinde dizin.\n6. Önceden ısıtılmış 200 derece fırında altın rengi olana kadar pişirin.";
            case "Çıtır Tavuk":
                return "Malzemeler:\n- 500 gram tavuk göğsü\n- 1 su bardağı mısır gevreği\n- 1 su bardağı galeta unu\n- 2 adet yumurta\n- Tuz\n- Karabiber\n- Pul biber\n- Kekik\n\nYapılışı:\n1. Tavuk göğüslerini parçalara ayırın ve tuzlayın.\n2. Mısır gevreği, galeta unu, tuz, karabiber, pul biber ve kekiki bir kapta karıştırın.\n3. Tavuk parçalarını önce yumurtaya sonra gevrekli karışıma bulayın.\n4. Yağlanmış fırın tepsisine dizin ve önceden ısıtılmış 180 derece fırında kızarana kadar pişirin.";
            case "Kıymalı Patates Tava":
                return "Malzemeler:\n- 500 gram kıyma\n- 4 adet patates\n- 1 adet soğan\n- 2 yemek kaşığı sıvı yağ\n- 2 domates\n- 2 yeşil biber\n- Tuz\n- Karabiber\n\nYapılışı:\n1. Patatesleri soyup yuvarlak dilimler halinde kesin.\n2. Soğanı doğrayın ve sıvı yağda kavurun.\n3. Kıymayı ekleyip kavurun.\n4. Domates ve biberleri doğrayın, kıymaya ekleyin.\n5. Patatesleri tepsiye dizin ve üzerine kıymalı harcı yayın.\n6. Tuz ve karabiber serpin.\n7. Önceden ısıtılmış fırında pişirin.";
            case "Piliç Izgara":
                return "Malzemeler:\n- 1 adet piliç\n- Zeytinyağı\n- Limon suyu\n- Tuz\n- Karabiber\n\nYapılışı:\n1. Piliği temizleyin ve dilimleyin.\n2. Zeytinyağı, limon suyu, tuz ve karabiberle marine edin.\n3. Izgarada her iki tarafı da kızarana kadar pişirin.";
            case "Izgara Köfte":
                return "Malzemeler:\n- 500 gram kıyma\n- 1 adet soğan\n- 2 diş sarımsak\n- 1 yumurta\n- Ekmek içi veya galeta unu\n- Tuz\n- Karabiber\n- Kimyon\n\nYapılışı:\n1. Kıymayı bir kaba alın.\n2. Soğanı ve sarımsağı rendeleyin, yumurta, ekmek içi veya galeta unu ekleyin.\n3. Tuz, karabiber ve kimyon ekleyip yoğurun.\n4. Köfte şekli verin ve ızgarada pişirin.";
            case "Fırın Makarna":
                return "Malzemeler:\n- 500 gram makarna\n- 250 gram kıyma\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 su bardağı rendelenmiş kaşar peyniri\n- 1 su bardağı süt\n- 2 yemek kaşığı domates salçası\n- Tuz\n- Karabiber\n\nYapılışı:\n1. Makarnayı haşlayın ve süzün.\n2. Soğanı ve sarımsağı kavurun.\n3. Kıymayı ekleyip kavurun.\n4. Salçayı ekleyin ve karıştırın.\n5. Fırın kabına makarnayı, kıymalı harcı ve rendelenmiş kaşar peynirini kat kat yerleştirin.\n6. Üzerine süt dökün.\n7. Önceden ısıtılmış fırında 180 derecede 20-25 dakika pişirin.";
            case "Mercimekli Ispanak":
                return "Malzemeler:\n- 1 su bardağı kırmızı mercimek\n- 500 gram ıspanak\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 yemek kaşığı zeytinyağı\n- 1 yemek kaşığı domates salçası\n- Tuz\n- Limon\n\nYapılışı:\n1. Mercimeği haşlayın ve süzün.\n2. Soğanı ve sarımsağı kavurun.\n3. Salçayı ekleyin ve karıştırın.\n4. Ispanakları ekleyip suyunu salıp çekene kadar pişirin.\n5. Mercimeği ekleyin ve karıştırın.\n6. Tuzunu ekleyin ve ocaktan alın.\n7. Üzerine limon sıkıp servis yapın.";
            case "Patlıcan Kavurma":
                return "Malzemeler:\n- 3 adet patlıcan\n- 2 adet domates\n- 2 adet yeşil biber\n- 3 diş sarımsak\n- Zeytinyağı\n- Tuz\n- Karabiber\n- Kırmızı pul biber\n- Maydanoz\n\nYapılışı:\n1. Patlıcanları közleyin ve kabuklarını soyun.\n2. Domates, biber ve sarımsağı doğrayın.\n3. Patlıcanları da doğrayın ve tüm malzemeyi tavada zeytinyağında kavurun.\n4. Tuz, karabiber ve kırmızı pul biber ekleyin.\n5. Üzerine doğranmış maydanoz serpip servis yapın.";
            case "Tavada Pizza":
                return "Malzemeler:\n- Pizza hamuru (marketten hazır alınabilir)\n- Pizza sosu (marketten hazır alınabilir)\n- Mozarella peyniri\n- Sucuk\n- Mantar\n- Yeşil biber\n- Zeytin\n- Zeytinyağı\n\nYapılışı:\n1. Pizza hamurunu tavada pişirmek için, tavaya zeytinyağı sürün ve hamuru yayın.\n2. Üzerine pizza sosunu sürün.\n3. İsteğe bağlı olarak sucuk, mantar, yeşil biber ve zeytinleri ekleyin.\n4. En üste mozzarella peynirini rendeleyin.\n5. Kapağını kapatın ve kısık ateşte pişirin.\n6. Alt kısım kızardığında, üst kısmı kızarana kadar pişirin ve servis yapın.";
            case "Tavuk Döner":
                return "Malzemeler:\n- 500 gram tavuk göğsü\n- Yoğurt\n- Zeytinyağı\n- Limon suyu\n- Kekik\n- Tuz\n- Karabiber\n- Kırmızı toz biber\n- Kimyon\n- Sarımsak  \nYapılışı:\n1. Tavuk göğüslerini ince dilimler halinde kesin.\n2. Yoğurt, zeytinyağı, limon suyu, kekik, tuz, karabiber, kırmızı toz biber, kimyon ve rendelenmiş sarımsak ile marine edin.\n3. Marine ettiğiniz tavuk dilimlerini şişlere dizin.\n4. Izgarada veya fırında her iki tarafı da kızarana kadar pişirin.\n5. Servis yapın.";
            case "Tarhana Çorbası":
                return "Malzemeler:\n- 1 su bardağı tarhana\n- 1 yemek kaşığı tereyağı\n- 5 su bardağı su\n- Tuz\n\nYapılışı:\n1. Tereyağını tencerede eritin.\n2. Tarhanayı ekleyin ve kavurun.\n3. Suyu ve tuzu ekleyin.\n4. Karıştırarak kaynatın.";
            case "Mercimek Çorbası":
                return "Malzemeler:\n- 1 su bardağı kırmızı mercimek\n- 1 adet soğan\n- 1 adet havuç\n- 1 yemek kaşığı tereyağı\n- 6 su bardağı su\n- Tuz\n\nYapılışı:\n1. Soğanı ve havucu doğrayın.\n2. Tereyağında soğanı kavurun.\n3. Havuç ve mercimeği ekleyin.\n4. Suyu ve tuzu ekleyin.\n5. Sebzeler yumuşayana kadar pişirin.";
            case "Eristeli Mercimek Çorbası":
                return "Malzemeler:\n- 1 su bardağı kırmızı mercimek\n- 1 adet soğan\n- 1 adet havuç\n- 1 yemek kaşığı tereyağı\n- 6 su bardağı su\n- 1/2 su bardağı erişte\n- Tuz\n\nYapılışı:\n1. Soğanı ve havucu doğrayın.\n2. Tereyağında soğanı kavurun.\n3. Havuç ve mercimeği ekleyin.\n4. Suyu ve tuzu ekleyin.\n5. Erişteleri ekleyip sebzeler yumuşayana kadar pişirin.";
            case "Arabaşı Çorbası":
                return "Malzemeler:\n- 200 gram kuzu eti\n- 1 su bardağı arpa\n- 1 adet soğan\n- 1 yemek kaşığı un\n- 1 yemek kaşığı tereyağı\n- 8 su bardağı su\n- Tuz\n\nYapılışı:\n1. Kuzu etini ve arpaları yıkayın.\n2. Soğanı doğrayın ve tereyağında kavurun.\n3. Unu ekleyip kavurmaya devam edin.\n4. Et ve arpayı ekleyin.\n5. Suyu ve tuzu ekleyip pişirin.";
            case "Ayranlı Çorba":
                return "Malzemeler:\n- 1 su bardağı yoğurt\n- 2 yemek kaşığı un\n- 1 yumurta\n- 6 su bardağı su\n- Tuz\n\nYapılışı:\n1. Yoğurt, un ve yumurtayı bir kapta çırpın.\n2. Su ve tuzu ekleyip karıştırın.\n3. Kaynamaya bırakın ve kıvam alana kadar pişirin.";
            case "Yayla Çorbası":
                return "Malzemeler:\n- 1 su bardağı yoğurt\n- 2 yemek kaşığı un\n- 1 yumurta\n- 6 su bardağı su\n- 1 çay bardağı pirinç\n- Tuz\n- Nane\n\nYapılışı:\n1. Yoğurt, un ve yumurtayı bir kapta çırpın.\n2. Suyu ekleyip karıştırın.\n3. Pirinci ekleyin ve pişirin.\n4. Tuzunu ekleyin ve ocaktan alın.\n5. Üzerine nane serpin.";
            case "Domates Çorbası":
                return "Malzemeler:\n- 3 adet domates\n- 1 adet soğan\n- 1 yemek kaşığı tereyağı\n- 2 yemek kaşığı un\n- 5 su bardağı su\n- Tuz\n- Karabiber\n\nYapılışı:\n1. Domatesleri rendeleyin.\n2. Soğanı doğrayın ve tereyağında kavurun.\n3. Unu ekleyip kavurmaya devam edin.\n4. Domatesleri ekleyin ve suyunu salıp çekene kadar pişirin.\n5. Suyu ve baharatları ekleyip pişirin.";
            case "Ezogelin Çorbası":
                return "Malzemeler:\n- 1 su bardağı kırmızı mercimek\n- 1 su bardağı pirinç\n- 1 adet soğan\n- 2 yemek kaşığı bulgur\n- 2 yemek kaşığı domates salçası\n- 1 yemek kaşığı biber salçası\n- 2 yemek kaşığı tereyağı\n- 8 su bardağı su\n- Tuz\n- Kırmızı pul biber\n\nYapılışı:\n1. Mercimeği yıkayın ve süzün.\n2. Soğanı doğrayın ve tereyağında kavurun.\n3. Salçaları ekleyip kavurmaya devam edin.\n4. Mercimeği, pirinci ve bulguru ekleyin.\n5. Suyu ve tuzu ekleyip pişirin.\n6. Servis yaparken üzerine kırmızı pul biber serpin.";
            case "Aş Çorbası":
                return "Malzemeler:\n- 1 su bardağı aşurelik buğday\n- 1 su bardağı nohut\n- 1 su bardağı kuru fasulye\n- 1 su bardağı pirinç\n- 1 su bardağı yeşil mercimek\n- 1 adet soğan\n- 2 yemek kaşığı tereyağı\n- 8 su bardağı su\n- Tuz\n- Kuru nane\n\nYapılışı:\n1. Tereyağında doğranmış soğanı kavurun.\n2. Yıkanmış buğdayı, nohutu, fasulyeyi, mercimeği ve pirinci ekleyin.\n3. Su ve tuzu ekleyip pişirin.\n4. Kıvam aldıktan sonra ocaktan alın.\n5. Üzerine kuru nane serpin.";
            case "Brokoli Çorbası":
                return "Malzemeler:\n- 1 adet brokoli\n- 1 adet patates\n- 1 adet soğan\n- 2 diş sarımsak\n- 2 yemek kaşığı tereyağı\n- 4 su bardağı tavuk suyu veya su\n- Tuz\n- Karabiber\n- Krema (isteğe bağlı)\n\nYapılışı:\n1. Brokolileri ve patatesi küçük parçalara ayırın.\n2. Soğanı ve sarımsağı doğrayın, tereyağında kavurun.\n3. Sebzeleri ekleyin ve hafifçe kavurun.\n4. Tavuk suyunu veya suyu ekleyin ve sebzeler yumuşayana kadar pişirin.\n5. Blenderdan geçirin, isteğe bağlı olarak krema ekleyin.\n6. Tuz ve karabiberle tatlandırın.";
            case "Cennet Çorbası":
                return "Malzemeler:\n- 250 gram kuzu eti\n- 1 su bardağı pirinç\n- 1 adet soğan\n- 1 yemek kaşığı tereyağı\n- 6 su bardağı su\n- Tuz\n- Kırmızı pul biber\n- Limon\n\nYapılışı:\n1. Kuzu etini ve pirinci yıkayın.\n2. Soğanı doğrayın ve tereyağında kavurun.\n3. Etleri ekleyin ve suyunu salıp çekene kadar kavurun.\n4. Su ekleyin ve etler yumuşayana kadar pişirin.\n5. Tuzunu ekleyin ve ocaktan alın.\n6. Limon sıkıp üzerine kırmızı pul biber serpin.";
            case "Güllaç":
                return "Malzemeler:\n- 10 adet gullaç yaprağı\n- 1 litre süt\n- 1 su bardağı toz şeker\n- 1 su bardağı dövülmüş ceviz\n- Yarım su bardağı dövülmüş fındık\n- Yarım su bardağı dövülmüş antep fıstığı\n\nYapılışı:\n1. Sütü kaynatın ve içine şekeri ekleyin, karıştırarak eritin.\n2. Gullaç yapraklarını sütün içinde yumuşayana kadar bekletin.\n3. Bir tepsiye sırayla dizdiğiniz gullaçların aralarına ceviz, fındık ve antep fıstığı serpiştirin.\n4. Üzerine kalan sütü dökün ve buzdolabında soğumaya bırakın.";
            case "Haşhaşlı Revani":
                return "Malzemeler:\n- 3 adet yumurta\n- 1 su bardağı yoğurt\n- 1 su bardağı şeker\n- Yarım su bardağı sıvı yağ\n- 1 su bardağı irmik\n- 1 su bardağı un\n- 1 paket kabartma tozu\n- 1 yemek kaşığı haşhaş\n\nYapılışı:\n1. Yumurta ve şekeri mikserle çırpın.\n2. Yoğurt ve sıvı yağı ekleyip çırpın.\n3. İrmik, un, kabartma tozu ve haşhaşı ekleyip karıştırın.\n4. Yağlanmış bir fırın tepsisine dökün.\n5. Önceden ısıtılmış 180 derece fırında üzeri kızarana kadar pişirin.";
            case "İrmik Helvası":
                return "Malzemeler:\n- 1 su bardağı irmik\n- 1 su bardağı şeker\n- 1 su bardağı süt\n- Yarım su bardağı sıvı yağ\n- Yarım su bardağı dövülmüş ceviz\n\nYapılışı:\n1. Sıvı yağ ile irmiği kavurun.\n2. Şeker ve sütü ekleyip kısık ateşte karıştırarak pişirin.\n3. Kıvam alınca ocaktan alın ve cevizi ekleyip karıştırın.\n4. Servis yapmadan önce ılımaya bırakın.";
            case "İzmir Bombası":
                return "Malzemeler:\n- 1 su bardağı un\n- 1 su bardağı irmik\n- 1 su bardağı hindistancevizi\n- 1 su bardağı toz şeker\n- 1 su bardağı süt\n- Yarım su bardağı sıvı yağ\n- 1 paket kabartma tozu\n- 3 adet yumurta\n\nYapılışı:\n1. Yumurta ve şekeri mikserle çırpın.\n2. Sıvı yağ ve sütü ekleyip çırpmaya devam edin.\n3. Un, irmik, hindistancevizi ve kabartma tozunu ekleyip karıştırın.\n4. Yağlanmış bir fırın kabına dökün.\n5. Önceden ısıtılmış 180 derece fırında üzeri kızarana kadar pişirin.";
            case "Kalburabastı":
                return "Malzemeler:\n- 250 gram tereyağı\n- Yarım su bardağı pudra şekeri\n- 2 su bardağı irmik\n- 1 su bardağı un\n- 1 tatlı kaşığı tarçın\n- Yarım su bardağı dövülmüş ceviz\n\nYapılışı:\n1. Tereyağı ve pudra şekerini yoğurma kabına alın, iyice karıştırın.\n2. İrmik, un ve tarçını ekleyip yoğurun.\n3. Hamurdan ceviz büyüklüğünde parçalar alıp yuvarlayın.\n4. Ortalarına bastırarak şekil verin.\n5. 180 derece fırında altın rengini alana kadar pişirin.";
            case "Sade Kek":
                return "Malzemeler:\n- 3 adet yumurta\n- 1 su bardağı toz şeker\n- 1 su bardağı süt\n- Yarım su bardağı sıvı yağ\n- 2 su bardağı un\n- 1 paket kabartma tozu\n\nYapılışı:\n1. Yumurta ve şekeri mikserle çırpın.\n2. Sıvı yağ ve sütü ekleyip çırpmaya devam edin.\n3. Un ve kabartma tozunu ekleyip karıştırın.\n4. Yağlanmış bir kek kalıbına dökün.\n5. Önceden ısıtılmış 180 derece fırında üzeri kızarana kadar pişirin.";
            case "Kıbrıs Tatlısı":
                return "Malzemeler:\n- 3 su bardağı un\n- 1 su bardağı sıvı yağ\n- Yarım su bardağı pudra şekeri\n- 1 paket kabartma tozu\n- 1 su bardağı dövülmüş ceviz\n- 1 su bardağı pekmez\n\nYapılışı:\n1. Un, sıvı yağ, pudra şekeri ve kabartma tozunu karıştırın.\n2. Hamurdan ceviz büyüklüğünde parçalar koparıp yuvarlayın.\n3. Ortalarını açıp ceviz içi koyun ve kapatın.\n4. 180 derece fırında üzeri kızarana kadar pişirin.\n5. Fırından çıktıktan sonra sıcakken üzerine soğuk pekmez dökün.";
            case "Muhallebili Kadayıf":
                return "Malzemeler:\n- 500 gram tel kadayıf\n- 250 gram tereyağı\n- 1 su bardağı dövülmüş ceviz\n- 1 su bardağı dövülmüş fındık\n- 1 su bardağı toz şeker\n- 1 litre süt\n- 1 su bardağı nişasta\n- 1 paket vanilya\n\nYapılışı:\n1. Tel kadayıfı tereyağı ile kavurun.\n2. Tavaya dövülmüş ceviz ve fındığı ekleyip karıştırın.\n3. Başka bir tencerede süt, toz şeker, nişasta ve vanilyayı karıştırarak pişirin.\n4. Ocaktan alın, kadayıfın üzerine dökün.\n5. Soğuyunca dilimleyip servis yapın.";
            case "Pankek":
                return "Malzemeler:\n- 1,5 su bardağı un\n- 1,5 su bardağı süt\n- 1 adet yumurta\n- 2 yemek kaşığı toz şeker\n- Yarım çay kaşığı tuz\n- 1 paket vanilya\n- 1 paket kabartma tozu\n- 2 yemek kaşığı sıvı yağ\n\nYapılışı:\n1. Un, toz şeker, tuz, vanilya ve kabartma tozunu karıştırın.\n2. Ortasını havuz gibi açıp yumurtayı kırın.\n3. Yavaşça sütü ekleyip karıştırın.\n4. Krep tavasında sıvı yağ ile pişirin.\n5. İstediğiniz meyve ve soslarla servis yapın.";
            case "Piyano Kek":
                return "Malzemeler:\n- 3 adet yumurta\n- 1 su bardağı toz şeker\n- Yarım su bardağı süt\n- Yarım su bardağı sıvı yağ\n- 2 su bardağı un\n- 1 paket kabartma tozu\n- 1 paket vanilya\n\nYapılışı:\n1. Yumurta ve şekeri mikserle çırpın.\n2. Sıvı yağ ve sütü ekleyip çırpmaya devam edin.\n3. Un, kabartma tozu ve vanilyayı ekleyip karıştırın.\n4. Yağlanmış bir kek kalıbına dökün.\n5. Önceden ısıtılmış 180 derece fırında üzeri kızarana kadar pişirin.";
            case "Profiterol":
                return "Malzemeler:\nHamuru için:\n- 1 su bardağı su\n- Yarım su bardağı tereyağı\n- 1 su bardağı un\n- 4 adet yumurta\n\nKreması için:\n- 2 su bardağı süt\n- 2 yemek kaşığı un\n- 2 yemek kaşığı nişasta\n- 2 adet yumurta\n- Yarım su bardağı toz şeker\n- 1 paket vanilya\n\nÇikolata sosu için:\n- 100 gram bitter çikolata\n- Yarım su bardağı süt\n- 1 yemek kaşığı tereyağı\n\nYapılışı:\n1. Hamur için su ve tereyağını tencerede kaynatın, unu ekleyip karıştırarak pişirin.\n2. Ocaktan alıp yumurtaları tek tek ekleyerek karıştırın.\n3. Yağlanmış fırın tepsisine ceviz büyüklüğünde parçalar halinde sıkın.\n4. 200 derece fırında kabarıp kızarana kadar pişirin.\n5. Krema için süt, un, nişasta, yumurta, toz şeker ve vanilyayı pişirin.\n6. Pişen profiterollerin içine krema sıkın.\n7. Çikolata sosu için çikolata, süt ve tereyağını benmari usulü eritin.\n8. Profiterollerin üzerine sosu dökün ve servis yapın.";
            case "San Sebastian":
                return "Malzemeler:\n- 200 gram un\n- 200 gram tereyağı\n- 200 gram toz şeker\n- 1 adet yumurta\n- 1 paket vanilya\n- 1 çay kaşığı tuz\n- 1 su bardağı dövülmüş ceviz\n\nYapılışı:\n1. Tereyağı ve şekeri mikserle çırpın.\n2. Yumurta ve vanilyayı ekleyip çırpmaya devam edin.\n3. Unu ve tuzu ekleyip yoğurun.\n4. Cevizleri ekleyip karıştırın.\n5. Hamurdan ceviz büyüklüğünde parçalar alıp yuvarlayın.\n6. Yağlanmış fırın tepsisine dizin.\n7. 180 derece fırında üzeri kızarana kadar pişirin.";
            case "Sufle":
                return "Malzemeler:\n- 100 gram bitter çikolata\n- 100 gram tereyağı\n- 3 adet yumurta\n- 1 su bardağı toz şeker\n- 1 yemek kaşığı un\n\nYapılışı:\n1. Çikolatayı benmari usulü eritin ve tereyağı ile karıştırın.\n2. Yumurta sarılarını ve yarım su bardağı toz şekeri mikserle çırpın.\n3. Unu ekleyip karıştırın.\n4. Yumurta beyazlarını ayrı bir kapta çırpın ve kar haline getirin.\n5. Eriyen çikolatayı yumurta sarılı karışıma ekleyin.\n6. Kar haline getirdiğiniz yumurta beyazlarını yavaşça karışıma ekleyin ve spatula ile karıştırın.\n7. Fırın kabına dökün ve 180 derece fırında 15-20 dakika pişirin.";
            case "Sütlü İrmik":
                return "Malzemeler:\n- 1 su bardağı irmik\n- 1 litre süt\n- Yarım su bardağı toz şeker\n- 1 paket vanilya\n- Yarım su bardağı dövülmüş ceviz veya fındık\n\nYapılışı:\n1. Bir tencerede irmiği kavurun.\n2. Üzerine sütü ekleyip karıştırarak pişirin.\n3. Toz şekeri ve vanilyayı ekleyin, karıştırın.\n4. Kıvam alınca ocaktan alın.\n5. Servis kaselerine alıp üzerine dövülmüş ceviz veya fındık serpiştirin.\n6. Soğuduktan sonra buzdolabında dinlendirin.";
            case "Tavuk Göğsü Tatlısı":
                return "Malzemeler:\n- 1 litre süt\n- 1 su bardağı toz şeker\n- Yarım su bardağı un\n- 1 su bardağı tavuk göğsü rendesi\n- 1 tatlı kaşığı tereyağı\n- 1 paket vanilya\n\nYapılışı:\n1. Süt, un, toz şeker ve tereyağını bir tencerede karıştırarak pişirin.\n2. Muhallebi kıvamına gelince tavuk göğsü rendesini ekleyin, karıştırın.\n3. Vanilyayı ekleyip karıştırın.\n4. Ocaktan alın ve servis kaselerine dökün.\n5. Soğuduktan sonra buzdolabında dinlendirin ve üzerine tarçın serpip servis yapın.";
            case "Waffle":
                return "Malzemeler:\n- 2 adet yumurta\n- Yarım su bardağı toz şeker\n- 1 su bardağı süt\n- Yarım su bardağı sıvı yağ\n- 2 su bardağı un\n- 1 paket kabartma tozu\n- 1 paket vanilya\n\nYapılışı:\n1. Yumurta ve toz şekeri çırpın.\n2. Süt ve sıvı yağı ekleyip karıştırın.\n3. Un, kabartma tozu ve vanilyayı ekleyip karıştırın.\n4. Krep tavasına veya waffle makinesine karışımdan dökün.\n5. Pişirin ve üzerine isteğe göre çikolata sosu, meyve veya dondurma ile servis yapın.";
            case "Ekşili Köfte Çorbası":
                return "Malzemeler:\n- 250 gram köftelik kıyma\n- 1 adet soğan\n- 2 yemek kaşığı pirinç\n- 1 adet limon\n- 1 adet yumurta\n- 2 yemek kaşığı un\n- 1 yemek kaşığı tereyağı\n- 6 su bardağı su\n- Tuz\n- Nane\n\nYapılışı:\n1. Kıymayı yoğurun ve küçük köfteler yapın.\n2. Soğanı doğrayın ve tereyağında kavurun.\n3. Pirinci ve suyu ekleyin, kaynamaya bırakın.\n4. Köfteleri ekleyin ve pişirin.\n5. Un, yumurta ve limon suyunu karıştırarak ekleyin.\n6. Tuzunu ekleyin ve koyulaşana kadar pişirin.\n7. Üzerine nane serpin ve servis yapın.";
            case "Sütlaç":
                return "Malzemeler:\n- 1 litre süt\n- 1 su bardağı pirinç\n- 1 su bardağı toz şeker\n- 2 su bardağı su\n- 1 paket vanilin\n\nYapılışı:\n1. Pirinci yıkayıp tencereye alın.\n2. Suyu ekleyip pirinçler yumuşayana kadar pişirin.\n3. Sütü ve şekeri ekleyip karıştırın.\n4. Vanilini ekleyin ve pişirmeye devam edin.\n5. Kaselere paylaştırıp soğutun.";
            case "Revani":
                return "Malzemeler:\n- 3 adet yumurta\n- 1 su bardağı toz şeker\n- 1 su bardağı yoğurt\n- 1 su bardağı irmik\n- 1 su bardağı un\n- 1 paket kabartma tozu\n- 1 paket vanilin\n\nŞerbet:\n- 3 su bardağı su\n- 3 su bardağı toz şeker\n- 1 dilim limon\n\nYapılışı:\n1. Yumurta ve şekeri çırpın.\n2. Yoğurt, irmik, un, kabartma tozu ve vanilini ekleyin.\n3. Hamuru yağlanmış tepsiye dökün.\n4. Önceden ısıtılmış 180°C fırında pişirin.\n5. Şerbeti hazırlayıp soğutun.\n6. Fırından çıkan sıcak revaninin üzerine soğuk şerbeti dökün.";
            case "Baklava":
                return "Malzemeler:\n- 1 paket baklavalık yufka\n- 500 gr ceviz\n- 250 gr tereyağı\n- 1 su bardağı sıvı yağ\n\nŞerbet:\n- 4 su bardağı toz şeker\n- 5 su bardağı su\n- 1 dilim limon\n\nYapılışı:\n1. Şerbeti hazırlayıp soğutun.\n2. Yufkaları tepsiye serip aralarına ceviz serpin.\n3. Tereyağı ve sıvı yağı eritip yufkaların üzerine sürün.\n4. 180°C fırında pişirin.\n5. Fırından çıkan sıcak baklavanın üzerine soğuk şerbeti dökün.";
            case "Şekerpare":
                return "Malzemeler:\n- 125 gr tereyağı\n- 1 çay bardağı sıvı yağ\n- 1 çay bardağı yoğurt\n- 1 yumurta\n- 1 su bardağı irmik\n- 3 su bardağı un\n- 1 paket kabartma tozu\n- 1 paket vanilin\n\nŞerbet:\n- 3 su bardağı toz şeker\n- 3 su bardağı su\n- 1 dilim limon\n\nYapılışı:\n1. Şerbeti hazırlayıp soğutun.\n2. Tereyağı, sıvı yağ, yoğurt ve yumurtayı karıştırın.\n3. İrmik, un, kabartma tozu ve vanilini ekleyip yoğurun.\n4. Hamurdan parçalar koparıp şekil verin ve tepsiye dizin.\n5. 180°C fırında pişirin.\n6. Fırından çıkan sıcak şekerparelerin üzerine soğuk şerbeti dökün.";
            case "Magnolia":
                return "Malzemeler:\n- 1 litre süt\n- 1 su bardağı toz şeker\n- 3 yemek kaşığı un\n- 2 yemek kaşığı mısır nişastası\n- 1 paket vanilin\n- 1 paket krema\n- 2 adet muz\n- 1 paket petibör bisküvi\n\nYapılışı:\n1. Süt, şeker, un ve nişastayı karıştırarak pişirin.\n2. Kaynadıktan sonra ocaktan alıp vanilin ve kremayı ekleyin.\n3. Bisküvileri rondodan geçirin.\n4. Kuplara bir kat muhallebi, bir kat bisküvi, bir kat muz dilimleri şeklinde doldurun.";
            case "Etimek":
                return "Malzemeler:\n- 1 paket etimek\n- 2 su bardağı toz şeker\n- 2 su bardağı su\n\nMuhallebi:\n- 1 litre süt\n- 1 su bardağı toz şeker\n- 3 yemek kaşığı un\n- 2 yemek kaşığı mısır nişastası\n- 1 paket vanilin\n- 1 paket krem şanti\n\nYapılışı:\n1. Şerbeti hazırlayıp soğutun.\n2. Etimekleri tepsiye dizip üzerine şerbeti dökün.\n3. Muhallebiyi pişirip etimeklerin üzerine dökün.\n4. Krem şantiyi hazırlayıp muhallebinin üzerine sürün.";
            case "Sultan Sarması":
                return "Malzemeler:\n- 1 litre süt\n- 1 su bardağı toz şeker\n- 3 yemek kaşığı un\n- 2 yemek kaşığı kakao\n- 1 paket vanilin\n- 1 paket krem şanti\n- 1 su bardağı hindistan cevizi\n\nYapılışı:\n1. Süt, şeker, un ve kakaoyu karıştırarak pişirin.\n2. Kaynadıktan sonra ocaktan alıp vanilini ekleyin.\n3. Muhallebiyi hindistan cevizi serpilmiş tepsiye dökün.\n4. Soğuduktan sonra krem şantiyi sürün ve rulo şeklinde sarın.";
            case "Erişteli Mercimek Çorbası":
                return "Malzemeler:\n- 1 su bardağı kırmızı mercimek\n- 1 çay bardağı erişte\n- 1 adet soğan\n- 1 yemek kaşığı tereyağı\n- 6 su bardağı su\n- Tuz, karabiber\n\nYapılışı:\n1. Soğanı doğrayıp tereyağında kavurun.\n2. Mercimek ve suyu ekleyin, mercimekler yumuşayana kadar pişirin.\n3. Erişteyi ekleyip yumuşayana kadar pişirin.\n4. Tuz ve karabiber ekleyip karıştırın.";
            case "Kabak Çorbası":
                return "Malzemeler:\n- 2 adet kabak\n- 1 adet soğan\n- 1 yemek kaşığı tereyağı\n- 1 su bardağı süt\n- 4 su bardağı su\n- Tuz, karabiber\n\nYapılışı:\n1. Soğanı doğrayıp tereyağında kavurun.\n2. Kabakları ekleyip kavurun.\n3. Su ve tuzu ekleyip kaynatın.\n4. Kabaklar yumuşayınca blenderdan geçirin.\n5. Süt ve karabiber ekleyip karıştırarak pişirin.";
            case "Lebeniye Çorbası":
                return "Malzemeler:\n- 1 su bardağı haşlanmış nohut\n- 1 su bardağı yoğurt\n- 1 yumurta sarısı\n- 1 yemek kaşığı un\n- 5 su bardağı su\n- Tuz\n\nYapılışı:\n1. Yoğurt, yumurta sarısı ve unu çırpın.\n2. Suyu ekleyip karıştırarak pişirin.\n3. Haşlanmış nohutları ekleyin.\n4. Tuz ekleyip karıştırın.";
            case "Mantar Çorbası":
                return "Malzemeler:\n- 250 gr mantar\n- 1 adet soğan\n- 2 yemek kaşığı un\n- 1 su bardağı süt\n- 4 su bardağı su\n- 2 yemek kaşığı tereyağı\n- Tuz, karabiber\n\nYapılışı:\n1. Soğanı doğrayıp tereyağında kavurun.\n2. Mantarları ekleyip kavurun.\n3. Unu ekleyip karıştırın.\n4. Su ve tuzu ekleyip kaynatın.\n5. Süt ve karabiber ekleyip karıştırarak pişirin.";
            case "Patates Çorbası":
                return "Malzemeler:\n- 2 adet patates\n- 1 adet soğan\n- 2 yemek kaşığı un\n- 1 su bardağı süt\n- 4 su bardağı su\n- 2 yemek kaşığı tereyağı\n- Tuz, karabiber\n\nYapılışı:\n1. Soğanı doğrayıp tereyağında kavurun.\n2. Patatesleri ekleyip kavurun.\n3. Unu ekleyip karıştırın.\n4. Su ve tuzu ekleyip kaynatın.\n5. Patatesler yumuşayınca blenderdan geçirin.\n6. Süt ve karabiber ekleyip karıştırarak pişirin.";
            case "Şehriyeli Tavuk Suyu Çorbası":
                return "Malzemeler:\n- 1 su bardağı şehriye\n- 1 adet tavuk göğsü\n- 6 su bardağı tavuk suyu\n- 2 yemek kaşığı tereyağı\n- Tuz, karabiber\n\nYapılışı:\n1. Tavuk göğsünü haşlayıp didikleyin.\n2. Tereyağında şehriyeyi kavurun.\n3. Tavuk suyu ve tuzu ekleyip kaynatın.\n4. Didiklenmiş tavukları ekleyip karıştırın.";
            case "Sütlü Domates Çorbası":
                return "Malzemeler:\n- 4 adet domates\n- 1 yemek kaşığı un\n- 1 su bardağı süt\n- 4 su bardağı su\n- 2 yemek kaşığı tereyağı\n- Tuz, karabiber\n\nYapılışı:\n1. Domatesleri rendeleyin.\n2. Tereyağında unu kavurun.\n3. Rendelenmiş domatesleri ekleyip kavurun.\n4. Su ve tuzu ekleyip kaynatın.\n5. Süt ve karabiber ekleyip karıştırarak pişirin.";
            case "Tutmaç Çorbası":
                return "Malzemeler:\n- 1 su bardağı yeşil mercimek\n- 1 çay bardağı erişte\n- 1 su bardağı yoğurt\n- 1 yemek kaşığı un\n- 1 yemek kaşığı tereyağı\n- 5 su bardağı su\n- Tuz, nane\n\nYapılışı:\n1. Mercimeği haşlayın.\n2. Yoğurt ve unu çırpın.\n3. Su ve yoğurt karışımını kaynatın.\n4. Erişteyi ekleyip pişirin.\n5. Haşlanmış mercimeği ekleyip karıştırın.\n6. Tereyağında naneyi kavurup çorbaya ekleyin.";
            default:
                return "Tarif bulunamadı.";
        }
    }
}