package com.example.myapp6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edad:EditText
    private lateinit var promedio:EditText
    private lateinit var res1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edad=findViewById(R.id.edit_Ingreso1)
        promedio=findViewById(R.id.edit_Ingreso2)
        res1=findViewById(R.id.text_Resultado)
    }
    fun beca(view: View){
        val valor1=edad.text.toString()
        val valor2=promedio.text.toString()
        if (valor1!=""&&valor2!=""){
            val num1=valor1.toInt()
            val num2=valor2.toFloat()
            if (num1>18){
                if (num2>=9){
                    val toBeca=2000.00
                    val resultado="Su beca es de: $toBeca$"
                    res1.text=resultado
                }else if (num2>=7.5){
                    val toBeca=1000.00
                    val resultado="Su beca es de: $toBeca$"
                    res1.text=resultado
                }else if (num2<7.5 && num2>=6.0){
                    val toBeca=500.00
                    val resultado="Su beca es de: $toBeca$"
                    res1.text=resultado
                }else if (num2<6){
                    val resultado="No puede resivir una beca, intente subir su promedio"
                    res1.text=resultado
                }
            }else if (num1<=18){
                if (num2>=9){
                    val toBeca=3000
                    val resultado="Su beca es de: $toBeca$"
                    res1.text=resultado
                }else if (num2<9 && num2>=8){
                    val toBeca=2000
                    val resultado="Su beca es de: $toBeca$"
                    res1.text=resultado
                }else if (num2<8 && num2>=6){
                    val toBeca=1000
                    val resultado="Su beca es de: $toBeca$"
                    res1.text=resultado
                }else if (num2<6){
                    val resultado="No puede resivir una beca, intente subir su promedio"
                    res1.text=resultado
                }
            }
        }else{
            Toast.makeText(this, "Ingrese los valores", Toast.LENGTH_SHORT).show()
        }
    }
}