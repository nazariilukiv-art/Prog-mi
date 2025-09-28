package model

class Cliente(var id: Int, var nombre: String) {
    lateinit var carrito: ArrayList<Producto>
    var factura: Double = 0.0

    init {
        // carrito = ArrayList()
        carrito = arrayListOf()
    }

    fun agregarProductoCarrito(producto: Producto) {

        carrito.add(producto)
        println("Producto agregado al carrito correctamente")
    }

    // mostrar todos los elementos del carrito
    fun mostrarCarrito() {
        if (carrito.isEmpty()) {
            println("No hay nada en el carrito")
        } else {
            carrito.forEach { it.mostrarDatos() }
        }
    }

    // mostrar el producto que esta en una posicion indicada
    fun accesoPorPosicion(posicon: Int) {
        if (posicon>carrito.size-1){
            println("ID fuera de rango")
        } else {
            carrito[posicon].mostrarDatos()
        }
    }

    // eliminar un producto del carrito
    // en caso de no estar el id en el carrito -> aviso de que no se encuentra
    // en caso de si estar en el carrito y solo existir uno, lo elimina
    // en caso de si estar en el carrito y existir varios, confirmacion de eliminar 1 o todos

    fun borrarElementos(id: Int){

        var listaFitrada = carrito.filter {
            return@filter it.id == id
        }

        if(listaFitrada.isEmpty()){
            println("el numero de resultado es ${listaFitrada.size} no se puede borrar")
        }else if ( listaFitrada.size == 1){
            carrito.remove(listaFitrada.first())
            // carrito.removeFirst()
            println("Borrado corectamente")
        }else{
            println("Se han encontrado varias coincidencias, cual quieres borrar (1 para primero / n para todos )")

            val opcion: String = readln()
            if (opcion.equals("1", true)){
                carrito.remove(listaFitrada.first())
            }else if(opcion.equals("n", true)){
                carrito.removeAll(listaFitrada.toSet())
            }
        }
    }


    fun pedirFactura(){
        if (carrito.isEmpty()){
            println("No puedes pedir no hay productos")
        }else{
            carrito.forEach {
                factura+=it.precio
            }
            println("Debes un total factura")
            carrito.clear()
        }


    }



}