package com.example.myapp10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var nombret1:EditText
    private lateinit var hora1t1:EditText
    private lateinit var hora2t1:EditText
    private lateinit var hora3t1:EditText
    private lateinit var hora4t1:EditText
    private lateinit var hora5t1:EditText
    private lateinit var hora6t1:EditText
    private lateinit var pago1t1:EditText
    private lateinit var pago2t1:EditText
    private lateinit var pago3t1:EditText
    private lateinit var pago4t1:EditText
    private lateinit var pago5t1:EditText
    private lateinit var pago6t1:EditText
    private lateinit var nombret2:EditText
    private lateinit var hora1t2:EditText
    private lateinit var hora2t2:EditText
    private lateinit var hora3t2:EditText
    private lateinit var hora4t2:EditText
    private lateinit var hora5t2:EditText
    private lateinit var hora6t2:EditText
    private lateinit var pago1t2:EditText
    private lateinit var pago2t2:EditText
    private lateinit var pago3t2:EditText
    private lateinit var pago4t2:EditText
    private lateinit var pago5t2:EditText
    private lateinit var pago6t2:EditText
    private lateinit var Respuesta:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nombret1=findViewById(R.id.edit_nombret1)
        hora1t1=findViewById(R.id.edit_hora1t1)
        hora2t1=findViewById(R.id.edit_hora2t1)
        hora3t1=findViewById(R.id.edit_hora3t1)
        hora4t1=findViewById(R.id.edit_hora4t1)
        hora5t1=findViewById(R.id.edit_hora5t1)
        hora6t1=findViewById(R.id.edit_hora6t1)
        pago1t1=findViewById(R.id.edit_pago1t1)
        pago2t1=findViewById(R.id.edit_pago2t1)
        pago3t1=findViewById(R.id.edit_pago3t1)
        pago4t1=findViewById(R.id.edit_pago4t1)
        pago5t1=findViewById(R.id.edit_pago5t1)
        pago6t1=findViewById(R.id.edit_pago6t1)
        nombret2=findViewById(R.id.edit_nombret2)
        hora1t2=findViewById(R.id.edit_hora1t2)
        hora2t2=findViewById(R.id.edit_hora2t2)
        hora3t2=findViewById(R.id.edit_hora3t2)
        hora4t2=findViewById(R.id.edit_hora4t2)
        hora5t2=findViewById(R.id.edit_hora5t2)
        hora6t2=findViewById(R.id.edit_hora6t2)
        pago1t2=findViewById(R.id.edit_pago1t2)
        pago2t2=findViewById(R.id.edit_pago2t2)
        pago3t2=findViewById(R.id.edit_pago3t2)
        pago4t2=findViewById(R.id.edit_pago4t2)
        pago5t2=findViewById(R.id.edit_pago5t2)
        pago6t2=findViewById(R.id.edit_pago6t2)
        Respuesta=findViewById(R.id.edit_rasultado)
    }
    fun horasTotales(view: View){
        val valor1=nombret1.text.toString()
        val valor2=hora1t1.text.toString()
        val valor3=hora2t1.text.toString()
        val valor4=hora3t1.text.toString()
        val valor5=hora4t1.text.toString()
        val valor6=hora5t1.text.toString()
        val valor7=hora6t1.text.toString()
        val valor8=nombret2.text.toString()
        val valor9=hora1t2.text.toString()
        val valor10=hora2t2.text.toString()
        val valor11=hora3t2.text.toString()
        val valor12=hora4t2.text.toString()
        val valor13=hora5t2.text.toString()
        val valor14=hora6t2.text.toString()
        if (valor1!=""&&valor2!=""&&valor3!=""&&valor4!=""&&valor5!=""&&valor6!=""&&valor7!=""&&valor8!=""&&valor9!=""&&valor10!=""&&valor11!=""&&valor12!=""&&valor13!=""&&valor14!="") {
            var nom1=valor1.toString()
            var nom2=valor8.toString()
            var num1=valor2.toInt()
            var num2=valor3.toInt()
            var num3=valor4.toInt()
            var num4=valor5.toInt()
            var num5=valor6.toInt()
            var num6=valor7.toInt()
            var num7=valor9.toInt()
            var num8=valor10.toInt()
            var num9=valor11.toInt()
            var num10=valor12.toInt()
            var num11=valor13.toInt()
            var num12=valor14.toInt()
            var sum1=num1+num2+num3+num4+num5+num6
            var sum2=num7+num8+num9+num10+num11+num12
            Respuesta.text = "Las Horas totales de la semana de:$nom1 es $sum1 y de:$nom2 es $sum2"
        }else{
            Toast.makeText(this, "Ingrese todos los Valores", Toast.LENGTH_SHORT).show()
        }
    }
    fun sueldoSemanal(view: View){
        val valor1=nombret1.text.toString()
        val valor2=nombret2.text.toString()
        val valor3=pago1t1.text.toString()
        val valor4=pago2t1.text.toString()
        val valor5=pago3t1.text.toString()
        val valor6=pago4t1.text.toString()
        val valor7=pago5t1.text.toString()
        val valor8=pago6t1.text.toString()
        val valor9=pago1t2.text.toString()
        val valor10=pago2t2.text.toString()
        val valor11=pago3t2.text.toString()
        val valor12=pago4t2.text.toString()
        val valor13=pago5t2.text.toString()
        val valor14=pago6t2.text.toString()
        if (valor1!=""&&valor2!=""&&valor3!=""&&valor4!=""&&valor5!=""&&valor6!=""&&valor1!=""&&valor1!=""&&valor1!=""&&valor1!=""&&valor1!=""&&valor1!=""&&valor1!=""){
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
}