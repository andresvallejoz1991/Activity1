package com.example.activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Validar si una persona mayor de edad o no
        validarEdad()
        //Presentar la tabla de multiplicar de n número de forma ascendente y descendente
        multiplicar()
        //Mostrar le listado del paralelo de la materia y los subgrupos por proyecto
        listado()
        //Presentar las propiedades de un vehiculo utilizando clases
        propiedades()
        //Ordenar de forma automatica un listado de números
        ordenarNumeros()
        //Validar una cedula
        cedula()
    }

    private fun validarEdad(){
        println("-------------------------------------------------------------------------------- ")
        val edad1 = 17
        if(edad1 >= 18){
            println("$edad1 años es mayor de edad")
        }else{
            println("$edad1 años es menor de edad")
        }
    }
    private fun multiplicar(){
        println("-------------------------------------------------------------------------------- ")
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

    private fun listado(){
        println("-------------------------------------------------------------------------------- ")
        val listas = listOf<String>("Andrés Vallejo","Brandon Vega","Frank Saca",
            "Luis Quizphe", "Jordy Esparza","Erick Jaramillo","Edgar Guamo","Jefferson Cueva")

        val ordenar = listas.sorted()
        println("Listado de Estudiantes")
        for (listas in ordenar){
            println(listas)
        }
        val grupos = mutableMapOf("Andrés Vallejo" to "Turismo","Brandon Vega" to "Banca",
            "Frank Saca" to "Turismo", "Luis Quizphe" to "Banca", "Jordy Esparza" to "Turismo",
            "Erick Jaramillo" to "Banca", "Edgar Guamo" to "Turismo", "Jefferson Cueva" to "Banca")

        val ordenGrupo = grupos.toSortedMap()
        println("Listado de Estudiantes por Proyectos")
        for (i in ordenGrupo ){
            println("${i.key} - ${i.value}")
        }
    }

    private fun propiedades(){
        println("-------------------------------------------------------------------------------- ")
        val car =NewClass(arrayOf(NewClass.traction.Delantera),motor = "V8",tipo="Motorizado",
            capacidad="4 personas")
        car.vehiculo()
        println(car.motor)
        println(car.tipo)
        println(car.capacidad)
    }

    private fun ordenarNumeros(){
        println("-------------------------------------------------------------------------------- ")
        var numeros = arrayListOf<Int>(8,5,2,7,4,1,9,6,3)
        var temporal = 0
        println("Lista Inicial")
        println("$numeros")
        for(x in(0 until numeros.size)){
            for (y in(0 until numeros.size)){
                if (numeros[x]>numeros[y]){
                    temporal = numeros[x]
                    numeros[x] = numeros[y]
                    numeros[y] = temporal
                }
            }
        }
        println("Lista de números ordenados")
        println("$numeros")
    }
    private fun cedula(){
        println("-------------------------------------------------------------------------------- ")
        val cedula = arrayListOf<Int>(1,1,5,0,0,8,3,7,7,0)
        var total =0
        var contador=0
        val numeroFinal = cedula.last()
        for(x in cedula.indices){
            contador=cedula[x]
            if(x%2==0){
                contador=(cedula[x]*2)
                if (contador>9){
                    contador = contador-9
                }
                total = total+contador
            }else{
                total = total+contador
            }
        }
        total = total - numeroFinal
        val primerNumero = total.toString().substring(0,1)
        val decena = (primerNumero.toInt()+1)*10
        if (decena-total==numeroFinal||decena-total==10){
            println("La cedula -/ $cedula -/ si es valida.")
        }else{
            println("La cedula -/ $cedula -/ no es valida.")
        }
    }

}