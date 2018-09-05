package com.zd112.smallloan.home

import android.os.Bundle
import com.zd112.framework.BaseFragment
import com.zd112.framework.net.helper.NetInfo
import com.zd112.smallloan.R
import com.zd112.smallloan.home.data.HomeData
import kotlinx.android.synthetic.main.home.*
import java.util.*

/**
 *@Created by Ender on 2018/9/4.
 *@author jiangshide
 *@Emal:18311271399@163.com
 */
class HomeFragment : BaseFragment() {

    override fun initView(p0: Bundle?) {
        setView(R.layout.home, this, true)
    }

    override fun processLogic(p0: Bundle?) {
        request("more/ind", HomeData::class.java, true)
    }

    override fun onSuccess(info: NetInfo?) {
        super.onSuccess(info)
        val homeData = info!!.getResponseObj<HomeData>()
        val bannerList = ArrayList<String>()
        for (picList in homeData.res!!.picLists!!) {
            bannerList.add(picList.picUrl!!)
        }
        homeBanner.setViewUrls(bannerList)
    }
}