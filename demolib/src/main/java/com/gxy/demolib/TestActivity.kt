package com.gxy.demolib

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.gxy.demolib.databinding.ActivityTestBinding
import com.zyxcoder.mvvmroot.base.activity.BaseVmVbActivity
import com.zyxcoder.mvvmroot.ext.onContinuousClick
import com.zyxcoder.mvvmroot.ext.showToast

class TestActivity : BaseVmVbActivity<ActivityViewModel, ActivityTestBinding>() {

    companion object {
        fun startActivity(context: Context) {
            if (mode_base_url.isNullOrEmpty()) {
                context.showToast("请先初始化url")
                return
            }
            context.startActivity(Intent(context, TestActivity::class.java))
        }
    }

    override fun createObserver() {

    }

    override fun dismissLoading() {
    }

    override fun initData() {
    }

    override fun initView(savedInstanceState: Bundle?) {
        mViewBind.apply {
            tvUrl.text = "模块地址:" + mode_base_url
            btJump.onContinuousClick {
                Test2Activity.startActivity(context = this@TestActivity)
            }
        }
    }

    override fun showLoading(message: String) {

    }

}