package com.example.sendmessage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SendMessageActivity : AppCompatActivity() {
    private val fab: FloatingActionButton by lazy{findViewById(R.id.fab)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_send_message)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
q
        fab.setOnClickListener {
            sendMessage()
        }
    }
}

private fun sendMessage(){
    val sender = Person("Daniel", "GM", "08116185Z")
    val receiver = Person("Daniel", "GM", "08116185Z")
    val message = Message (1, edMessage.text.toString(), sender, receiver)

    val bundle = Bundle()
    bundle.putSerializable(Message.KEY_EXTRA, message)

    val intent = Intent(this.ViewActivity::class.java)

    intent.putExtras(bundle)

    startActivity(intent)
}