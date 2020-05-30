package com.example.sopt26seminar5.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.oursopt5.recyclerview_burger.BgAdapter
import com.example.oursopt5.recyclerview_burger.BgData
import com.example.oursopt5.recyclerview_menu.McHomeDecoration
import com.example.oursopt5.recyclerview_menu.MenuBtnAdapter
import com.example.oursopt5.recyclerview_menu.MenuBtnData
import com.example.sopt26seminar5.R
import com.example.soptseminar5.CustomPagerAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.home_viewpager
import kotlinx.android.synthetic.main.fragment_home.tab
import java.time.LocalDateTime

class HomeFragment : Fragment() {

    lateinit var bgAdapter: BgAdapter
    val datas = mutableListOf<BgData>()

    lateinit var menuBtnAdapter: MenuBtnAdapter
    val datas_menu = mutableListOf<MenuBtnData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        home_viewpager.adapter= CustomPagerAdapter(childFragmentManager)
        home_viewpager.offscreenPageLimit=2
        tab.setupWithViewPager(home_viewpager)

        bgAdapter =
            BgAdapter(view.context)
        recyclerView_burger.adapter = bgAdapter

        loadDatas()
        recyclerView_burger.addItemDecoration(McHomeDecoration(250,230)) //itemDecoration 여백주기

        //스크롤 했을 때 크기 달라지는 것
        /*
        recyclerView_burger.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                if(newState == RecyclerView.SCROLL_STATE_IDLE){
                    val eventparent = BgViewHolder
                }
            }
        })
        */

        menuBtnAdapter =
            MenuBtnAdapter(view.context)
        recyclerView_menu.adapter = menuBtnAdapter
        loadMenuDatas()
        recyclerView_menu.addItemDecoration(McHomeDecoration(50, 50)) //itemDecoration 여백주기
    }

    private fun loadDatas() {
        datas.apply {
            add(
                BgData(
                    imageView = "@drawable/home_cou_pic01",
                    explain = "모두가 사랑하는",
                    burger_name = "빅맥®",
                    price = "5900원",
                    sale = "3900원",
                    discount = "33%"
                )
            )
            add(
                BgData(
                    imageView = "@drawable/home_cou_pic02",
                    explain = "모두가 사랑하는",
                    burger_name = "빅맥®",
                    price = "5900원",
                    sale = "3900원",
                    discount = "33%"
                )
            )
            add(
                BgData(
                    imageView = "@drawable/home_cou_pic01",
                    explain = "모두가 사랑하는",
                    burger_name = "빅맥®",
                    price = "5900원",
                    sale = "3900원",
                    discount = "33%"
                )
            )
        }

        bgAdapter.datas = datas
        bgAdapter.notifyDataSetChanged()
    }

    private fun loadMenuDatas(){
        datas_menu.apply{
            add(
                MenuBtnData(
                    menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg",
                    menu_name = "비프 버거"
                )
            )
            add(
                MenuBtnData(
                    menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg",
                    menu_name = "비프 버거"
                )
            )
            add(
                MenuBtnData(
                    menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg",
                    menu_name = "비프 버거"
                )
            )
            add(
                MenuBtnData(
                    menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg",
                    menu_name = "비프 버거"
                )
            )

        }

        menuBtnAdapter.datas = datas_menu
        menuBtnAdapter.notifyDataSetChanged()

    }
}
