package com.example.buyauto.ui.transport

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.buyauto.R
import com.example.buyauto.adapter.SliderAdapter
import com.example.buyauto.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_transport.*


class TransportFragment : Fragment(R.layout.fragment_transport) {
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager: ViewPager

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler_view = view.findViewById(R.id.recycler_view) as RecyclerView
        val horizontalLayoutManagaer = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recycler_view.setLayoutManager(horizontalLayoutManagaer)
        recycler_view.setHasFixedSize(true)
        recycler_view.adapter = SliderAdapter()

        val tabLayout = view.findViewById(R.id.tab_layout) as TabLayout
        tabLayout.setupWithViewPager(tr_viewPager)

        viewPagerAdapter = ViewPagerAdapter(childFragmentManager)
        viewPager = view.findViewById(R.id.tr_viewPager)
        viewPager.adapter = viewPagerAdapter

    }

}