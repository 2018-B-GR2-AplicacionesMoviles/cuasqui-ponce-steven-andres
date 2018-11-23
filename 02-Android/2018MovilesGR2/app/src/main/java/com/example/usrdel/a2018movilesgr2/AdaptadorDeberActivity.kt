package com.example.usrdel.a2018movilesgr2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class AdaptadorDeberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adaptador_deber)
    }

    val arregloUsuarios = ArrayList<Usuarios>()

    val usuario = Usuarios(
            "Steven",
            29,

            12.00)
    val usuarioDos = Usuarios(
            "Andres",
            32,

            17.00)

    val usuarioTres = Usuarios(
            "Cuasqui",
            32,

            15.00)

    arregloUsuarios.add(usuario)
    arregloUsuarios.add(usuarioDos)

    val arregloUsuarios2 = ArrayList<Usuario>()

    val usuariotres = Usuarios(
            "Alexa",
            29,

            12.00)
    val usuariocuatro = Usuarios(
            "Vane",
            32,

            15.00)



    arregloUsuarios2.add(usuariotres)
    arregloUsuarios2.add(usuariocuatro)


    val arregloUsuarios3 = ArrayList<Usuarios>()

    val usuariocinco = Usuarios(
            "angel",
            29,

            12.00)
    val usuarioseis = Usuarios(
            "david",
            32,

            15.00)




    arregloUsuarios3.add(usuariocinco)
    arregloUsuarios3.add(usuarioseis)






    val arregloUsuarios4 = ArrayList<Usuario>();

    val usuariosiete= Usuarios(
            "daniel",
            29,

            12.00)
    val usuarioochi = Usuarios(
            "jose",
            32,

            15.00)







    arregloUsuarios4.add(usuariosiete)
    arregloUsuarios4.add(usuarioochi)


    // ADAPTADOR

    val adaptadorUsuarios = ArrayAdapter<Usuarios>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios
    )

    val adaptadorUsuarios2= ArrayAdapter<Usuarios>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios2
    )

    // Seteo el adaptado
    val lista =lista1
    lista.adapter = adaptadorUsuarios
    val lista2 = lista2
    lista2.adapter = adaptadorUsuarios2


    val adaptadorUsuarios3 = ArrayAdapter<Usuarios>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios3
    )

    val adaptadorUsuarios4= ArrayAdapter<Usuarios>(
            this,
            android.R.layout.simple_list_item_1,
            arregloUsuarios4
    )

    // Seteo el adaptado
    val lista3 =lista3
    lista3.adapter = adaptadorUsuarios3
    val lista4 = lista4
    lista4.adapter = adaptadorUsuarios4








}






