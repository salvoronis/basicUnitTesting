package com.salvoroni.unitTest.models

class RemoteControl : Entity {
    override val name: String = "пульт управления"

    fun lieDown(person: Person){
        println("$person положил ноги на $name")
    }
}