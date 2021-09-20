package android.kotlin.dearnovel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Membuat object layoutManager
    private var layoutManager: RecyclerView.LayoutManager? = null
    // Membuat object adapter
    private var adapter: RecyclerView.Adapter<NovelAdapter.ViewHolder>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        adapter = NovelAdapter()
        recycler_view.adapter = adapter
    }
}