package com.wakwak.model.core

import android.content.Context
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by Ryo on 2018/03/08.
 */
class ModelInitializer(
        private val config: RealmConfiguration = RealmConfiguration.Builder()
                .name("data")
                .modules(ModelModule())
                .deleteRealmIfMigrationNeeded()
                .build()) {

    val realm: Realm = Realm.getDefaultInstance()

    fun configure(context: Context): RealmConfiguration {
        Realm.setDefaultConfiguration(config)
        Realm.init(context)
        return config
    }
}
