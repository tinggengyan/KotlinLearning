package com.thousandsunny.kotlinweatherapp.domain.commands

/**
 * Created by SteveYan on 2017/12/27.
 */
interface Command<out T> {
    fun execute(): T
}