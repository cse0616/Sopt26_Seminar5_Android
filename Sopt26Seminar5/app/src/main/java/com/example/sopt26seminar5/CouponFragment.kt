package com.example.sopt26seminar5


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_coupon.*
import kotlinx.android.synthetic.main.item_coupon_button.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CouponFragment : Fragment() {

    lateinit var couponBtnAdapter : CouponBtnAdapter
    var datas = mutableListOf<CouponBtnData>()

    lateinit var couponAdapter: CouponAdapter
    var datas_coupon = mutableListOf<CouponData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coupon, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        couponBtnAdapter = CouponBtnAdapter(view.context)
        rv_coupon_btn.adapter = couponBtnAdapter
        rv_coupon_btn.addItemDecoration(CouponBtnRecyclerviewItemDecoration())
        loadCouponBtnDatas()

        couponAdapter = CouponAdapter(view.context)
        rv_coupon.adapter = couponAdapter
        rv_coupon.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        loadCouponDatas()
    }

    private fun loadCouponBtnDatas(){
        datas.apply {
            add(
                CouponBtnData(
                    menu = "버거"
                ))
            add(
                CouponBtnData(
                    menu = "세트"
                ))
            add(
                CouponBtnData(
                    menu = "맥모닝"
                ))
            add(
                CouponBtnData(
                    menu = "사이드&디저트"
                ))
            add(
                CouponBtnData(
                    menu = "맥카페&음료"
                ))
        }
        couponBtnAdapter.datas = datas
        couponBtnAdapter.notifyDataSetChanged()
    }

    private fun loadCouponDatas(){
        datas_coupon.apply {
            add(
                CouponData(
                    menu = "버거",
                    name = "에그 불고기 버거",
                    price = 1000,
                    price_origin = 0,
                    date = "가입 후 2주 이내 사용",
                    img_menu = "https://cdn.pixabay.com/photo/2017/04/04/16/25/hamburger-2201748__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "빅맥®",
                    price = 3900,
                    price_origin = 5900,
                    date = "유효기간 2020-05-25",
                    img_menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "맥스파이시® 상하이 버거",
                    price = 3700,
                    price_origin = 5500,
                    date = "유효기간 2020-05-25",
                    img_menu = "https://cdn.pixabay.com/photo/2017/04/04/16/26/hamburger-2201749__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "에그 불고기 버거",
                    price = 1000,
                    price_origin = 5500,
                    date = "가입 후 2주 이내 사용",
                    img_menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "에그 불고기 버거",
                    price = 1000,
                    price_origin = 5500,
                    date = "가입 후 2주 이내 사용",
                    img_menu = "https://cdn.pixabay.com/photo/2017/04/04/16/26/hamburger-2201749__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "에그 불고기 버거",
                    price = 1000,
                    price_origin = 5500,
                    date = "가입 후 2주 이내 사용",
                    img_menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "에그 불고기 버거",
                    price = 1000,
                    price_origin = 5500,
                    date = "가입 후 2주 이내 사용",
                    img_menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "에그 불고기 버거",
                    price = 1000,
                    price_origin = 5500,
                    date = "가입 후 2주 이내 사용",
                    img_menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg"
                ))
            add(
                CouponData(
                    menu = "버거",
                    name = "에그 불고기 버거",
                    price = 1000,
                    price_origin = 5500,
                    date = "가입 후 2주 이내 사용",
                    img_menu = "https://cdn.pixabay.com/photo/2014/11/10/04/37/double-cheeseburger-524990__340.jpg"
                ))
        }
        couponAdapter.datas = datas_coupon
        couponBtnAdapter.notifyDataSetChanged()
    }

    /*private fun btn(){
        val btn = view!!.findViewById<Button>(R.id.coupon_btn)
        btn.setOnClickListener {
            btn.setBackgroundColor(Color.parseColor("#ca2c21"))
            btn.setTextColor(Color.parseColor("#ffffff"))
        }
    }*/

}
