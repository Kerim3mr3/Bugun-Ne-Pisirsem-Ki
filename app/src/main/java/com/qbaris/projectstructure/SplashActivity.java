package com.qbaris.projectstructure;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // ImageView'i bul ve Glide ile GIF'i yükle
        ImageView splashImageView = findViewById(R.id.splashImageView);
        Glide.with(this)
                .asGif()
                .load(R.drawable.bnpk_splash_screen_animated)
                .centerCrop() // Resmi merkeze hizala ve kırp
                .placeholder(R.color.tema_rengi) // Optional: loading placeholder image
                .into(splashImageView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}