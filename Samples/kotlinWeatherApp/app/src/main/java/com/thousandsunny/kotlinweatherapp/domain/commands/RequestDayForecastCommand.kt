package com.thousandsunny.kotlinweatherapp.domain.commands

import com.google.gson.Gson
import com.thousandsunny.kotlinweatherapp.domain.model.ForecastResult
import java.net.URL

/**
 * Created by SteveYan on 2017/12/27.
 */
class RequestDayForecastCommand : Command<ForecastResult> {

    companion object {
        val url = "https://weatherapi.market.xiaomi.com/wtr-v3/weather/all?latitude=110&longitude=112&isLocated=true&locationKey=weathercn%3A101010100&days=15&appKey=weather20151024&sign=zUFJoAR2ZVrDy1vF3D07&romVersion=7.2.16&appVersion=87&alpha=false&isGlobal=false&device=cancro&modDevice=&locale=zh_cn"
    }

    override fun execute(): ForecastResult {
        val url = URL(url);
        val text = url.readText().toString()
        val gson = Gson()
        return gson.fromJson(text, ForecastResult::class.java)
    }
}