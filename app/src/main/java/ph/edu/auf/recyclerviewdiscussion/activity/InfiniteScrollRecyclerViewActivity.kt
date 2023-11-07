package ph.edu.auf.recyclerviewdiscussion.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.auf.recyclerviewdiscussion.R
import ph.edu.auf.recyclerviewdiscussion.databinding.ActivityInfiniteScrollRecyclerViewBinding

class InfiniteScrollRecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInfiniteScrollRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfiniteScrollRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}