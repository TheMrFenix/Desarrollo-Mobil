package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var et1:EditText
    private lateinit var et2:EditText
    private lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)
        et1=findViewById(R.id.txt_num1)
        et2=findViewById(R.id.txt_num2)
        tv1=findViewById(R.id.tv_resultado)
    }
    fun sumar(view: View){
        val valor1=et1.text.toString()
        val valor2=et2.text.toString()
        if (valor1!=""&& valor2!="") {
            val num1 = valor1.toInt()
            val num2 = valor2.toInt()
            val suma = num1 + num2
            val resultado = suma.toString()
            tv1.text = resultado
        }else{
            Toast.makeText(this, "Ingrese valores en los campos", Toast.LENGTH_SHORT).show()
        }
    }
}