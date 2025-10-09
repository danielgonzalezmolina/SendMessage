package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sendmessage.model.Message
import com.example.sendmessage.model.Persona
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.sendmessage.ViewActivity
import kotlin.jvm.java

class SendMessageActivity : AppCompatActivity() {
    private val fab: FloatingActionButton by lazy { findViewById(R.id.fab) }
    private val edMessage : EditText by lazy { findViewById(R.id.edMessage) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_send_message)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Cuando se pulse sobre el botón flotante cambia la Activity
        fab.setOnClickListener()
        {
            sendMessage()
        }
    }

private fun sendMessage(){
    //1. Crear los objetos message, sender y recceiver

    val sender = Persona("Daniel", "GM", "08116185Z")
    val receiver = Persona("Miguel", "MM", "12345678A")
    val message = Message ("1", edMessage.text.toString(), sender, receiver)

    //2. Se crea el objeto Bundle, que contiene a otros objetos

    val bundle = Bundle()
    bundle.putSerializable(Message.KEY_EXTRA, message)

    val intent = Intent(this, ViewActivity::class.java)

    intent.putExtras(bundle)

    startActivity(intent)
}}