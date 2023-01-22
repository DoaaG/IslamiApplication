package com.example.myapplication.home.hadeth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.Constants
import com.example.myapplication.databinding.FragmentHadethBinding

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

        val adapterlist = readfile()
        Adapeter = HadethAdapter(adapterlist)
        onClick()
        Hadethbinding.hadethRecycler.adapter = Adapeter
    }

    private fun onClick() {
        Adapeter.onHadethClickListener = object : OnHadethClickListener {
            override fun onitemClick(position: Int, listitem:List <String>) {
                val intent = Intent(activity, HadethDetailsActivity::class.java)
                intent.putExtra(Constants.Index, position)
                intent.putExtra(Constants.Hadeth_Details,listitem[position])
                activity?.startActivity(intent)
            }

        }
    }


    private fun readfile(): List<String> {
        val fileName = "ahadeth .txt"
        val fileContent = activity?.assets?.open(fileName)?.bufferedReader().use {
            it!!.readText()
        }
        return fileContent.split("#") as ArrayList<String>
    }


}

