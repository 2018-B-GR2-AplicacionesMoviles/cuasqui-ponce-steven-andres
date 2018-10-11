import java.util.Date;
fun main(args:Array<String>){
    println("Hola mundo")

    //Mutar -> cambiarse/Reasignar
    var edad = 29 //variable edad entero
    edad=10
    //INmutable -> No puede cambiarse/ no se reasigna
    val edadInmutable:Int
    edadInmutable=10
    //duck Typing
    var curso = 101
    curso = 102

    var nombre = "Steven"
    var apellido = 'a'
    var casado=true
    var sueldo = 10.1
    var fechaNacimiento = Date()
    println(fechaNacimiento.toString())

    when(casado){
        false -> println("Feliz $nombre") //Template Strings
        true -> println("Triste ${nombre}")
        else -> {
            println("No me voy a ejecutar")
            println("Yo tampoco")
        }
    }

    var bono = if (casado) 1000.00 else 0.00
    println(bono)

    val sueldoTotal =calcularsueldo(bono)
    println(sueldoTotal)
    val adrian=Usuario("Steven")
    println(adrian.toString())

}

fun calcularsueldo(bono:Double):Double{
    var sueldo=800
    return sueldo+bono
}

fun saludar():Unit{
    println("Hola mundo")
}

class Usuario{
    public var nombre:String

    constructor(vNombre:String){
        nombre=vNombre
    }

    override fun toString():String{
        return "Hola ${this.nombre}"
    }
}