package com.example.sendmessage

import android.app.Application
import android.util.Log

class sendMessageAplication : Application() {
    //Método donde se inicializará las conexiones o elementos que sean comunes para toda la aplicacion: inyección de dependencias o BD
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Application -> onCreate()")
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "Application -> onTerminate()")
    }
    companion object {
        const val TAG="SendMessageApplication"
    }

}