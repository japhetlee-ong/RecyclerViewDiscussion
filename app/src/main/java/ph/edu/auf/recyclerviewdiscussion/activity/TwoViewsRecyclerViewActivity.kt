package ph.edu.auf.recyclerviewdiscussion.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.auf.recyclerviewdiscussion.R
import ph.edu.auf.recyclerviewdiscussion.databinding.ActivityTwoViewsRecyclerViewBinding

class TwoViewsRecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoViewsRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwoViewsRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}