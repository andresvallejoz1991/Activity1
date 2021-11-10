package com.example.activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        validarEdad()
        multiplicar()
        propiedades()
    }

    private fun validarEdad(){
        val edad1 = 17
        if(edad1 >= 18){
            println("$edad1 años es mayor de edad")
        }else{
            println("$edad1 años es menor de edad")
        }
    }
    private fun multiplicar(){
        val n = 5
        println("La tabla de multiplicar de $n en forma ascendente es : ")
        for(i in 1..9){
            println("$n x $i = ${n * i}")
        }
        println("La tabla de multiplicar de $n en forma descendente es : ")
        var contador = 10
        for(i in 1..10){
            contador--
            println("$n x $contador = ${n * contador}")
        }
    }

    private fun propiedades(){
        val car =NewClass(arrayOf(NewClass.traction.Delantera),motor = "V8",tipo="Motorizado",capacidad="4 personas")
        car.vehiculo()
        println(car.motor)
        println(car.tipo)
        println(car.capacidad)
    }

}