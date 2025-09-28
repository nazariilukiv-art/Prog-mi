fun main(){
    println("Introduce un numero entero: ")
    val num = readln().toInt()

    when {
        num > 0 -> println("El numero $num es positivo")
        num < 0 -> println("El numero $num es negativo")
        else  -> println("El numero $num es zero")
    }
}