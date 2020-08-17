package com.example.buyauto.ui.transport.transport_frg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.buyauto.R

class ChooseMarkFragment() : Fragment() {

    var images:Array<Int> = arrayOf(R.drawable.img_car,R.drawable.img_car,R.drawable.img_car)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var v = inflater.inflate(R.layout.fragment_choose_mark, container, false)


        return v
    }


}