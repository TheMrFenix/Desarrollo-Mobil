package com.example.mapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var tag = "infodev"

    //vectores
    var vect: Array<String> = arrayOf("Luz", "Telefono", "Agua")

    //crear matriz
    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9, 10, 11, 12)
    )

    //coleccion Set
    var clientesVIP: Set<Int> = setOf(123, 456, 7890)
    var mesclado = setOf(12,34,56,"pollo","casa")
    var clientes: MutableSet<Int> = mutableSetOf(12,45,78)

    //coleccion list
    var lista: List<Int> = listOf(1,2,3,4,5,6)
    var listamutable: MutableList<Int> = mutableListOf()

    //coleccion Map
    var refrescos: Map<Int,String> = mapOf(
        1 to "Cocacola",
        2 to "Fanta",
        3 to "Pepsi"
    )
    var inversiones = mutableMapOf<String,Float>()

    fun mostrarmutablemap(){
        Log.w(tag,"mostrar mutable map")
        inversiones.put("Pepsi",50F)
        inversiones.put("Cocacola",250F)
        inversiones.put("Fanta",150F)
        for (i in inversiones){
            Log.e(tag,i.toString())
        }
    }
    fun mostrarmap(){
        Log.w(tag,"Mostrar Map")
        for (i in refrescos){
            Log.e(tag,i.toString())
        }
    }
    fun mostrarMutableList(){
        Log.w(tag,"Mutable list")
        listamutable.add(0,69)
        listamutable.add(58)
        listamutable.add(36)
        for (i in listamutable){
            Log.e(tag,i.toString())
        }
    }
    fun mostrarList(){
        Log.w(tag,"mostrar List")
        for (i in lista){
            Log.e(tag,i.toString())
        }
    }
    fun mostrarMutableSet(){
        clientes.add(3)
        clientes.add(6)
        Log.w(tag,"Mutable Set")
        for (i in clientes){
            Log.e(tag,i.toString())
        }
    }
    fun mostrarSet() {
        Log.w(tag, "clientes VIP")
        Log.e(tag, clientesVIP.toString())
        Log.e(tag, "tamaño: ${clientesVIP.size}")
        if (clientesVIP.contains(1234)) {
            Log.e(tag, "El clientes 123 esta en la lista")
        } else {
            Log.e(tag, "El cliente 1234 no esta en la lista")
        }
    }
    fun mostrarMatriz() {
        Log.w(tag, "mostrar matriz")
        for (i in (0 until matriz.size)) {
            for (j in (0 until matriz[i].size)) {
                Log.e(tag, "posicion: [$i][$j]: ${matriz[i][j]}")
            }
        }
    }
    fun mostrarVector() {
        //primera forma de for
        Log.w(tag, "primera forma For")
        for (i in vect) {
            Log.e(tag, i.toString())
        }
        //segunda forma de for
        Log.w(tag, "segunda forma For")
        for (i in vect.indices) {
            Log.e(tag, vect.get(i))
        }
        //tercera forma for
        Log.w(tag, "tercera forma For")
        for (i in 0..vect.size - 1) {
            Log.e(tag, "${i + 1}: ${vect.get(i)}")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mostrarVector()
        //mostrarMatriz()
        //mostrarSet()
        //mostrarMutableSet()
        //mostrarList()
        //mostrarMutableList()
        //mostrarmap()
        mostrarmutablemap()
    }
}