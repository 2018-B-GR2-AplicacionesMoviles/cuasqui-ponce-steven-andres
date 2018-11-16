package com.example.usuario.deberandroid

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_actions.*
import android.widget.TextView
import android.widget.CalendarView
import java.text.SimpleDateFormat
import java.util.*


class ActivityActions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions)
        val simpleWebView = findViewById(R.id.simpleWebView) as WebView
        var url = "https://es.wikipedia.org/wiki/Android"
        switch_texto
            .setOnClickListener {
                if (switch_texto.isChecked == true) {
                    simpleWebView.setVisibility(View.VISIBLE)
                    simpleWebView.loadUrl(url);
                } else {
                    simpleWebView.setVisibility(View.GONE)
                    simpleWebView.loadUrl("wwww.google.com")
                }
            }

        //calendarView
//            .setOnClickListener {
//
                    var cv = findViewById(R.id.calendarView) as CalendarView
                    var c = Calendar.getInstance()
                    var ss = SimpleDateFormat("dd-MM-yyyy")
                    var date = cv.date
                    var currentdate = ss.format(date)
                    var editText = this.findViewById(R.id.textoCalendario) as TextView
                    editText.setText(currentdate)
//            calendarView.get
//
//            }
//          fun onSelectedDayChange(calendarView ,int year, int month, int dayOfMonth){
//                textoCalendario.setText(year+"-"+month+"-"+dayOfMonth)
//            }
    }
}
