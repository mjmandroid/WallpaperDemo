package com.zs.wanandroid.http

import android.view.View
import com.zs.wanandroid.weight.OnLimitClickListener
import java.io.IOException

/**
 * 用来封装业务错误信息
 *
 * @author zs
 * @date 2020-03-08
 */
class BusinessHttpException(val businessMessage: String, val businessCode: Int) :
    IOException()