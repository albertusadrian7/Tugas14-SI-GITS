package android.kotlin.dearnovel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val intent = intent
        val judulNovel = intent.getStringExtra("judulNovel")
        val penulisNovel = intent.getStringExtra("penulisNovel")
        val hargaNovel = intent.getStringExtra("hargaNovel")
        val gambarNovel = intent.getIntExtra("gambarNovel",0)
        detailJudul.setText(judulNovel)
        detailPenulis.setText(penulisNovel)
        detailHarga.setText(hargaNovel)
        gambarDetailNovel.setImageResource(gambarNovel)
    }
}