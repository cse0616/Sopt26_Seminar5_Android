package com.example.soptseminar5

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.sopt26seminar5.R

class CustomPagerAdapter(fm:FragmentManager):
FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    val images= arrayOf(
        R.drawable.home_adpic01,
        R.drawable.home_adpic01,
        R.drawable.home_adpic01
    )

    override fun getItem(position: Int): Fragment {

        return when(position){
            0-> Adpic(images[0])
            1-> Adpic(images[1])
            else->Adpic(images[2])
        }
    }

    override fun getCount(): Int {
        return 3
    }


}