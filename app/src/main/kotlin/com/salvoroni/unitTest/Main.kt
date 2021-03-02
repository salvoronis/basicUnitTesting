package com.salvoroni.unitTest

import com.salvoroni.unitTest.math._acos
import com.salvoroni.unitTest.sort.shellSort
import com.salvoroni.unitTest.models.*

fun main() {
    println(_acos(-0.5))
    val arr = intArrayOf(23, 12, 1,8, 34, 54, 2, 3)
    for (i in arr) print("$i ")

    shellSort(arr)
    println()

    for (i in arr) print("$i ")

    val arthur = Person("Артур", "Голова Артура", "левая рука Артура", "правая рука Артура", "левая нога Артура", "правая нога Артура")
    val unnamed = Person("Безымянный", "Голова Безымянного", "левая рука Безымянного", "правая рука Безымянного", "левая нога Безымянного", "правая нога Безымянного")
    val room = Room()
    room.enter(unnamed)
    arthur.getNervous()
    room.enter(arthur)
    arthur.shock()
    arthur.mainHead.see()
    val chair: Chair = Chair()
    chair.sit(unnamed)
    val remote: RemoteControl = RemoteControl()
    remote.lieDown(unnamed)
    unnamed.secondHead = Head("Вторая голова Безымянного(правая)")
    unnamed.secondHead?.jaw?.chew(unnamed.leftArm, unnamed.mainHead)
    unnamed.secondHead?.busy()
    unnamed.mainHead.smile()
    arthur.shock()
    arthur.mainHead.jaw.sag()
}