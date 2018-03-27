package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 进入该分支的时候,自动转换成String
        return obj.length
    }
    return null
}