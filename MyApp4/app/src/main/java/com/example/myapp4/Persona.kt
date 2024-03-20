package com.example.myapp4

class Persona(var nombre:String) {
    private var apellidoPaterno:String =""
    private var apellidoMaterno:String =""

    override fun toString(): String {
        return "Persona(nombre='$nombre',apellidoPaterno='$apellidoPaterno',apellidoMaterno='$apellidoMaterno)"
    }
    fun getApellidoPaterno():String{
        return this.apellidoPaterno
    }
    fun setApellidoPaterno(a:String){
        this.apellidoPaterno=a
    }
    fun getApellidoMaterno():String{
        return this.apellidoMaterno
    }
    fun setApellidoMeterno(a:String){
        this.apellidoMaterno=a
    }
}