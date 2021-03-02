package com.salvoroni.unitTest.models

class Chair : Entity {
    override val name: String = "кресло"

    fun sit(person: Person){
        println("$person развалился в $name")
    }
}