package com.example.myapplication.home.sebha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSebhaBinding

class SebhaFragment : Fragment() {
    lateinit var sebhabinding: FragmentSebhaBinding
    var count = 1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sebhabinding = FragmentSebhaBinding.inflate(inflater,container,false)
        return sebhabinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sebhabinding.tasbehButton.setOnClickListener {
            ontasbehbuttonclick()
            sebharotation()
        }
    }
    fun ontasbehbuttonclick() {
        sebhabinding.tasbehNumber.text = count++.toString()

    }

    fun sebharotation() {
        sebhabinding.sebhaBody.animation = AnimationUtils.loadAnimation(context, R.anim.sebha_rotation)
    }
}