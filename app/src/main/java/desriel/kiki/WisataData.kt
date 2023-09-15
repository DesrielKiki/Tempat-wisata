package desriel.kiki

object WisataData {
    private val TempatWisata = arrayOf(
        "Istana Maimun",
        "Kota Lama",
        "Candi Borobudur",
        "Lawang Sewu",
        "Candi Gedong Songo",
        "Candi Muara Takus",
        "Lobang Jepang",
        "Masjid Raya Baiturrahman",
        "Danau TobaV",
        "Kota Tua"
    )

    private val Lokasi = arrayOf(
        "Kota Medan, Sumatera Utara",
        "Kota Semarang, Jawa Tengah",
        "Magelang, Jawa Tengah",
        "Kota Semarang, Jawa Tengah",
        "Bandungan, Kabupaten Semarang, Jawa Tengah",
        "Kabupaten Kampar, Provinsi Riau.",
        "Kota Bukittinggi, Sumatera Barat",
        "Kota Banda Aceh, Aceh",
        "Sumatra Utara",
        "Jakarta"
    )

    private val wisataImage = intArrayOf(
        R.drawable.a_istana_maimun,
        R.drawable.b_kota_lama,
        R.drawable.c_candi_borobudur,
        R.drawable.d_lawang_sewu,
        R.drawable.e_gedong_songo,
        R.drawable.f_candi_muara_takus,
        R.drawable.g_lobang_jepang,
        R.drawable.h_masjid_baiturrahman,
        R.drawable.i_danau_toba,
        R.drawable.j_kota_tua)

private val deskripsiWisata = arrayOf(
    "Istana Maimun yang megah adalah bekas peninggalan Kesultanan Deli. Objek wisata bersejarah di Indonesia ini mulai dibangun sejak 26 Agustus 1888 hingga selesai pada 18 Mei 1891, dan sampai saat ini masih berdiri megah dan kokoh.\n" +
            "\n" +
            "Bangunan bersejarah yang identik dengan warna kuning keemasan cerah itu adalah hasil karya arsitek asal Italia bernama Theo Van Erp. Dengan otaknya yang cemerlang, beliau berhasil menggabungkan konsep arsitektur tradisional bergaya melayu, timur tengah, dan Eropa saat membangun istana ini. Konsep arsitektur yang unik ini kemudian dilengkapi dengan furnitur yang tak kalah mewahnya menjadikan Istana Maimun salah satu ikon wisata sejarah di Indonesia yang wajib kamu kunjungi.\n",
    "Kawasan Kota Lama di Semarang merupakan lanskap bersejarah. Pernah menjadi pusat perdangangan riuh di abad 19 dan 20, kawasan Kota Lama Semarang memiliki sekitar 50 bangunan kuno yang masih berdiri dengan kokoh dan mempunyai nilai sejarah tinggi. Para pelancong yang mengunjungi objek wisata sejarah Indonesia ini akan disuguhi bangunan dengan arsitektur benua Eropa sekitar tahun 1700-an lengkap dengan atap yang unik, penggunaan kaca warna-warni, dan ukuran pintu serta jendela yang besar.\n" +
            "\n" +
            "Saking tua dan bersejarahnya kawasan ini, rencananya Kota Lama Semarang akan diajukan menjadi salah satu Situs Warisan Dunia UNESCO. Kota Lama Semarang tak hanya menarik perhatian turis domestik. Banyak juga turis mancanegara yang melancong ke daerah ini. Jika kamu ingin menambah wawasan sejarahmu, destinasi wisata sejarah di Indonesia satu ini bisa jadi salah satu pilihan yang menarik.\n",
    "Siapa yang tak kenal Candi Borobudur? Dibangun di era Raja Samaratungga dari Dinasti Syailendra pada tahun 825 M, objek wisata sejarah Indonesia yang telah mendunia ini memiliki tinggi 42 meter yang terdiri dari 10 tingkat. \n" +
            "\n" +
            "Arsitek Borobodur, Gunadharma, berhasil membuat 2672 panel relief yang menghiasi seluruh permukaan candi bercorak Buddha terbesar itu. Buat kamu yang ingin mencari tempat bersejarah sebagai destinasi wisatamu berikutnya, Candi Borobudur merupakan pilihan yang tepat. Di area candi ini sendiri terdapat pemandu tur yang siap menceritakan kisah yang diketahuinya mengenai candi ini.\n",
    "Gedung megah nan indah yang berwarna putih ini merupakan salah satu ikon Kota Semarang. Lawang Sewu dibangun pada 1904. Dulunya gedung ini digunakan sebagai kantor dari Nederlands-Indische Spoorweg Maatschappij atau NIS.\n" +
            "\n" +
            "Pada masa penjajahan Jepang, gedung ini sempat disulap menjadi penjara bawah tanah yang digunakan untuk menyiksa para penduduk pribumi. Selain itu, Lawang Sewu juga pernah menjadi tempat pertempuran antara Angkatan Pemuda Kereta Api (AMKA) melawan Jepang.\n" +
            "\n" +
            "Para pemuda yang meninggal itu kemudian dimakamkan di halaman Lawang Sewu. Namun pada 1975, jenazah para pemuda ini dipindahkan di makam pahlawan. Untuk memperingati gugurnya pemuda-pemuda ini, dibangunlah Tugu Muda di depan Lawang Sewu.\n",
    "Candi Gedong Songo merupakan peninggalan Kerajaan Mataram Kuno yang dibangun sekitar abad ke-8. Rakai Mataram Sang Ratu Sanjaya raja adalah yang membangun Candi Gedong Songo pada awal pemerintahannya. Namun, candi peninggalan budaya Hindu ini baru ditemukan oleh Sir Thomas Stamford Raffles pada 1804. \n" +
            "\n" +
            "Mulanya, hanya ditemukan tujuh buah bangunan candi, sehingga dinamakan Candi Gedong Pitu. Kemudian pada sekitar tahun 1908 hingga 1911, arkeolog asal Belanda bernama Van Stein Callenfels menemukan dua bangunan candi tambahan. Sejak saat itu, namanya berubah menjadi Candi Gedong Songo dan pernah dilakukan pemugaran sebanyak dua kali.\n",
    "Candi Muara Takus diperkirakan dibangun pada masa perkembangan agama Hindu dan Buddha di Indonesia. Meski demikian, asal-usul dari pendirian candi ini masih belum banyak ditemukan karena kurangnya bukti-bukti yang kuat.\n" +
            "Candi Muara Takus diperkirakan dibangun pada masa Kerajaan Sriwijaya, yakni antara abad ke-4 hingga 11 M. Candi ini merupakan candi Budha tertua di Indonesia yang ditemukan di Sumatera. Hal ini dibuktikan pada bentuk stupa yang merupakan lambang dari Budha Gautama. Pada bangunan candi ini juga terdapat Yoni dan Lingga sebagai simbol dari jenis kelamin dan juga ada kemiripan arsitekturnya dengan candi-candi yang berada di Myanmar. Hal itu karena Candi Muara Takus merupakan perpaduan antara Budha dan Syiwa.\n",
    "Lobang Jepang dibangun atas instruksi dari Letjen Moritake Tanabe. Dia adalah Panglima Divisi ke-25 Angkatan Darat Jepang. Panjang Lobang Jepang mencapai 6 kilometer dan lebarnya sekitar 2 meter. Terowongan ini didesain dengan banyak kelokan di dalamnya. Dibangun sejak Maret 1942, terowongan ini selesai dikerjakan pada Maret 1944. Kedalamannya sendiri mencapai 49 meter di bawah permukaan tanah. Pembangunan Lobang Jepang dilakukan secara paksa. Pemerintah Jepang saat itu mendatangkan pekerja dari berbagai daerah, seperti Jawa, Kalimantan, hingga Sulawesi. Selain itu, pembangunan terowongan ini sama sekali tidak melibatkan masyarakat sekitar Bukittinggi. Tujuannya adalah untuk menjaga kerahasiaan.",
    "Masjid Raya Baiturrahman didirikan pada masa kekuasaan Sultan Iskandar Muda dari Kesultanan Aceh Darussalam, tepatnya 1022H/1612M. Masjid ini menjadi saksi sejarah kehidupan rakyat Aceh, menjadi pusat pendidikan umat Islam, dan tetap kukuh meski diterjang tsunami pada 2004. \n" +
            "Masjid Raya Baiturrahman yang terletak di pusat kota Banda Aceh, menjadi simbol agama, budaya, jiwa, ketangguhan, dan perjuangan masyarakat Aceh. Pada masa awal pendirian, Masjid Raya Baturrahman tidak hanya menjadi tempat ibadah semata. Masjid ini dijadikan Kesultanan Aceh sebagai pusat pendidikan ilmu agama Islam. Mengutip laman Islamic Center, para penuntut ilmu yang datang ke masjid tersebut tidak hanya berasal dari warga lokal, tetapi juga berasal dari Melayu, Persia, Arab, hingga Turki.\n",
    "Danau Toba adalah sebuah keajaiban alam yang sangat menakjubkan. Danau ini diperkirakan terbentuk dari letusan dahsyat sebuah gunung api, Gunung Toba, yang terjadi sekitar 74.000 tahun yang lalu. Dengan luas lebih dari 1.145 kilometer persegi dan kedalaman 450 meter, Danau Toba sebenarnya lebih mirip lautan daripada danau. Di tengah danau vulkanik terbesar di dunia ini juga terdapat sebuah pulau yang berukuran cukup besar, yaitu Pulau Samosir.",
    "Batavia Lama adalah sebutan dari Kota Tua Jakarta merupakan pusat perdagangan bagi benua Asia pada jaman pemerintahan Hindia Belanda. Sejarah Kota Tua Jakarta Pada waktu itu para pelayar serta pedagang dari seluruh dunia terutama Asia melakukan transaksinya di sini. Oleh para pelayar dari Eropa kawasan ini ini juga dijuluki sebagai “Ratu dari Timur” serta “Permata Asia”. Wilayah kota ini melintasi daerah Jakarta Barat serta Jakarta Utara dan memiliki luas kurang lebih sekitar 139 hektar. Saat ini Kota Tua Jakarta menjadi objek wisata di mana terdapat berbagai macam bangunan atau gedung dengan arsitektur bergaya Eropa dan Cina. Gedung-gedung tersebut sudah dibangun sejak abad ke-17.")
    val listData: ArrayList<TempatWisata>
        get() {
            val list = arrayListOf<TempatWisata>()
            for (position in TempatWisata.indices) {
                val wisata = TempatWisata()
                wisata.name = TempatWisata[position]
                wisata.lokasi = Lokasi[position]
                wisata.photo = wisataImage[position]
                wisata.deskripsi = deskripsiWisata[position]
                list.add(wisata)
            }
            return list
        }
}