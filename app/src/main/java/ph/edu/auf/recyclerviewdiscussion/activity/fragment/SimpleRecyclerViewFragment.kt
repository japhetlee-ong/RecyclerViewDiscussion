package ph.edu.auf.recyclerviewdiscussion.activity.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ph.edu.auf.recyclerviewdiscussion.R
import ph.edu.auf.recyclerviewdiscussion.databinding.FragmentSimpleRecyclerViewBinding

class SimpleRecyclerViewFragment : Fragment() {

    private lateinit var binding: FragmentSimpleRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSimpleRecyclerViewBinding.inflate(inflater,container,false);
        return binding.root
    }
}