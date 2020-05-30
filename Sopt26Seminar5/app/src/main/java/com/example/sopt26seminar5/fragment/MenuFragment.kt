package com.example.sopt26seminar5.fragment


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.sopt26seminar5.R
import com.example.sopt26seminar5.menu_recycler_category.CategoryAdapter
import com.example.sopt26seminar5.menu_recycler_category.CategoryData
import com.example.sopt26seminar5.menu_recycler_menu.MenuAdapter
import com.example.sopt26seminar5.menu_recycler_menu.MenuData
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment() {
    lateinit var categoryAdapter : CategoryAdapter
    val categorydatas = mutableListOf<CategoryData>()

    lateinit var menuAdapter : MenuAdapter
    val menudatas = mutableListOf<MenuData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val filterArr = resources.getStringArray(R.array.filterArray)
        val spinnerAdapter = ArrayAdapter(view.context,
            R.layout.custom_spinner, filterArr)
        menu_btn_sequnce_filter.adapter = spinnerAdapter
        menu_btn_sequnce_filter.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {}

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {}
        }


        categoryAdapter =
            CategoryAdapter(
                view.context
            )
        rv_category.adapter = categoryAdapter
        menuAdapter =
            MenuAdapter(view.context)
        rv_menu.adapter = menuAdapter
        loadCategoryDatas()
        loadMenuDatas()

        search.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.isNullOrBlank()) {text_reset.visibility = View.INVISIBLE}
                else text_reset.visibility = View.VISIBLE
            }
        })

        text_reset.visibility = View.INVISIBLE
        text_reset.setOnClickListener(){
            if(search.text.toString() != null)
                search.setText("")
        }
    }

    private fun loadCategoryDatas(){
        categorydatas.apply {
            add(
                CategoryData(
                    categoryImage = "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775_960_720.png",
                    categoryName = "버거"
                )
            )
            add(
                CategoryData(
                    categoryImage = "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775_960_720.png",
                    categoryName = "맥모닝"
                )
            )
            add(
                CategoryData(
                    categoryImage = "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775_960_720.png",
                    categoryName = "해피밀"
                )
            )
            add(
                CategoryData(
                    categoryImage = "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775_960_720.png",
                    categoryName = "사이드"
                )
            )
            add(
                CategoryData(
                    categoryImage = "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775_960_720.png",
                    categoryName = "디저트"
                )
            )
            add(
                CategoryData(
                    categoryImage = "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775_960_720.png",
                    categoryName = "맥카페&음료"
                )
            )
        }
        categoryAdapter.datas = categorydatas
        categoryAdapter.notifyDataSetChanged()
    }

    private fun loadMenuDatas() {
        menudatas.apply {
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "버거 | 세트",
                    menuName = "허니 크림치즈\n상하이 버거 세트",
                    menuGram = "242",
                    menuKcal = "554"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "맥모닝",
                    menuName = "에그 맥머핀",
                    menuGram = "139",
                    menuKcal = "292"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "디저트",
                    menuName = "초코 선데이\n아이스크림",
                    menuGram = "155",
                    menuKcal = "307"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "버거 | 세트",
                    menuName = "맥스파이시\n상하이 버거 세트",
                    menuGram = "234",
                    menuKcal = "883~981"
                )
            )
            add(
                MenuData(
                    menuImage = "https://cdn.pixabay.com/photo/2018/05/29/00/17/burger-3437618_960_720.png",
                    menuSort = "버거 | 세트",
                    menuName = "1955 버거 세트",
                    menuGram = "246",
                    menuKcal = "898~1047"
                )
            )
        }
        menuAdapter.datas = menudatas
        menuAdapter.notifyDataSetChanged()
    }
}
