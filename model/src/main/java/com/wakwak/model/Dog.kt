package com.wakwak.model

import io.realm.RealmObject

/**
 * Created by Ryo on 2018/03/08.
 */
open class Dog(open var name: String = "", open var imageUrl: String = "") : RealmObject()
