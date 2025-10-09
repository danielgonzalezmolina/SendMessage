package com.example.sendmessage

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sendmessage.model.Message

class ViewActivity : AppCompatActivity() {

    private lateinit var message: Message

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        message = intent.getSerializableExtra(Message.KEY_EXTRA) as Message

        Log.v("ViewActivity", "Mensaje recibido: ${message.content}")
    }

    //region Métodos del ciclo de vida
    override fun onStart() {
        super.onStart()
        Log.v("ViewActivity", "Se ha ejecutado el método onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("ViewActivity", "Se ha ejecutado el método onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("ViewActivity", "Se ha ejecutado el método onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("ViewActivity", "Se ha ejecutado el método onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("ViewActivity", "Se ha ejecutado el método onDestroy")
    }
    //endregion
}
