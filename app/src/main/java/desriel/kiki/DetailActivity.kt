package desriel.kiki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val nama = intent.getStringExtra("NAMA")
        val deskripsi = intent.getStringExtra("DESKRIPSI")
        val lokasi = intent.getStringExtra("LOKASI")
        val foto = intent.getIntExtra("FOTO", 0)

        val tvNama = findViewById<TextView>(R.id.tv_item_name_detail)
        val tvLokasi = findViewById<TextView>(R.id.tv_item_lokasi_detail)
        val tvDeskripsi = findViewById<TextView>(R.id.tv_item_deskripsi_detail)
        val ivFoto = findViewById<ImageView>(R.id.photoDetail)

        tvNama.text = nama
        tvLokasi.text = lokasi
        tvDeskripsi.text = deskripsi
        ivFoto.setImageResource(foto)
    }
}