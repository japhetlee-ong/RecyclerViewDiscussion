package ph.edu.auf.recyclerviewdiscussion.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.auf.recyclerviewdiscussion.R
import ph.edu.auf.recyclerviewdiscussion.activity.fragment.SimpleRecyclerViewFragment
import ph.edu.auf.recyclerviewdiscussion.databinding.ActivitySimpleRecyclerViewFragmentBinding

class SimpleRecyclerViewFragmentActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySimpleRecyclerViewFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleRecyclerViewFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(binding.fragContainer.id,SimpleRecyclerViewFragment())
        fragmentManager.commit()

    }
}