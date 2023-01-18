package com.example.myapplication.home.hadeth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.Constants
import com.example.myapplication.databinding.FragmentHadethBinding
import com.example.myapplication.home.quran.SuarDetailsActivity
import java.io.File

class HadethFragment : Fragment() {
    lateinit var Hadethbinding : FragmentHadethBinding
    lateinit var Adapeter : HadethAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Hadethbinding = FragmentHadethBinding.inflate(inflater,container,false)
        return Hadethbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Adapeter = HadethAdapter(50)

        Adapeter.onHadethClickListener = object : OnHadethClickListener {
            override fun onitemClick(position: Int) {
                val intent = Intent(activity, HadethDetailsActivity::class.java)
                intent.putExtra(Constants.Index, position)
                activity?.startActivity(intent)
            }

        }
        Hadethbinding.hadethRecycler.adapter = Adapeter

    }


}

