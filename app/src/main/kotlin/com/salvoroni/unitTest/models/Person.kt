package com.salvoroni.unitTest.models

class Person(_name: String, _headName: String, _leftArm: String, _rightArm: String, _leftFoot: String, _rightFoot: String) {
    val mainHead: Head = Head(_headName)
    var secondHead: Head? = null
    val leftArm: Arm = Arm(_leftArm)
    val rightArm: Arm = Arm(_rightArm)
    val leftFoot: Foot = Foot(_leftFoot)
    val rightFoot: Foot = Foot(_rightFoot)

    val name: String = _name

    fun shock() {
        println("$name не верил своим глазам")
    }

    fun getNervous() {
        println("$name нервничает")
    }

    override fun toString(): String {
        return this.name
    }
}