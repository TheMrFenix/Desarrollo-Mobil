package com.example.myapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    //String
    //Int
    //Float
    //Double
    //Boolean
    //val -> no cambia a lo largo de su ejecucion
    //var -> cambia a lo largo de su ejecucion

    var nombre: String = "Tefo"
    var sueldo: Float = 2000F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nombre = "Pablo"
        sueldo = 2500.55F
        if (sueldo > 5500F) {
            sueldo += 500
            mostrar()
        } else if (sueldo > 2000 && sueldo < 3000) {
            sueldo += 300
            cambiarSueldo()
            Log.e("infodev", retirarDinero(3000F))
            mostrar()
            var op: Int = 5
            when (op) {
                5 -> Log.e("infodev", "Este es el caso 5")
                1 -> "bubs"
                2, 3 -> "farfadox"
            }
        }
    }

    fun mostrar() {
        Log.e("infodev", "nombre: $nombre sueldo $sueldo")
    }

    fun cambiarSueldo() {
        sueldo += 100
    }

    fun retirarDinero(sueldoRetiro: Float): String {
        if (sueldoRetiro <= sueldo) {
            sueldo -= sueldoRetiro
            return "sueldo retirado"
        } else {
            return "sueldo no se puede retirar"
        }
    }
}