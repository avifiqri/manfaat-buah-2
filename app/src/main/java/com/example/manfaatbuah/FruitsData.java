package com.example.manfaatbuah;

import java.util.ArrayList;

public class FruitsData {

    public static String[][] data = new String[][] {

            {"Buah Apel", " 1. Apel bersifat sebagai anti-kanker. \n  2. Menurunkn Kolesterol. \n  3. Meningkankan Sistem Kekebalan Tubuh. \n  4. Mencegah Alzheimer. \n  5. Mengobati Asma \n  6. Mengendalikan Gula Darah. \n  7. Mencegah Batu Empedu \n  8. Menetralkan Irritable Bowel Syndrome.  ","http://1.bp.blogspot.com/-ZiIj3FdJgnI/UVVZ5cSvR5I/AAAAAAAAACo/k8nNtoqtfE0/s400/gambar-buah-apel.jpeg"},
            {" Buah Belimbing Wuluh"," 1. Membantu meredakan batuk. \n  2. Mengobati wajah berjerawat. \n  3. Mengobati sakit gigi. \n  4. Membantu meringankan kaku dan nyeri otot. \n  5. Menyembuhkan sakit linu karena rematik.  ","https://images.f2fcdn.net/files/Nail/belimbing%20wuluh.jpg"},
            {"Buah Ceri", " 1. Kaya akan Nutrisi. \n  2. Pengeluaran Racun. \n  3. Penghilang Rasa Sakit.  \n  4. Sebagai Anti Inflamasi. \n  5. Meningkatkan Gairah Suami Istri. ","http://2.bp.blogspot.com/_hFbn3kZ-qPA/TUOBtxKZ5OI/AAAAAAAAAQI/MK5CH3pQisE/s320/ceri.jpg"},
            {"Buah Delima", " 1. Perawatan Gigi. \n  2. Menjaga Kesehatan Jantung. \n  3. Stenosis arteri karotis. \n  4. Mencegah Kanker Prostat. \n  5. Mengatasi Gangguan Perut \n  6. Menghindari Anemia. ","https://res.cloudinary.com/dk0z4ums3/image/upload/v1504584673/attached_image/4-manfaat-buah-delima-yang-perlu-kamu-tahu-alodokter.jpg"},
            {"Buah Jeruk ", " 1. Menjaga fungsi otak. \n  2. Daya tahan tubuh terhadap penyakit. \n  3. Sebagai Antioksidan. \n  4. Menurunkan resiko kanker hati. \n  5. Memelihara kesehatan Jantung. \n  6. Terhindar dari infeksi bakteri.  ","http://3.bp.blogspot.com/-xE93e80eS_8/TnMHvpIwm5I/AAAAAAAAA5o/PVOyYlDp_mE/s1600/jeruk.jpg"},
            {"Buah Kiwi", " 1. Membantu Mengelola Tekanan Darah. \n  2. Melindungi dari Kerusakan DNA. \n  3. Meningkatkan Kekebalan Tubuh. \n  4. Untuk Berat Badan. \n 5. Meningkatkan Kesehatan Pencernaan. \n 6. Membantu menghilangkan Racun.","https://cdn.sindonews.net/dyn/620/content/2017/03/10/155/1187028/buah-buahan-ini-menjaga-daya-tahan-tubuh-anak-cS4.jpg"},
            {"Buah Langsat", " 1. Membantu Mencegah Kanker. \n  2. Mengobati Demam dan Flu. \n  3. Memperkuat Tulang dan Gigi. \n  4. Baik untuk Penderita Diabetes. \n  5. Membantu Mengontrol Kolesterol. \n  6. Meredakan Sakit Migrain. \n  7. Sebagai Anti Malaria.","https://c1.staticflickr.com/3/2724/4117395288_8aaec5217f.jpg"},
            {"Buah Manggis ", " 1. Menjaga kesehatan kulit. \n  2.Mengatasi diabetes dan kardiovaskular. \n  3. Sebagai antioksidan. \n  4. Mengurangi berat badan.  ","http://images.wisegeek.com/whole-and-cut-mangosteen.jpg"},
            {"Buah Nanas ", " 1. Melawan radikal bebas. \n  2. Menjaga kesehatan jantung. \n  3. Membantu menurunkan kadar lemak. \n  4. Meningkatkan daya tahan tubuh. \n  5. Menyehatkan mata." ,"http://i.ndtvimg.com/mt/cooks/2014-11/pineapple-annanas.jpg"},
            {"Buah Pisang", " 1. Kaya kandungan vitamin dan serat. \n  2. Sumber energi. \n  3. Menurunkan berat badan. \n  4. Meningkatkan kesehatan otak. \n  5. Mengobati jerawat \n  6. Menghaluskan kulit wajah. ","http://3.bp.blogspot.com/-vdhoJfMWqHw/VqVv77SKutI/AAAAAAAACRI/smQgRC4r85Q/s1600/IMG_7093.jpg"},
            {"Buah Tin", " 1. Anti Bakteri, virus dan jamur. \n  2. Untuk Diet. \n  3. Pembentukan sel darah merah. \n  4. Mempelancar Sistem Pencernaan. \n  5. Mencegah resiko penyakit jantung. \n  6. Kalsium. ","https://i.ytimg.com/vi/yaNCPYvkv8E/hqdefault.jpg"}
    };


    public static ArrayList<Fruits> getListData() {
        ArrayList<Fruits>list = new ArrayList<>();
        for (String[] aData: data){
            Fruits fruits = new Fruits();

            fruits.setName(aData[0]);
            fruits.setFunction(aData[1]);
            fruits.setPhoto(aData[2]);


            list.add(fruits);

        }

        return list;
    }



}

