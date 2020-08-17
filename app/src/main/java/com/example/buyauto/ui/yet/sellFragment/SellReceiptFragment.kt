package com.example.buyauto.ui.yet.sellFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.buyauto.R
import kotlinx.android.synthetic.main.fragment_sell_receipt.*


class SellReceiptFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sell_receipt, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_back.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_sellReceiptFragment_to_navigation_yet2)
        }
    }
}