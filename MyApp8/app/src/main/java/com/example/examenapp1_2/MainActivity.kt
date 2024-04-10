package com.example.examenapp1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var bol1:EditText
    private lateinit var res1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bol1=findViewById(R.id.edit_ingreso2)
        res1=findViewById(R.id.edit_resultado2)
    }
    fun euros(view: View){
        val valor1=bol1.text.toString()
        if (valor1!=""){
            val num=valor1.toFloat()
            val toeuro=num*0.13
            val resultado=toeuro.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
        }
    }
    fun dolares(view: View){
        val valor2=bol1.text.toString()
        if (valor2!=""){
            val num=valor2.toFloat()
            val todolar=num*0.14
            val resultado=todolar.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
        }
    }
    fun yuanes(view: View){
        val valor3=bol1.text.toString()
        if (valor3!=""){
            val num=valor3.toFloat()
            val toyuan=num*1.05
            val resultado=toyuan.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
        }
    }
    fun todos(view: View){
        val valor4=bol1.text.toString()
        val valor5=bol1.text.toString()
        val valor6=bol1.text.toString()
        if (valor5!=""&&valor6!=""&&valor4!=""){
            val num1=valor4.toFloat()
            val num2=valor5.toFloat()
            val num3=valor6.toFloat()
            val toeuro=num1*0.13
            val todolar=num2*0.14
            val toyuan=num3*1.05
            val resultado="Euro: $toeuro Dolar: $todolar Yuan: $toyuan"
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese un valor", Toast.LENGTH_SHORT).show()
        }
    }
}