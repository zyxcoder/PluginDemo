package com.gxy.demolib

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.gxy.demolib.adapter.ListAdapter
import com.gxy.demolib.base.BaseViewBindActivity
import com.gxy.demolib.databinding.ActivityTestBinding
import com.gxy.demolib.entity.ItemData
import com.zyxcoder.mvvmroot.ext.onContinuousClick
import com.zyxcoder.mvvmroot.ext.showToast
import com.zyxcoder.mvvmroot.utils.loadImage

class TestActivity : BaseViewBindActivity<ActivityViewModel, ActivityTestBinding>() {

    private lateinit var adapter: ListAdapter

    companion object {
        fun startActivity(context: Context) {
            if (mode_base_url.isNullOrEmpty()) {
                context.showToast("请先初始化url")
                return
            }
            context.startActivity(Intent(context, TestActivity::class.java))
        }
    }

    override fun init(savedInstanceState: Bundle?) {
        mViewBind.apply {
            tvUrl.text = "模块地址:" + mode_base_url
            btJump.onContinuousClick {
                Test2Activity.startActivity(context = this@TestActivity)
            }
            adapter = ListAdapter().apply {
                rvInfo.adapter = this
            }
            ivLogo.loadImage("https://gntbiz.guangxingyun.com/ImageData/id_card/20220630/1_1656556786872.jpg")
        }
    }

    override fun createObserver() {

    }

    override fun dismissLoading() {
    }

    override fun initData() {
        val list = mutableListOf<ItemData>()
        repeat(20) {
            list.add(ItemData("scsqwdqdqwdwqdqwdqa" + it))
        }
        adapter.setNewInstance(list)
    }

    override fun showLoading(message: String) {

    }

}