package com.example.buyauto.adapter

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import com.example.buyauto.ui.transport.transport_frg.ComtransFragment
import com.example.buyauto.ui.transport.transport_frg.MotoFragment
import com.example.buyauto.ui.transport.transport_frg.SedanFragment

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                SedanFragment()
            }
            1 -> {
                ComtransFragment()
            }
            else -> {
                return MotoFragment()
            }

        }
    }
    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position){
            0 -> "Легковые"
            1 -> "Комтранс"
            else ->{
                return "Мото"
            }
        }
    }
}