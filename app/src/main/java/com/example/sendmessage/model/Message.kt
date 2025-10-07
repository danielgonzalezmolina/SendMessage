package com.example.sendmessage.model

import java.io.Serializable

data class Message(val id: Int, val content : String, val sender : Person) : Serializable {

    companion object {
        const val KEY_EXTRA = "key_extra_message"
    }
}
