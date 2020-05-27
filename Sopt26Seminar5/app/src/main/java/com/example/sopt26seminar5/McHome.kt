package com.example.soptseminar5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sopt26seminar5.R
import kotlinx.android.synthetic.main.fragment_mc_home.*

/**
 * A simple [Fragment] subclass.
 */
class McHome : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mc_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        home_viewpager.adapter=CustomPagerAdapter(childFragmentManager)
        home_viewpager.offscreenPageLimit=2
        tab.setupWithViewPager(home_viewpager)
    }

}
