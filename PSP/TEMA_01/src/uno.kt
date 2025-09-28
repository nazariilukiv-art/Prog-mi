import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){

    val nimbre = "arp -a"
    val proceso = ProcessBuilder("notepad")
    val procesotemporal = proceso.start()
    // println(procesotemporal.isAlive)
    // procesotemporal.waitFor()
    // procesotemporal.inputStream.bufferedReader().readText()
    val lector  = BufferedReader(InputStreamReader(procesotemporal.inputStream))
    var linea:String?
    while (lector.readLine().also { linea = it } != null){
        print(linea)
    }

}