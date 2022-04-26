package com.Dwipa.myrecyclerview;

import java.util.ArrayList;

class DataMakanan {
    private static String[] NamaMakanan = {
            "Ayam Betutu",
            "Babi Guling",
            "Laklak Bali",
            "Lawar",
            "Sambal Matah",
            "Sate Lilit",
            "Serombotan",
            "Tipat Cantok",
            "Tum Ayam",
            "Sayur Ares"
    };

    private static String[] AboutMakanan = {
            "Betutu adalah lauk yang terbuat dari ayam atau bebek yang utuh yang berisi bumbu, kemudian dipanggang dalam api sekam. Betutu ini telah dikenal di seluruh kabupaten di Bali. Betutu merupakan jenis makanan tradisional daerah Bali yang bahan mentahnya berupa karkas utuh itik dan ayam",
            "Babi guling adalah sejenis makanan yang terbuat dari anak babi betina atau jantan yang perutnya diisikan dengan bumbu dan sayuran seperti daun ketela pohon dan lalu dipanggang sambil diputar-putar sampai matang dengan ditandai dengan perubahan warna kulit menjadi kecokelatan dan renyah.",
            "Kue Laklak atau yang biasa disebut Jaje Laklak dalam masyarakat bali, adalah kue mungil yang berbentuk lingkaran berdiameter 3 cm, dan memiliki rasa yang gak pernah ada matinya. Sangat pas sebagai teman duduk disaat pagi hari, ditambah dengan hangatnya sajian kopi Bali.",
            "Lawar adalah masakan berupa campuran sayur-sayuran dan daging cincang yang dibumbui secara merata yang berasal dari Bali. Makanan ini lazim disajikan dalam rumah tangga di Bali atau dijual secara luas di rumah-rumah makan dengan sebutan lawar Bali",
            "Sambal matah adalah sambal tradisional Bali yang dapat ditemukan di seluruh daerah di Provinsi Bali. matah memiliki arti mentah. Sambal matah merupakan sambal yang berbahan mentah tanpa digerus. Bahan-bahan sambal matah yaitu: bawang merah, cabai merah, terasi, garam, sereh, jeruk lemo dan minyak kelapa.",
            "Sate Lilit adalah sebuah varian sate asal Bali. Sate ini terbuat dari daging babi, ikan, ayam, daging sapi, atau bahkan kura-kura yang dicincang, kemudian dicampur dengan parutan kelapa, santan, jeruk nipis, bawang merah, dan merica.",
            "Serombotan adalah sayuran khas Kabupaten Klungkung, Bali, terbuat dari sayur buah botor muda atau kecipir, terong bulat, pare, tauge, kubis yang dimasak setengah matang. kemudian diberi bumbu disebut kalas yang terdiri dari santan yang diberi tumbukan kunyit, lengkuas, bawang merah dan bawang putih, ketumbar dan sedikit kencur.",
            "Tipat cantok merupakan salah satu makanan khas Bali yang terbuat dari sayuran rebus dan ketupat serta disajikan dengan bumbu kacang. Dalam bahasa Bali, tipat memiliki pengertian \"ketupat\" dan cantok memiliki pengertian \"diuleg/ dihaluskan dengan cobek\".",
            "Tum adalah pepes atau botok khas Bali yang dimasak dengan cara dikukus. Selayaknya pepes, tum juga dibungkus dengan daun pisang.",
            "Sayur ares merupakan makanan khas Pulau Lombok dengan bahan baku utama berupa pelepah atau kedebong pisang yang masih muda. Sayuran ini dimasak dengan santan dan sedikit potongan daging sapi yang nantinya akan dibumbui oleh rempah-rempah alami."
    };

    private static int[] GambarMakanan = {
            R.drawable.ayam_betutu,
            R.drawable.babi_guling,
            R.drawable.laklak_bali,
            R.drawable.lawar_bali,
            R.drawable.sambal_matah,
            R.drawable.sate,
            R.drawable.sayur_ares,
            R.drawable.serombotan,
            R.drawable.tipat_cantok,
            R.drawable.tum_ayam
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < NamaMakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setName(NamaMakanan[position]);
            makanan.setDetail(AboutMakanan[position]);
            makanan.setPhoto(GambarMakanan[position]);
            list.add(makanan);
        }
        return list;
    }
}