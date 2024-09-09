package com.gxy.demolib.base

import androidx.viewbinding.ViewBinding
import com.zyxcoder.mvvmroot.base.fragment.BaseVmVbFragment
import com.zyxcoder.mvvmroot.base.viewmodel.BaseViewModel

/**
 * @author zhangyuxiang
 * @date 2024/2/22
 */
abstract class BaseViewBindFragment<VM : BaseViewModel, VB : ViewBinding> :
    BaseVmVbFragment<VM, VB>() {

    /**
     * 懒加载 只有当前fragment视图显示时才会触发该方法
     */
    override fun lazyLoadData() {}

    /**
     * 创建LiveData观察者 Fragment执行onViewCreated后触发
     */
    override fun createObserver() {}

    /**
     * Fragment执行onViewCreated后触发
     */
    override fun initData() {

    }

    override fun showLoading(message: String) {
    }

    override fun dismissLoading() {
    }
}