package com.subdiox.blitzmodderpro.adapter

import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.View
import com.subdiox.blitzmodderpro.R
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionParameters
import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection


/**
 * Created by subdiox on 2018/03/23.
 */

internal class MainItem(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tvItem: TextView

    init {

        tvItem = itemView.findViewById(R.id.tvItem)
    }
}

internal class MainSection : StatelessSection(SectionParameters.builder()
        .itemResourceId(R.layout.section_item)
        .headerResourceId(R.layout.section_header)
        .build()) {
    var itemList = Arrays.asList("Item1", "Item2", "Item3")

    override fun getContentItemsTotal(): Int {
        return itemList.size
    }

    override fun getItemViewHolder(view: View): RecyclerView.ViewHolder {
        return MainItem(view)
    }

    override fun onBindItemViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemHolder = holder as MainItem

        // bind your view here
        itemHolder.tvItem.setText(itemList.get(position))
    }
}