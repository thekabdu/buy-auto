package com.example.buyauto.ui.yet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.buyauto.R
import kotlinx.android.synthetic.main.fragment_yet.*

class YetFragment : Fragment() {

    private lateinit var yetViewModel: YetViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_yet, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_fav.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_navigation_yet_to_sellAutoFragment)
        }

        btn_kred.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_navigation_yet_to_sellAutoReqFragment2)
        }

        btn_pay.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_navigation_yet_to_sellAutoAdvertFragment)
        }
    }


}