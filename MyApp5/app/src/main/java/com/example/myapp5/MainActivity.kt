package com.example.myapp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var ingreso1:EditText
    private lateinit var ingreso2:EditText
    private lateinit var res1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ingreso1=findViewById(R.id.edit_Ingreso1)
        ingreso2=findViewById(R.id.edit_Ingreso2)
        res1=findViewById(R.id.edit_Resultado)
    }
    fun suma(view: View){
        val valor1=ingreso1.text.toString()
        val valor2=ingreso2.text.toString()
        if (valor1!=""&&valor2!=""){
            val num1=valor1.toFloat()
            val num2=valor2.toFloat()
            val toSuma=num1+num2
            val resultado=toSuma.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese los valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun resta(view: View){
        val valor1=ingreso1.text.toString()
        val valor2=ingreso2.text.toString()
        if (valor1!=""&&valor2!=""){
            val num1=valor1.toFloat()
            val num2=valor2.toFloat()
            val toResta=num1-num2
            val resultado=toResta.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese los valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun multiplic(view: View){
        val valor1=ingreso1.text.toString()
        val valor2=ingreso2.text.toString()
        if (valor1!=""&&valor2!=""){
            val num1=valor1.toFloat()
            val num2=valor2.toFloat()
            val toMulti=num1*num2
            val resultado=toMulti.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese los valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun division(view: View){
        val valor1=ingreso1.text.toString()
        val valor2=ingreso2.text.toString()
        if (valor1!=""&&valor2!=""){
            val num1=valor1.toFloat()
            val num2=valor2.toFloat()
            val toDivi=num1/num2
            val resultado=toDivi.toString()
            res1.text=resultado
        }else{
            Toast.makeText(this, "Ingrese los valores", Toast.LENGTH_SHORT).show()
        }
    }
}