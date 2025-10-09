package com.example.sendmessage

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sendmessage.databinding.ActivitySendMessageBinding
import com.example.sendmessage.model.Message
import com.example.sendmessage.model.Persona
import kotlin.jvm.java


class SendMessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendMessageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySendMessageBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.fab.setOnClickListener { sendMessage() }

        binding.aboutUs.setOnClickListener {
            val intent = Intent(this, AboutUsActivity::class.java)
            startActivity(intent)
        }

    }





private fun sendMessage(){
    //1. Crear los objetos message, sender y recceiver

    val sender = Persona("Daniel", "GM", "08116185Z")
    val receiver = Persona("Miguel", "MM", "12345678A")
    val message = Message ("1", binding.edMessage.text.toString(), sender, receiver)

    //2. Se crea el objeto Bundle, que contiene a otros objetos

    val bundle = Bundle()
    bundle.putSerializable(Message.KEY_EXTRA, message)

    val intent = Intent(this, ViewActivity::class.java)

    intent.putExtras(bundle)

    startActivity(intent)
}}