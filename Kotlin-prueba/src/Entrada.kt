fun main(){

    println("Primer programa Kotlin")

    var nombre = "Nazarii" //String
    var edad = 40 // Int
    val correo:String? = null
    lateinit var direccion: String
    val DNI = "123123A"
    /*
     println("Hola mi nombre es $nombre tengo $edad y mi dni es $DNI")
     println("Mi nombre tiene ${nombre.length} letras")
     println("Mi correo es ${correo?.length ?: "sin asignado"}")
     direccion = "Alcorcon"
     println("Mi Direccion es $direccion")

     var nombre1 = "Alemania"
     nombre1 = "Berlin"
     nombre1 = "1234E"
     println("$nombre1")
  */
    /*
    println("Por favor introduce tu nombre")
    nombre = readln()

    println("Por favor introduce tu edad")
    edad = readln().toInt() */

    saludar(vecesParam = 2)


    println("El resultado es ${sumar(4,7)}")

    sumaFlecha(1,6)

    repetirFor()
}

fun saludar(nombreParam : String = "Sin nombre", vecesParam: Int): Unit{
        println("hola $nombreParam, acabas de realizar una funcion")
}

fun sumar(op1: Int, op2: Int) : Int{
    return op1 + op2
}

var sumaFlecha: ((Int, Int) -> Unit) = { p1:Int, p2:Int -> println("El resultado de suma es ${p1 + p2}") }

fun repetirFor(){
    /*for (i in 0..9){
        println(i)
    }*/

    (20..30).forEachIndexed { index, i -> println("posision $index en $i") }
}