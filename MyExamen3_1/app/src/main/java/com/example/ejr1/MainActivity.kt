package com.example.ejr1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var idTarea: EditText
    private lateinit var idEliminar: EditText
    private lateinit var tareaText: EditText
    private lateinit var listaText: TextView

    var listaTarea = mutableMapOf<Int,String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        idTarea=findViewById(R.id.idTarea_text)
        idEliminar=findViewById(R.id.id_text)
        tareaText=findViewById(R.id.registrar_text)
        listaText=findViewById(R.id.lista_view)
    }

    fun registrarTarea(view:View){
        val idText = idTarea.text.toString()
        val nombreTarea = tareaText.text.toString()

        if (idText.isNotEmpty() && nombreTarea.isNotEmpty()){
            try {
                val id = idText.toInt()
                listaTarea[id] = nombreTarea

                idTarea.text.clear()
                tareaText.text.clear()

                Toast.makeText(this, "Tarea registrada", Toast.LENGTH_SHORT).show()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "El ID debe ser un número válido", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
        }
    }
    fun mostrarLista(view: View){
        val sb = StringBuilder()

        for ((id,tarea) in listaTarea){
            sb.append("$id, - $tarea\n")
        }
        listaText.text = sb.toString()
    }
    fun modificarTarea(view: View){
        val idTextModificar = idTarea.text.toString()
        val nuevaTarea = tareaText.text.toString()

        if (idTextModificar.isNotEmpty() && nuevaTarea.isNotEmpty()){
            try {
                val id = idTextModificar.toInt()

                if (listaTarea.containsKey(id)) {
                    listaTarea[id] = nuevaTarea

                    idTarea.text.clear()
                    idTarea.text.clear()

                    Toast.makeText(this, "Tarea modificada", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "ID de tarea no encontrado", Toast.LENGTH_SHORT).show()
                }
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "El ID debe ser un número válido", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
        }
    }

    fun eliminarTarea(view: View) {
        val idEliminarText = idEliminar.text.toString()

        if (idEliminarText.isNotEmpty()) {
            try {
                val idEliminar = idEliminarText.toInt()

                if (listaTarea.containsKey(idEliminar)) {
                    listaTarea.remove(idEliminar)
                    idTarea.text.clear()
                    tareaText.text.clear()
                    Toast.makeText(this, "Tarea eliminada", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "No se encontró el id", Toast.LENGTH_SHORT).show()
                }
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Error al encontrar id", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Ingrese un id para eliminar", Toast.LENGTH_SHORT).show()
        }
    }

}