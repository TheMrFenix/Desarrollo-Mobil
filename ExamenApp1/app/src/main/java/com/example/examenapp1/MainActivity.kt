package com.example.examenapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private  lateinit var cel1:EditText
    private  lateinit var res1:TextView
    private lateinit var bol1:EditText
    private lateinit var res2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cel1=findViewById(R.id.edit_ingreso)
        res1=findViewById(R.id.edit_resultado)
    }
    fun fahren(view: View){
        val valor1=cel1.text.toString()
        if (valor1!=""){
            val num=valor1.toFloat()
            val tofahren=(num*9/5)+32
            val resultado=tofahren.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
        }
    }
    fun kelv(view: View){
        val valor2=cel1.text.toString()
        if (valor2!=""){
            val num=valor2.toDouble()
            val tokelv=num+273.15
            val resultado=tokelv.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
        }
    }
    fun ambos(view: View){
        val valor3=cel1.text.toString()
        val valor4=cel1.text.toString()
        if (valor3!=""&&valor4!=""){
            val num1=valor3.toFloat()
            val num2=valor4.toFloat()
            val amboz1=(num1*9/5)+32
            val amboz2=num2+273.15
            val resultado1="$amboz1 y $amboz2"
            res1.text=resultado1
        }else{
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
        }
    }
}