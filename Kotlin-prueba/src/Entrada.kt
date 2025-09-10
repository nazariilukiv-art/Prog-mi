fun main(){
    println("Primer programa Kotlin")

    val nombre = "Nazarii" //String
    val edad = 40 // Int
    val correo:String? = null
    lateinit var direccion: String
    val DNI = "123123A"

    println("Hola mi nombre es $nombre tengo $edad y mi dni es $DNI")
    println("Mi nombre tiene ${nombre.length} letras")
    println("Mi correo es ${correo?.length ?: "sin asignado"}")
    direccion = "Alcorcon"
    println("Mi Direccion es $direccion")
}