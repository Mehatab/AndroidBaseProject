package com.starter.uicomponents.rvadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.starter.data.models.DiffItem
import com.starter.uicomponents.BR

class GenericRVAdapter(private val layoutId: Int = 0) : Adapter<RecyclerView.ViewHolder>(),
    OnAdapterItemClick {

    private lateinit var inflater: LayoutInflater
    lateinit var getLayout: (Int) -> Int
    lateinit var onItemClick: (View, Int) -> Unit

    private var itemList: List<DiffItem> by autoNotifyDelegate(
        adapter = this,
        initialValue = emptyList()
    )

    fun setList(list: List<DiffItem>) {
        itemList = list.toMutableList()
    }

    fun getItem(position: Int) = itemList[position]

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        if (::inflater.isInitialized.not())
            inflater = LayoutInflater.from(parent.context)

        return ItemViewHolder(
            DataBindingUtil.inflate(
                inflater,
                getLayoutId(position),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = itemList.size

    //Instead of view type returning position so we can get from parent to support multiple view type
    override fun getItemViewType(position: Int) = position

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is ItemViewHolder) {
            holder.binding.setVariable(BR.viewModel, itemList[position])
            holder.binding.setVariable(BR.listener, this)
        }
    }

    class ItemViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

    private fun getLayoutId(position: Int): Int {
        return if (::getLayout.isInitialized) getLayout(position) else layoutId
    }

    override fun onAdapterItemClick(v: View, position: Int) {
        if (::onItemClick.isInitialized) onItemClick(v, position)
    }
}


interface OnAdapterItemClick {
    fun onAdapterItemClick(v: View, position: Int)
}