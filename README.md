# IF3210-2022-Android-10
Tugas besar 1 mata kuliah IF3210 Pengembangan Aplikasi Platform Khusus, Platform Android
## Deskripsi Aplikasi
Aplikasi berisi fitur-fitur yang membantu mengakses berita, mencari faskes, dan mempermudah berpergian selama masa pandemi
## Cara Kerja Aplikasi
* Aplikasi dapat mencari dan menampilkan daftar faskes berdasarkan daerah yang dipilih dengan memilih provinsi, kemudian kota/kabupaten
* Daftar faskes yang ditampilkan adalah 5 faskes yang terdekat dari lokasi pengguna
* Aplikasi dapat melihat detail dari faskes yang dipilih dari pencarian sebelumnya, seperti nama, kode, alamat, nomor telepon, jenis faskes, dan status kesiapannya
* Pada halaman yang sama, terdapat tombol untuk bookmark faskes tersebut atau menghilangkan bookmark
* Pada halaman ini juga dapat membuka lokasi faskes dengan google maps
* Aplikasi juga dapat membuka daftar faskes bookmark
* Aplikasi juga dapat memindai QR code untuk melakukan check in
* Saat check in, aplikasi akan mengirimkan kode dari QR code dan informasi latitude-longitude ke API, yang kemudian mengembalikan respon yang sesuai
* Terdapat 4 jenis respon, berhasil, gagal karena belum vaksin, bahaya karena positif covid-19, dan hati-hati
* Pada halaman check in juga ditampilkan suhu ruangan, tetapi hal ini tidak selalu tersedia karena tidak banyak device yang memiliki pengukur suhu sekitar
## Library yang Digunakan
* Retrofit   : Untuk mengirimkan request ke API
* ZXing      : Untuk barcode scanner yang memindai QR scanner
* Coroutines : Untuk melakukan pengambilan data secara asinkron
* Fragment   : Untuk menampilkan recyclerview
* Location   : Untuk memperoleh data lokasi pengguna
* Navigation : Untuk membuat navigation bar di bagian bawah
* Room       : Untuk database yang menyimpan bookmark
* Glide      : Untuk menampilkan gambar sebagai thumbnail berita
## Screenshot Aplikasi
### Light Mode
<img src="./Screenshots/SplashScreenLight.png" width="128">
<img src="./Screenshots/NewsLight.png" width="128">
<img src="./Screenshots/DetailNewsLight.png" width="128">
<img src="./Screenshots/SearchFaskesLight.png" width="128">
<img src="./Screenshots/DetailFaskesLight.png" width="128">
<img src="./Screenshots/BookmarkFaskesLight.png" width="128">
<img src="./Screenshots/ScanLight.png" width="128">

### Landscape
<img src="./Screenshots/DetailFaskesLandscape.png" height="128">
<img src="./Screenshots/SearchFaskesLandscape.png" height="128">

### Dark mode
<img src="./Screenshots/SplashScreen.jpg" width="128">
<img src="./Screenshots/SearchFaskes.jpg" width="128">
<img src="./Screenshots/DetailFaskes.jpg" width="128">
<img src="./Screenshots/BookmarkFaskes.jpg" width="128">
<img src="./Screenshots/CheckIn.jpg" width="128">
<img src="./Screenshots/CheckInBlack.jpg" width="128">
<img src="./Screenshots/CheckInRed.jpg" width="128">

## Pembagian Kerja
* Raffi Zulvian Muzhaffar (13519003)    : Berita COVID-19
* Jesica (13519011)                     : Cari Faskes, Detail Faskes, Bookmark Faskes, Bottom Navigation, Splash Screen
* Ilyasa Salafi Putra Jamal (13519023)  : Menu Check-In

