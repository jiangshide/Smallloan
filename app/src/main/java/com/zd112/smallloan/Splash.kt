package com.zd112.smallloan

import android.os.Bundle
import com.zd112.framework.BaseActivity
import com.zd112.framework.utils.IntentUtils
import com.zd112.framework.view.UpdateView

/**
 *@Created by Ender on 2018/9/4.
 *@author jiangshide
 *@Emal:18311271399@163.com
 */
class Splash : BaseActivity(), UpdateView.OnUpdateListener {

    override fun initView(p0: Bundle?) {
        setView(R.layout.splash, this)
    }

    override fun processLogic(p0: Bundle?) {
        UpdateView(this).init().setListener(this)
    }

    override fun onResult(p0: Int) {
        IntentUtils().setClass(MainActivity::class.java).start()
    }
}