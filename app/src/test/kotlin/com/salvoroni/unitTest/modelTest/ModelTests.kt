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

    @Test fun domainTestMain() {
        System.setOut(newOut)

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

        val output: String = String(baos.toByteArray())
        assertTrue(output.contains(
            "Безымянный вошел в комната\n" +
            "Артур нервничает\n"+
            "Артур вошел в комната\n"+
            "Артур не верил своим глазам\n"+
            "видеть\n"+
            "Безымянный развалился в кресло\n"+
            "Безымянный положил ноги на пульт управления\n"+
            "Челюсть Вторая голова Безымянного(правая) в Голова Безымянного ковыряется с помощью левая рука Безымянного\n"+
            "Вторая голова Безымянного(правая) занята\n"+
            "Голова Безымянного улыбается\n"+
            "Артур не верил своим глазам\n"+
            "Челюсть Голова Артура отвисла"
        ))

        System.setOut(oldOut)
    }
}