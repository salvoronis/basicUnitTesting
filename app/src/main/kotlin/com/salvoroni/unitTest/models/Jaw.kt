package com.salvoroni.unitTest.models

class Jaw(_name: String) : BodyPart {
    override val name: String = _name

    fun chew(arm: Arm, head: Head){
        println("$name в $head ковыряется с помощью $arm")
    }

    fun sag() {
        println("$name отвисла")
    }

    override fun toString(): String {
        return this.name
    }
}