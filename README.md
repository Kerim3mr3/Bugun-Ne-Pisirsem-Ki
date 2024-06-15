# İçindekiler

1. [Splash Screen (Açılış Ekranı)](#splash-screen-a%C3%A7%C4%B1l%C4%B1%C5%9F-ekran%C4%B1)
2. [Ana Sayfa](#ana-sayfa)
3. [Menu](#menu)
4. [Yemekler](#yemekler)
5. [Çorbalar](#%C3%A7orbalar)
6. [Tatlılar](#tatl%C4%B1lar)
7. [Gradle Gereksinimleri](#gradle-gereksinimleri)

---

# **Splash Screen (Açılış Ekranı)**  
![Splash Screen Ekran Görüntüsü](./app/src/main/res/drawable/bnpk_splash_screen_animated.gif)  

# **Ana Sayfa**  
![Ana Sayfa Ekran Görüntüsü](./app/src/main/res/drawable/anasayfa_gif.gif)  

# **Menu**  
![Menu Ekran Görüntüsü](./app/src/main/res/drawable/Menu_Gif.gif)  

# **Yemekler**  
![Yemekler Ekran Görüntüsü](./app/src/main/res/drawable/Yemekler_Gif.gif)  

# **Çorbalar**  
![Çorbalar Ekran Görüntüsü](./app/src/main/res/drawable/Corbalar_Gif.gif)  

# **Tatlılar**  
![Tatlılar Ekran Görüntüsü](./app/src/main/res/drawable/Tatlılar_Gif.gif)  

# **Gradle Gereksinimleri**
```gradle
implementation "androidx.recyclerview:recyclerview:1.3.2"
implementation 'com.google.android.material:material:1.11.0'
implementation ('com.github.shrikanth7698:Custom-Navigation-Drawer:v0.0.1') {
    exclude group: 'com.android.support', module: 'support-compat'
}
implementation 'com.github.bumptech.glide:glide:4.12.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
