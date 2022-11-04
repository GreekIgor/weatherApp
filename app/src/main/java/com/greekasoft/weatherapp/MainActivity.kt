package com.greekasoft.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_city_tv.text = "Moskow"
        main_whetarname.text = "Rain drop"
        MainTempTxt.text = "25°"
        maindatetv.text = "24 yuli 2022"
        main_weather_image.setImageResource(R.mipmap.raincloud4x)

    }
}