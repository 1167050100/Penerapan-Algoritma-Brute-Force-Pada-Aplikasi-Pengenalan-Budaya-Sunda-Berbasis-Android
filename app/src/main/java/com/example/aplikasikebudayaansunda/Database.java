package com.example.aplikasikebudayaansunda;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper{
    final static String DB_NAME = "db_budaya";

    public Database(Context context) {
        super(context, DB_NAME, null, 15);
// TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS budaya(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, kategori TEXT, deskripsi TEXT, img BLOB, link TEXT)";
        String sql2 = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);
        db.execSQL(sql2);


        ContentValues values1 = new ContentValues();
        // DB SOAL KUIZ
        values1.put("soal", "Apa nama kebudayaan dari gambar di atas?");
        values1.put("pil_a", "Angklung");
        values1.put("pil_b","Degung");
        values1.put("pil_c", "Calung");
        values1.put("jwban","0");
        values1.put("img", R.drawable.imv_alatmusik_angklung);
        db.insert("tbl_soal", "soal", values1);

        values1.put("soal", "Apa nama kebudayaan dari gambar di atas?");
        values1.put("pil_a", "Tari Ketuk Tilu");
        values1.put("pil_b","Tari Wayang");
        values1.put("pil_c", "Tari Keurseus");
        values1.put("jwban","2");
        values1.put("img", R.drawable.imv_kesenian_tari_keurseus);
        db.insert("tbl_soal", "soal", values1);

        values1.put("soal", "Apa nama kebudayaan dari gambar di atas?");
        values1.put("pil_a", "Encrak");
        values1.put("pil_b","Gatrik");
        values1.put("pil_c", "Parepet Jengkol");
        values1.put("jwban","1");
        values1.put("img", R.drawable.imv_permainantradisional_gatrik);
        db.insert("tbl_soal", "soal", values1);

        values1.put("soal", "Apa nama kebudayaan dari gambar di atas?");
        values1.put("pil_a", "Randu Kentir");
        values1.put("pil_b","Rampak Gendang");
        values1.put("pil_c", "Uyeg");
        values1.put("jwban","0");
        values1.put("img", R.drawable.imv_kesenian_randu);
        db.insert("tbl_soal", "soal", values1);

        values1.put("soal", "Apa nama kebudayaan dari gambar di atas?");
        values1.put("pil_a", "Upacara Puput Puseur");
        values1.put("pil_b","Upacara Nenjrag Bumi");
        values1.put("pil_c", "Upacara Turun Taneuh");
        values1.put("jwban","1");
        values1.put("img", R.drawable.imv_adat_tradisional_nenjrag_bumi);
        db.insert("tbl_soal", "soal", values1);

        // DB KEBUDAYAAN
        ContentValues values = new ContentValues();
        // Rumah adat
        values.put("_id", "1");
        values.put("nama", "Suhunan Jolopong");
        values.put("kategori", "Rumah Adat");
        values.put("deskripsi", "Suhunan Jolopong, yaitu bentuk bangunan yang atapnya (suhunan) memanjang, sering disebut suhunan panjang atau gagajahan. Bentuk Jolopong sendiri memiliki dua bidang atap. Kedua bidang atap ini dipisahkan oleh jalur suhunan ditengah bangunan rumah. Batang suhunan sama panjangnya dan sejajar dengan kedua sisi bawah bidang atap yang berbelahan, sedangkan lainnya lebih pendek dibanding dengan suhunan dan memotong tegak lurus di kedua ujung suhunan itu. Ruang Jolopong terdiri atas ruang depanyang disebut emper atau tepas, ruangan tengah disebut tengah imah atau patengahan, ruangan samping disebut pangkeng (kamar), ruangan belakang yang terdiri atas dapur yang disebut pawon dan tempat menyimpan beras yang disebut padaringan. ");
        values.put("link", "https://www.youtube.com/watch?v=KN5ukswA7Sc&ab_channel=IndraHilmiFauzan");
        values.put("img", R.drawable.imv_rumahadat_joloponggagajahan);
        db.insert("budaya", "_id", values);

        values.put("_id", "2");
        values.put("nama", "Julang Ngapak");
        values.put("kategori", "Rumah Adat");
        values.put("deskripsi", "Julang Ngapak yaitu bentuk bangunan rumah yang suhunan bagian sisi kiri dan kanannya agak melebar kesamping. Ada juga yang menyebutnya memakai sorondoy. Apabila dilihat dari arah depan seperti burung yang sedang terbang.");
        values.put("link", "https://www.youtube.com/watch?v=D_cU4nIj9Wc&ab_channel=fotolokasi");
        values.put("img", R.drawable.imv_rumahadat_julangngapak);
        db.insert("budaya", "_id", values);

        values.put("_id", "3");
        values.put("nama", "Parahu Kumureb");
        values.put("kategori", "Rumah Adat");
        values.put("deskripsi", "Parahu Kumureb, yaitu bentuk bangunan rumah yang atapnya (suhunan) membentuk perahu terbalik(terlungkup).");
        values.put("link", "https://www.youtube.com/watch?v=BoY2QBVck-k&ab_channel=RajeChannel");
        values.put("img", R.drawable.imv_rumahadat_parahukumureb);
        db.insert("budaya", "_id", values);

        values.put("_id", "4");
        values.put("nama", "Tagog Anjing");
        values.put("kategori", "Rumah Adat");
        values.put("deskripsi", "Tagog Anjing, yaitu bentuk bangunan mirip dengan bentuk badak heuay, tetapi ada sambungan ke bagian depan dan sedikit turun. Jadi, bangunannya berbentuk menekuk (ngeluk).");
        values.put("link", "https://www.youtube.com/watch?v=plZcO0zHZLE&ab_channel=TheDraftsman");
        values.put("img", R.drawable.imv_rumahadat_tagoganjing);
        db.insert("budaya", "_id", values);

        values.put("_id", "5");
        values.put("nama", "Badak Heuay");
        values.put("kategori", "Rumah Adat");
        values.put("deskripsi", "Badak Heuay, yaitu bentuk bangunan seperti saung tidak memakai wuwung sambungan atap (hateup) depan dengan belakang seperti badak sedang membuka mulutnya (menguap) dalam bahasa Sunda disebut heuay. ");
        values.put("link", "https://www.youtube.com/watch?v=xFB_2hbvfoI&ab_channel=GriyaTwinza");
        values.put("img", R.drawable.imv_rumahadat_badakheuay);
        db.insert("budaya", "_id", values);

        values.put("_id", "6");
        values.put("nama", "Capit Gunting");
        values.put("kategori", "Rumah Adat");
        values.put("deskripsi", "Capit Gunting, yaitu bentuk bangunan rumah yang atap (suhunan) bagian ujung belakang atas dan depan atas menggunakan kayu atau bambu yang bentuknya menyilang di bagian atasnya seperti gunting.");
        values.put("link", "https://www.youtube.com/watch?v=BoY2QBVck-k&t=115s&ab_channel=RajeChannel");
        values.put("img", R.drawable.imv_rumahadat_capitgunting);
        db.insert("budaya", "_id", values);

        // Alat musik
        values.put("_id", "7");
        values.put("nama", "Angklung");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Angklung adalah alat musik tradisional indonesia yang berasal dari Sunda. Alat musik ini terbuat dari bambu, yang dibunyikan dengan cara digoyangkan (bunyi disebabkan oleh benturan badan pipa bambu) sehingga menghasilkan bunyi yang bergetar dalam susunan nada 2, 3, sampai 4 nada dalam setiap ukuran, baik besar maupun kecil. Sejak November 2010, angklung sudah terdaftar sebagai karya agung warisan budaya lisan dan non bendawi manusia dari UNESCO.");
        values.put("link", "https://www.youtube.com/watch?v=mDW7nkxp7L8&ab_channel=JeffriCen");
        values.put("img", R.drawable.imv_alatmusik_angklung);
        db.insert("budaya", "_id", values);

        values.put("_id", "8");
        values.put("nama", "Calung");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Calung adalah alat musik Sunda yang merupakan prototipe dari angklung. Berbeda dengan angklung yang dimainkan dengan digoyangkan, calung dimainkan dengan cara dipukul. Jenis bambu untuk pembuatan calung kebanyakan dari awi wulung (bambu hitam), namun ada pula yang dibuat dari awi temen (bambu berwarna putih).");
        values.put("link", "https://www.youtube.com/watch?v=veLhEkYIg18&ab_channel=RaraKids");
        values.put("img", R.drawable.imv_alatmusik_calung);
        db.insert("budaya", "_id", values);

        values.put("_id", "9");
        values.put("nama", "Arumba");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Arumba atau disebut juga Angklung Arumba merupakan salah satu jenis musik rakyat yang terdapat hampir disetiap daerah Jawa Barat. Perangkat ini terbuat dari bambu pilihan seperti awi temen, tali dan wulung (bambu hitam). Diantara waditranya terdapat seperangkat angklung yang bertangga nada diatonis, karena memang musik arumba ini merupakan perkembangan dari musik angklung yang sudah sejak lama terdapat di Jawa Barat. Arumba (alunan rumpun bambu) pada awalnya menggunakan tangga nada pentagonis namun dalam perkembangannya menggunakan tangga nada diatonis.");
        values.put("link", "https://www.youtube.com/watch?v=1KplOLZc9c4&ab_channel=SaungAngklungUdjo");
        values.put("img", R.drawable.imv_alatmusik_arumba);
        db.insert("budaya", "_id", values);

        values.put("_id", "10");
        values.put("nama", "Gendang/Kendang");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Gendang adalah alat musik tradisional yang dibuat dari kulit binatang seperti kerbau, kambing atau, lembu. Fungsinya sebagai pengatur irama lagu. Kendang merupakan waditra yang tergabung dalam perangkat gamelan dan merupakan salah satu alat musik dalam keluarga genderang.");
        values.put("link", "https://www.youtube.com/watch?v=szOgQixXZNc&ab_channel=RisAdityachannel");
        values.put("img", R.drawable.imv_alatmusik_gendang);
        db.insert("budaya", "_id", values);

        values.put("_id", "11");
        values.put("nama", "Kacapi");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Kacapi adalah alat musik petik yang berasal dari Jawa Barat. Bentuk organologi kacapi adalah sebuah kotak kayu yang diatasnya berjajar dawai/senar. Kotak kayu tersebut berguna sebagai resonatornya. Dilihat dari fungsi dan bentuk kecapi dapat dibedakan menjadi dua jenis, yaitu Kacapi parahu (kecapi indung) dan kacapi siter. Untuk kedua jenis kacapi ini, setiap dawai diikatkan pada suatu sekrup kecil pada sisi kanan atas kotak. Mereka dapat ditala dalam berbagai sistem : pelog, sorog/madenda atau salendro. Saat ini kotak resonansi kacapi dibuat dengan cara mengelem sisi enam bidang kayu.");
        values.put("link", "https://www.youtube.com/watch?v=lZYK1U1O8zQ&ab_channel=KangYoanChannel");
        values.put("img", R.drawable.imv_alatmusik_kacapi);
        db.insert("budaya", "_id", values);

        values.put("_id", "12");
        values.put("nama", "Kacapi Parahu");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Kacapi Parahu (kecapi indung) adalah suatu kotak resonansi yang bagian bawahnya diberi lubang resonansi untuk memungkinkan suara keluar. Sisi-sisi jenis kacapi ini dibentuk sedemikian rupa sehingga menyeruapai perahu. Di masa lalu, kacapi ini dibuat langsung dari bongkahan kayu dengan memahatnya. Kacapi parahu (indung) digunakan untuk mengiringi tembang sunda (mamaos/cianjuran).");
        values.put("link", "https://www.youtube.com/watch?v=H5GPRqc2T-c&ab_channel=Kamandaka");
        values.put("img", R.drawable.imv_alatmusik_kacapiindung);
        db.insert("budaya", "_id", values);

        values.put("_id", "13");
        values.put("nama", "Kacapi Siter");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Kacapi Siter merupakan kotak resonansi dengan bidang rata yang sejajar.Serupa dengan kacapi parahu, lubangnya ditempatkan pada bagian bawah. Sisi bagian atas dan bawahnya membentuk trapesium. Kacapi siter digunakan untuk mengiringi lagu-lagu kawih.");
        values.put("link", "https://www.youtube.com/watch?v=lwr8i0jFc6E&ab_channel=SULEChannel");
        values.put("img", R.drawable.imv_alatmusik_kacapisinter);
        db.insert("budaya", "_id", values);

        values.put("_id", "14");
        values.put("nama", "Suling");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Suling adalah alat musik tiup yang berasal dari Sunda dan terbuat dari bambu. Dilihat dari ukuran dan jumlah lubang, nada suling dapat digolongkan dalam dua jenis, yaitu suling yang berjumlah lubang nada 4 disebut suling degung dan suling yang berjumlah lubang nada 6 biasa disebut suling kawih");
        values.put("link", "https://www.youtube.com/watch?v=EbzeNiBsDMw&ab_channel=SaungAngklungUdjo");
        values.put("img", R.drawable.imv_alatmusik_suling);
        db.insert("budaya", "_id", values);

        values.put("_id", "15");
        values.put("nama", "Rebab");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Rebab adalah instrumen musik tradisional yang menggunakan teknik gesek. Rebab terdapat di beberapa daerah, seperti Jawa Barat, Jawa Tengah, dan Jakarta (kesenian Betawi). Rebab terbuat dari bahan kayu dan resonatornya ditutup dengan kulit tipis, mempunyai dua buah senar/dawai dan mempunyai tangga nada pentatonis. Instrumen musik tradisional lainnya yang mempunyai bentuk seperti rebab adalah ohyan. Resonatornya terbuat dari tempurung kelapa. Rebab jenis ini dapat dijumpai di Bali, Jawa, dan Kalimantan Selatan.");
        values.put("link", "https://www.youtube.com/watch?v=FdWTuTD00Yk&ab_channel=BungaDessriNurGhaliyah");
        values.put("img", R.drawable.imv_alatmusik_rebab);
        db.insert("budaya", "_id", values);

        values.put("_id", "16");
        values.put("nama", "Degung");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Degung merupakan salah satu gamelan khas dan asli hasil kreativitas masyarakat Sunda. Gamelan yang kini jumlahnya telah berkembang dengan pesat, diperkirakan awal perkembangannya sekitar akhir abad ke-18/awal abad ke-19. Jaap Kunst yang mendata gamelan di seluruh Pulau Jawa dalam bukunya Toonkunst van Java (1934) mencatat bahwa degung terdapat di Bandung (5 perangkat), Sumedang (3 perangkat), Cianjur (1 perangkat), Ciamis (1 perangkat), Kasepuhan (1 perangkat), Kanoman (1 perangkat), Darmaraja (1 perangkat), Banjar (1 perangkat), dan Singaparna (1 perangkat).\n" +
                "\n" +
                "Masyarakat Sunda dengan latar belakang kerajaan yang terletak di hulu sungai, kerajaan Galuh misalnya, memiliki pengaruh tersendiri terhadap kesenian degung, terutama lagu-lagunya yang yang banyak diwarnai kondisi sungai, di antaranya lagu Manintin, Galatik Manggut, Kintel Buluk, dan Sang Bango. Kebiasaan marak lauk masyarakat Sunda selalu diringi dengan gamelan renteng dan berkembang ke gamelan degung.\n" +
                "\n" +
                "Dugaan-dugaan masyarakat Sunda yang mengatakan bahwa degung merupakan musik kerajaan atau kadaleman dihubungkan pula dengan kirata basa, yaitu bahwa kata “degung” berasal dari kata \"ngadeg\" (berdiri) dan “agung” (megah) atau “pangagung” (menak; bangsawan), yang mengandung pengertian bahwa kesenian ini digunakan bagi kemegahan (keagungan) martabat bangsawan. E. Sutisna, salah seorang nayaga Degung Parahyangan, menghubungkan kata “degung” dikarenakan gamelan ini dulu hanya dimiliki oleh para pangagung (bupati). Dalam literatur istilah “degung” pertama kali muncul tahun 1879, yaitu dalam kamus susunan H.J. Oosting. Kata \"De gong\" (gamelan, bahasa Belanda) dalam kamus ini mengandung pengertian “penclon-penclon yang digantung”.\n" +
                "\n" +
                "Gamelan yang usianya cukup tua selain yang ada di keraton Kasepuhan (gamelan Dengung) adalah gamelan degung Pangasih di Museum Prabu Geusan Ulun, Sumedang. Gamelan ini merupakan peninggalan Pangeran Kusumadinata (Pangeran Kornel), bupati Sumedang (1791—1828).");
        values.put("link", "https://www.youtube.com/watch?v=pRtyKX2fZ68&ab_channel=v.lane.");
        values.put("img", R.drawable.imv_alatmusik_degung);
        db.insert("budaya", "_id", values);

        values.put("_id", "17");
        values.put("nama", "Tarawangsa");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Tarawangsa merupakan alat musik tradisional khas Jawa Barat dimana dalam sejarah alat musik ini tercatat dalam naskah kuno pada abad ke-18 Sewaka Darma.\n" +
                "\n" +
                "Tarawangsa dimainkan dengan cara digesek karna hanya memiliki 2 dawai, salah satu dawai sembari memetik dawai satunya untuk menghasilkan suara yang merdu. Tarawangsa dapat kamu temukan di beberapa daerah di Jawa Barat dan Banten.");
        values.put("link", "https://www.youtube.com/watch?v=210ean8lnRc&ab_channel=ezzarush");
        values.put("img", R.drawable.imv_alatmusik_tarawangsa);
        db.insert("budaya", "_id", values);

        values.put("_id", "18");
        values.put("nama", "Karinding");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Karinding merupakan alat musik asal Jawa Barat, alat musik ini memiliki keunikan tersendiri karna dimainkan dengan cara diletakkan di bibir kemusian ditepuk bagian pemukulnya untuk menghasilkan nada. Karinding ini terbuat dari bambu ataupun pelepah pohon aren.\n" +
                "\n" +
                "Alat musik ini gak memiliki nada yang tetap, semua tergantung dari penggunanya memainkan karinding ini. Bagi orang yang sudah mahir bermain karinding maka akan menghasilkan melodi yang indah.");
        values.put("link", "https://www.youtube.com/watch?v=IFpWE96kVUk&ab_channel=IndraAmirawiguna");
        values.put("img", R.drawable.imv_alatmusik_karinding);
        db.insert("budaya", "_id", values);

        values.put("_id", "19");
        values.put("nama", "Jengglong");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Alat musik dari Jawa Barat lainnya yaitu Jengglong. Alat musik ini memiliki bentuk yang unik, karna disusun dan diikatkan dengan tali dimana Jengglong dibuat dari kuningan atau tembaga yang dimainkan dengan cara dipukul.\n" +
                "\n" +
                "Untuk memainkannya pun perlu menggunakan alat pukul khusus biasanya alat pukul ini dilapisi dengan rajutan dari bahan dasar wol sehingga suara yang dihasilkan lebih lembut.");
        values.put("link", "https://www.youtube.com/watch?v=5woU2Ur4-Z0&ab_channel=OpenLearnfromTheOpenUniversity");
        values.put("img", R.drawable.imv_alatmusik_jengglong);
        db.insert("budaya", "_id", values);

        values.put("_id", "20");
        values.put("nama", "Jentreng");
        values.put("kategori", "Alat Musik");
        values.put("deskripsi", "Jentreng alat musik tradisional khas Jawa Barat sekilas mirip dengan kecapi. Namun, sebenarnya jentreng sangat berbeda dengan kecapi karna ukuran jentreng lebih kecil dibandingkan kecapi. Alat musik ini dimainkan dengan cara dipetik dan memiliki 7 buah senar.");
        values.put("link", "https://www.youtube.com/watch?v=crawrwhK8YE&ab_channel=lpsnjakarta");
        values.put("img", R.drawable.imv_alatmusik_jentreng);
        db.insert("budaya", "_id", values);

        // Alat dapur Sunda
        values.put("_id", "21");
        values.put("nama", "Boboko/sangku");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Boboko adalah tempat menyimpan nasi, atau tempat menyuci beras (ngisikan) sebelum dimasak. Boboko (sangku) terbuat dari anyaman bambu atasnya bulat dan bawahnya berbentuk persegi, yang diberi kaki dari kayu atau bambu.");
        values.put("link", "https://www.youtube.com/watch?v=-YVP547hFKA&ab_channel=jejaksiRamoz");
        values.put("img", R.drawable.imv_alatdapur_boboko);
        db.insert("budaya", "_id", values);

        values.put("_id", "22");
        values.put("nama", "Tolombong");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Tolombong adalah wadah berbentuk bundar seperti boboko dengan alas bagian bawah agak persegi. Tolombong merupakan wadah serbaguna, bisa digunakan untuk menyimpan lalapan seperti cabe, terong, dan lain-lain.");
        values.put("link", "https://www.youtube.com/watch?v=_dNUkTgH_IE&ab_channel=JuraganAnyaman");
        values.put("img", R.drawable.imv_alatdapur_tolombong);
        db.insert("budaya", "_id", values);

        values.put("_id", "23");
        values.put("nama", "Aseupan");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Aseupan bentuknya kerucut terbuat dari anyaman bambu, biasanya digunakan untuk menanak nasi yang diletakan diatas seeng. Dengan posisi bagian yang runcing berada dibawah, beras yang telah dicuci akan dimasukkan kedalam aseupan tersebut.");
        values.put("link", "https://www.youtube.com/watch?v=jCZgq8SmCAA&ab_channel=SundaBerkarya");
        values.put("img", R.drawable.imv_alatdapur_aseupan);
        db.insert("budaya", "_id", values);

        values.put("_id", "24");
        values.put("nama", "Hihid");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Hihid adalah kipas berbentuk persegi yang terbuat dari anyaman bambu, mempunyai pegangan yang terbuat dari batang bambu. Digunakan untuk mendinginkan nasi panas yang baru diambil dari aseupan. Selain itu dapat juga dipakai untuk mengipasi bara arang.");
        values.put("link", "https://www.youtube.com/watch?v=6PnwVB_6LlA&ab_channel=SundaBerkarya");
        values.put("img", R.drawable.imv_alatdapur_hihid);
        db.insert("budaya", "_id", values);

        values.put("_id", "25");
        values.put("nama", "Seeng");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Seeng terbuat dari kuningan, alumunium, atau seng, digunakan untuk menanak nasi dengan cara mengukusnya didalam aseupan.");
        values.put("link", "https://www.youtube.com/watch?v=QPCcfGtKsMQ&ab_channel=KotaSubang");
        values.put("img", R.drawable.imv_alatdapur_seeng);
        db.insert("budaya", "_id", values);

        values.put("_id", "26");
        values.put("nama", "Katel");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Katel terbuat dari alumunium, biasanya digunakan untuk menggoreng atau membuat sayur dan masak-memasak lainnya.");
        values.put("link", "https://www.youtube.com/watch?v=v82-9F_s3Yo&ab_channel=PoponPatimah");
        values.put("img", R.drawable.imv_alatdapur_katel);
        db.insert("budaya", "_id", values);

        values.put("_id", "27");
        values.put("nama", "Kastrol");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Digunakan untuk membuat nasi liwet.");
        values.put("link", "https://www.youtube.com/watch?v=gDpeC16tRvE&ab_channel=BadrudinMuhsin");
        values.put("img", R.drawable.imv_alatdapur_kastrol);
        db.insert("budaya", "_id", values);

        values.put("_id", "28");
        values.put("nama", "Cungkir");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Digunakan untuk membolak-balik gorengan atau mengocek sayuran.");
        values.put("link", "https://www.youtube.com/watch?v=euLpdUjnNTI&ab_channel=MAMAINA");
        values.put("img", R.drawable.imv_alatdapur_cungkir);
        db.insert("budaya", "_id", values);

        values.put("_id", "29");
        values.put("nama", "Centong");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Digunakan untuk menyiduk sayuran.");
        values.put("link", "https://www.youtube.com/watch?v=BhTxneeanqQ&ab_channel=YoncaOfficial");
        values.put("img", R.drawable.imv_alatdapur_centong);
        db.insert("budaya", "_id", values);

        values.put("_id", "30");
        values.put("nama", "Songsong");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Terbuat dari ujung bambu, yang dipotong antara bukunya. Songsong digunakan untuk meniup api dalam perapian (hawu) jika apinya padam.");
        values.put("link", "https://www.youtube.com/watch?v=TUz9GJckhrs&ab_channel=MEGALUHTV");
        values.put("img", R.drawable.imv_alatdapur_songsong);
        db.insert("budaya", "_id", values);

        values.put("_id", "31");
        values.put("nama", "Hawu");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Terbuat dari tanah liat yang dibentuk kotak dengan tinggi kira-kira 30-35 cm. Tungku (hawu) tersebut memiliki fungsi sebagai tempat memasak (kompor) dengan bahan bakar kayu.");
        values.put("link", "https://www.youtube.com/watch?v=h-CWzCa5QeE&ab_channel=GarutTurunanKidul");
        values.put("img", R.drawable.imv_alatdapur_hawu);
        db.insert("budaya", "_id", values);

        values.put("_id", "32");
        values.put("nama", "Ayakan");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Terbuat dari anyaman bambu, tetapi tidak rapat (sepertiram). Ukurannya bervariasi, dari yang diameternya 30cm hingga 90cm. Ayakan biasanya digunakan sebagai tempat menyimpan sayuran yang masih mentah atau untuk menjemur makanan hingga kering dan siap untuk dimakan.");
        values.put("link", "https://www.youtube.com/watch?v=VM8Se93HseE&ab_channel=PutraAquarius");
        values.put("img", R.drawable.imv_alatdapur_ayakan);
        db.insert("budaya", "_id", values);

        values.put("_id", "33");
        values.put("nama", "Jodang");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Bentuknya seperti ayakan namun ukurannya lebih besar dan biasanya digunakan untuk menjemur makanan seperti opak, kerupuk, rangginang, ranggining, dan lain-lain.");
        values.put("link", "https://www.youtube.com/watch?v=k2P1DhHBYV4&ab_channel=RinagustinaChannel");
        values.put("img", R.drawable.imv_alatdapur_jodang);
        db.insert("budaya", "_id", values);

        values.put("_id", "34");
        values.put("nama", "Nyiru");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Terbuat dari anyaman bambu dan bentuknya bulat, biasanya digunakan untuk membersihkan kotoran pada beras atau kacang yang akan dimasak.\n"+
                "\n"+
                "Cara menggunakannya adalah dengan meletakkan kacang atau beras diatas nyiru. Kemudian, kedua jari tangan memegang tepian nyiru. Setelah itu, nyiru diangkat-angkat agar beras atau kacang tadi memantul ke atas dan turun lagi ke bawah. Pada saat yang bersamaan angin akan meniup kulit beras atau kulit kacang terlepas dari butirannya dan meninggalkan nyiru. Namun demikian, jika tidak ada angin maka kita dapat meniupnya dengan mulut kita, untuk membersihkan benda-benda kecil yang masih ada. Untuk membersihkan batu-batu kecil dari butiran beras atau kacang dapat menggunakan jari tangan secara langsung.");
        values.put("link", "https://www.youtube.com/watch?v=xBCYdKdl3xA&ab_channel=SundaBerkarya");
        values.put("img", R.drawable.imv_alatdapur_nyiru);
        db.insert("budaya", "_id", values);

        values.put("_id", "35");
        values.put("nama", "Dulang");
        values.put("kategori", "Alat Dapur");
        values.put("deskripsi", "Terbuat dari batang kayu yang dilubangi semakin kecil ke bawah semakin kecil, biasanya buat menumpuk opak, atau bikin tepung beras.");
        values.put("link", "https://www.youtube.com/watch?v=OePQvGx7k_Q&ab_channel=HADEHATEVlog");
        values.put("img", R.drawable.imv_alatdapur_dulang);
        db.insert("budaya", "_id", values);

        // Alat Pertanian
        values.put("_id", "36");
        values.put("nama", "Huluku");
        values.put("kategori", "Alat Pertanian");
        values.put("deskripsi", "Alat untuk membajak sawah terbuat dari kayu, biasanya untuk membolak-balikan tanah yang ditarik oleh sapi/kerbau.");
        values.put("link", "https://www.youtube.com/watch?v=W61adF9WDoQ&ab_channel=TERASID");
        values.put("img", R.drawable.imv_alatpertanian_huluku);
        db.insert("budaya", "_id", values);

        values.put("_id", "37");
        values.put("nama", "Garu");
        values.put("kategori", "Alat Pertanian");
        values.put("deskripsi", "Alat membajak sawah, terbuat dari kayu dan bambu. Pada bagian kayu bentuknya balok panjang yang diberi gigi, biasanya digunakan untuk meratakan tanah setelah dihuluku dan ditarik oleh sapi/kerbau.");
        values.put("link", "https://www.youtube.com/watch?v=CE47GkUyZVs&ab_channel=Srifat");
        values.put("img", R.drawable.imv_alatpertanian_garu);
        db.insert("budaya", "_id", values);

        values.put("_id", "38");
        values.put("nama", "Pacul/Cangkul");
        values.put("kategori", "Alat Pertanian");
        values.put("deskripsi", "Gunanya untuk membolak-balikkan tanah atau membuat pematang sawah (ngagaleunganan), terbuat dari besi dan diberi gagang dari kayu. Panjang gagangnya kira-kira 90cm.");
        values.put("link", "https://www.youtube.com/watch?v=AQntqmtV9FY&ab_channel=BOWASTVCHANNEL");
        values.put("img", R.drawable.imv_alatpertanian_pacul);
        db.insert("budaya", "_id", values);

        values.put("_id", "39");
        values.put("nama", "Lencong");
        values.put("kategori", "Alat Pertanian");
        values.put("deskripsi", "Bentuknya seperti garpu untuk makan, terbuat dari besi, untuk membalikkan tanah dan biasanya digunakan di lahan perkebunan.");
        values.put("link", "https://www.youtube.com/watch?v=66QAXxGJ9OU&ab_channel=Themus");
        values.put("img", R.drawable.imv_alatpertanian_lencong);
        db.insert("budaya", "_id", values);

        values.put("_id", "40");
        values.put("nama", "Sabit");
        values.put("kategori", "Alat Pertanian");
        values.put("deskripsi", "Biasanya digunakan untuk memotong padi, atau memotong rumput.");
        values.put("link", "https://www.youtube.com/watch?v=dLd51_WPefY&ab_channel=Parijowo");
        values.put("img", R.drawable.imv_alatpertanian_sabit);
        db.insert("budaya", "_id", values);

        values.put("_id", "41");
        values.put("nama", "Bengkong/Congkrang");
        values.put("kategori", "Alat Pertanian");
        values.put("deskripsi", "Untuk membersihkan rumput atau membabat rumput. Bentuknya seperti sabit.");
        values.put("link", "https://www.youtube.com/watch?v=D_-Rpk8SB_s&ab_channel=KangAipChannel");
        values.put("img", R.drawable.imv_alatpertanian_bengkong);
        db.insert("budaya", "_id", values);

        // Adat nikah
        values.put("_id", "42");
        values.put("nama", "Nendeun Omong");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Yaitu pembicaraan orangtua atau utusan pihak laki-laki yang berniat mempersunting seseorang gadis. Pihak orangtua laki-laki biasanya bertamu kepada calon besan (pihak orangtua perempuan). Berbincang dalam suasana santai penuh canda tawa, sambil sesekali diselingi pertanyaan yang bersifat menyelidiki status anak perempuannya apakah sudah ada yang melamar atau belum (belum punya pacar).\n" +
                "\n" +
                "Pihak orangtua (calon besan) pun demikian dalam menjawabnya penuh dengan banyolan dan siloka.\n"+
                "\n"+
                "Walaupun sudah sepakat di antara kedua orangtua itu, pada zaman dahulu kadang-kadang anak-anak mereka tidak tahu.\n"+
                "\n"+
                "Di beberapa daerah wilayah pasundan, kadang-kadang ada yang menggunakan cara dengan saling mengirim barang tertentu. Seperti orangtua anak laki-laki megirim rokok cerutu dan orangtua anak perempuan mengerti dengan maksud itu. Apabila mereka setuju akan segera membalasnya dengan mengirimkan benih labu siam (binih waluh siam). Dengan demikian, anak perempuannya itu sudah menyimpan ucapan anak laki-laki yang mendekatinya itu atau istilah Sundanya diteundeunan omong.");
        values.put("link", "https://www.youtube.com/watch?v=O4q--Syznrc&ab_channel=RuangDunia");
        values.put("img", R.drawable.imv_adatpernikahan_nendeunomong);
        db.insert("budaya", "_id", values);

        values.put("_id", "43");
        values.put("nama", "Lamaran");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Tahap melamar atau meminang ini sebagai tindak lanjut dari tahap pertama. Proses ini dilakukan orangtua calon pengantin dan keluarga dekat. Hampir mirip dengan yang pertama, bedanya dalam lamaran, orangtua laki-laki biasanya mendatangi calon besannya dengan membawa makanan atau bingkisan seadanya, memabawa lamareun sebagai simbol pengikat (pameungkeut), bisa berupa uang, seperangkat pakaian, semacam cincin pertunangan, sirih pinang komplit dan lainnya, sebagai tali pengikat kepada calon pengantin perempuannya. Selanjutnya, kedua pihak mulai membicarakan waktu dan hari yang baik untuk melangsungkan pernikahan.");
        values.put("link", "https://www.youtube.com/watch?v=HskZ-g9c1dc&ab_channel=PakAdeFamilyTV");
        values.put("img", R.drawable.imv_adatpernikahan_lamaran);
        db.insert("budaya", "_id", values);

        values.put("_id", "44");
        values.put("nama", "Tunangan");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Dilakukan tradisi 'patuker beubeur tameuh', yaitu penyerahan ikat pinggang warna pelangi atau polos kepada si gadis.");
        values.put("link", "https://www.youtube.com/watch?v=BwaGKe-ckuw&ab_channel=DesaMulyasari");
        values.put("img", R.drawable.imv_adatpernikahan_tunangan);
        db.insert("budaya", "_id", values);

        values.put("_id", "45");
        values.put("nama", "Seserahan");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Biasanya dilakukan pihak calon pengantin laki-laki membawa uang, pakaian, perabot rumah tangga, perabot dapur, makanan dan lain-lain.\n"+
                "\n"+
                "Seminggu atau 3 hari menjelang peresmian pernikahan, yaitu ngebakan atau siraman. Berupa acara memandikan calon pengantin agar bersih lahir dan batin, acara berlangsung siang hari di kediaman masing-masing calon mempelai. Bagi umat muslim, acara ini terlebih dahulu diawali dengan pengajian.");
        values.put("link", "https://www.youtube.com/watch?v=5M8V65agwUA&ab_channel=Tikichanel");
        values.put("img", R.drawable.imv_adatpernikahan_seserahan);
        db.insert("budaya", "_id", values);

        values.put("_id", "46");
        values.put("nama", "Ngeuyeuk Seureuh");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Jika acara ngeuyeuk seureuh tidak dilakukan maka seserahan dilaksanakan sesaat sebelum akad nikah.\n"+
                "\n"+
                "Falsafah hidup orang Sunda senantiasa dilandasi oleh tiga sifat utama, yakni silih asih, silih asuh, dan silih asah atau secara literal diartikan sebagai saling menyayangi, saling menjaga, mengajari. Ketiga sifat itu selalu tampak dalam berbagai upacara adat atau ritual terutama acara ngeuyeuk seureuh. Diharapkan kedua calon pengantin bisa mengamalkan sevuah pribahasa kawas gula jeung peuet (bagaikan gula dengan nira yang sudah matang) artinya hidup yang rukun, saling menyayangi, dan sedapat mungkin menghindari perselisihan.");
        values.put("link", "https://www.youtube.com/watch?v=WaQRHsb1c4Y&ab_channel=RiniWiedy");
        values.put("img", R.drawable.imv_adatpernikahan_ngeuyeukseureuh);
        db.insert("budaya", "_id", values);

        values.put("_id", "47");
        values.put("nama", "Meuleum Harupat");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Mempelai laki-laki memegang batang harupat, pengantin perempuan membakar dengan lilin sampai menyala. Harupat yang sudah menyala kemudian dimasukan kedalam kendi yang dipegang mempelai perempuan, diangkat kembali dan dipatahkan lalu dibuang jauh-jauh. Melambangkan nasihat kepada kedua mempelai untuk senantiasa bersama dalam memecahkan persoalan dalam rumah tangga. Fungsi istri dengan memegang kendi berisi air adalah untuk mendinginkan setiap persoalan yang membuat pikiran dan hati suami menjadi nyaman.");
        values.put("link", "https://www.youtube.com/watch?v=SraHeT9FW2w&ab_channel=xiatshuchannel");
        values.put("img", R.drawable.imv_adatpernikahan_meuleumharupat);
        db.insert("budaya", "_id", values);

        values.put("_id", "48");
        values.put("nama", "Buka Pintu");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Diawali mengetuk pintu tiga kali. Diadakan tanya jawab dengan pantun bersahutan dari dalam dan luar pintu rumah. Setelah kalimat syahadat dibacakan, pintu dibuka. Pengantin masuk menuju pelaminan. Dialog pengantin perempuan dengan penganti laki-laki seperti berikut ini : \n"+
                "\n"+
                "Kentar Bayubud\n"+
                "Istri : Saha eta anu kumawani, Tanya tata taya bemakrama, Ketrak ketrok kana panto.\n"+
                "Laki-laki : Geuning bet jadi kitu, Api-api kawas nu pangling, Apan ieu teh engkang, Hayang geura tepung, Tambah teu kuat ku era, Da di luar seueur tamu nu ningali.\n"+
                "Istri : Euleuh karah panutan.");
        values.put("link", "https://www.youtube.com/watch?v=eJTrGgBICxI&ab_channel=KENstudio");
        values.put("img", R.drawable.imv_adatpernikahan_bukapintu);
        db.insert("budaya", "_id", values);

        values.put("_id", "49");
        values.put("nama", "Nincak Endog");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Dalam upacara ini mempelai laki-laki menginjak telur di baki papan dan elekan (batang bambu muda), kemudian mempelai perempuan mencuci kaki mempelai laki-laki dengan air di kendi, mengelapnya sampai kering lalu kendi dipecahkan berdua. Melambangkan pengabdian istri kepada suami yang dimulai dari hari itu.  ");
        values.put("link", "https://www.youtube.com/watch?v=4E1rP_1mRY8&ab_channel=OfficialProMediaProduction");
        values.put("img", R.drawable.imv_adatpernikahan_nincakendog);
        db.insert("budaya", "_id", values);

        values.put("_id", "50");
        values.put("nama", "Ngalepas Japati");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Ibunda dari kedua mempelai berjalan keluar sambil masing-masing membawa burung merpati yang kemudian dilepaskan terbang dihalaman. Melambangkan bahwa peran orang tua sudah berakhir hari itu karena kedua anak mereka telah mandiri dan memiliki keluarga sendiri.");
        values.put("link", "https://www.youtube.com/watch?v=8eEieACBtRU&ab_channel=OfficialProMediaProduction");
        values.put("img", R.drawable.imv_adatpernikahan_ngalepasjapati);
        db.insert("budaya", "_id", values);

        values.put("_id", "51");
        values.put("nama", "Huap Lingkung");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Pasangan mempelai disuapi oleh kedua orang tua.Dimulai oleh para ibunda yang dilanjutkan oleh kedua ayahanda. Selanjutnya, kedua mem[elai saling menyuapi, tersedia 7 (tujuh) bulatan nasi punar (nasi ketan kuning) di atas piring. Saling menyuap melalui bahu masing-masing, kemudian satu bulatan diperebutkan keduanya untuk kemudian dibelah dua dan disuapkan kepda pasangan.\n"+
                "\n"+
                "Melambangkan suapan terakhir dari orangtua karena setelah berkeluarga, kedua anak mereka harus mencari sumber keburuhan hidup sendiri dan juga menandakan bahwa kasih sayang kedua orangtua terhadap anak dan menantu itu sama besarnya.");
        values.put("link", "https://www.youtube.com/watch?v=ElLkMNdoMZM&ab_channel=PurnamaProduction");
        values.put("img", R.drawable.imv_adatpernikahan_huaplingkung);
        db.insert("budaya", "_id", values);

        values.put("_id", "52");
        values.put("nama", "Pabetot Bakakak");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Kedua mempelai duduk berhadapan sambil tangan kanan mereka memegang kedua paha ayam bakakak di atas meja, kemudian pemandu acara memberi aba-aba, kedua mempelai serentak menarik bakakak ayam tersebut hingga terbelah. Yang mendapat bagian terbesar, harus membagi dengan pasangannya dengan cara digigit bersama. Melambangkan bahwa berapapun rejeki yang didapat, harus dibagi berdua dan dinikmati bersama.");
        values.put("link", "https://www.youtube.com/watch?v=cHDtGEPqx9U&ab_channel=LiaMaryani");
        values.put("img", R.drawable.imv_adatpernikahan_pabetotbakakak);
        db.insert("budaya", "_id", values);

        values.put("_id", "53");
        values.put("nama", "Numbas");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara numbas biasa dilaksanakan satu minggu setelah akad nikah. Upacara numbas mengandung maksud untuk memberitahu kepada keluarga dan tetangga bahwa pengantin perempuan'tidak mengecewakan' pengantin laki-laki. Upacara numbas dilakukan dengan cara membagi-baikan nasi kuning.");
        values.put("link", "https://www.youtube.com/watch?v=d0VzOjqBTe8&ab_channel=AhmadBadawiAladzkaStudio");
        values.put("img", R.drawable.imv_adatpernikahan_numbas);
        db.insert("budaya", "_id", values);

        // Permainan Tradisional
        values.put("_id", "54");
        values.put("nama", "Beklen");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan yang dilakukan oleh beberapa anak perempuan di tempat yang keras dan rata. Alat yang digunakan adalah bola beklen dan kuwuk sebanyak 10-12 biji. Untuk menentukan siapa anak yang akan main pertama, diadakan undian dengan cara suten atau hompimpah. Apabila yang pertama kali main lasut (gagal) maka permainan dilanjutkan oleh pemain kedua, dan seterusnya. \n"+
                "\n" +
                "Cara bermainnya, pertama menaburkan biji-bijian yang diupayakan supaya tidak terpencar berjauhan tapi juga tidak berhimpitan. Kemudian, si anak melambungkan bolanya ke atas. Sewaktu bola melambung ke atas, si anak mengambil biji-bijian yang terserak tersebut. Pengambilan biji satu-satu disebut mihiji. Apabila dapat menyelesaikan mihiji, dilanjutkan dengan midua (mengambil biji dua-dua dan seterusnya sampai pengambilan semua biji yang dimainkan sekaligus). Jika biji tidak terambil, bola tidak tertangkap, atau gudir (menyentuh biji yang belum waktunya diambil) maka dinyatakan lasut dan permainan diganti oleh anak berikutnya.");
        values.put("link", "https://www.youtube.com/watch?v=nMtHVs5UnuU&ab_channel=KLAIndonesia");
        values.put("img", R.drawable.imv_permainantradisional_beklen);
        db.insert("budaya", "_id", values);

        values.put("_id", "55");
        values.put("nama", "Congklak");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan congklak sering dimainkan anak-anak perempuan. Bentuk alat permainan congklak ini seperti perahu kecil yang memiliki 16 lekukan bundar sebagai tempat 98 biji atau kuwuk. Alat ini disebut juga congklak, daku, atau dakon. Badan congklak mempunyai 16 lekukan bundar. Lekukan kecil terdiri dari 14 buah yang dijadikan 2 deretan, masing-masing disebut anak. Kemudian 2 buah lekukan besar tersebut indung (induk) yang terletak di bagian tengah di sebelah kiri dari masing-masing deretan. \n"+
                "\n"+
                "Cara memajukannya sebagai berikut. Masukkan biji kuwuk ke dalam lubang masing-masing diisi 7 biji kuwuk (kecuali 2 lekukan indung dikosongkan). Permainan dilakukan oleh dua orang berhadapan. Masing-masing mempunyai 7 lekukan anak dengan 1 lekukan indung yang terletak di sebelah kirinya.\n"+
                "\n"+
                "Untuk menentukan siapa yang dahulu bermain, diadakan undian dengan cara suten. Kemudian, si pemenang suten memulai permainan, dengan mengambil kuwuk dari salah satu lekukan anak yang dimilikinya lalu dibagikan ke setiap lekukan dan indung (kecuali indung lawan) secara merata. Jika kuwuk terakhir jatuh pada lekukan yang kosong maka si pemain harus berhenti sebab dianggap mati. Jika mati ditempat lekukan miliknya dan kebetulan lekukan di hadapannya (milik musuhnya) berisi kuwuk-kuwuk maka kuwuk milik musuhnya itu menjadi haknya dan disimpan di induknya. Kejadian itu disebut nembak.\n"+
                "\n"+
                "Permainan selesai jika semua kuwuk yang semula terdapat di lekukan anak, pindah ke lekukan induk masing-masing. Yang mendapat kuwuk lebih banyak menjadi pemenang. Jika permainan akan diteruskan maka kuwuk itu dibagi-bagikan lagi pada lekukan-lekukan anaknya masing-masing. Yang jumlah kuwuknya kurang, harus menutup lekukan yang tidak kebagian kuwuk yang dianggap pecak(buta). Yang menang mendapat giliran pertama untuk membagikan kuwuk. Lekukan yang pecak harus dilewati (tidak diisi). Permainan selesai jika salah seorang tidak sanggup lagi meneruskan permainan karena kuwuknya kurang dari 7.");
        values.put("link", "https://www.youtube.com/watch?v=brYTyuPPPe0&ab_channel=EXPLOSIVIECLASS");
        values.put("img", R.drawable.imv_permainantradisional_congklak);
        db.insert("budaya", "_id", values);

        values.put("_id", "56");
        values.put("nama", "Gatrik");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan gatrik ini juga disebut gatok lele (tokle). Permainan anak-anak ini menggunakan dua potong bambu, satu panjang dan satu lagi pendek. Bambu pendek berukuran 10-12 cm dan yang panjang 30-37 cm, biasanya diameter 1-2 cm. Perlengkapan lainnya adalah 2 buah bata yang dipasang sejajar dengan jarak antara 7-10 cm, tempat menaruh keratan bambu pendek jika hendak main.\n"+
                "\n"+
                "Permainan dimulai setelah melakukan suten. Yang menang meletakkan bambu pendek diatas bata, mencungkilnya dengan bambu panjang agar terlempar sejauh mungkin. Yang kalah berusaha menangkap bambu pendek itu. Jika berhasil menangkapnya, ia memperoleh nilai 10. Jika tidak, ia harus melemparkan bambu pendek itu ke arah sepasang bata itu, jika bata itu tersenggol oleh bambu itu maka ia menjadi pemain, sedangkan musuhnya menjadi penjaga. Jika tidak terjadi penggantian pemain, si pemain melemparkan bambu pendek yang harus dipukul sekeras-kerasnya dengan bambu panjang agar jatuh sejauh mungkin. Jika tertangkap, si penjaga memperoleh angka 25. Apabila tidak tertangkap, si penjaga harus melemparkannya ke arah bata. Kalau lemparan bisa masuk celah bata itu, ia dapat nilai lagi 10. Jika si pemain berhasil memukul balik bambu pendek itu sebelum jatuh ke bawah tanah, si pemain mendapat nilai sejumlah hitungan jarak dari bata ke tempat jatuhnya bambu yang diukur dengan bambu panjang. Misalnya saja jauhnya 50 kali dari panjang bambu, berarti ia mendapat nilai 50.\n"+
                "\n"+
                "Permainan dilanjutkan dengan gatok lele, yaitu si pemain mencungkil dan memukul bambu pendek dengan bambu panjang agar jatuh sejauh mungkin. Jika si penjaga bisa menangkapnya, ia memperoleh nilai 25. Jika tidak maka si pemain berhak mengumpulkan nilai dengan mengukur jarak jatuhnya bambu. Jika sebelum dipukul jauh, bambu itu dipukul pelan dulu beberapa kali, asal tidak jatuh ke tanah, maka hitungan pendapatan si pemain jadi berlipat. Jika dipukul dua kali, lipat dua, kalau tiga kali lipat tiga, dan seterusnya.\n"+
                "\n"+
                "Sebab itu gatok lele merupakan kesempatan meraup angka bagi si pemain. Jumlah angka ini sudah ditetapkan batasnya, 200 atau 250. Jika batas itu telah tercapai, maka permainan selesai. Yang paling dahulu mencapai angka itu keluar sebagai pemenang.");
        values.put("link", "https://www.youtube.com/watch?v=in4rjupL1jM&ab_channel=saungkaul79");
        values.put("img", R.drawable.imv_permainantradisional_gatrik);
        db.insert("budaya", "_id", values);

        values.put("_id", "57");
        values.put("nama", "Hahayaman");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan anak-anak, menggambarkan seekor ayam yang dikejar oleh seekor musang dengan penjaga kandang dalam bentuk lingkaran. Penentuan anak yang menjadi ayam dan musang dilakukan dengan diundi. Anak-anak lain berpegangan untuk membentuk lingkaran sebagai penjaga kandang. Ayam berupaya jangan sampai tertangkap oleh musang. Musang sebaliknya terus mengejar mau menerkam ayam. Anak-anak lain yang menjadi penjaga kandang berusaha sekuat tenaga agar jangan sampai jebol oleh musang. Apabila musang dapat menjebolnya ayam berusaha cepat keluar dan sebaliknya.\n"+
                "\n"+
                "Permainan selesai jika ayam tertangkap oleh musang atau musang merasa lelah karena tidak dapat menangkap ayam. Jika ayam tertangkap musang maka musang dianggap menang. Sebaliknya jika ayam tidak tertangkap, maka ayam dinyatakan menang.");
        values.put("link", "https://www.youtube.com/watch?v=xkb4y9C9THc&ab_channel=AsepZaenalaripin");
        values.put("img", R.drawable.imv_permainantradisional_hahayaman);
        db.insert("budaya", "_id", values);

        values.put("_id", "58");
        values.put("nama", "Kobak");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan anak-anak yang mempergunakan uang logam (benggol) atau benda bulat lainnya. Pemain terdiri dari anak-anak usia 7-12 tahun dengan jumlah pemain 2-5 orang.\n"+
                "\n"+
                "Sebelum bermain, mereka terlebih dahulu membuat kobak (lubang) dangkal dan membuat garis pelemparan yang berjarak antara 3-5 meter dari lubang, kemudian mengadakan undian untuk menentukan siapa yang akan bermain terlebih dahulu. Caranya cukup dengan melemparkan benggol atau gundu ke arah lubang. Anak yang dapat memasukkan uang ke lubang, dialah yang pertama bermain. Kalau tidak ada yang dapat memasukkan uang ke lubang maka dipilih benggol yang paling dekat ke lubang. Jika ada dua orang atau lebih yang berhasil memasukkan maka diundi lagi dengan cara yang sama.\n"+
                "\n"+
                "Cara bermainnya, bagi anak yang mendapat giliran, berusaha untuk memasukkan uang logam lawan-lawannya ke dalam lubang, Apabila uang itu masuk, dialah pemenangnya dan benggol atau gundu milik musuhnya harus ditebus oleh uang atau benda lainnya sesuai dengan perjanjian. Tetapi jika gagal memasukkannya, ia digantikan oleh pemain berikutnya.");
        values.put("link", "https://www.youtube.com/watch?v=WF7rS4fsYCk&ab_channel=PenikmatGarut");
        values.put("img", R.drawable.imv_permainantradisional_kobak);
        db.insert("budaya", "_id", values);

        values.put("_id", "59");
        values.put("nama", "Bebentengan");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan ini dapat dilakukan oleh anak laki-laki atau perempuan sebanyak 16-24 oran. Tempat yang digunakan harus luas dengan ukuran kira-kira 10 x 5 meter persegi sehingga dapat bermain leluasa. Adapun alat yang diperlukan, yaitu beberapa buah bata/batu sebagai bentengnya.\n"+
                "\n"+
                "Secara edukatif permainan ini sangat baik bagi perkembangan bakat dan pertumbuhan jasmani anak-anak karena dapat melatih kelincahan dan kecepatan lari, juga melatih strategi.");
        values.put("link", "https://www.youtube.com/watch?v=aiRbiHxJezo&ab_channel=JakartaTourism");
        values.put("img", R.drawable.imv_permainantradisional_bebentengan);
        db.insert("budaya", "_id", values);

        values.put("_id", "60");
        values.put("nama", "Oray-orayan");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan ini dapat dimainkan beberapa anak perempuan ataupun laki-laki di lapangan terbuka. Caranya para pemain saling memegang ujung baju bagian belakang teman di depannya untuk membentuk barisan panjang. Pemain terdepan berusaha menangkap pemain yang paling belakang yang akan menghindar, sehingga barisan bergerak-meliuk-liuk seperti ular, tetapi barisan itu tidak boleh terputus. Sambil bermain, pemain, melantunkan kawih.\n"+
                "\n"+
                "Oray-orayan luar-leor mapay sawah\n"+
                "Tong ka sawah parena keur sedeng beukah\n"+
                "Oray-orayan luar-leor mapay sawah\n"+
                "Tong ka leuwi di leuwi loba nu mandi\n"+
                "Oray-orayan\n"+
                "Oray naon\n"+
                "Oray bungka\n"+
                "Bungka naon\n"+
                "Bungka laut\n"+
                "Laut naon\n"+
                "Laut dipa\n"+
                "Dipa naon\n"+
                "Di pandeuri..ri..ri..ri");
        values.put("link", "https://www.youtube.com/watch?v=0gmE2B8s45o&ab_channel=AbahMayana");
        values.put("img", R.drawable.imv_permainantradisional_orayorayan);
        db.insert("budaya", "_id", values);

        values.put("_id", "61");
        values.put("nama", "Paciwit-ciwit lutung");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan ini dilakukan oleh 3-4 orang anak, baik anak perempuan maupun laki-laki. Setiap pemain berusaha saling mendahului mencubit (nyiwit) punggung tangan di urutan teratas sambil melantunkan kawih (nyanyian) sebagai berikut : \n"+
                "\n"+
                "Paciwit-ciwit lutung, Si lutung pindah ka tungtung, Paciwit-ciwit lutung, Si lutung pindah ka tungtung. Pada umumnya, tidak ada pihak yang dinyatakan menang atau kalah. Jadi jenis permainan ini semata-mata dilakukan hanya untuk bersenang-senang.");
        values.put("link", "https://www.youtube.com/watch?v=BhIntT7IHe4&ab_channel=ChannelkhangMaul");
        values.put("img", R.drawable.imv_permainantradisional_paciwit2lutung);
        db.insert("budaya", "_id", values);

        values.put("_id", "62");
        values.put("nama", "Perepet Jengkol");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan ini dilakukan oleh 3-4 anak laki-laki atau perempuan. Pemain berdiri saling membelakangi, berpegangan tangan, dan salah satu kaki saling berkaitan di arah belakang. Dengan berdiri sebelah kaki, pemain harus menjaga keseimbangannya agar tidak terjatuh, sambil bergerak berputar ke arah kiri atau kanan menuruti aba-aba si 'dalang', yang bertepuk tangan sambil melantunkan kawih. Perepet jengkol jajahean..., Kadempet kohkol jejeretean...\n"+
                "\n"+
                "Tidak ada pihak yang dinyatakan menang atau kalah dalam permainan ini. Jadi, jenis permainan ini hanya dimainkan untuk bersenang-senang pada saat terang bulan.");
        values.put("link", "https://www.youtube.com/watch?v=Edspi6l08Y4&ab_channel=GuruIzarChannel");
        values.put("img", R.drawable.imv_permainantradisional_perepetjengkol);
        db.insert("budaya", "_id", values);

        values.put("_id", "63");
        values.put("nama", "Sondah/engklek/pecle");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan ini pada umumnya dimainkan oleh anak-anak perempuan. Pola gambar berbentuk kotak-kotak berpalang dibuat di tanah. Setiap pemain memegang sepotong pecahan genting atau batu pipih, yang kemudian dilemparkan ke dalam kotak permainan. Pemain melompat-lompat dari kotak ke kotak berikutnya. Kotak yang berisi pecahan genting tidak boleh diinjak. Pemain yang dinyatakan kalah jika menginjak garis kotak atau bagian luar kotak. Pemain pertama disebut mi-hiji, kedua mi-dua, ketiga mi-tilu, dan seterusnya.");
        values.put("link", "https://www.youtube.com/watch?v=MPMjv1TPyaY&ab_channel=SEKOLAHDASARFRANSISKUS2");
        values.put("img", R.drawable.imv_permainantradisional_sondah);
        db.insert("budaya", "_id", values);

        values.put("_id", "64");
        values.put("nama", "Encrak");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Encrak salah satu permainan anak Sunda yang biasanya dimainkan oleh perempuan. Jumlah pemainnya 2 sampai 4 orang, dapat dimainkan berpasangan atau sendiri-sendiri. Adapun alat yang digunakan ialah batu kerikil dengan jumlah bergantung pada keinginan si pemain. Misalkan, pemainnya 4 orang satu orang 20 batu, jadi jumlah batunya 80 biji. Dimainkan dengan cara dilempar ke atas sambil mengambil satu batu di bawah, kemudian batu yang dilempar ditangkap lagi jangan sampai jatuh ke lantai. Jika batu yang ditangkap jatuh berarti gagal maka diganti gilirannya yang lain sampai batu yang di bawahnya atau yang di lantai habis. Bagi yang berhasil mengumpulkan banyak, itulah pemenangnya.");
        values.put("link", "https://www.youtube.com/watch?v=fqzPtGp0dkk&ab_channel=DADANDIDIN");
        values.put("img", R.drawable.imv_permainantradisional_encrak);
        db.insert("budaya", "_id", values);

        values.put("_id", "65");
        values.put("nama", "Bancakan/Ucing Sumput");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan petak umpet ini peralatannya sederhana, hanya memerlukan batu dan genting sebanyak jumlah pemain. Batu dan genting itu disusun bertumpuk pada dua lingkaran yang berdampingan. Selain itu, ada juga yang menggunakan tiang atau pohon sebagai patokan bagi yang menjadi ucing untuk menjaganya.\n"+
                "\n"+
                "Dalam permainan ini, ada yang bertugas sebagai penjaga alias ucing, ada juga yang bersembunyi. Pengundiannya dapat dilakukan dengan hompimpa, suit, atau cing ciripit. Sang kucing bertugas menyusun genteng sebagai bentengnya secara bertumpuk. Di waktu yang sama, pemain yang lain bersembunyi. Ketika susunan genteng sudah berdiri sempurna, kucing mulai menjaga bentengnya agar tidak dirobohkan sambil mencari para pemain. Apabila menemukan pemain yang sedang bersembunyi, kucing harus menyebut nama pemain itu sekaligus menginjak batu sambil berteriak \"BANCAKAN!\" Artinya, persembunyian pemain telah terbongkar dan ia harus keluar dari persembunyiannya. Satu sesi permainan berakhir jika sang kucing berhasil menemukan persembunyian seluruh pemain.\n"+
                "\n"+
                "Dalam versi yang lebih umum, permainan ini cukup dilakukan dengan cara menutup mata sang kucing dan ia harus menghitung sampai angka tertentu. Sambil kucing menghitung, pemain lain bersembunyi. Ketika hitungan sudah selesai, barulah kucing boleh membuka mata dan mencari para pemain.\n");
        values.put("link", "https://www.youtube.com/watch?v=gRoMAN9B1O4&ab_channel=SUNDAGProduction");
        values.put("img", R.drawable.imv_permainantradisional_ucingsumput);
        db.insert("budaya", "_id", values);

        values.put("_id", "66");
        values.put("nama", "Ngadu muncang/kemiri");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Biasanya permainan adu muncang/kemiri dilakukan oleh anak laki-laki ketika sedang musimnya. Cara mengadu muncang/kemiri adalah dua muncang/kemiri diletakkan di atas papan atau tanah, kemudian diapit oleh sebilah bambu terus dipukul sampai ada salah satu muncang/kemiri pecah, dan muncang/kemiri yang masih utuh berarti itulah pemenangnya.");
        values.put("link", "https://www.youtube.com/watch?v=hRLT5DgHCf8&ab_channel=Aida22");
        values.put("img", R.drawable.imv_permainantradisional_adu_muncang);
        db.insert("budaya", "_id", values);

        values.put("_id", "67");
        values.put("nama", "Boy-boyan");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan ini menggunakan pecahan genteng yang disusun dan bola kecil untuk melempar pecahan gentengnya supaya rubuh. Yang bertugas menjaga gentengnya harus melempar bola ke pemain yang lain ke kakinya sampai kena siapa yang kena pertama dia giliran selanjutnya, biasanya dimainkan lebih dari 4 orang.\n"+
                "\n"+
                "Sebelum permainan dimulai anak-anak harus dibagi menjadi 2 tim. Biasanya kedua tim melakukan hompimpa untuk menentukan tim mana yang berhak melempar terlebih dahulu dan tim yang jaga.");
        values.put("link", "https://www.youtube.com/watch?v=0LeORa1KHzg&ab_channel=RahmaCeria");
        values.put("img", R.drawable.imv_permainantradisional_boy2an);
        db.insert("budaya", "_id", values);

        values.put("_id", "68");
        values.put("nama", "Pepeletokan");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Pepeletokan biasanya dimainkan oleh anak bambu yang berukuran kecil yang dipotong laki-laki. Permainan ini menggunakan batang antara bukunya, kemudian diberi gagang dan diisi pelor (peluru). Biasanya peluru yang digunakan adalah dari buah kanyere atau dan kertas yang direndam air.");
        values.put("link", "https://www.youtube.com/watch?v=n_stxBJ7DC8&ab_channel=RizkiArt");
        values.put("img", R.drawable.imv_permainantradisional_bebeletokan);
        db.insert("budaya", "_id", values);

        values.put("_id", "69");
        values.put("nama", "Galah Asin");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan Galah asin biasa dimainkan dihalaman luas, dengan membuat garis-garis seperti yang tertera dalam gambar diatas pemain harus berlari tanpa tersentuh oleh pemain lawan.\n" +
                "\n" +
                "Cara memainkan permainan galah asin; Pemain dibagi menjadi dua tim, satu tim yang biasanya terdiri dari 3-7 (ganjil) berdiri sejajar sesuai garis (kanan-kiri) dengan satu orang melintang dari garis depan sampai belakang.\n" +
                "\n" +
                "Sedangkan tim lainnya berlari masuk ke dalam arena permainan sambil menghindari kejaran dan sentuhan tangan dari pemain lawan, permainan ini mengandalkan kecepatan dan kelincahan pemain.\n" +
                "\n" +
                "Bila salah satu pemain terkena sentuhan dari pemain penjaga, maka permainan berakhir dan kedua tim berganti giliran.");
        values.put("link", "https://www.youtube.com/watch?v=zEvqOK0ANkc&ab_channel=PERMAINANJADUL");
        values.put("img", R.drawable.imv_permainantradisional_galahasin);
        db.insert("budaya", "_id", values);

        values.put("_id", "70");
        values.put("nama", "Jajangkungan");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Permainan egrang ataupun jajangkungan dimainkan dengan sepasang tongkat atau galah, yang terbuat dari kayu atau bambu setinggi 2 hingga 3 sentimeter. Sementara untuk tumpuan atau pijakan kaki ibuat dengan ketinggian 30 60 em dari ujung bawah tongkat. Beberapa orang pemain dapat serentak memainkannya bersama-sama. \n" +
                "\n"+
                "Disejumlah daerah, umumnya permainan dilakukan sebagai adu ketahanan keseimbangan tubuh. Namun didaerah lainnya, perrnalnan egrang ataupun jajangkungan dilakukan sebagai adu ketahanan fisik, strategi, dan konsentrasi karna harus memainkan egrang atau jajangkungan berupaya menjatuhkan lawannya. Dua kelompok pemain sating berpasangan satu lawan satu. Setelah saling berhadapan, pemain satu dengan lainnya saling menendang ujung egrang yang menyentuh tanah. Selain itu, dibeberapa daerah pesisir (pantura) permainan egrang lebih banyak dipadukan dengan permainan lain. \n" +
                "\n"+
                "Semisal permainan sepakbola, pukul kendi dan lainnya. Media bambu yang dipergunakan umumnya bambu tali (awi tali) ataupun bambu hijau (awi hejo) dan bambu hitam (awi hideung). Pemilihan bambu tali, hijau dan hitam bukan tanpa alasan. Selain mudah dalam proses pembuatan karena cepat kering, juga sangat kuat tidak mudah retak saat dijadikan pijakan. Selain itu bila disambungkan antara bagian bambu yang dijadikan pegangan dan pijakan tidak merekah dan justru sebaliknya semakin menjepit. Berbeda dengan jenis bambu lainnya seperi bambu gombong dan tanaman bambu lainnya yang cenderung sulit mongering dan mudah merekah serta rapuh. \n" +
                "\n"+
                "Proses pembuatan permainan egrang atau jajangkungan. Setelah ditebang, bambu yang dipilih adalah bambu yang sesuai dengan pegangan tangan atau bambu bagian atas. Bila tidak melalui proses pengeringan, batang bambu terlebih dahulu  dibersihkan. Pamasangan pijakan disesuaikan dengan urutan buluh bambu, buluh bambu bagian atas dipergunakan untuk pegangangan (bagian atas) sedangkan yang disambung dengan pijakan merupakan bulu bagian bawah.");
        values.put("link", "https://www.youtube.com/watch?v=cvBQBiAz1lU&ab_channel=EKIHCHANNEL");
        values.put("img", R.drawable.imv_permainantradisional_jajangkungan);
        db.insert("budaya", "_id", values);

        values.put("_id", "71");
        values.put("nama", "Ucing Beling");
        values.put("kategori", "Permainan Tradisional");
        values.put("deskripsi", "Menggunakan media pecahan beling/kaca yang ditumbuk menjadi kecil, cara memainkan permainan ucing beling adalah semua pemain membuat pecahan kaca kecil dan kemudian membuat garis bulat di tanah, ukuran bulatan garis disesuaikan dengan pemain.\n" +
                "\n" +
                "Dengan melakukan cingciripit, hompimpah atau suten (suit) pemain menentukan siapa yang menjadi kucing.\n" +
                "\n" +
                "Kucing akan menghitung angka (biasanya) 1-10,  sementara pemain lain menyembunyikan pecahan beling di area garis bulat tadi dan menyamarkannya agar tidak terlihat oleh si kucing yang nanti akan mencarinya.\n" +
                "\n");
        values.put("link", "https://www.youtube.com/watch?v=3qdw8r7qGPM&ab_channel=CYBERSTUDENTSMANPACIANJUR");
        values.put("img", R.drawable.imv_permainantradisional_ucingbeling);
        db.insert("budaya", "_id", values);

        // Kesenian
        values.put("_id", "72");
        values.put("nama", "Tembang Cianjuran");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Cianjuran merupakan kesenian khas Jawa Barat. Kesenian ini menampilkan nyanyian yang dibawakan oleh seorang penyanyi, lagu yang dibawakannya pun merupakan lagu khas Jawa Barat. Masyarakat Jawa Barat memberikan nama lain untuk nyanyian Cianjuran ini yaitu Mamaos yang artinya bernyanyi.");
        values.put("link", "https://www.youtube.com/watch?v=I_4_w_wcOFM&ab_channel=AfranNinoOfficial");
        values.put("img", R.drawable.imv_kesenian_tembang_cianjuran);
        db.insert("budaya", "_id", values);

        values.put("_id", "73");
        values.put("nama", "Wayang Golek");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Wayang Golek merupakan kesenian tradisional dari Jawa Barat, yaitu pementasan sandiwara boneka yang terbuat dari kayu dan dimainkan oleh seorang sutradara merangkap pengisi suara yang disebut Dalang. Seorang Dalang memiliki keahlian dalam menirukan berbagai suara manusia. Seperti halnya Jaipong, pementasan Wayang Golek diiringi musik Degung lengkap dengan Sinden nya. Wayang Golek biasanya dipentaskan pada acara hiburan, pesta pernikahan atau acara lainnya.\n" +
                "\n" +
                "Waktu pementasannya pun unik, yaitu pada malam hari (biasanya semalam suntuk) dimulai sekitar pukul 20.00 - 21.00 hingga pukul 04.00 pagi. Cerita yang dibawakan berkisar pada pergulatan antara kebaikan dan kejahatan (tokoh baik melawan tokoh jahat). Ceritanya banyak diilhami oleh budaya Hindu dari India, sepertiRamayana atau Perang Baratayudha. Tokoh-tokoh dalam cerita mengambil nama-nama dari tanah India. Dalam kelompok yang dinamakan Purnakawan, seperti Dawala dan Cepot. Tokoh-tokoh ini digemari karena mereka merupakan tokoh yang selalu memerankan peran lucu (seperti pelawak) dan sering memancing gelak tawa penonton. Seorang Dalang yang pintar akan memainkan tokoh tersebut dengan variasi yang lucu dan menarik.");
        values.put("link", "https://www.youtube.com/watch?v=KOt3mXTNn54&ab_channel=AaStudio");
        values.put("img", R.drawable.imv_kesenian_wayang_golek);
        db.insert("budaya", "_id", values);

        values.put("_id", "74");
        values.put("nama", "Reog");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Di daerah Jawa Barat terdapat kesenian yang disebut Reog, kesenian ini pada umumnya ditampilkan dengan bodoran, serta diiringi dengan musik tradisional yang disebut Calung. Kesenian ini biasanya dimainkan oleh beberapa orang yang mempunyai bakat melawak dan berbakat seni. Kesenian ini ditampilkan dengan membawakan sebuah alur cerita yang kebanyakan cerita yang dibawakan adalah cerita lucu atau lelucon.");
        values.put("link", "https://www.youtube.com/watch?v=_UMYe0-mgws&ab_channel=KrisnaEuy");
        values.put("img", R.drawable.imv_kesenian_reog);
        db.insert("budaya", "_id", values);

        values.put("_id", "75");
        values.put("nama", "Gendang Pencak");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi","Gendang penca atau kendang penca satu seni yang tidak terlepas dari seni pencak silat. kendang pencak yang keberadaannya makin tersisihkan bahkan bisa di bilang barang langka terlebih buat anak-anak muda sekarang padahal kendang pencak warisan tak ternilai dari para karuhun/leluhur sunda yang merupakan satu kesenian yang harus di jaga dan di lestarikan.\n" +
                "\n" +
                "Di Jawa Barat, di samping dikenal dengan aspek beladirinya, yang lebih dikenal dengan sebutan buah atau eusi, dikenal pula aspek pencak silat seni yang disebut kembang atau ibing pencaksilat, sehingga apabila mendengar kata \"pencak” yang terbayang oleh masyarakat Jawa Barat bukanlah suatu sistem pembelaan diri, melainkan suatu seni ibing pencak silat yang diambil dari gerak serangan dan belaan.");
        values.put("link", "https://www.youtube.com/watch?v=ajNIYGGKoLM&ab_channel=SimawarEnterprise");
        values.put("img", R.drawable.imv_kesenian_kendang_pencak);
        db.insert("budaya", "_id", values);

        values.put("_id", "76");
        values.put("nama", "Pencak Silat");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Pada awalnya pencak Silat ini merupakan tarian yang menggunakan gerakan tertentu yang gerakannya itu mirip dengan gerakan bela diri. Pencak silat dimainkan oleh dua orang atau lebih, dengan memakai pakaian yang serba hitam, menggunakan ikat pinggang dari bahan kain yang diikatkan dipinggang, serta memakai ikat kepala dari bahan kain yang orang sunda menyebutnya iket.\n" +
                "\n" +
                "Pencak silat merupakan kesenian yang berasal dari daerah Jawa Barat, yang kini sudah menjadi kesenian Nasional. Pada awalnya pencak Silat ini merupakan tarian yang menggunakan gerakan tertentu yang gerakannya itu mirip dengan gerakan bela diri. Pada umumnya pencak silat ini dibawakan oleh dua orang atau lebih, dengan memakai pakaian yang serba hitam, menggunakan ikat pinggang dari bahan kain yang diikatkan dipinggang, serta memakai ikat kepala dari bahan kain yang orang sunda menyebutnya lket. Pada umumnya kesenian pencaksilat ini ditampilkan dengan diiringi oleh musik yang disebut gendang penca, yaitu musik pengiring yang alat musiknya menggunakan gendang dan terompet.");
        values.put("link", "https://www.youtube.com/watch?v=8H0x1AKlpM4&ab_channel=Yosilat");
        values.put("img", R.drawable.imv_kesenian_pencak_silat);
        db.insert("budaya", "_id", values);

        values.put("_id", "77");
        values.put("nama", "Tari Ketuk Tilu");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Ketuk Tilu adalah suatu tarian pergaulan dan sekaligus hiburan yang biasanya diselenggarakan pada acara pesta perkawinan, acara hiburan penutup kegiatan atau diselenggrakan secara khusus di suatu tempat yang cukup luas. Pemunculan tari ini di masyarakat tidak ada kaitannya dengan adat tertentu atau upacara sakral tertentu tapi murni sebagai pertunjukan hiburan dan pergaulan. Oleh karena itu tari ketuk tilu ini banyak disukai masyarakat terutama di pedesaan yang jarang kegiatan hiburan.");
        values.put("link", "https://www.youtube.com/watch?v=Xeb4BWnnAyQ&ab_channel=IndonesiaHeritage");
        values.put("img", R.drawable.imv_kesenian_tari_ketuk_tilu);
        db.insert("budaya", "_id", values);

        values.put("_id", "78");
        values.put("nama", "Rampak Gendang");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Rampak Gendang merupakan kesenian yang berasal dari Jawa Barat. Rampak Gendang ini adalah pemainan menabuh gendang secara bersama-sama dengan menggunakan irama tertentu serta menggunakan cara-cara tertentu untuk melakukannya, pada umumnya dimainkan oleh lebih dari empat orang yang telah mempunyai keahlian khusus dalam menabuh gendang. Biasanya rampak gendang ini diadakan pada acara pesta atau pada acara ritual.");
        values.put("link", "https://www.youtube.com/watch?v=MTzvEikyNoM&ab_channel=sriwisnu");
        values.put("img", R.drawable.imv_kesenian_rampak_gendang);
        db.insert("budaya", "_id", values);

        values.put("_id", "79");
        values.put("nama", "Tayub");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Tari pergaulan di kalangan menak (bangsawan) sunda. Di dalam tari Tayub, gerak tarinya tidak mempunya pola khusus, baik menurut kehendak maupun perbendaharaan gerak masing-masing penari. Oleh karena itu, tari Tayub yang bebas kadang kala tidak terkendalikan, sehingga tayuban dijadikan sebagai pertemuan silaturahmi antar penari.");
        values.put("link", "https://www.youtube.com/watch?v=5ASMw3Thnu4&ab_channel=AWANGPUSTAKAWAN");
        values.put("img", R.drawable.imv_kesenian_tayub);
        db.insert("budaya", "_id", values);

        values.put("_id", "80");
        values.put("nama", "Tari Keurseus");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Tari Keurseus merupakan tari yang erat kaitanya dengan tari tayub Salah seorang pelopornya adalah kerabat Bupati Sumedang, yaitu R Gandakoesoemah, yang di kalangan seni tari Sunda dikenal dengan nama Aom Doyot, pada waktu itu ia Camat Leuwiliang Bogor. Salah seorang penganut gaya Aom Doyot adalah R. Sambas Wirakoesoemah yang juga masih kerabat bupati Sumedang. Oleh R. Sambas Wirakoesoemah, ibing patokan ditingkatkan lagi, baik gerakan maupun struktur tariannya, sehingga lebih mudah untuk disebarluaskan dan dari sinilah lahir istilah tari Keurseus Tari Keurseus disusun oleh R. Sambas Wirakoesoemah, lurah Rancaekek (Bandung) tahun 1915-1920 dan 1926-1935. Beliau adalah putra Nyi Raden Ratnamirah dan Raden Mintapradjakoesoemah, wedana Tanjungsari, Sumedang. Pada tahun 1905-1913, Wirakoesoemah belajar tari kepada Uwanya, Rd. Hj. Koesoemaningroem, penari di Kabupaten Sumedang dan ia juga belajar pada Sentana (Wentar), pengamen Topeng dari Palimanan, Cirebon tahun 1914. Dari bekal belajar tari itu, kemudian ia menyusun dan merapikan tari Tayub. Perguruan tarinya diberi nama Wirahmasari yang didirikan tahun 1920 di Rancaekek dengan murid-muridnya yang kebanyakan berasal dari kalangan menak yang kemudian menyebarkannya ke seluruh Tatar Sunda. Pelajaran yang diajarkan secara sistematis pada muridmuridnya dalam bahasa Belanda dikenal dengan istilah Cursus. Dalam lafal sunda menjadi Keurseus, sehingga tari yang diajarkan di Wirahmasari ini kemudian dikenal dengan nama Tari Keurseus. Tari keurseus merupakan perkembangan dari tari tayub. Tarian ini merupakan lambang status kehalusan budi para menak. Para menak Sunda pada waktu itu biasa mengadakan pesta dengan menari. Menak yang tidak bisa menari akan sangat memalukan di mata umum. Oleh karena itulah setiap menak akan beusaha belajar dan meningkatkan keahliannya dalam menari.");
        values.put("link", "https://www.youtube.com/watch?v=bLAdVAJYEXw&ab_channel=SolihinAhmed");
        values.put("img", R.drawable.imv_kesenian_tari_keurseus);
        db.insert("budaya", "_id", values);

        values.put("_id", "81");
        values.put("nama", "Longser");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Longser merupakan salah satu jenis teater rakyat yang hidup dan berkembang di daerah Priangan, khususnya di daerah Bandung. Dari beberapa sumber disebutkan bahwa sekitar tahun 1915 di Bandung terdapat sebuah pertunjukan rakyat yang disebut doger. Dalam perkembangannya doger berubah menjadi lengger kemudian berubah lagi menjadi longser. Longser cukup berjaya sekitar tahun 1920-1960-an. Pengertian dari longser belum ditemukan secara pasti apa artinya. Akan tetapi beberapa keterangan mengaitkan pengertian itu dalam kirata basa. Didalam bahasa Sunda, yang dinamakan kirata basa (akronim) kependekan dari dikira-kira tapi nyata. Long dari katamelongyang artinya memandang dan berartinya ada sesuatu rasa, hasrat, atau gairah seksual. Namun tampaknya pengertian itu hanya dikarang-karang saja karena belum tentu kebenarannya, terlihat seperti terlalu dipaksakan.\n" +
                "\n" +
                "Bentuk pertunjukan longser adalah teater rakyat yang di dalamnya terdapat unsur tari, nyanyi, lakon yang di dalamnya sarat dengan lelucon Biasanya dipertunjukan pada malam hari di tempat terbuka dengan menggelar tikar. Secara otomatis penonton pun membuat setengah lingkaran seperti tapal kuda. Di tengah-tengah arena biasanya diletakkan oncorbersumbu tiga atau lima sebagai alat penerangan. Gamelan diletakkan di belakang yang sekaligus juga sebagai tempat berganti pakaian oleh anggota oleh anggota rombongan. Walaupun umumnya pertunjukan malam hari, namun kadangkala dipertunjukan pula siang hari dengan istilah lain yaitu lontang. Longser biasanya dipertunjukan dengan cara mengamen, walaupun sekali-kali ada yang nanggap. Waditra (alat musik) yang digunakan dalam pertunjukan Longser adalah ketuk, kendang, dua buah saron, kempyang, kempul, goong, kecrek, dan rebab. Dalam perkembangannya waditra yang digunakan semakin lengkap yaitu ditambah dengan terompet, bonang, rincik, gambang, dan jenglong. Yang berlaras salendro.\n" +
                "\n" +
                "Dalam pertunjukan longser ada anggota perempuan yang disebut ronggeng. Salah seorang di antaranya ada yang disebut Sripanggung. Ia merupakan bintang atau primadona dari pararonggeng. Para ronggeng menggunakan kain dan kebaya, juga menggunakan karembong (selendang). Hiasan kepala bersanggul dihiasi dengan mangle (bunga melati/sedap malam yang dironce). Asessoris yang dipakai adalah subang (hiasan telinga), kalung, gelang, cincin, juga bros. Mereka berias tebal (menor). Para ronggeng biasanya diberi julukan dengan nama ikan seperti Si Jeler, Si Tawes, Si Sepat, si Kumpay, dan lain-lain. Para pemain laki-laki menggunakan pakaian jawara, yaitu menggunakan kampret, kain sarung, dengan ikatbarangbang seplak, lengkap dengan golok yang diselipkan pada sabuk kulit yang lebar, juga menggunakan gelang bahar dan cincin batu yang besar-besar.\n" +
                "\n" +
                "Pertunjukkan Longser dimulai dengan masuknya para ronggeng yang disebut dengan adegan wawayangan atau mamarung, yaitu para ronggeng menyanyi sambil menari. Hal ini sebagai salah satu cara yang dilakukan untuk menarik hati penonton. Apabila ada laki-laki yang tertarik pada salah satu ronggeng, biasanya akan memakaikan apa saja yang dimilikinya kepada ronggeng. Misalnya: sarung, kopiah, jam tangan, kacamata, sapu tangan, dan lain-lain. Bila selesai menari, barang-barang tersebut dikembalikan kepada yang mempunyai barang tersebut dengan tebusan uang. Setelah itu, datang bodor untuk mengucapkan terima kasih kepada para penonton atas partisipasinya. Orang yang jadi bodor biasanya adalah pemimpin rombongan. Sambil melawak, ia memperkenalkan rombongan juga Sripanggung serta para ronggeng kepada para penonton.\n" +
                "\n" +
                "Selanjutnya, Jawara dan Sripanggung menari berpasangan kemudian diikuti oleh ronggeng yang lain berpasangan dengan para penonton yang menaksirnya. Penonton juga diperbolehkan meminta lagu kesenangannya, dengan imbalan memberi uang. Lagu-lagu yang diminta seperti Awi Ngarambat, Geboy, Berenuk Mundur, dan lagu-lagu Ketuk Tilu yang lain. Tidak jauh berbeda dengan sajian Ketuk Tilu. Pada acara inikadang-kadang terjadi rebutan ronggeng sampai berkelahi. Maka apabila terjadi perkelahian, pimpinan rombongan berkewajiban untuk melerainya, oleh sebab itu pimpinan rombongan harus memiliki kemampuan penca. Adegan selanjutnya adalah menyajikan lakonan. Lakon-lakon yang sering ditampilkan biasanya diangkat dari kehidupan masyarakat sehari-hari. Di antaranya adalah Suganda-Sugandi, Si Keletek jeung Si Kulutuk. Karnadi Anemer Bangkong, Rasiah Geulang Rantai, Pahatu Lalis, Kelong, dan lain-lain.");
        values.put("link", "https://www.youtube.com/watch?v=UJCO1O7Se94&ab_channel=Shulhan%26Susi");
        values.put("img", R.drawable.imv_kesenian_longser);
        db.insert("budaya", "_id", values);

        values.put("_id", "82");
        values.put("nama", "Banjet");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Topeng Banjet merupakan kesenian tradisional khas Kabupaten Karawang yang sangat khas dengan bahasa Sundanya yang kasar dan Waditra pengiringnya. Penamaan Topeng Banjet menurut sejumlah tokoh pelakunya hanya berupa istilah semata untuk membedakan topeng tradisional dengan topeng berasal dari Indramayu dan Cirebon serta dari Jawa yang mengamen hingga ke pesisir Karawang. Musik Topeng Banjet yang dimainkan sangat berbeda dengan musik topeng dari Jawa hingga bunyinya seperti suara bancet (sejenis katak) bersahutan. Waditra (pengiring) Topeng Banjet yang sangat khas tersebut ada pada kendang, kecrek, dan goong buyung (gong kecil). Kesenian Topeng banjet merupakan bentuk kesenian tradisional dengan jenisnya termasuk seni pertunjukan rakyat atau dapat dimasukkan juga ke dalam bentuk teater tradisional. Lebih khusus lagi kesenian Topeng Banjet dapat didefinisikan sebagai seni pertunjukan rakyat yang diawali lawakan atau pelawak (bodor) dengan Topeng Banjet diteruskan dengan pertunjukan seni drama tradisional.\n" +
                "\n" +
                "Kesenian Topeng Banjet adalah kesenian tradisional yang termasuk kedalam teater tradisional. Kesenian Topeng Banjet merupakan seni pertunjukan rakyat yang diawali dengan lawakan dengan Topeng Banjet kemudian diteruskan dengan pertunjukan seni drama tradisional. Topeng Banjet adalah kesenian tradisional khas Kabupaten Karawang. Menurut sejumlah tokoh, penamaan Topeng Banjet hanya berupa istilah untuk membedakan topeng tradisional dengan topng daerah Indramayu, Cirebon dan Jawa yang mengamen hingga pesisir Karawang.\n" +
                "\n" +
                "Topeng Banjet sangat khas dengan bahasa sundanya yang kasar dan waditra pengiringnya. Waditra atau pengiring Topeng Banjet sangat khas terdapat pada kendang, kecrek, dan goong buyung (gong kecil). Musik Topeng Banjet dimainkan menyerupai suara bancet (sejenis katak) bersahutan.\n" +
                "\n" +
                "Pada masa sekarang dalam pementasan kesenian Topeng Banjet tidak ada pemain yang memakai Topeng namun pada masa silam dalam sebagian pementasannya ada yang menggunakan Topeng, yaitu pada babak Ngajantuk dan babak Ngedok. Pemakain topeng ini hanya sampai tahun 1949, sebab semenjak itu dilarang oleh penguasa setempat pada masa itu (Batalion X). Dengan dihapusnya pemakaian topeng itu maka hapuslah babak Ngajantuk itu sampai sekarang. Walaupun demikian pemakain kata Topeng tetap dipakai untuk penamaan kesenian Topeng Banjet.\n" +
                "\n" +
                "Sepanjang sejarah perkembangan Topeng Banjet telah mengalami beberapa perubahan, meskipun secara umum masih bersifat tradisional. Busana yang dipakai oleh nayaga umumnya pakaian bebas (seadanya), bahkan pada masa silam ada yang cukup memakai kaos oblong saja dan pakaian luar biasanya dibungkus dengan sarung yang dikaitkan di pinggangnya. Pada masa kini telah dimulai ada perubahan yaitu pada beberapa grup kesenian Topeng Banjet telah memakai pakaian seragam (kostum) khususnya bagi para nayaga. Pakaian pelawaknya juga bebas, ada kalanya pelawak laki-laki pada jaman dahulu yang sama sekalai tidak memakai baju dan bagian bawah cukup bersarung tenun saja. Pemeran Si Jantuk biasanya berikut kepala atau berkopiah dan memakai jubah/mantel dan membawa tiruan golok dari kayu. Sedangkan pakaian ronggeng (Topeng) yaitu disamping pakaian biasa, berkebaya yang tangannya sampai di tengah pergelangan tangan pendek) memakai kainpanjang sampai ujung kaki, pinggimya tidak dilipat-lipat.\n" +
                "\n" +
                "Pada masa lalu kesenian Topeng Banjet berfungsi sebagai pelengkap upacara-upacara tradisional seperti di dalam kegiatan panen padi. Pada perkembangan selanjutnya, fungsi kesenian Topeng Banjet yaitu digunakan dalam kegiatan lainnya seperti dalam acara hiburan hajatan perkawinan, khitanan, acara penyambutan tamu, pesta-pesta, juga pada acara hiburan peringatan hari-hari nasional, serta hiburan lain, seperti kegiatan kegiatan festival di berbagai tempat. Kesenian Topeng Banjet juga berkembang menuju profesionalisme karena sering diundang dalam suatu kegiatan dengan memperoleh imbalan. Namun, pada hakekatnya Topeng Banjet dimaksudkan untuk menyampaikan pesan-pesan heroik melalui cerita dan lawakan.\n" +
                "\n");
        values.put("link", "https://www.youtube.com/watch?v=Fa9Hyv7JJJE&ab_channel=RIODisccariu");
        values.put("img", R.drawable.imv_kesenian_banjet);
        db.insert("budaya", "_id", values);

        values.put("_id", "83");
        values.put("nama", "Ubrug");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Ubrug merupakan teater tradisional bersifat kerakyatan yang terdapat di daerah Banten. Ubrug menggunakan bahasa daerah Sunda, campur Jawa dan Melayu, serupa dengan topeng banjet yang terdapat di daerah Karawang. Ubrug dapat dipentaskan di mana saja, seperti halnya teater rakyat lainnya. Dipentaskan bukan saja untuk hiburan, tetapi juga untuk memeriahkan suatu \"hajatan\", atau meramaikan suatu \"perayaan\". Untuk apa saja, yang dilakukan masyarakat, ubrug dapat diundang tampil.\n" +
                "\n" +
                "Istilah ubrug diambil dari bahasa Sunda yaitu saubrug-ubrug yang artinya bercampur baur. Dalam pelaksanannya, kesenian ubrug ini kegiatannya memang bercampur yaitu antara pemain/pelaku dengan nayaga yang berada dalam satu tempat atau arena. Namun ada pendapat bahwa ubrug diambil dari kata sagebrug yang artinya apa yang ada atau seadanya dicampurkan, maksudnya yaitu antara nayaga dan pemain lainnya bercampur dalam satu lokasi atau tempat pertunjukan.\n" +
                "\n" +
                "Kesenian ubrug terdapat di Kecamatan Cikande bagian utara, Kragilan, Carenang, Pontang, Tirtayasa, Kasemen, Ciruas, Walantaka, Taktakan, Waringin Kurung, Kramat Watu, Bojonegara, Merak, Cilegon, Anyar, Mancak, Cinangka, Ciomas, Pabuaran, Padarineang, dan Pamarayan sebelah utara. Di daerah ini bahasa yang digunakan yaitu bahasa Jawa Banten, sedangkan yang berbahasa Sunda terdapat di Kecamatan Cikande sebelah selatan, Kopo, Cikeusal, Baros, Pamarayan Timur dan Selatan serta Petir. Di sini istilah ubrug diganti dengan istilah topeng, walaupun dalam pertunjukannya sama dengan ubrug dan tidak memakai topeng. Mungkin hal ini disebabkan karena Kabupaten Serang bagian tenggara berdekatan dengan Kabupaten Bogor tempat topeng Cisalak berada.\n" +
                "\n" +
                "Waditra yang digunakan dalam ubrug yaitu kendang besar, kendang kecil, goong kecil, goong angkeb (dulu disebut katung angkub atau betutut), bonang, rebab, kecrek dan ketuk. Alat-alat ini dibawa oleh satu orang yang disebut tukang kanco karena alat pemikulnya bernama kanco yaitu tempat menggantungkan alat-alat tersebut.\n" +
                "\n" +
                "Busana yang dipakai yaitu: juru nandung mengenakan pakain tari lengkap dengan kipas untuk digunakan pada waktu nandung. Pelawak atau bodor pakaiannya disesuaikan dengan fungsinya sebagai pelawak yang harus membuat geli penonton. Bagi nayaga tidak ada ketentuan, hanya harus memakai pakaian yang rapi dan sopan dan pakaian pemain disesuaikan dengan peran yang dibawakannya.\n" +
                "\n" +
                "Ubrug dipentaskan di halaman yang cukup luas dengan tenda seadanya cukup dengan daun kelapa atau rumbia. Pada saat menyaksikan ubrug, penonton mengelilingi arena. Sekitar tahun 1955, ubrug mulai memakai panggung atau ruangan, baik yang tertutup ataupun terbuka di mana para penonton dapat menyaksikannya dari segala arah.");
        values.put("link", "https://www.youtube.com/watch?v=-Gb1XEkgqB4&ab_channel=AbahYadiKlinikPusaka");
        values.put("img", R.drawable.imv_kesenian_ubrug);
        db.insert("budaya", "_id", values);

        values.put("_id", "84");
        values.put("nama", "Debus");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Debus merupakan kesenian bela diri dari Banten yang mempertunjukan kemampuan manusia yang luar biasa. Misalnya kebal senjata tajam, kebal air keras dan lain-lain. Kesenian ini berawal pada abad ke-16, pada masa pemerintahan Sultan Maulana Hasanuddin (1532-1570). Pada zaman Sultan Ageng Tirtayasa (1651–1692) Debus menjadi sebuah alat untuk memompa semangat juang rakyat banten melawan penjajah Belanda pada masa itu. Kesenian Debus saat ini merupakan kombinasi antara seni tari dan suara.\n" +
                "\n" +
                "Kesenian Debus yang sering dipertontonkan di antaranya: Menusuk perut dengan tombak atau senjata tajam lainnya tanpa terluka. Mengiris bagian anggota tubuh dengan pisau atau golok. Memakan api. Menusukkan jarum kawat ke lidah, kulit pipi atau anggota tubuh lainnya hingga tebus tanpa mengeluarkan darah. Menyiram tubuh dengan air keras hingga pakaian yang dikenakan hancur lumat namun kulit tetap utuh. Menggoreng telur di atas kepala. Membakar tubuh dengan api. Menaiki atau menduduki susunan golok tajam. Bergulingan di atas serpihan kaca atau beling.\n" +
                "\n" +
                "Debus dalam bahasa Arab berarti tongkat besi dengan ujung runcing berhulu bundar. Bagi sebagian masyarakat awam kesenian Debus memang terbilang sangat ekstrim. Pada masa sekarang Debus sebagai seni beladiri yang banyak dipertontonkan untuk acara kebudayaan ataupun upacara adat.\n" +
                "\n" +
                "Debus lebih dikenal sebagai kesenian asli masyarakat Banten, yang mungkin berkembang sejak abad ke-18. Menurut sebagian banyak sumber sejarah, kesenian debus Banten bermula pada abad 16 masa pemerintahan Sultan Maulana Hasanuddin (1532-1570) Debus mulai dikenal pada masyarakat Banten sebagai salah satu cara penyebaran agama Islam. Namun ada juga yang menyebutkan Debus berasal dari daerah Timur Tengah bernama Al-Madad yang diperkenalkan ke daerah Banten ini sebagai salah satu cara penyebaran Islam pada waktu itu. Yang lainnya menyebutkan bahwa debus berasal dari tarekat Rifa'iyah Nuruddin al-Raniri yang masuk ke Banten oleh para pengawal Cut Nyak Dien (1848–1908).");
        values.put("link", "https://www.youtube.com/watch?v=AvdKET1CIQ0&ab_channel=USIKBUHUNOFFICIAL");
        values.put("img", R.drawable.imv_kesenian_debus);
        db.insert("budaya", "_id", values);

        values.put("_id", "85");
        values.put("nama", "Tari Jaipong");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Dikenal memiliki aneka budaya yang unik dan menarik, Jaipongan adalah salah satu seni budaya yang terkenal dari daerah ini. Jaipongan atau Tari Jaipong sebetulnya merupakan tarian yang sudah modern karena merupakan modifikasi atau pengembangan dari tari tradisional khas Sunda yaitu ketuk Tilu. Tari Jaipong ini dibawakan dengan iringan musik yang khas pula, yaitu Degung. Musik ini merupakan kumpulan beragam alat musik seperti Kendang, Go'ong, Saron, Kacapi, dsb. Degung bisa diibaratkan 'Orkestra' dalam musikEropa/Amerika. Ciri khas dari Tari Jaipong ini adalah musiknya yang menghentak, dimana alat musik kendang terdengar paling menonjol selama mengiringi tarian.\n" +
                "\n" +
                "Jaipong merupakan tarian khas Jawa Barat yang di mainkan oleh satu orang atau lebih. Penarinya pun menggunakan pakaian khas Jawa Barat. Tari ini di ciptakan pada tahun 1960 oleh seorang seniman asal Bandung yang bernama Gugum Gumbira.\n");
        values.put("link", "https://www.youtube.com/watch?v=YIvo7IDMAVQ&ab_channel=MalakaStudio");
        values.put("img", R.drawable.imv_kesenian_jaipongan);
        db.insert("budaya", "_id", values);

        values.put("_id", "86");
        values.put("nama", "Sisingaan");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Sisingaan atau juga dikenal dengan istilah Kirab Helaran adalah suatu jenis kesenian tradisional atau seni pertunjukan rakyat yang dilakukan dengan arak- arakan dalam bentuk helaran dan merupakan kesenian yang berasal dari daerah Subang Jawa barat. Kesenian ini ditampilkan dengan cara menggotong patung yang berbentuk seperti singa yang ditunggangi oleh anak kecil dan digotong oleh empat orang serta diiringi oleh tabuhan gendang dan terompet. Kesenian ini biasanya ditampilkan pada acara khitanan atau acara peringatan hari-hari bersejarah seperti, menyambut tamu, hiburan peresmian, kegiatan HUT Kemerdekaan RI dan kegiatan hari-hari besar lainnya.");
        values.put("link", "https://www.youtube.com/watch?v=htx5af5QoCk&ab_channel=romyjayasaputra");
        values.put("img", R.drawable.imv_kesenian_sisingaan);
        db.insert("budaya", "_id", values);

        values.put("_id", "87");
        values.put("nama", "Kuda Renggong");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Kuda Renggong atau Kuda Depok ialah salah satu jenis kesenian helaran yang terdapat di Kabupaten Sumedang. Cara penyajiannya yaitu, seekor kuda atau lebih di hias warna-warni, budak sunat dinaikkan ke atas punggung kuda tersebut, Budak sunat tersebut dihias seperti seorang Raja atau Satria, bisa pula meniru pakaian para Dalem Baheula, memakai Bendo, takwa dan pakai kain serta selop.");
        values.put("link", "https://www.youtube.com/watch?v=YQE9sthhzHg&ab_channel=KrisnaEuy");
        values.put("img", R.drawable.imv_kesenian_kuda_rengkong);
        db.insert("budaya", "_id", values);

        values.put("_id", "88");
        values.put("nama", "Tari Topeng");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Adalah tarian suku sunda yang dibawakan oleh sekelompok orang penari pria atau wanita, yang menggunakan topeng khas suku sunda, dan biasanyatarian ini untuk menyambut tamu-tamu yang ingin berkunjung datang, dan sebagai pementasan pada saat acara-acara tertentu .Seperti perkawinan, khitanan, dan sebagainya.");
        values.put("link", "https://www.youtube.com/watch?v=CoG82D9JVbI&ab_channel=AURAVIDEOGRAPHY");
        values.put("img", R.drawable.imv_kesenian_tari_topeng);
        db.insert("budaya", "_id", values);

        values.put("_id", "89");
        values.put("nama", "Kecapi Suling");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Kacapi Suling adalah kesenian yang berasal dari daerah Jawa Barat, yaitu permainan alat musik tradisional yang memadukan suara alunan Suling dengan Kacapi (kecapi), iramanya sangat merdu yang biasanya diiringi oleh Mamaos (tembang) Sunda yang memerlukan cengkok/alunan tingkat tinggi khas Sunda, yang pada umumnya nyanyian atau lagunya dibawakan oleh seorang penyanyi perempuan, yang dalam bahasa sunda disebut Sinden. Kacapi suling ini biasanya digunakan untuk mengiringi nyanyian sunda. Sunda. Kacapi Suling berkembang pesat di daerah Cianjur dan kemudian menyebar kepenjuru Parahiangan Jawa Barat dan seluruh dunia.");
        values.put("link", "https://www.youtube.com/watch?v=S38O3QJZX9o&ab_channel=rekhapiduasepuhOfficial");
        values.put("img", R.drawable.imv_kesenian_kacapi_suling);
        db.insert("budaya", "_id", values);

        values.put("_id", "90");
        values.put("nama", "Rengkong");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Rengkong adalah salah satu kesenian tradisional yang diwariskan oleh leluhur masyarakat Sunda. Muncul sekitar tahun 1964 di daerah Kabupaten Cianjur dan orang yang pertama kali memunculkan dan mempopulerkannya adalah H. Sopjan. Bentuk kesenian ini sudah diambil dari tata cara masyarakat sunda dahulu ketika menanam padi sampai dengan menuainya.");
        values.put("link", "https://www.youtube.com/watch?v=LdPqf2drL18&ab_channel=SukmadijayaRukmana");
        values.put("img", R.drawable.imv_kesenian_rengkong);
        db.insert("budaya", "_id", values);

        values.put("_id", "91");
        values.put("nama", "Kuda Lumping");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Kuda Lumping merupakan kesenian yang beda dari yang lain, karena dimainkan dengan cara mengundang roh halus sehingga orang yang akan memainkannya seperti kesurupan. Kesenian ini dimainkan dengan cara orang yang sudah kesurupan itu menunggangi kayu yang dibentuk seperti kuda serta diringi dengan tabuhan gendang dan terompet. Keanehan kesenian ini adalah orang yang memerankannya akan mampu memakan kaca, rumput. Selain itu orang yang memerankannya akan di cambuk seperti halnya menyabuk kuda.");
        values.put("link", "https://www.youtube.com/watch?v=igbiv7E3nYQ&ab_channel=stridedigital");
        values.put("img", R.drawable.imv_kesenian_kuda_lumping);
        db.insert("budaya", "_id", values);

        values.put("_id", "92");
        values.put("nama", "Angklung Buncis");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Angklung Buncis mangrupa seni pintonan hiburan, anu tumuwuh di Baros (Arjasari, Bandung). Dina mulanya buncis dipaké dina acara-acara tatanen anu nyambung jeung paré. Tapi dina mangsa ayeuna, Buncis dipaké minangka seni hiburan. Warsih 1940-an bisa dianggap minangka lekasanana fungsi ritual buncis dina penghormatan paré, alatan saprak harita buncis robah jadi pintonan hiburan. Saluyu jeung éta, tempat-tempat penyimpanan paré ogé mimitian ngiles ti imah-imah nu nyicingan, digantian kalayan tempat-tempat karung anu leuwih praktis, sarta gampang dibawa ka mana-mana. Paré ogé ayeuna loba anu langsung dijual, henteu ditunda di lumbung. Ku kituna kasenian buncis anu tadina dipaké pikeun acara-acara ngunjal (mawa paré) henteu diperlukeun deui. Instrumen anu dipaké dina kasenian buncis nya éta: 2 angklung indung, 2 angklung ambrug, angklung panempas, 2 angklung pancer, 1 angklung enclok. Saterusna 3 buah dogdog, diwangun ti 1 talingtit, panembal, sarta badublag. Dina perkembangannya saterusna ditambah kalayan terompet, kecrek, sarta goong. Angklung buncis berlaras salendro jeung lagu vokal bisa berlaras madenda atawa degung.\n" +
                "\n" +
                "Wewengkon anu masih ngamumulé kasenian angklung buncis antarana: Angklung Buncis (Parahiangan/Bandung), Angklung Badud (Parahiangan WÉTAN/Ciamis), Angklung Bungko (Indramayu), Angklung Gubrag (Bogor). Angklung Ciusul (Banten), Angklung Dog dog Lojor (Sukabumi), Angklung Badeng (Malangbong, Garut) sarta Angklung Daeng anu idéntik jeung Angklung Nasional jeung tangga nada diatonis, anu dimekarkeun saprak warsih 1938. Rombongan angklung anu dawam memainkan lagu \"Buncis\", digigireun lagu-lagu séjénna. Angklungna aya 9 hiji, nya éta (1) singgul, (2) Jongjrong. (3) Ambrung, (4) Ambrung panerus, (5) Pancer, (6) Pancer panerus, (7) Engklok, (8) Roel sarta (9) Roel panerus. Dilengkepan kalayan rombongan dogdog diwangun ku opat dogdog anu gurat tengahna béda, ti anu pangleutikna ukuranana 25 cm, beuki badag nepi ka anu ukuranana 45 cm, dingaranan (1) tilingtit, (2) panempas, (3) jongjrong, sarta (4) bangbrang atawa badugblag anu pangbadagna. Digigireun éta aya ogé peniup terompet kendang penca. Para pamaén angklung nabeuh waditrana bari usik jeung ngigel sakapeung aya ogé anu memainkan angklungna bari nangkarak. Sedengkeun para nu dogdog sarta terompet henteu kudu ngalakonan léngkah-léngkah kitu, cukup nangtung atawa ngaléngkah leutik mundur atawa maju. Maranéhanana bernyanyi silih gentenan bari ngabodor. Kajaba lagu \"Buncis\", lagu séjén anu dawam dicoo ialah \"Badud\" sarta \"Tonggeret\". Angklung Buncis aya di Ciwidey. Ujungberung, Bandung. Biasana dipertunjukkan dina hajatan, poé raya nasional, pesta désa kawas sabéak panen, jsb.");
        values.put("link", "https://www.youtube.com/watch?v=oNeCULLAhNQ&ab_channel=KINGPRODUCTION");
        values.put("img", R.drawable.imv_kesenian_angklung_buncis);
        db.insert("budaya", "_id", values);

        values.put("_id", "93");
        values.put("nama", "Gondang");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Gondang adalah lagu pada tutunggulan. Ngagondang adalah kakawihan yang dipirig oleh tutunggulan. Pada mulanya gondang merupakan bagian dari upacara untuk menghormati Dewi Padi, Nyi Pohaci SANGHYANG SRI, waktu menumbuk padi untuk pertama kalinya, biasa disebut meuseul Nyai Sri, setelah panen usai. Yang melakukan gondang yaitu wanita yang dianggap suci atau sudah tidak menstruasi (menopause). Itu dulu waktu di Jaman Prabu Siliwangi. Perkembangan selanjutnya gondang menjadi nama salah satu seni pertunjukan yang menggambarkan muda-mudi di pedesaan menjalin cinta kasih, dengan gerak dan lagu yang romantis penuh canda. Sekelompok pemudi menumbuk padi dengan mempergunakan lesung, kemudian sekelompok pemuda datang. Terjadilah dialog yang akhirnya mereka pulang berpasang-pasangan.\n" +
                "\n" +
                "Lagu-lagu yang dipergunakan banyak mengambil dari lagu rakyat, atau lagu perkembangan yang diubah katanya. Salah seorang inovator seni pertunjukan ini adalah Tatang Kosasih, yang mengolahnya pada awal tahun 1960-an. Kata-katanya tidak saja berbahasa Sunda, tetapi dicampur dengan bahasa Indonesia, dan untuk membedakan dengan kreasi gondang lainnya, gondang karya Tatang Kosasih biasa disebut gondang tidak jangan. Mang Koko dan Wahyu Wibisana pernah membuat Gondang Samagaha (gerhana), yang mengisahkan kegiatan muda-mudi dikala terjadi gerhana, diiringi gamelan pelog dan salendro. Salah satu ciri gondang adalah adanya kegiatan tutunggulan dengan alat alu atau lesung. Tingtung tutunggulan gondang artinya bunyi-bunyian yang terdengar dari pukulan alu dan lesung yang dimainkan oleh beberapa orang, sehingga membentuk paduan bunyi yang polyphonis. Tutunggulan biasa pula dijadikan tangara (tanda) untuk masyarakat sekitarnya bahwa ada seseorang yang akan melangsungkan perhelatan.");
        values.put("link", "https://www.youtube.com/watch?v=MgcnhOs6zW4&ab_channel=CakrawalaEnterprise");
        values.put("img", R.drawable.imv_kesenian_gondang);
        db.insert("budaya", "_id", values);

        values.put("_id", "94");
        values.put("nama", "Lais");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Kesenian Lais merupakan sebuah kesenian pertunjukan akrobatik dalam seutas tali sepanjang 6 meter yang dibentangkan dan dikaitkan di antara dua buah bambu dengan ketinggian 12 sampai 13 meter. Kesenian Lais di ambil dari nama seseorang yang sangat terampil memanjat pohon kelapa yang bernama \"Laisan\" yang sehari-hari di panggil Pak Lais. Lais ini sudah dikenal sejak zaman penjajahan Belanda, tempatnya di Kampung Nangka Pait, Kec. Sukawening. Atraksi yang di tontonkan mula-mula pelais memanjat bambu lalu pindah ke tambang sambil menari-nari dan berputar di udara tanpa menggunakan sabuk pengaman dengan diiringi musik reog, kendang penca, dog-dog dan terompet.");
        values.put("link", "https://www.youtube.com/watch?v=BvhNpz9qpQw&ab_channel=TalkieFilms");
        values.put("img", R.drawable.imv_kesenian_lais);
        db.insert("budaya", "_id", values);

        values.put("_id", "95");
        values.put("nama", "Tari Merak");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Tari merak merupakan tarian tradisi suku sunda yang menggambarkan burung-burung merak yang sedang menari dengan gembira, tarian ini dibawakan oleh penari wanita-wanita sunda . dan biasanya tarian merak ini dibawakan untuk acara perkawinan ataupun menyambut tamu yang datang berkunjung ke tanah sunda.");
        values.put("link", "https://www.youtube.com/watch?v=o62RTDLncAU&ab_channel=SATVOfficial");
        values.put("img", R.drawable.imv_kesenian_tarian_merak);
        db.insert("budaya", "_id", values);

        values.put("_id", "96");
        values.put("nama", "Bajidoran");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Bajidoran merupakan sebuah kesenian yang dalam memainkannya hampir sama dengan permainan musik modern, cuma lagu yang dialunkan merupakan lagu tradisional atau lagu daerah Jawa Barat serta alat-alat musik yang digunakannya adalah alat-alat musik tradisional Jawa Barat seperti Gendang, Goong, Saron, Bonang, Kacapi, Rebab, Jenglong serta Terompet. Bajidoran ini biasanya ditampilkan dalam sebuah panggung dalam acara pementasan atau acara pesta.\n" +
                "\n" +
                "Bajidoran adalah bentuk kesenian rakyat yang tumbuh dan berkembang di kawasan pantai utara (Pantura) Jawa Barat, khususnya di daerah Subang dan Karawang. Musik pengiringnya adalah seperangkat gamelan yang pada umumnya menggunakan laras salendro, sering dipentaskan oleh penyelenggara atau biasa disebut pamangku hajat, mengiringi pesta syukuran inisiasi (kelahiran bayi, khitanan, perkawinan), atau acara syukuran lainnya yang berkaitan dengan upacara-upacara ritual (hajat bumi, panen, menyambut datangnya hujan, bersih desa, dan lain-lain). \n" +
                "\n" +
                "Daya tarik kesenian ini ada pada sosok sinden atau ronggeng yang digandrungi oleh para bajidor, istilah bagi orang yang gemar menari atau ngibing di pakalangan (arena pertunjukan), memesan lagu, serta memberi uang saweran. Oleh karena itu, keseniannya pun diberi nama Kliningan Bajidoran atau Bajidoran saja, sedangkan kata kerjanya menjadi ngabajidor.\n" +
                "\n" +
                "Kata bajidor itu, terutama di daerah Subang, secara sinis populer dengan akronim dari barisan jiwa doraka (barisan jiwa durhaka), menunjuk pada perilaku para penggemar Kliningan Bajidoran yang cenderung menghalalkan segala cara di arena pertunjukan, mulai dari menghamburkan uang saweran, menenggak minuman keras, hingga merayu serta mengekspresikan hasrat seksual kepada sinden atau ronggeng. Konon, istilah bajidor datang dari H. Hilman (alm), mantan Lurah Pagaden, yang pada zamannya terkenal sebagai penggemar fanatik Kliningan Bajidoran dan kemudian mempersunting sinden kenamaan pada zamannya, Cucun Cunayah. Akronim bajidor yang lain dan tak kalah sinisnya adalah abah haji ngador (abah haji keluyuran), karena banyaknya bajidor yang bergelar haji. Sedangkan menurut tokoh rekaman lagu Sunda, Tan Deseng, bajidor itu akronim dari beberapa kesenian rakyat, yaitu banjet, tanji, dan bodor.\n" +
                "\n" +
                "Dalam praktiknya, sinden atau ronggeng sangat piawai menggoda dan merayu bajidor agar mau menghamburkan uangnya. Mereka akan merayu dengan cara menyebut-nyebut nama bajidor di sela-sela alunan lagu yang didendangkannya, atau merayu dengan bahasa tubuhnya yang diekspresikan melalui gerakan-gerakan tarian, senyuman, tatapan mata, sentuhan tangan, serta perilaku-perilaku lainnya. Melalui cara-cara itulah seorang bajidor akan terus melakukan saweran hingga uangnya terkuras habis.");
        values.put("link", "https://www.youtube.com/watch?v=B4Q3Zei8FEs&ab_channel=BudayaSaya");
        values.put("img", R.drawable.imv_kesenian_bajidoran);
        db.insert("budaya", "_id", values);

        values.put("_id", "97");
        values.put("nama", "Tari Wayang");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Tari wayang mulai dikenal masyarakat pada masa kesultanan Cirebon pada abad ke-16 oleh Syekh Syarif Hidayatullah, yang kemudian disebarkan oleh seniman keliling yang datang ke daerah Sumedang. Garut, Bogor, Bandung dan Tasikmalaya.\n" +
                "\n" +
                "Tari wayang mulai dikenal masyarakat pada masa kesultanan Cirebon pada abad ke-16 oleh Syekh Syarif Hidayatullah, yang kemudian disebarkan oleh seniman keliling yang datang ke daerah Sumedang, Garut, Bogor, Bandung dan Tasikmalaya. Berdasarkan segi penyajiannya tari wayang dikelompokkan menjadi 3 bagian antara lain : Tari Tunggal yaitu tarian yang dibawakan oleh satu orang penari dengan membawakan satu tokoh pewayangan. Contoh : Tari Arjuna, Gatotkaca, dll. Tari berpasangan, yaitu tarian yang dibawakan oleh dua orang penari atau lebih yang keduanya saling melengkapi keutuhan tariannya, contoh : Tari Sugriwa, Subali dll.. Tari Massal yang berjumlah lebih dari satu penari dengan tarian atau ungkapan yang sama. Contoh : Tari Monggawa, Badaya.\n" +
                "\n" +
                "Tari wayang memiliki tingkatan atau jenis karakter yang berbeda misalnya karakter tari pria dan wanita. Karakter tari wanita terdiri dari Putri Lungguh untuk tokoh Subadra dan Arimbi serta ladak untuk tokoh Srikandi. Sedangkan karakter tari pria terdiri dari : Satria Lungguh untuk tokoh Arjuna, Abimanyu, dan Arjuna Sastrabahu; Satria Ladak Lungguh untuk tokoh Arayana, Nakula dan Sadewa; Satria Ladak Dengah/Kasar untuk tokoh Jayanegara, Jakasono, Diputi Karna dan sebagainya; Monggawa Dengah/Kasar seperti Baladewa dan Bima; Monggawa Lungguh seperti Antareja dan Gatotkaca: Denawa Raja seperti Rahwana dan Nakula Niwatakawaca.\n" +
                "\n" +
                "Secara garis besar, jika dilihat dari segi koreografinya tari wayang memiliki tiga gerakan utama yaitu : Pokok ialah patokan tarian, gerak tersebut antara lain adeg-adeg, jangkung ilo, mincid, keupat, gedut, kiprahan, tindak tilu, engkek gigir, mamandapan, dan calok sembahan Peralihan ialah gerak sebagai sisipan yang digunakan sebagai peralihan dari gerak satu ke gerak yang lainnya. Misal cindek, raras, trisi dan gedig. Khusus ialah gerak secara spesifik yang terdapat pada tari tertentu.");
        values.put("link", "https://www.youtube.com/watch?v=fb9IY17-Eg8&ab_channel=SYNTYAMAR");
        values.put("img", R.drawable.imv_kesenian_tari_wayang);
        db.insert("budaya", "_id", values);

        values.put("_id", "98");
        values.put("nama", "Adu Domba");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Adu domba merupakan salah satu kesenian khas rakyat jawa barat yang cukup digemari, terutama di kalangan tradisional. Kesenian ini merupakan peninggalan leluhur yang masih bertahan eksistensinya hingga saat ini. Pada intinya adu domba ialah ajang pamer ketangkasan hewan ternak yang pada akhirnya akan menaikan gengsi suatu perkumpulan ternak tertentu. Para pesertanya ialah peternak-peternak domba yang tersebar hampir di seluruh jawa barat, terutama daerah garut, sumedang, bandung, majalengka dan lainya. Event adu domba dilaksanakan setiap tahun dengan sistim kompetisi, hampir setiap bulan kegiatan ini dilaksanakan bergilir di daerah-daerah. Di bandung arena adu domba salah satunya terletak di lebak siliwangi. Setiap event adu domba selalu dipadati oleh penonton. Kegiatan ini juga memiliki gengsi yang cukup tinggi karena banyak tokoh-tokoh sunda yang juga merupakan penggemar sekaligus pemiliknya, seperti Kang Ibing (alm) dan lain lain.");
        values.put("link", "https://www.youtube.com/watch?v=aH5wwGrkyPg&ab_channel=MysteriumOutdoor");
        values.put("img", R.drawable.imv_kesenian_adu_domba);
        db.insert("budaya", "_id", values);

        values.put("_id", "99");
        values.put("nama", "Tari Topeng Lakon (Cirebon)");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Tari topeng Cirebon adalah salah satu tarian tradisional yang berkembang di wilayah parahyangan (daerah Sunda di Jawa Barat yang luasnya mencakup wilayah Ciamis, Tasikmalaya, Garut, Sumedang, Cimahi, Bandung, dan Cianjur). Menurut cerita rakyat yang berkembang Tari Topeng diciptakan oleh sultan Cirebon yang cukup terkenal, yaitu Sunan Gunung Jati. Ketika Sunan Gunung Jati berkuasa di Cirebon, terjadilah serangan oleh Pangeran Welang dari Karawang. Pangeran ini sangat sakti karena memiliki pedang yang diberi nama Curug Sewu. Melihat kesaktian sang pangeran tersebut, Sunan Gunung Jati tidak bisa menandinginya walaupun telah dibantu oleh Sunan Kalijaga dan Pangeran Cakrabuana.\n" +
                "\n" +
                "Akhirnya sultan Cirebon memutuskan untuk melawan kesaktian Pangeran Welang itu dengan cara diplomasi kesenian. Berawal dari keputusan itulah kemudian terbentuk kelompok tari, dengan Nyi Mas Gandasari sebagai penarinya. Setelah kesenian itu terkenal, akhirnya Pangeran Welang jatuh cinta pada penari itu, dan menyerahkan pedang Curug Sewu itu sebagai pertanda cintanya. Bersamaan dengan penyerahan pedang itulah, akhirnya Pangeran Welang kehilangan kesaktiannya dan kemudian menyerah pada Sunan Gunung Jati. Pangeran itupun berjanji akan menjadi pengikut setia Sunan Gunung Jati yang ditandai dengan bergantinya nama Pangeran Welang menjadi Pangeran Graksan. Seiring dengan berjalannya waktu, tarian inipun kemudian lebih dikenal dengan nama Tari Topeng dan masih berkembang hingga sekarang. Selain sebagai media hiburan, tarian ini juga pernah dijadikan sebagai media komunikasi dakwah Islam di Cirebon pada zaman dulu.");
        values.put("link", "https://www.youtube.com/watch?v=nWQy77z2Xb0&ab_channel=BabulSajati");
        values.put("img", R.drawable.imv_kesenian_tari_topeng_lakon);
        db.insert("budaya", "_id", values);

        values.put("_id", "100");
        values.put("nama", "Gondang Buhun (Kab. Ciamis)");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Gondang Buhun adalah kesenian khas Kampung Kuta yang tidak terdapat di daerah lain. Dalam kesenian gondang, alat yang digunakan adalah alu biasanya tingginya mencapai 2 meter, dan lisung yang panjangnya 2,5 meter. Biasanya lisung diisi dua ikat padi atau masyarakat Kamp. Kuta menyebutnya dua geugeus pare.\n" +
                "\n" +
                "Kesenian kondang selalu diadakan setiap kali ada hajatan. Baik itu pernikahan maupun khitanan. Kesenian kondang diadakan di pagi buta. Ibu-ibu yang ada di kampung kuta menumbuk padi dengan menggunakan lesung dan halu. Suara dihasilkan dari halu yang dipukulkan ke lesung sambil menumbuk padi hingga menjadi beras.");
        values.put("link", "https://www.youtube.com/watch?v=rLZSxZx5_j0&ab_channel=AepSaefurrohman");
        values.put("img", R.drawable.imv_kesenian_gondang_buhun);
        db.insert("budaya", "_id", values);

        values.put("_id", "101");
        values.put("nama", "Angklung Badud (Kota Tasikmalaya)");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Angklung Badud adalah kesenian khas Tasikmalaya. Badud sendiri berarti energik. Hal ini terlihat dari karakter hentakan angklung, atraktifnya para penari, pukulan dogdog dan semangat dari penari kuda lumping. Kesenian ini tumbuh di Desa Sukamaju Kaler, Kec. Indihiang, Kota Tasikmalaya. Atraksi kesenian nan dinamis ini diiringi seperangkat Angklung Buhun yang berusia kurang lebih 1 abad. Salah satu keindahan Tasik lainnya adalah pada batiknya yang berwarna dinamis.\n" +
                "\n" +
                "Fungsi utama dari Seni Angklung Badud ini, di masyarakat asalnya, dipergunakan untuk mengarak dan menghibur pengantin Sunat. Jaman dahulu ketika obat bius lokal penghilang rasa sakit (pangbaal) belum biasa digunakan, anak yang akan disunat pagi-pagi sekali diarak menuju ke kolam (balong) kemudian anak disuruh untuk berendam di kolam selama beberapa menit, nah pada saat diarak menuju kolam dan pulang dari kolam inilah Angklung Badud dimainkan, masyarakat pun ikut berbondong-bondong membentuk barisan berjejer, layaknya pawai atau karnaval sekarang, sehingga terjadilah kegembiraan dan diantara kegembiraan itu pula, biasanya muncul kreativitas dari pemain dan masyarakat membuat kelucuan dan kemeriahan lainnya. Acara ini pun digelar sekaligus mengundang dan memberitahu masyarakat agar pada saatnya anak disunat bisa hadir memberikan dola dan uang \"panyecep\" kepada pengantin sunat.\n" +
                "\n" +
                "Seni Angklung Badud lahir dan dibesarkan di Kampung Parakanhonje Kelurahan Sukamaju Kaler Kecamatan Indihiang Kota Tasikmalaya. Di bawah asuhan Keluarga Besar Kanca Indihiang, Angklung Badud pada jamannya sekitar tahun 70-an bisa dikenal di mana-mana. BADUD bisa diartikan Energik, atau Dinamis. Ini terlihat dari sifat dan karakter Seni ini, di mana nada-nada yang dihasilkan oleh hentakan Angklung, pukulan Dogdog, rancaknya penari, dan bergeloranya semangat penari Kuda Lumping yang bergoyang mengikuti irama musik, sungguh sangat nikmat, seolah mengajak kepada penonton dan pendengarnya untuk ikut bergerak dan ngengklak mengikuti irama yang ritmis.\n" +
                "\n" +
                "Perlu diketahui, para penari Kuda Lumping di Angklung Badud, tidak kesurupan atau intrance. Sehingga di alam sadarnya justru penari Kuda Lumping, bergerak indah, mata penari kuda lumping pun dipejam sedikit (peureum hayam), merem melek menikmati alunan musik, sementara kaki dan tubuhnya tak hentinya meliuk indah, melompat lincah dan berguling cekatan, sebentar berlari, sebentar melompat, lari kecil, dan rincik, sungguh nikmat kelihatannya.");
        values.put("link", "https://www.youtube.com/watch?v=xFSC5izy2k8&ab_channel=AyoSunaryo");
        values.put("img", R.drawable.imv_kesenian_angklung_badud);
        db.insert("budaya", "_id", values);

        values.put("_id", "102");
        values.put("nama", "Parebut Seeng (Kab. Bogor)");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Parebut Seeng atau ada juga yang menyebut Tepak Seeng, adalah kesenian tradisional yang hidup di sebagian wilayah Kabupaten Bogor. Kesenian ini dinamakan Parebut Seeng karena salah satu dari acara dalam upacara adat pernikahan itu adalah memperebutkan seeng. Seeng artinya dandang yakni alat dapur yang biasanya dipergunakan untuk menanak nasi atau mengukus berbagai jenis makanan.\n" +
                "\n" +
                "Awalnya kesenian ini tumbuh di Kecamatan Caringin, Kabupaten Bogor yang merupakan pusat aliran seni bela diri yang sangat terkenal, Cimande. Pada awalnya, atraksi Parebut Seeng disebut Tepak Seeng dan biasanya ditampilkan dalam salah satu acara yang terdapat dalam rangkaian upacara adat pernikahan. Kesenian ini kemudianmenyebar ke berbagai tempat seiring dengan penyebaran aliran pencak silat Cimande ke berbagai wilayah di Kabupaten Bogor, antara lain sampai ke Kampung Sindang Barang, Desa Pasir Eurih, Kecamatan Tamansari. Diperoleh keterangan, bahwa pada sekitar tahun 1925, salah seorang warga Sindangbarang (waktu itu termasuk Kecamatan Ciomas) yang bernama Bapak Ujang Aslah bermukim di Cimande dan ia belajar pencak silat aliran Cimande dari Abah Haji Hasbulloh.\n" +
                "\n" +
                "Setelah lima tahun mempelajari Penca Silat Cimande, kemudian ia kembali ke kampungnya dan mengajarkan pencak tersebut kepada salah satu keturunannya, yakni Ukat s. la, seperti juga ayahnya, kemudian mengajarkan aliran pencak tersebut ke berbagai kalangan di sekitar daerah Pasir Eurih. Pada tahun 2006, ia pun berusaha untuk menghidupkan kembali seni Parebut Seeng di bawah asuhan Lurah Pasireurih yaitu Bapak Etong Sumawijaya. Sejak tahun 1950-1970-an pencak silat aliran Cimande berikut atraksi Tepak Seeng yang kemudian dinamakan Parebut Seeng, berkembang dan menyebar ke berbagai tempat. Sepeninggalnya Bapak Etong Sumawijaya, kesenian tersebut dilanjutkan oleh salah seorang cucunya yang bernama Maki Sumawijaya hingga saat ini.\n" +
                "\n" +
                "Seni Parebut Seeng terkait dengan upacara adat pernikahan yang pelaksanaannya dilakukan sebelum akad nikah, yakni setelah kedua belah pihak yang akan bebesanan saling memperkenalkan diri. Dahulu, sebelum tahun 80-an, yakni ketika infrastruktur jalan dan transportasi belum berkembang pesat, keluarga calon pengantin pria untuk sampai ke tempat calon pengantin wanita, mereka berjalan kaki, seberapa pun jauhnya, diantar oleh kerabat dan handai-taulan sambil diiringi oleh tetabuhankendang penca. Mereka membawa berbagai macam barang dan makanan untuk dipersembahkan kepada calon pengantin wanita, seperti macam-macam bumbu, makanan alat-alat dapur, pakaian, sirih-pinang, bahkan kambing pun dituntunnya. kini, setelah hal tersebut berkembang pesat, tradisi tersebut perlahan-lahan hilang.\n" +
                "\n" +
                "Kedatangan mereka biasanya disambut dengan sukacita oleh keluarga calon mempelai wanita, kemudian mereka melaksanakan upacara adat penyambutan. Dimulai oleh wakil dari rombongan calon pengantin pria, yang disebut bobotoh,beruluk-salam. memperkenalkan diri dan mengutarakan maksud dan tujuan kedatangannya. Keluarga calon pengantin wanita, yang juga diwakili oleh bobotoh, kemudian membalas salam dari keluarga calon pengantin pria seraya mengatakan bahwa maksud dan tujuan kedatangannya dapat dipahami. Akan tetapi, untuk menguji bahwa calon pengantin pria itu benar-benar lelaki perkasa, pihak keluarga calon pengantin pria mengajukan tantangan, yakni akad nikah hanya bisa dilaksanakan jika pihak calon pengantin wanita dapat merebut seeng yang dibawa oleh salah seorang Jawara dari pihak pria. Pihak calon pengantin wanita bersedia menerima tantangan tersebut. Kedua Jawara kemudian berlaga saling mengadu kekuatan. Mereka maju ke kalangan, memasang kuda-kada sambil memperlihatkan jurus-jurus silatnya. Setelah itu mereka beradu ketangkasan dengan cara saling pukul, saling tendang, masing-masing berusaha untuk menangkis dan menghindar setiap serangan lawan. Jawara yang satu berusaha untuk mempertahankan seeng yang digendong dan Jawara yang satunya lagi berusaha untuk merebutnya. Pergulatan itu akan berakhir jika Jawara dari pihak calon pengantin wanita dapat menyentuh seeng tersebut. Acara pun dilanjutkan dengan seserahan, yakni menyerahkan calon pengantin pria dan seluruh barang bawaannya kepada pihak calon pengantin wanita. Setelah itu barulah akad nikah dilaksanakan.\n" +
                "\n" +
                "Setelah akad nikah selesai, biasanya dilanjutkan dengan ngeuyeuk seureuh, dan sawer panganten, kemudian dilanjutkan dengan acara hiburan berupa tari-tarian Pencak Silat aliran Cimande.");
        values.put("link", "https://www.youtube.com/watch?v=eIjBfg0Pn2Q&ab_channel=RyanWestJava");
        values.put("img", R.drawable.imv_kesenian_parebut_seeng);
        db.insert("budaya", "_id", values);

        values.put("_id", "103");
        values.put("nama", "Cokek (Kab. Bekasi)");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Cokek yang merupakan perpaduan antara Gambang Kromong dan Ronggeng serta Ketuk Tilu yang terdapat di Kabupaten Bogor dan Bekasi. Cokek atau Ronggeng Cokek muncul sekitar tahun 1900, ketika para pecinta Seni Ketuk Tilu, Gambang Kromong dan Ronggeng tergugah untuk memadukan ketiga unsur seni tadi. Dari Gambang Kromong diambil alat tabuhnya, lagu dan nyanyiannya, dari Ronggeng diambil tariannya, dan dari Ketuk Tilu cara penyajiannya. Dengan perpaduan ketiga unsur seni tadi maka terbentuklah Cokek yang terdiri dari unsur musik (instrumentalis dan lagu), tarian sendiri atau bersama, puisi atau pantun serta lawakan yang juga mengandung lakon dalam bentuk fragmen. Irama tabuhannya ceria, dan di antara lagu-lagunya ada yang bersifat merangsang birahi atau nafsu dengan nada tinggi. Cokek biasanya diselenggarakan pada malam hari, yaitu mulai pukul 21.00 sampai pagi.");
        values.put("link", "https://www.youtube.com/watch?v=X_GeBXD21Fk&ab_channel=DianaRosca");
        values.put("img", R.drawable.imv_kesenian_cokek);
        db.insert("budaya", "_id", values);

        values.put("_id", "104");
        values.put("nama", "Gamelan Ajeng");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Asal muasal nama Ajeng diambil dari panggung pentas yang senantiasa di tinggikan sampai dua meter. Musik tradisional Ajeng dan tarian Soja awalnya berupa jenis musik dan tarian persembahan rasa syukur dalam upacara panen raya yang kini mulai tergeser menjadi upacara penyambutan tamu agung. Sekarang gamelan ajeng dan tarian soja lebih sering dipentaskan dalam upacara untuk menyambut tamu agung dalam bentuk arak-arakan dan acara pernikahan.\n" +
                "\n" +
                "Ditengah pemetasan gamelan tersebut, enam orang penari masuk ke arena panggung untuk melakukan tarian soja. Para penari memberi warna lain dalam pementasan gamelan ajeng seperti yang di tuturkan oleh Abah lying selaku pewaris ke tiga \"gamelan ajeng mewariskan tiga buah lagu dari 72 lagu. Abah menuturkan bahwa dia hanya ingat tiga lagu dari 72 lagu yang judul nya, \"suren\", \"Renggong Burung\", dan \"Rancag Panjang\". Ke tiga lagu tersebut, diwariskan kepada anak-anak dan cucunya agar tidak menjadi punah \"Abah mengharap dari ketiga tembang tersebut, bisa terus diwariskan kepada generasi berikutnya dengan harapan agar kesenian tradisional gamelan ajeng bisa tetap eksis\" ucapnya.");
        values.put("link", "https://www.youtube.com/watch?v=TDTYDlhZCzw&ab_channel=Kresipahstomp");
        values.put("img", R.drawable.imv_kesenian_angklung_ajeng);
        db.insert("budaya", "_id", values);

        values.put("_id", "105");
        values.put("nama", "Topeng Menor");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Topeng Menor, bukanlah sebutan bagi suatu jenis kesenian. Sebutan itu sebenarnya hanya untuk menunjukkan seseorang sebagai penari topeng. Menor adalah nama lain bagi seorang yang bernama Carini la adalah buah perkawinan dari Sutawijaya (ayah) dan Sani (ibu). Sutawijaya adalah dalang wayang kulit dan Sani dalang topeng. Menor adalah julukan bagi Carini, seorang dalang topeng berdarah Cirebon yang tinggal di Dusun Babakan Bandung, Desa Jati, Kecamatan Cipunagara, Kabupaten Subang. Sebutan Menor diberikan karena ia adalah satu-satunya anak perempuan dari empat bersaudara keturunan Sutawijaya Menor adalah nama kesayangan, karena semasa remajanya Cari itu memang menor, alias cantik atau genit. Ia adalah anak tertua dari empat bersaudara (Sunaryo, Supendi, dan Komar).");
        values.put("link", "https://www.youtube.com/watch?v=1-1JEa8lnmg&ab_channel=KrissilasPanji");
        values.put("img", R.drawable.imv_kesenian_topeng_menor);
        db.insert("budaya", "_id", values);

        values.put("_id", "107");
        values.put("nama", "Randu Kentir (Kab. Indramayu)");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Tari yang berasal dari kata randu (Pohon Randu) dan kentir (hanyut) ini memiliki kemiripan dengan gerakan orang yang konon pada masa itu hanyut di sungai dan ditolong oleh warga dengan menggunakan ranting pohon randu. Kini, pertunjukkan tarian ini sudah cukup banyak di beberapa kota sekitar Indramayu, seperti Cirebon bahkan di Kota Bandung.\n" +
                "\n" +
                "Pada pagelarannya tari Randu Kentir dipirig gamelan dan terbang. Dengan pirigan musik sederhana ini, mampu mengiringi gerakan sebanyak sepuluh penari cantik. Gerakan pada tarian pun amatlah sederhana, unik, dan mudah dipelajari. Meskipun demikian, tarian yang berdurasi selama 10 menit itu mampu menarik perhatian penonton.\n" +
                "\n" +
                "Seni Randu Kentir berasal dari Desa Jumbleng Kecamatan Losarang. Konon, pada masa lalu ada warganya yang hanyut (kentir) terbawa air sungai. Kemudian masyarat setempat rame-rame menolongnya, dengan cara melemparkan sebatang pohon randu, dan akhirnya korban selamat. Karena memiliki nilai historis itulah pada gerakan tari Randu kentir ada kemiripan gerakan tangan menirukan orang hanyut di sungai.");
        values.put("link", "https://www.youtube.com/watch?v=jWginVf8ncw&ab_channel=MAYDAS159-OFFICIALSMKPGRIJATIBARANG");
        values.put("img", R.drawable.imv_kesenian_randu);
        db.insert("budaya", "_id", values);

        values.put("_id", "108");
        values.put("nama", "Seni Uyeg (Kota Sukabumi)");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Pertunjukan Uyeg sangat berbeda dengan genre teater rakyat lainnya. Hal itu disebabkan karena hadirnya tokoh sakral Sanghyang Raja Uyeg di panggung pertunjukan. Pemahaman arti Sanghyang sebagai julukan terhormat (honorific epithet) di dalam mitologi Sunda merupakan gelar seseorang atau sesuatu yang dianggap memiliki daya gaib yang bersifat transendental dan biasanya sinonim dengan sebutan dewa dalam religi Hinduisme. Tokoh ini hanya muncul tiga kali sepanjang pertunjukan dan memiliki kedudukan terhormat sebagai penguasa jagat Uyeg.\n" +
                "\n" +
                "Di dalam Uyeg, tokoh Sanghyang Raja Uyeg dimainkan oleh seorang pemain, tidak sebagai shaman. Namun bias arkais dengan Uyeg lama, masih terdapat pada pra pertunjukannya, yakni pembakaran kemenyan dengan pembacaan mantra Panajem (mantra pengikat penononton), dan memakai setting, gambaran tiga dunia (imago mundi), yakni dunia atas, dunia tengah, dan dunia bawah.");
        values.put("link", "https://www.youtube.com/watch?v=Ct0bA9wENWY&ab_channel=DeasyHerlina");
        values.put("img", R.drawable.imv_kesenian_uyeg);
        db.insert("budaya", "_id", values);

        values.put("_id", "109");
        values.put("nama", "Beluk");
        values.put("kategori", "Kesenian Tradisional");
        values.put("deskripsi", "Karawitan sekar beluk ini sudah langka sekali. Beluk lebih dikenal pada upacara selamatan 40 hari bagi bayi yang baru dilahirkan. Beluk sangat erat dengan pergelaran nembang wawacan. Memang pada dasarnya kesenian beluk hanya menembangkan cerita dalam wawacan yang tersusun ceritanya dalam bentuk puisi terutama pupuh. Wawacan adalah cerita yang disusun menggunakan pupuh dengan maksud untuk dinyanyikan atau didangdingkeun.\n" +
                "\n" +
                "Teknik penyajian beluk dibantu oleh juru ilo. Juru ilo dalah orang yang membacakan cerita dalam bentuk prosa (membaca biasa) yang ditujukan kepada penembang beluk untuk bahan kata-kata yang akan dinyanyikannya. Secara spontan dan penuh variasi, juru beluk menyanyikan kata-kata itu. Frekwensi nada yang digunakan adalah nada yang tinggi sehingga semakin mahir bermain lagu dalam nada-nada yang tinggi makin tinggilah kemampuan ki juru beluk itu.\n" +
                "\n" +
                "Teknik bersuara banyak mempergunakan nasal hidung (sengau). Kata-kata yang dinyanyikan sebenarnya kurang begitu jelas terucapkan karena yang lebih penting bagi pendengar adalah teknik-teknik bernyanyinya itu sendiri. Kalau mereka ingin tahu tentang kata-katanya, sebelum dinyanyikan telah disebutkan secara jelas oleh juru ilo. Beluk sudah dianggap sebagai kesenian buhun (kolot, tua, lama). Penggunaan sekar irama merdekanya memberikan cirri yang tersendiri dari bentuk kesenian rakyat sebab kebanyakan lagu-lagu rakyat Pasundan banyak mempergunakan irama tandak (terikat)\n" +
                "\n" +
                "Kalau dilihat dari penyajiannya, dimana ada unsur cerita yang dinyanyikan, maka mungkin sekali dasar-dasar \"gending karesmen\" didalam karawitan Sunda banyak berpijak dari perkembangan beluk dengan nembang wawacannya.");
        values.put("link", "https://www.youtube.com/watch?v=oAJ_zJKD2CY&ab_channel=ArdiHardiChannel");
        values.put("img", R.drawable.imv_kesenian_beluk);
        db.insert("budaya", "_id", values);

        // Update Adat Tradisional
        values.put("_id", "110");
        values.put("nama", "Upacara Mengandung Empat Bulan");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Dulu Masyarakat Jawa Barat apabila seorang perempuan baru mengandung 2 atau 3 bulan belum disebut hamil, masih disebut mengidam. Setelah lewat 3 bulan barulah disebut hamil. Upacara mengandung Tiga Bulan dan Lima Bulan dilakukan sebagai pemberitahuan kepada tetangga dan kerabat bahwa perempuan itu sudah betul-betul hamil. Namun sekarang kecenderungan orang-orang melaksanakan upacara pada saat kehamilan menginjank empat bulan, karena pada usia kehamilan empat bulan itulah saat ditiupkannya roh pada jabang bayi oleh Allah SWT. Biasanya pelaksanaan upacara Mengandung empat Bulan ini mengundang pengajian untuk membacakan do'a selamat, biasanya doa nurbuat dan doa lainnya agar bayinya mulus, sempurna, sehat, dan selamat.");
        values.put("link", "https://www.youtube.com/watch?v=zx8Q4WEGI6E&ab_channel=QMTart");
        values.put("img", R.drawable.imv_adat_tradisional_4bulan);
        db.insert("budaya", "_id", values);

        values.put("_id", "111");
        values.put("nama", "Upacara Mengandung Tujuh Bulan/Tingkeban");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara Tingkeban adalah upacara yang diselenggarakan pada saat seorang ibu mengandung 7 bulan. Hal itu dilaksanakan agar bayi yang berasal dari kata tingkeb artinya tutup, maksudnya si ibu yang sedang mengandung tujuh bulan tidak boleh bercampur dengan suaminya sampe empat puluh hari sesudah persalinan, dan jangan bekerja terlalu berat karena bayi yang dikandung sudah besar, hal ini untuk menghindari dan sesuatu yang tidak diinginkan. Di dalam upacara ini biasa diadakan pengajian biasanya membaca ayat-ayat Al-Quran surat Yusuf, surat Lukman dan surat Maryam\n" +
                "\n" +
                "Di samping itu dipersiapkan pula peralatan untuk upacara memandikan ibu hamil, dan yang utama adalah rujak kanistren yang terdiri dari 7 macam buah-buahan. Ibu yang sedang hamil tadi dimandikan oleh 7 orang keluarga dekat yang dipimpin seorang paraji secara bergantian dengan menggunakan 7 lembar kain batik yang dipakai bergantian setiap guyuran dan dimandikan dengan air kembang 7 rupa. Pada guyuran ketujuh dimasukan belut sampai mengena pada perut si ibu hamil, hal ini dimaksudkan agar bayi yang akan dilahirkan dapat berjalan lancar (licin seperti belut). Bersamaan dengan jatuhnya belut, kelapa gading yang telah digambari tokoh wayang oleh suaminya dibelah dengan golok. Hal ini dimaksudkan agar bayi yang dikandung dan orang tuanya dapat berbuat baik lahir dan batin, seperti keadaan kelapa gading warnanya elok, bila dibelah airnya bersih dan manis. Itulah perumpamaan yang diharapkan bagi bayi yang dikandung supaya mendapatkan keselamatan dunia-akhirat.\n" +
                "\n" +
                "Sesudah selesai dimandikan biasanya ibu hamil didandani dibawa menuju ke tempat rujak kanistren tadi yang sudah dipersiapkan. Kemudian sang ibu menjual rujak itu kepada anak-anak dan para tamu yang hadir dalam upacara itu, dan mereka membelinya dengan menggunakan talawengkar, yaitu genteng yang sudah dibentuk bundar seperti koin. Sementara si ibu hamil menjual rujak, suaminya membuang sisa peralatan mandi seperti air sisa dalam jajambaran, belut, bunga, dsb. Semuanya itu harus dibuang di jalan simpang empat atau simpang tiga. Setelah rujak kanistren habis terjual selesailah serangkaian upacara adat tingkeban.");
        values.put("link", "https://www.youtube.com/watch?v=nA-q9AGcbvQ&ab_channel=ayufebriyanti");
        values.put("img", R.drawable.imv_adat_tradisional_7bulan);
        db.insert("budaya", "_id", values);

        values.put("_id", "112");
        values.put("nama", "Upacara Mengandung Sembilan Bulan");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara sembuilan bulan dilaksanakan setelah usia kandungan masuk sembilan bulan. Dalam upacara ini diadakan pengajian dengan maksud agar bayi yang dikandung cepat lahir dengan selamat karena sudah waktunya lahir. Dalam upacara ini dibuar bubur lolos, sebagai simbul dari upacara ini yaitu supaya mendapat kemudahan waktu melahirkan, lolos. Bubur lolos ini biasanya dibagikan beserta nasi tumpeng atau makanan lainnya.");
        values.put("link", "https://www.youtube.com/watch?v=TSLH6dmBiGk&ab_channel=AyuShintaBella");
        values.put("img", R.drawable.imv_adat_tradisional_9bulan);
        db.insert("budaya", "_id", values);

        values.put("_id", "113");
        values.put("nama", "Upacara Reuneuh Mundingeun");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara Reuneuh Mundingeun dilaksanakan apabila perempuan yang mengandung lebih dari sembilan bulan, bahkan ada yang sampai 12 bulan tetapi belum melahirkan juga, perempuan yang hamil itu disebut Reuneuh Mundingeun, seperti munding atau kerbau yang bunting. Upacara ini diselenggarakan agar perempuan yang hamil tua itu segera melahirkan jangan seperti kerbau, dan agar tidak terjadi sesuatu yang tidak diinginkan.\n" +
                "\n" +
                "Pada pelaksanaannya leher perempuan itu dikalungi kolotok dan dituntun oleh indung beurang sambil membaca doa dibawa ke kandang kerbau. Kalau tidak ada kandang kerbau, cukup dengan mengelilingi rumah sebanyak tujuh kali. Perempuan yang hamil itu harus berbuat seperti kerbau dan menirukan bunyi kerbau sambil dituntun dan diiringkan oleh anak-anak yang memegang cambuk. Setelah mengelilingi kandang kerbau atau rumah, kemudian oleh indung beurang dimandikan dan disuruh masuk ke dalam rumah. Di kota pelaksanaan upacara ini sudah jarang dilaksanakan.");
        values.put("link", "https://www.youtube.com/watch?v=J33MfXW3BJw&ab_channel=maulanaakhmad");
        values.put("img", R.drawable.imv_adat_tradisional_reuneuh_mundingan);
        db.insert("budaya", "_id", values);

        values.put("_id", "114");
        values.put("nama", "Upacara Memelihara Tembuni");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Tembuni/placenta dipandang sebagai saudara bayi karena itu tidak boleh dibuang sembarangan, tetapi harus diadakan upacara waktu menguburnya atau menghanyutkannya ke sungai. Bersamaan dengan bayi dilahirkan, tembuni (placenta) yang keluar biasanya dirawat dibersihkan dan dimasukan ke dalam pendil dicampuri bumbu-bumbu garam, asam dan gula merah lalu ditutup memakai kain putih yang telah diberi udara melalui bambu kecil (elekan). Pendil diemban dengan kain panjang dan dipayungi, biasanya oleh seorang paraji untuk dikuburkan di halaman rumah atau dekat rumah. Ada juga yang dihanyutkan ke sungai secara adat. Upacara penguburan tembuni disertai pembacaan doa selamat dan menyampaikan hadiah atau tawasulan kepada Syeh Abdulkadir Jaelani dan ahli kubur. Didekat kuburan tembuni itu dinyalakan cempor/pelita sampai tali pusat bayi lepas dari perutnya.. Upacara pemeliharaan tembuni dimaksudkan agar bayi itu selamat dan kelak menjadi orang yang berbahagia.");
        values.put("link", "https://www.youtube.com/watch?v=Ti3fV8qTtCw&ab_channel=Lucky86");
        values.put("img", R.drawable.imv_adat_tradisional_tembuni);
        db.insert("budaya", "_id", values);

        values.put("_id", "115");
        values.put("nama", "Upacara Nenjrag Bumi");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara Nenjrag Bumi ialah upacara memukulkan alu ke bumi sebanyak tujuh kali di dekat bayi, atau cara lain yaitu bayi dibaringkan diatas pelupuh (lantai dari bambo yang dibelah-belah ), kemudian indung beurang menghentakkan kakinya ke pelupuh di dekat bayi. Maksud dan tujuan dari upacara ini ialah agar bayi kelak menjadi anak yang tidak lekas terkejut atau takut jika mendengar bunyi yang tiba-tiba dan menakutkan.");
        values.put("link", "https://www.youtube.com/watch?v=K-4OwRSli5o&ab_channel=ApihHendiOfficial");
        values.put("img", R.drawable.imv_adat_tradisional_nenjrag_bumi);
        db.insert("budaya", "_id", values);

        values.put("_id", "116");
        values.put("nama", "Upacara Puput Puseur");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Setelah bayi terlepas dari tali pusatnya, biasanya diadakan selamatan. Tali pusat yang sudah lepas itu oleh indung beurang dimasukkan ke dalam kanjut kundang. Seterusnya pusar bayi ditutup dengan uang logam/benggol yang telah dibungkus kasa atau kapas dan diikatkan pada perut bayi, maksudnya agar pusat bayi tidak dosol, menonjol ke luar. Ada juga pada saat upacara ini dilaksanakan sekaligus dengan pemberian nama bayi. Pada upacara ini dibacakan doa selamat, dan disediakan bubur merah bubur putih.\n" +
                "\n" +
                "Ada kepercayaan bahwa tali pusat (tali ari-ari) termasuk saudara bayi juga yang harus dipelihara dengan sungguh-sungguh. Adapun saudara bayi yang tiga lagi ialah tembuni, pembungkus, dan kakawah. Tali ari, tembuni, pembungkus, dan kakawah biasa disebut dulur opat kalima pancer, yaitu empat bersaudara dan kelimanya sebagai pusatnya ialah bayi itu. Kesemuanya itu harus dipelihara dengan baik agar bayi itu kelak setelah dewasa dapat hidup rukun dengan saudara-saudaranya (kakak dan adiknya) sehingga tercapailah kebahagiaan.");
        values.put("link", "https://www.youtube.com/watch?v=0VaDEACkfqA&ab_channel=AgusSetiawanOfficial");
        values.put("img", R.drawable.imv_adat_tradisional_puput_puseur);
        db.insert("budaya", "_id", values);

        values.put("_id", "117");
        values.put("nama", "Upacara Ekah");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Sebetulnya kata ekah berasal dari bahasa Arab, dari kata aqiqatun \"anak kandung\". Upacara Ekah ialah upacara menebus jiwa anak sebagai pemberian Tuhan, atau ungkapan rasa syukur telah dikaruniai anak oleh Tuhan Yang Maha Kuasa, dan mengharapkan anak itu kelak menjadi orang yang saleh yang dapat menolong kedua orang tuanya nanti di alam akhirat. Pada pelaksanaan upacara ini biasanya diselenggarakan setelah bayi berusia 7 hari, atau 14 hari, dan boleh juga setelah 21 hari. Perlengkapan yang harus disediakan adalah domba atau kambing untuk disembelih, jika anak laki-laki dombanya harus dua (kecuali bagi yang tidak mampu cukup seekor), dan jika anak perempuan hanya seekor saja. Domba yang akan disembelih untuk upacara Ekah itu harus yang baik, yang memenuhi syarat untuk kurban. Selanjutnya domba itu disembelih oleh ahlinya atau Ajengan dengan pembacaan doa selamat, setelah itu dimasak dan dibagikan kepada handai tolan.");
        values.put("link", "https://www.youtube.com/watch?v=zSdLkOCCxdc&ab_channel=Sholahudin30");
        values.put("img", R.drawable.imv_adat_tradisional_ekah);
        db.insert("budaya", "_id", values);

        values.put("_id", "118");
        values.put("nama", "Upacara Nurunkeun");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara Nurunkeun ialah upacara pertama kali bayi dibawa ke halaman rumah, maksudnya mengenal lingkungan dan sebagai pemberitahuan kepada tetangga bahwa bayi itu sudah dapat digendong dibawa berjalan-jalan di halaman rumah. Upacara Nurun keun dilaksanakan setelah tujuh hari upacara Puput Puseur. Pada pelaksanaannya biasa diadakan pengajian untuk keselamatan dan sebagai hiburannya diadakan pohon tebu atau pohon pisang yang digantungi aneka makanan, permainan anak-anak yang diletakan di ruang tamu. Untuyk diperebutkan oleh para tamu terutama oleh anak-anak.");
        values.put("link", "https://www.youtube.com/watch?v=nDD6s7CmrJI&ab_channel=SiCapunkMartadipura");
        values.put("img", R.drawable.imv_adat_tradisional_nurunkeun);
        db.insert("budaya", "_id", values);

        values.put("_id", "119");
        values.put("nama", "Upacara Cukuran/Marhaban");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara cukuran atau dimaksudkan untuk membersihkan menyucikan rambut bayi dari segala macam najis. Upacara cukuran atau marhabaan juga merupakan ungkapan syukuran atau terima kasih kepada Tuhan YME yang telah mengkaruniakan seorang anak yang telah lahir dengan selamat. Upacara cukuran dilaksanakan pada saat bayi berumur 40 hari.Pada pelaksanaannya bayi dibaringkan di tengah-tengah para undangan disertai perlengkapan bokor yang diisi air kembang 7 rupa dan gunting yang digantungi perhiasan emas berupa kalung, cincin atau gelang untuk mencukur rambut bayi. Pada saat itu mulailah para undangan berdo'a dan berjanji atau disebut marhaban atau pupujian, yaitu memuji sifat-sifat nabi Muhammad saw. Dan membacakan doa yang mempunyai makna selamat lahir bathin dunia akhirat. Pada saat marhabaan itulah rambut bayi digunting sedikit oleh beberapa orang yang berdoa pada saat itu.");
        values.put("link", "https://www.youtube.com/watch?v=N4tJV98fiKA&ab_channel=ayuni");
        values.put("img", R.drawable.imv_adat_tradisional_cukuran);
        db.insert("budaya", "_id", values);

        values.put("_id", "120");
        values.put("nama", "Upacara Turun Taneuh");
        values.put("kategori", "Adat Tradisional");
        values.put("deskripsi", "Upacara Turun Taneuh ialah upacara pertama kali bayi menjejakkan kakinya ke tanah, diselenggarakan setelah bayi itu agak besar, setelah dapat merangkak atau melangkah sedikit-sedikit. Upacara ini dimaksudkan agar si anak mengetahui keduniawian dan untuk mengetahui akan menjadi apakah anak itu kelak, apakah akan menjadi petani, pedagang, atau akan menjadi orang yang berpangkat.\n" +
                "\n" +
                "Perlengkapan yang disediakan harus lebih lengkap dari upacara Nurunkeun, selain aneka makanan juga disediakan kain panjang untuk menggendong, tikar atau taplak putih, padi segenggam, perhiasan emas (kalung, gelang, cincin), uang yang terdiri dari uang lembaran ratusan,rebuan, dan puluh ribuan.\n" +
                "\n" +
                "Jalannya upacara, apabila para undangan telah berkumpul diadakan doa selamat, setelah itu bayi digendong dan dibawa ke luar rumah. Dihalaman rumah telah dipersiapkan aneka makanan, perhiasan dan uang yang disimpan di atas kain putih, selanjutnya kaki si anak diinjakan pada padi/makanan, emas, dan uang, hal ini dimaksudkan agar si anak kelak pintar mencari nafkah. Kemudian anak itu dilepaskan di atas barang-barang tadi dan dibiarkan merangkak sendiri, para undangan memperhatikan barang apa yang pertama kali dipegangnya. Jika anak itu memegang padi, hal itu menandakan anak itu kelak menjadi petani. Jika yang dipegang itu uang, menandakan anak itu kelak menjadi saudagar/pengusaha. Demikian pula apabila yang dipegangnya emas, menandakan anak itu kelak akan menjadi orang yang berpangkat atau mempunyai kedudukan yang terhormat.");
        values.put("link", "https://www.youtube.com/watch?v=UKLdOj7_4NY&ab_channel=ArifPratama");
        values.put("img", R.drawable.imv_adat_tradisional_turun_taneuh);
        db.insert("budaya", "_id", values);

    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS budaya");
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);

    }

}
