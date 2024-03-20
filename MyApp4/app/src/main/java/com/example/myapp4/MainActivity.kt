package com.example.myapp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p1:Persona= Persona("Juan")
        p1.setApellidoPaterno("Gonzales")
        p1.setApellidoMeterno("Perales")
        Log.e("infodev",p1.toString())
    }
}