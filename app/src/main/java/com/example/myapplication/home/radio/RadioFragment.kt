package com.example.myapplication.home.radio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentQuranBinding
import com.example.myapplication.databinding.FragmentRadioBinding

class RadioFragment : Fragment() {
    lateinit var RadioBinding: FragmentRadioBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        RadioBinding = FragmentRadioBinding.inflate(inflater, container, false)
        return RadioBinding.root
    }

}