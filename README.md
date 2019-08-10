<h2>Kriteria</h2>
<p>Fitur yang harus ditambahkan pada aplikasi:</p>
<ol>
<li><strong>Pencarian film</strong><br />Syarat<strong>:</strong>
<ul>
<li>Pengguna dapat melakukan pencarian&nbsp;<strong>Movies</strong>.</li>
<li>Pengguna dapat melakukan pencarian&nbsp;<strong>Tv Show</strong>.<br /><br /></li>
</ul>
</li>
<li><strong>Widget</strong><br />Syarat<strong>:</strong>
<ul>
<li>Pengguna dapat menampilkan widget dari film favorite ke halaman utama smartphone.</li>
<li>Tipe widget yang diterapkan adalah&nbsp;<strong>Stack Widget</strong>.<br /><br /></li>
</ul>
</li>
<li><strong>Reminder</strong><br />Syarat<strong>:</strong>
<ul>
<li>Daily Reminder, mengirimkan notifikasi ke pengguna untuk kembali ke&nbsp;<strong>Aplikasi Movie Catalogue</strong>. Daily reminder harus selalu berjalan tiap jam 7 pagi.</li>
<li>Release Today Reminder, mengirimkan notifikasi ke pengguna berupa informasi film yang rilis<em>&nbsp;</em>hari ini (<strong>wajib menggunakan endpoint seperti yang telah disediakan pada bagian Resources di bawah</strong>). Release reminder harus selalu berjalan tiap jam 8 pagi.</li>
<li>Terdapat halaman pengaturan untuk mengaktifkan dan menonaktifkan reminder.<br /><br /></li>
</ul>
</li>
<li><strong>Aplikasi</strong>&nbsp;<strong>Favorite</strong><br />Syarat<strong>:</strong>
<ul>
<li>Membuat aplikasi atau modul baru yang menampilkan daftar film favorite.</li>
<li>Menggunakan&nbsp;<strong>Content Provider</strong>&nbsp;sebagai mekanisme untuk mengakses data dari satu aplikasi ke aplikasi lain.</li>
</ul>
</li>
</ol>
<p>&nbsp;</p>
<p title="">Berikut kerangka tampilan yang bisa Anda gunakan sebagai referensi:</p>
<p title=""><img class="fr-dib fr-draggable fr-fil" src="https://dicodingacademy.blob.core.windows.net/academies/201902180856320073cc3b59071a00e26d5be08eecc67d.png" alt="201902180856320073cc3b59071a00e26d5be08eecc67d.png" /></p>
<p title="">&nbsp;</p>
<p title="">Kesempatan untuk submission Anda diterima akan lebih besar jika:</p>
<ul>
<li>Notifikasi dapat berjalan pada perangkat Oreo dan setelahnya</li>
<li>Data pada&nbsp;<strong>widget</strong>&nbsp;dapat diperbarui secara otomatis ketika terdapat perubahan pada data&nbsp;<strong>favorite</strong>.</li>
<li>Menggunakan&nbsp;<strong>SearchView</strong>&nbsp;pada fitur pencarian film.</li>
<li title="">Menggunakan library pihak ketiga seperti Retrofit, Fast Android Networking, dsb.</li>
<li title="">Menggunakan library penyimpanan lokal pihak ketiga seperti Room, Realm, dsb.</li>
<li title="">Menerapkan design pattern seperti MVP, MVVM, Arch Component, dsb.</li>
<li title="">Aplikasi bisa memberikan pesan eror jika data tidak berhasil ditampilkan.</li>
<li dir="ltr" title="">Menuliskan kode dengan bersih.</li>
</ul>
<p title="">&nbsp;</p>
<p dir="ltr" title="">Submission Anda akan ditolak jika:</p>
<ul>
<li>Fitur&nbsp;<strong>pencarian</strong>&nbsp;tidak berjalan dengan baik.</li>
<li>Fitur&nbsp;<strong>pencarian</strong>&nbsp;tidak memanfaatkan endpoint dari&nbsp;<strong>TheMovieDB</strong>.</li>
<li>Fitur&nbsp;<strong>reminder</strong>&nbsp;tidak berjalan dengan baik.</li>
<li>Fitur&nbsp;<strong>release today reminder</strong>&nbsp;tidak memanfaatkan endpoint dari&nbsp;<strong>TheMovieDB.</strong></li>
<li>Tidak dapat menampilkan data favorite ke dalam&nbsp;<strong>Stack Widget</strong>.</li>
<li>Tidak terdapat aplikasi atau modul baru yang menampilkan data&nbsp;<strong>favorite</strong>.</li>
<li>Tidak menerapkan&nbsp;<strong>Content Provider</strong>&nbsp;sebagai mekanisme untuk mengakses data dari satu aplikasi ke aplikasi lain.</li>
<li title="">Tidak Mempertahankan semua fitur aplikasi dan komponen yang digunakan pada<strong>&nbsp;</strong>aplikasi&nbsp;<strong>Movie Catalogue</strong><strong>&nbsp;(Local Storage).</strong></li>
<li dir="ltr" title="">
<p dir="ltr" title="">Informasi yang ditampilkan pada daftar ataupun detail film, tidak relevan.</p>
</li>
<li dir="ltr" title="">
<p dir="ltr" title="">Aplikasi&nbsp;<strong>force closed</strong>.</p>
</li>
<li dir="ltr" title="">
<p dir="ltr" title="">Project tidak bisa di-build.</p>
</li>
<li dir="ltr" title="">
<p dir="ltr" title="">Mengirimkan file selain proyek Android Studio.</p>
</li>
<li dir="ltr" title="">
<p dir="ltr" title="">Mengirimkan proyek yang bukan karya sendiri.</p>
</li>
</ul>
<p>&nbsp;</p>
<h2>Resources</h2>
<p>Gunakan endpoint berikut untuk melakukan pencarian film.<br /><strong>Movies</strong>:&nbsp;https://api.themoviedb.org/3/search/movie?api_key=<strong>{API KEY}</strong>&amp;language=en-US&amp;query=<strong>{MOVIE NAME}</strong><br /><strong>Tv</strong>&nbsp;<strong>Show</strong>:&nbsp;https://api.themoviedb.org/3/search/tv?api_key=<strong>{API KEY}</strong>&amp;language=en-US&amp;query=<strong>{TV SHOW NAME}</strong><br /><strong>Contoh:&nbsp;</strong>https://api.themoviedb.org/3/search/movie?api_key=<strong>123456789</strong>&amp;language=en-US&amp;query=<strong>Avenger</strong></p>
<p>&nbsp;</p>
<p>Gunakan endpoint berikut untuk mendapatkan film yang rilis pada tanggal hari ini.<br /><strong>Movies release</strong>:&nbsp;https://api.themoviedb.org/3/discover/movie?api_key={<strong>API KEY</strong>}&amp;primary_release_date.gte={<strong>TODAY DATE</strong>}&amp;primary_release_date.lte={<strong>TODAY DATE</strong>}<br /><strong>Contoh</strong>:&nbsp;https://api.themoviedb.org/3/discover/movie?api_key=<strong>123456789</strong>&amp;primary_release_date.gte=<strong>2019-01-31</strong>&amp;primary_release_date.lte=<strong>2019-01-31</strong><br /><strong>Catatan</strong>: Pastikan format tanggal yang kalian gunakan benar.&nbsp;Format tanggal yang digunakan adalah&nbsp;<strong>"yyyy-MM-dd"</strong>.</p>
<p>&nbsp;</p>
<p><strong>Ketentuan</strong></p>
<p dir="ltr" title="">Beberapa ketentuan umum dari proyek aplikasi:</p>
<ul>
<li dir="ltr" title="">
<p dir="ltr" title="">Menggunakan&nbsp;<strong>Android Studio.</strong></p>
</li>
<li dir="ltr" title="">
<p dir="ltr" title="">Menggunakan bahasa pemrograman&nbsp;<strong>Kotlin</strong>&nbsp;atau&nbsp;<strong>Java</strong>.</p>
</li>
<li dir="ltr" title="">
<p dir="ltr" title="">Mengirimkan pekerjaan Anda dalam bentuk folder Proyek Android Studio yang telah diarsipkan (<strong>ZIP</strong>).</p>
</li>
<li dir="ltr" title="">Tim penilai akan mengulas submission Anda dalam waktu&nbsp;<strong>selambatnya</strong><strong>&nbsp;3 (tiga) hari kerja</strong>&nbsp;(tidak termasuk Sabtu, Minggu, dan hari libur nasional).</li>
<li dir="ltr" title="">Tidak disarankan untuk melakukan submit berkali-kali karena akan memperlama proses penilaian yang dilakukan tim penilai.</li>
<li dir="ltr" title="">Anda akan mendapat notifikasi hasil pengumpulan submission Anda via email, atau Anda dapat mengecek status submission pada akun Dicoding Anda.</li>
</ul>
<p title="">&nbsp;</p>
<h2 dir="ltr" title="">Tips</h2>
<p dir="ltr" title="">Sebelum mengirimkan proyek, pastikan Anda sudah mengekspornya dengan benar.</p>
<p dir="ltr" title="">Bagaimana cara ekspor proyek ke dalam berkas&nbsp;<strong>ZIP</strong>?</p>
<ol>
<li dir="ltr" title="">
<p dir="ltr" title="">Pilih menu&nbsp;<strong>File &rarr; Export to ZIP File...</strong>&nbsp;pada Android Studio.</p>
</li>
<li dir="ltr" title="">
<p dir="ltr" title="">Pilih direktori penyimpanan dan klik&nbsp;<strong>OK</strong>.</p>
</li>
</ol>
<p dir="ltr" title="">Dengan cara di atas, ukuran dari berkas&nbsp;<strong>ZIP</strong>&nbsp;akan lebih kecil dibandingkan Anda melakukan kompresi secara manual pada file explorer.</p>
