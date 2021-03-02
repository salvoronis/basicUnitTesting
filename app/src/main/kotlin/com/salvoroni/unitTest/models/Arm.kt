package com.salvoroni.unitTest.models

class Arm(_name: String) : BodyPart {
    override val name: String = _name

    override fun toString(): String {
        return this.name
    }
}