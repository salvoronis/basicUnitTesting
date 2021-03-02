package com.salvoroni.unitTest.models

interface Place {
    val persons: ArrayList<Person>?

    fun enter(person: Person)
}