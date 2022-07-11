package com.ezatpanah.navigationcomponent_passdata_youtube.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ezatpanah.navigationcomponent_passdata_youtube.R
import com.ezatpanah.navigationcomponent_passdata_youtube.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitViews
        binding.apply {
            btnSend.setOnClickListener {
                val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment(edtName.text.toString(),edtAge.text.toString().toInt())
                findNavController().navigate(direction)
            }
        }
    }
}