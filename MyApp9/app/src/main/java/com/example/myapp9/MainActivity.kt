package com.example.myapp9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var anti:EditText
    private lateinit var sueldo:EditText
    private lateinit var bono:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        anti=findViewById(R.id.edit_Ingreso1)
        sueldo=findViewById(R.id.edit_Ingreso2)
        bono=findViewById(R.id.text_Resultado)
    }
    fun bonoAntiguedad(view: View){
        val valor1=anti.text.toString()
        val valor2=sueldo.text.toString()
        if (valor1!=""&&valor2!=""){
            val num1=valor1.toInt()
            val num2=valor2.toFloat()
            if (num1>=2&&num1<5){
                val toBono=num2*0.2
                val resultado="Su bono es de $toBono$"
                bono.text=resultado
            } else if (num1>=5){
                val toBono=num2*0.3
                val resultado="Su bono es de $toBono$"
                bono.text=resultado
            } else {
                val resultado="Su antiguedad no es suficiente, intente con la otra opcion"
                bono.text=resultado
            }
        } else {
            Toast.makeText(this, "Ingrese los valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun bonoSueldo(view: View){
        val valor1=anti.text.toString()
        val valor2=sueldo.text.toString()
        if (valor1!=""&&valor2!=""){
            val num2=valor2.toFloat()
            if (num2<=1000){
                val toBono=num2*0.25
                val resultado="Su bono es de $toBono$"
                bono.text=resultado
            }else if (num2>1000&&num2<=3500){
                val toBono=num2*0.15
                val resultado="Su bono es de $toBono$"
                bono.text=resultado
            }else if (num2>3500){
                val toBono=num2*0.1
                val resultado="Su bono es de $toBono$"
                bono.text=resultado
            }
        } else {
            Toast.makeText(this, "Ingrese los valores", Toast.LENGTH_SHORT).show()
        }
    }
}