package com.example.myexamen3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var agregarLista:EditText
    private lateinit var modificarLista:EditText
    private lateinit var mostrarLista:TextView
    var Lista:MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        agregarLista=findViewById(R.id.edit_ingresarTarea)
        modificarLista=findViewById(R.id.edit_ingresarModificado)
        mostrarLista=findViewById(R.id.edit_rasultado)
    }
    fun AgregarLista(view: View){
        val valor1=agregarLista.text.toString()
        Lista.add(valor1)
        for (i in Lista){
            mostrarLista.text=i.toString()
        }
    }
    fun ModificarLista(view: View){
        val valor1=modificarLista.text.toString()
        Lista.set(0,valor1)
        for (i in Lista){
            mostrarLista.text=i.toString()
        }
    }
    fun EliminarLista(view: View){
        Lista.removeAt(0)
        mostrarLista.text="Lista"
    }
}