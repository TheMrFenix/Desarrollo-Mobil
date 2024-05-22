package com.example.myapp10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var trabajador:TextView
    private lateinit var nombre:EditText
    private lateinit var dia:TextView
    private lateinit var hora:EditText
    private lateinit var pago:EditText
    private lateinit var resultado:TextView
    var dias= listOf<String>("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    var nombret1 = ""
    var horat1 = mutableListOf<Int>()
    var pagot1 = mutableListOf<Float>()
    var nombret2 = ""
    var horat2 = mutableListOf<Int>(0,2,3,4,5,6)
    var pagot2 = mutableListOf<Float>(0f,2f,3f,4f,5f,6f)
    var paso=1
    private var cambio=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trabajador=findViewById(R.id.edit_TextNombre)
        nombre=findViewById(R.id.ingreso_Nombre)
        dia=findViewById(R.id.edit_TextDia)
        hora=findViewById(R.id.ingreso_Hora)
        pago=findViewById(R.id.ingreso_Pago)
        resultado=findViewById(R.id.edit_Resultado)
    }
    fun Pasar(view: View){
        paso=paso+1
    }
    fun Registro(view: View){
        val valor1=nombre.text.toString()
        val valor2=hora.text.toString()
        val valor3=pago.text.toString()
        if (cambio){
            if (valor1!="") {
                nombret1=valor1
            }else{
                Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
            }
            if (valor2!=""&&valor3!=""){
                val num1=valor2.toInt()
                val num2=valor3.toFloat()
                dia.text=dias[paso]
                horat1.add(paso,num1)
                pagot1.add(paso,num2)
            }else{
                Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
            }
            if (paso==6){
                cambio=true
                paso=1
                dia.text=dias[paso]
            }
        }else{
            if (valor1!=""){
                nombret2=valor1
            }else{
                Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
            }
            if (valor2!=""&&valor3!=""){
                val num1=valor2.toInt()
                val num2=valor3.toFloat()
                for (i in horat2){
                    dia.text=dias[i]
                    horat2.add(i,num1)
                    pagot2.add(i,num2)
                }
            }else{
                Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun HorasTotales(view: View){
        val valor1=hora.text.toString()
        if (valor1!="") {
            var sum1 = 0
            for (i in horat1) {
                sum1 += horat1.get(i)
            }
            var sum2 = 0
            for (j in horat2) {
                sum2 += horat2.get(j)
            }
            resultado.text =
                "Las Horas totales de la semana de:$nombret1 es $sum1 y de:$nombret2 es $sum2"
        }else{
            Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun SueldoSemanal(view: View){
        val valor1=pago.text.toString()
        if (valor1!=""){
            var sum1=0f
            for (i in pagot1){
                sum1+=pagot1.get(i.toInt())
            }
            var sum2=0f
            for (j in pagot2){
                sum2+=pagot2.get(j.toInt())
            }
            resultado.text="El sueldo semanal de:$nombret1 es $sum1 y de:$nombret2 es $sum2"
        }else{
            Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun PagoEmpresa(view: View){
        val valor1=pago.text.toString()
        if (valor1!=""){
            var sum1=0f
            for (i in pagot1){
                sum1+=pagot1.get(i.toInt())
            }
            var sum2=0f
            for (j in pagot2){
                sum2+=pagot2.get(j.toInt())
            }
            var sum3=sum1+sum2
            resultado.text="El total que la Empresa debe pagar es:$sum3"
        }else{
            Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun MasHoras(view: View){
        val valor1=horat1.get(1)
        val valor2=horat2.get(1)
        if(valor1>valor2){
            resultado.text="El Trabajador con mas horas laburadas el lunes es:$nombret1"
        } else if (valor1<valor2){
            resultado.text="El trabajador con mas horas laburadas el lunes es:$nombret2"
        } else if (valor1==valor2){
            resultado.text="Ambos trabajadores laburaron la misma cantidad de horas"
        } else {
            Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
        }
    }
}