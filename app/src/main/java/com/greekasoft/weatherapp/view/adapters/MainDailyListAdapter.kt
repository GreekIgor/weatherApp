package com.greekasoft.weatherapp.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.greekasoft.weatherapp.R

class MainDailyListAdapter: RecyclerView.Adapter<MainDailyListAdapter.DailyViewHolder>() {

    inner class DailyViewHolder(view: View): RecyclerView.ViewHolder(view)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main_daily, parent,false)
       return DailyViewHolder(view)
    }

    override fun onBindViewHolder(holder: DailyViewHolder, position: Int) {

    }

    override fun getItemCount()=8
}