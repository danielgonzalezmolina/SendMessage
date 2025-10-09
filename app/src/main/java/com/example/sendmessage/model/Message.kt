package com.example.sendmessage.model

import java.io.Serializable

data class Message(val id: String, val content: String, val sender: Persona, val receiver: Persona) :
    Serializable {
    companion object{
        const val KEY_EXTRA = "key_extra_message"
    }
}
