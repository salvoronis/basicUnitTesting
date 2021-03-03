package com.salvoroni.unitTest.modelTest

import com.salvoroni.unitTest.models.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ModelTest {
    val oldOut: PrintStream = System.out
    val baos: ByteArrayOutputStream = ByteArrayOutputStream()
    val newOut: PrintStream = PrintStream(baos)

    @Test fun roomEnterTests() {
        val room: Room = Room()
        val person: Person = Person("Артур", "Голова Артура", "левая рука Артура", "правая рука Артура", "левая нога Артура", "правая нога Артура")
        room.enter(person)
        assertTrue(room.persons.contains(person))
    }

    val arthur = Person("Артур", "Голова Артура", "левая рука Артура", "правая рука Артура", "левая нога Артура", "правая нога Артура")
    val unnamed = Person("Безымянный", "Голова Безымянного", "левая рука Безымянного", "правая рука Безымянного", "левая нога Безымянного", "правая нога Безымянного")
    val room = Room()
    val chair: Chair = Chair()
    val remote: RemoteControl = RemoteControl()

    @Test fun domainTestMain() = assertAll({
        unnamed.secondHead = Head("Вторая голова Безымянного(правая)")

        System.setOut(newOut)
        room.enter(unnamed)
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Безымянный вошел в комната"))
    },{
        arthur.getNervous()
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Артур нервничает"))
    },{
        room.enter(arthur)
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Артур вошел в комната"))
    },{
        arthur.shock()
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Артур не верил своим глазам"))
    },{
        arthur.mainHead.see()
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("видеть"))
    },{
        chair.sit(unnamed)
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Безымянный развалился в кресло"))
    },{
        remote.lieDown(unnamed)
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Безымянный положил ноги на пульт управления"))
    },{
        unnamed.secondHead?.jaw?.chew(unnamed.leftArm, unnamed.mainHead)
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Челюсть Вторая голова Безымянного(правая) в Голова Безымянного ковыряется с помощью левая рука Безымянного"))
    },{
        unnamed.secondHead?.busy()
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Вторая голова Безымянного(правая) занята"))
    },{
        unnamed.mainHead.smile()
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Голова Безымянного улыбается"))
    },{
        arthur.shock()
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Артур не верил своим глазам"))
    },{
        arthur.mainHead.jaw.sag()
        val output: String = String(baos.toByteArray())
        assertTrue(output.contains("Челюсть Голова Артура отвисла"))
        System.setOut(oldOut)
    })
}