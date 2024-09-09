package com.gxy.demolib.adapter

import com.gxy.demolib.R
import com.gxy.demolib.databinding.ItemListTestBinding
import com.gxy.demolib.entity.ItemData
import com.zyxcoder.mvvmroot.base.adapter.BaseViewBindingAdapter
import com.zyxcoder.mvvmroot.base.adapter.BaseViewBindingHolder

/**
 * @author zhangyuxiang
 * @date 2024/9/9
 */
class ListAdapter : BaseViewBindingAdapter<ItemData, ItemListTestBinding>(
    ItemListTestBinding::inflate, R.layout.item_list_test
) {
    override fun convert(holder: BaseViewBindingHolder<ItemListTestBinding>, item: ItemData) {
        holder.viewBind.apply {
            tvName.text = item.name
        }
    }
}