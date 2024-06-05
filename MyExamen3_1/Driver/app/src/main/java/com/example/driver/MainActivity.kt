package com.example.ejercicio5

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.driver.R
import java.lang.StringBuilder

data class Datos(val horasTrabajadas: List<Int>, val sueldoHora: Float)

class MainActivity : AppCompatActivity() {
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var et3: EditText
    private lateinit var tvDays: TextView
    private lateinit var tv1: TextView

    var driverList = mutableMapOf<String, Datos>()
    var currentDayIndex = 0
    val daysOfWeek = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
    var horasTrabajadasTemp = mutableListOf<Int>()
    var currentDriverName : String? = null
    var currentDriverSueldo : Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1=findViewById(R.id.nombre_text)
        et2=findViewById(R.id.horasTotal_int)
        et3=findViewById(R.id.sueldo_float)
        tvDays=findViewById(R.id.days_text)
        tv1=findViewById(R.id.result_text)

        updateDaysTextView()
    }

    fun updateDaysTextView(){
        if (currentDayIndex < daysOfWeek.size){
            tvDays.text= "Dia: ${daysOfWeek[currentDayIndex]}"
        }
    }

    fun registrarHoras(view: View) {
        val nombre = et1.text.toString()
        val horas = et2.text.toString().toIntOrNull()
        val sueldo = et3.text.toString().toFloatOrNull()

        if (currentDayIndex == 0 ){
            if (nombre.isNotEmpty() && sueldo != null){
                currentDriverName = nombre
                currentDriverSueldo = sueldo
            } else {
                Toast.makeText(this, "Ingrese un nombre y sueldo", Toast.LENGTH_SHORT).show()
                return
            }
        }
        if (horas != null && currentDriverName != null && currentDriverSueldo != null){
            horasTrabajadasTemp.add(horas)
            currentDayIndex++

            et2.text.clear()

            if (currentDayIndex < daysOfWeek.size){
                updateDaysTextView()
            } else {
                driverList[currentDriverName!!] = Datos(horasTrabajadasTemp.toList(), currentDriverSueldo!!)
                Toast.makeText(this, "Conductor registrado", Toast.LENGTH_SHORT).show()

                horasTrabajadasTemp.clear()
                currentDayIndex = 0
                currentDriverName = null
                currentDriverSueldo = null
                et1.text.clear()
                et2.text.clear()
                et3.text.clear()
                updateDaysTextView()
            }
        } else {
            Toast.makeText(this, "Ingrese un numero de horas valido", Toast.LENGTH_SHORT).show()
        }
    }

    fun mostrarResultados(view: View){
        val sb = StringBuilder()
        var totalPagarEmpresa = 0.0f
        var maxHorasLunes = 0
        var nombreMaxLunes = ""

        if(driverList.isEmpty()){

            Toast.makeText(this, "No hay conductores registrados.", Toast.LENGTH_SHORT).show()

        } else {
            for ((nombre, datos) in driverList) {
                val totalHorasSemana = datos.horasTrabajadas.sum()
                val sueldoSemanal = totalHorasSemana * datos.sueldoHora
                totalPagarEmpresa += sueldoSemanal

                sb.append("Total de horas trabajadas por $nombre: $totalHorasSemana\n")
                sb.append("Sueldo semanal de $nombre: $sueldoSemanal\n")

                if (datos.horasTrabajadas[0] > maxHorasLunes) {
                    maxHorasLunes = datos.horasTrabajadas[0]
                    nombreMaxLunes = nombre
                }
            }

            sb.append("Total a pagar por la empresa: $totalPagarEmpresa\n")
            sb.append("El chofer que mas trabajo mas horas el dia lunes es: $nombreMaxLunes con $maxHorasLunes horas\n")

            tv1.text = sb.toString()
        }
    }
}
