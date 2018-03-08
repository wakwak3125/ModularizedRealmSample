package com.wakwak.modularizedrealmsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wakwak.model.Dog
import com.wakwak.model.core.ModelInitializer

class MainActivity : AppCompatActivity() {

    private lateinit var model: ModelInitializer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model = (application as MyApplication).model
        model.realm.use { it.executeTransaction { it.insert(Dog("はち")) } }
        model.realm.use { realm -> realm.where(Dog::class.java).findAll().forEach {
            Toast.makeText(this,it.name, Toast.LENGTH_SHORT).show()
        } }
    }
}
