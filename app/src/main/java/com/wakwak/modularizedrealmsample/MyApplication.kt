package com.wakwak.modularizedrealmsample

import android.app.Application
import com.wakwak.model.core.ModelInitializer

/**
 * Created by Ryo on 2018/03/08.
 */
class MyApplication : Application() {

    lateinit var model: ModelInitializer

    override fun onCreate() {
        super.onCreate()
        model = ModelInitializer()
        model.configure(this)
    }
}
