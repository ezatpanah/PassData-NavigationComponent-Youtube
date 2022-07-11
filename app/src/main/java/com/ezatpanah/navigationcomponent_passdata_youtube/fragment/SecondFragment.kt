package com.ezatpanah.navigationcomponent_passdata_youtube.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ezatpanah.navigationcomponent_passdata_youtube.R
import com.ezatpanah.navigationcomponent_passdata_youtube.databinding.FragmentFirstBinding
import com.ezatpanah.navigationcomponent_passdata_youtube.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    private val args : SecondFragmentArgs by navArgs()
    private var name =""
    private var age =0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        name = args.name
        age=args.age

        binding.tvName.text = name
        binding.tvAge.text=age.toString()
    }


}