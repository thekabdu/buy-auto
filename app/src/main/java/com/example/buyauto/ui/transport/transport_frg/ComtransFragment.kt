package com.example.buyauto.ui.transport.transport_frg

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.buyauto.R
import kotlinx.android.synthetic.main.fragment_comtrans.tabitem_moto
import kotlinx.android.synthetic.main.fragment_comtrans.tabitem_sedan

class ComtransFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_comtrans, container, false)
    }
}