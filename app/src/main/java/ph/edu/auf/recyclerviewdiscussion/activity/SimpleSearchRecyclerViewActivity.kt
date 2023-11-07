package ph.edu.auf.recyclerviewdiscussion.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.auf.recyclerviewdiscussion.R
import ph.edu.auf.recyclerviewdiscussion.databinding.ActivitySimpleSearchRecyclerViewBinding

class SimpleSearchRecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySimpleSearchRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleSearchRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}