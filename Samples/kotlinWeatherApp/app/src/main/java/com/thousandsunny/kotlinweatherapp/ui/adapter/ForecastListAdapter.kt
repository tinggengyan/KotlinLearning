package com.thousandsunny.kotlinweatherapp.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thousandsunny.kotlinweatherapp.R
import com.thousandsunny.kotlinweatherapp.domain.model.Forecast
import kotlinx.android.synthetic.main.weather_day_item.view.*

/**
 * Created by steveyan on 9/10/17.
 * Email:tinggengyan@gmail.com
 */
class ForecastListAdapter(val items: List<Forecast>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindForecast(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_day_item, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindForecast(forecast: Forecast): Unit {
            with(forecast) {
                itemView.weather.text = forecast.weather
                itemView.day.text = forecast.day
                itemView.aqi.text = forecast.aqi
                itemView.temp.text = forecast.temp
            }
        }
    }
}