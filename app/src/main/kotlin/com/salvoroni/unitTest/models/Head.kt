package com.salvoroni.unitTest.models

class Head(_name: String) : BodyPart {
    override val name: String = _name
    val jaw: Jaw = Jaw("Челюсть $name")

    fun see() {
        println("видеть")
    }

    fun smile() {
        println("$name улыбается")
    }

    fun busy() {
        println("$name занята")
    }

    override fun toString(): String {
        return this.name
    }
}