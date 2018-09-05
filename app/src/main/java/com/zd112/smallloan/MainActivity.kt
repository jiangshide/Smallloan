package com.zd112.smallloan

import android.os.Bundle
import com.zd112.framework.BaseActivity
import com.zd112.smallloan.home.HomeFragment
import com.zd112.smallloan.mine.MineFragment
import com.zd112.smallloan.more.MoreFragment

class MainActivity : BaseActivity() {
    override fun initView(p0: Bundle?) {
        setView(mNavigationBar.initView(supportFragmentManager, HomeFragment(), MineFragment(), MoreFragment()).initData(intArrayOf(R.mipmap.tab_home, R.mipmap.tab_mine, R.mipmap.tab_more), intArrayOf(R.mipmap.tab_home_selected, R.mipmap.tab_mine_selected, R.mipmap.tab_more_selected), getResArrStr(R.array.tab_main_title), R.color.font_gray, R.color.colorPrimary)
                .setBgColor(getResColor(R.color.app_bg)), this)
    }

    override fun processLogic(p0: Bundle?) {
        mNavigationBar.setTxtSize(10).showView(mTabIndex)
    }
}
