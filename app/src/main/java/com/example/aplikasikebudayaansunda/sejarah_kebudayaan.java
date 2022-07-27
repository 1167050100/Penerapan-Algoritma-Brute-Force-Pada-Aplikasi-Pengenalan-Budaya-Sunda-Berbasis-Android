package com.example.aplikasikebudayaansunda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class sejarah_kebudayaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_kebudayaan);

        WebView webView = (WebView) findViewById(R.id.deskripsi);
        String text = "Suku Sunda dikenal dengan Tatar Pasundan meliputi wilayah bagian barat pulau Jawa dimana sebagian besar wilayahnya masuk provinsi Jawa Barat dan Banten. Menurut Rouffaer (1905: 16) menyatakan bahwa kata Sunda berasal dari akar kata sund atau kata suddha dalam bahasa Sansekerta yang mempunyai pengertian bersinar, terang, berkilau, putih (Williams, 1872: 1128, Eringa, 1949: 289)."
                +" Orang Sunda meyakini bahwa memiliki etos atau karakter Kasundaan, sebagai jalan menuju keutamaan hidup. Karakter orang Sunda yang dimaksud adalah cageur (sehat), bageur (baik), bener (benar), singer (mawas diri), wanter (berani) dan pinter (cerdas). Karakter ini telah dijalankan oleh masyarakat Sunda sejak zaman Kerajaan Salakanagara, Kerajaan Tarumanagara, Kerajaan Sunda-Galuh, Kerajaan Pajajaran hingga sekarang."
                +" <p align=justify> Selain agama yang dijadikan pandangan hidup, orang Sunda juga mempunyai pandangan hidup yang diwariskan oleh nenek moyangnya. Pandangan hidup tersebut tidak bertentangan dengan agama yang dianutnya karena secara tersurat dan tersirat dikandung juga dalam ajaran agamanya, khususnya ajaran agama Islam. Pandangan hidup orang Sunda yang diwariskan dari nenek moyangnya dapat diamati pada ungkapan tradisional sebagai berikut: </p>"
                +" <p align=justify> Hana nguni hana mangke, tan hana nguni tan hana mangke, aya ma beuheula aya tu ayeuna, hanteu ma beuheula hanteu tu ayeuna. Hana tunggak hana watang, tan hana tunggak tan hana watang. Hana ma tunggulna aya tu catangna.</p>"
                +" <p align=justify>Artinya: Ada dahulu ada sekarang, bila tak ada dahulu tak akan ada sekarang, karena ada masa silam maka ada masa kini, bila tak ada masa silam takan ada masa kini. Ada tunggak tentu ada batang, bila tak ada tunggak tak akan ada batang, bila ada tunggulnya tentu ada batangnya. </p>"
                +" <p align=justify> Dalam percakapan sehari-hari, etnis Sunda banyak menggunakan bahasa Sunda. Namun kini telah banyak masyarakat Sunda terutama yang tinggal di perkotaan tidak lagi menggunakan bahasa Sunda dalam bertutur kata. Seperti yang terjadi di pusat-pusat keramaian kota Bandung, Bogor, dan Tangerang, dimana banyak masyarakat yang tidak lagi menggunakan bahasa Sunda.</p>"
                +" <p align=justify>  Sunda juga memiliki kesenian yang beragam, diantaranya adalah seni tari: tari jaipong, tari topeng, tari rampak gendang. Seni pertunjukan:  sisingaan, wayang golek, kuda renggong. Seni musik: cianjuran, rampak gendang, degung. Serta kesenian tradisional Sunda laninya yang biasa dimainkan pada pagelaran kesenian.</p>";
        webView.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
    }
}
