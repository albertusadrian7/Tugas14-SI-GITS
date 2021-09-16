package android.kotlin.dearnovel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Membuat class RecyclerAdapter yang implementasi interface RecyclerView
class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    // Membuat array untuk menampung judul novel
    private var arrJudul = arrayOf(
        "To Kill a Mockingbird",
        "Harry Potter #7: Deathly Hallows 20 Years",
        "Koala Kumal",
        "Winter in Tokyo",
        "Selamat Tinggal",
        "Pulang",
        "Summer in Seoul",
        "Tarian Bumi"
    )
    // Membuat array untuk menampung penulis novel
    private var arrPenulis = arrayOf("Harper Lee","J.k. Rowling","Raditya Dika","Ilana Tan","Tere Liye","Tere Liye","Ilana Tan","Oka Rusmini")
    // Membuat array untuk menampung harga novel
    private var arrHarga = arrayOf("Rp 179.000", "Rp 204.000", "Rp 67.000", "Rp 93.000", "Rp 85.000", "Rp 89.000", "Rp 83.000", "Rp 90.000")
    // Membuat array untuk menampung gambar novel
    private var arrGambar = intArrayOf(R.drawable.tokillamockingbird,R.drawable.harrypotter7,R.drawable.koalakumal,R.drawable.winterintokyo,R.drawable.selamattinggal,R.drawable.pulang,R.drawable.summerinseoul,R.drawable.tarianbumi)

    // Implement method-method untuk RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.judulNovel.text = arrJudul[position]
        holder.penulisNovel.text = arrPenulis[position]
        holder.hargaNovel.text = arrHarga[position]
        holder.gambarNovel.setImageResource(arrGambar[position])
    }

    override fun getItemCount(): Int {
        return arrJudul.size
    }

    // Membuat inner class ViewHolder
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var gambarNovel: ImageView
        var judulNovel: TextView
        var penulisNovel: TextView
        var hargaNovel: TextView
        init {
            gambarNovel = itemView.findViewById(R.id.gambarNovel)
            judulNovel = itemView.findViewById(R.id.judulNovel)
            penulisNovel = itemView.findViewById(R.id.penulis)
            hargaNovel = itemView.findViewById(R.id.harga)
        }
    }

}