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
    val adrian=Usuario("Steven", "Cuasqui", "Ponce")
    println(adrian.toString())

}

fun calcularsueldo(bono:Double):Double{
    var sueldo=800
    return sueldo+bono
}

fun saludar():Unit{
    println("Hola mundo")
}

class Usuario(public var nombre:String){ //1er constructor
    public var apellido: String? =null
    public var apellidoMaterno: String?=null

    constructor(vNombre:String,vApellido:String,vApellidoMaterno:String):this(vNombre){ //2do, 3ro,4to
        this.apellido=vApellido
        apellidoMaterno=vApellidoMaterno
    }
    /*
    constructor(vNombre:String){
        nombre=vNombre
    }
    */
    override fun toString():String{
        val apellidoMay = if (!apellido.isNullOrBlank()) this.apellido?.toUpperCase() else ""
        val apellidoMat = if (!apellidoMaterno.isNullOrBlank()) this.apellidoMaterno?.toUpperCase() else ""
        return "Hola $nombre $apellidoMay $apellidoMaterno"
    }
}

open class Animal(var nombre:String){

}

class Tortuga(nombre:String,var pesoCaparazon:Double):Animal("Mario"){

    init{
        println("$nombre $pesoCaparazon")
    }

}

var animal=Animal("Caballo")
var george=Tortuga("George",12.5)

class Ejemplo{
    var nombre:String

    constructor(nNombre:String){
        println("Estoy en el constructor")
        nombre=nNombre
    }
    init{
        println("estoy en el init")
    }
}

val ejemplo =Ejemplo("Steven")