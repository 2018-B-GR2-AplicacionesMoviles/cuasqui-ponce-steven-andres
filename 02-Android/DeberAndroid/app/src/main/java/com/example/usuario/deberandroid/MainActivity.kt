package com.example.usuario.deberandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        boton_acceso
            .setOnClickListener {

                var estadoConexion = boton_toggle.isChecked

                when(estadoConexion){
                    true -> {
                        texto_estado.setText("Online")
                        irPantallaAcciones()}
                    false -> {
                        texto_estado.setText("Offline")
                        irPantallaAcciones()}
                    else ->{
                        print("No entra")
                }
                }

            }

        check_notif
            .setOnClickListener{
                if(check_notif.isChecked==true){
                    texto_Noti.setText("Activo")
                }else{
                    texto_Noti.setText("Inactivo")
                }
            }


    }

    fun irPantallaAcciones(){
        val intentIrABotones = Intent(this , ActivityActions::class.java)
        this.startActivity(intentIrABotones)
    }

    fun mensajeAdvertencia(){

    }

}
