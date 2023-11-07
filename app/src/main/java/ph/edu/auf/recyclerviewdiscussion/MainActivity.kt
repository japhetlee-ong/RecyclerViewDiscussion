package ph.edu.auf.recyclerviewdiscussion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import ph.edu.auf.recyclerviewdiscussion.activity.InfiniteScrollRecyclerViewActivity
import ph.edu.auf.recyclerviewdiscussion.activity.RecyclerviewWithViewModelActivity
import ph.edu.auf.recyclerviewdiscussion.activity.SimpleRecyclerViewActivity
import ph.edu.auf.recyclerviewdiscussion.activity.SimpleRecyclerViewFragmentActivity
import ph.edu.auf.recyclerviewdiscussion.activity.SimpleSearchRecyclerViewActivity
import ph.edu.auf.recyclerviewdiscussion.activity.TwoViewsRecyclerViewActivity
import ph.edu.auf.recyclerviewdiscussion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInfiniteScroll.setOnClickListener(this)
        binding.btnRvWithSimpleSearch.setOnClickListener(this)
        binding.btnTwoViews.setOnClickListener(this)
        binding.btnSimpleRecyclerView.setOnClickListener(this)
        binding.btnSimpleRecyclerViewFragments.setOnClickListener(this)
        binding.btnViewmodel.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btn_simple_recycler_view -> {
                val intent = Intent(this, SimpleRecyclerViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_simple_recycler_view_fragments -> {
                val intent = Intent(this, SimpleRecyclerViewFragmentActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_two_views -> {
                val intent = Intent(this, TwoViewsRecyclerViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_rv_with_simple_search ->{
                val intent = Intent(this, SimpleSearchRecyclerViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_infinite_scroll ->{
                val intent = Intent(this, InfiniteScrollRecyclerViewActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_viewmodel -> {
                val intent = Intent(this,RecyclerviewWithViewModelActivity::class.java)
                startActivity(intent)
            }
        }

    }
}