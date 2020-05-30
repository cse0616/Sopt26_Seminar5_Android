package com.example.sopt26seminar5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.sopt26seminar5.fragment.CouponFragment
import com.example.sopt26seminar5.fragment.HomeFragment
import com.example.sopt26seminar5.fragment.MenuFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout,
            HomeFragment(), "home").commitAllowingStateLoss()

        main_bottom_navigation.setOnNavigationItemSelectedListener {
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()

                when (it.itemId) {
                    R.id.menu_home -> {
                        val fragment =
                            HomeFragment()
                        transaction.replace(R.id.frame_layout, fragment, "home")
                    }
                    R.id.menu_coupon -> {
                        val fragment =
                            CouponFragment()
                        transaction.replace(R.id.frame_layout, fragment, "coupon")
                    }
                    R.id.menu_menu -> {
                        val fragment =
                            MenuFragment()
                        transaction.replace(R.id.frame_layout, fragment, "menu")
                    }
                }
                transaction.commit()
                true
        }

    }
}
