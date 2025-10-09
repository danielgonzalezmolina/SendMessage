package com.example.sendmessage.model

import java.io.Serializable

/**
 * Persona
 *
 * @property name
 * @property surname
 * @property dni
 */

data class Persona(val name: String, val surname: String, val dni: String) : Serializable