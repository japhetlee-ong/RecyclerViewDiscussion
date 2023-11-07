package ph.edu.auf.recyclerviewdiscussion.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.auf.recyclerviewdiscussion.R
import ph.edu.auf.recyclerviewdiscussion.databinding.ActivityRecyclerviewWithViewModelBinding

class RecyclerviewWithViewModelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerviewWithViewModelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerviewWithViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}