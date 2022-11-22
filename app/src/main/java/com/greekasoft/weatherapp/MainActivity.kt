package com.greekasoft.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.greekasoft.weatherapp.view.adapters.MainDailyListAdapter
import com.greekasoft.weatherapp.view.adapters.MainHourlyListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initView()


        main_howerly_list.apply {
            adapter = MainHourlyListAdapter()
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
        }

        main_daily_list.adapter = MainDailyListAdapter()
        main_daily_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        main_daily_list.setHasFixedSize(true)


    }

    private fun initView(){
        main_city_tv.text = "Moskow"
        main_whetarname.text = "Rain drop"
        MainTempTxt.text = "25°"
        maindatetv.text = "24 yuli 2022"
        main_weather_image.setImageResource(R.mipmap.raincloud4x)
    }




}