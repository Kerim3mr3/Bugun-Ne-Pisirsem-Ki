# İçindekiler

1. [Tanıtım](#tan%C4%B1t%C4%B1m)
2. [Splash Screen (Açılış Ekranı)](#splash-screen-a%C3%A7%C4%B1l%C4%B1%C5%9F-ekran%C4%B1)
3. [Ana Sayfa](#ana-sayfa)
4. [Menu](#menu)
5. [Yemekler](#yemekler)
6. [Çorbalar](#%C3%A7orbalar)
7. [Tatlılar](#tatl%C4%B1lar)
8. [Gradle Gereksinimleri](#gradle-gereksinimleri)

---
## **Tanıtım**  
Java programlama dilinde Android Studio platformunda yapılmış basit bir yemek tarifleri mobil uygulaması, veri tabanı kullanılmamıştır.

<div align="center" style="display: flex; flex-direction: column; align-items: center;">
    <h2>Splash Screen (Açılış Ekranı)</h2>
    <img src="./app/src/main/res/drawable/bnpk_splash_screen_animated.gif" alt="Splash Screen Ekran Görüntüsü" width="300">
</div>

<div align="center" style="display: flex; flex-direction: column; align-items: center;">
    <h2>Ana Sayfa</h2>
    <img src="./app/src/main/res/drawable/anasayfa_gif.gif" alt="Ana Sayfa Ekran Görüntüsü" width="300">
</div>

<div align="center" style="display: flex; flex-direction: column; align-items: center;">
    <h2>Menu</h2>
    <img src="./app/src/main/res/drawable/Menu_Gif.gif" alt="Menu Ekran Görüntüsü" width="300">
</div>


<div align="center" style="display: flex; flex-direction: column; align-items: center;">
    <h2>Yemekler</h2>
    <img src="./app/src/main/res/drawable/Yemekler_Gif.gif" alt="Yemekler Ekran Görüntüsü" width="300">
</div>

<div align="center" style="display: flex; flex-direction: column; align-items: center;">
    <h2>Çorbalar</h2>
    <img src="./app/src/main/res/drawable/Corbalar_Gif.gif" alt="Çorbalar Ekran Görüntüsü" width="300">
</div>

<div align="center" style="display: flex; flex-direction: column; align-items: center;">
    <h2>Tatlılar</h2>
    <img src="./app/src/main/res/drawable/Tatlılar_Gif.gif" alt="Tatlılar Ekran Görüntüsü" width="300">
</div>

# **Gradle Gereksinimleri **
```gradle
implementation "androidx.recyclerview:recyclerview:1.3.2"
implementation 'com.google.android.material:material:1.11.0'
implementation ('com.github.shrikanth7698:Custom-Navigation-Drawer:v0.0.1') {
    exclude group: 'com.android.support', module: 'support-compat'
}
implementation 'com.github.bumptech.glide:glide:4.12.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
