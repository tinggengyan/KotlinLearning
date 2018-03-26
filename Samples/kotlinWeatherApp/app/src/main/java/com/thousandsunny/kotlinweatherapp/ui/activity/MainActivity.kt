package com.thousandsunny.kotlinweatherapp.ui.activity

import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.TextView
import com.thousandsunny.kotlinweatherapp.R
import com.thousandsunny.kotlinweatherapp.domain.commands.RequestDayForecastCommand
import com.thousandsunny.kotlinweatherapp.domain.model.Forecast
import com.thousandsunny.kotlinweatherapp.domain.model.ForecastResult
import com.thousandsunny.kotlinweatherapp.ui.adapter.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var items: ArrayList<Forecast> = ArrayList<Forecast>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ForecastListAdapter(items)
        forecast_list.layoutManager = LinearLayoutManager(this)

        request()
    }


    fun request(): Unit {
        WeatherTask(contentTextView).execute()
    }


    class WeatherTask(val textview: TextView) : AsyncTask<Void, Void, ForecastResult>() {
        override fun doInBackground(vararg p0: Void?): ForecastResult {
            return RequestDayForecastCommand().execute();
        }

        override fun onPostExecute(result: ForecastResult?) {
            super.onPostExecute(result)
            textview.text = result?.forecastHourly?.desc
        }

    }

}
