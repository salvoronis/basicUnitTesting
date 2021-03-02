package com.salvoroni.unitTest.models

class Foot(_name: String) : BodyPart {
    override val name: String = _name
    fun step() {
        println("$name сделала шаг")
    }
}