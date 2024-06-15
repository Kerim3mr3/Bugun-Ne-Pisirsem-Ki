package com.qbaris.projectstructure;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Anasayfa extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Fragment'ın layoutunu inflate et
        View rootView = inflater.inflate(R.layout.fragment_anasayfa, container, false);

        // ImageView'i bul
        ImageView backgroundImageView = rootView.findViewById(R.id.backgroundImageView);

        // Glide kütüphanesi kullanarak GIF'i yükle
        Glide.with(this)
                .load(R.drawable.anasayfa_gif)
                .diskCacheStrategy(DiskCacheStrategy.NONE) // Disk önbelleği kullanma
                .skipMemoryCache(true) // Bellek önbelleği kullanma
                .transition(DrawableTransitionOptions.withCrossFade()) // Geçiş efekti uygula
                .centerCrop() // Resmi merkeze hizala ve kırp
                .into(backgroundImageView);

        return rootView;
    }
}