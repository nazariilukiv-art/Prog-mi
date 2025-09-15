import java.util.Scanner
fun main(args:Array<String>) {

    val sc = Scanner(System.`in`)
    val nombre = "arp -a"
    println("se ha ejecutado $nombre")
    val proceso = ProcessBuilder("cmd.exe", "/c", "arp -a > fichero44.txt")
    proceso.start()


}


/*fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)  // ← lector de entrada estándar

    print("Introduce tu nombre: ")
    val nombre = scanner.nextLine()     // lee una línea completa

    println("Se ha ejecutado $nombre")

    val proceso = ProcessBuilder("$nombre")
    proceso.start()
}

 */