package com.salvoroni.unitTest.models

class Room : Place {
    val name: String = "комната"
    override val persons: ArrayList<Person>? = ArrayList()

    override fun enter(person: Person) {
        persons?.add(person)
        println("$person вошел в $name")
    }
}