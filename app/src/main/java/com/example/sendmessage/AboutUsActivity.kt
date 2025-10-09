package com.example.sendmessage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import husaynhakeem.com.aboutpage.AboutPage
import husaynhakeem.com.aboutpage.Item

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(AboutPage(this)
            .setBackground(android.R.color.white)
            .setDescription("SendMessage es una aplicación sencilla que te permite enviar mensajes de forma rápida y directa.\n" +
                    "Diseñada para practicar el intercambio de información entre pantallas, muestra cómo crear, enviar y visualizar mensajes dentro de una interfaz limpia y fácil de usar.\n" +
                    "\n" +
                    "Ideal para aprender los fundamentos de Android: intents, bundles y comunicación entre actividades.")
            .setImage(R.mipmap.ic_launcher)
            .addItem(Item("Version 0.1.0"))
            .addEmail("test@gmail.com")
            .addFacebook("test")
            .addGithub("danielgonzalezmolina")
            .addInstagram("test")
            .addPlayStore("com.test")
            .addTwitter("test")
            .addWebsite("http://www.test.com")
            .addYoutube("UCyWqModMQlbIo8274Wh_ZsQ")
            .addItem(Item("DANIEL GONZÁLEZ MOLINA", null, View.OnClickListener { Toast.makeText(this, "Enjoy!", Toast.LENGTH_SHORT).show() }))
            .create())
    }
}