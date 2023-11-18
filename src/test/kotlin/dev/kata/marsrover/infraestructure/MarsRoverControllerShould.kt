package dev.kata.marsrover.infraestructure

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class MarsRoverControllerShould : ShouldSpec({
    should("move to the front with one movement") {
        val marsRoverController = MarsRoverController()
        val finalPosition = marsRoverController.execute("M")

        finalPosition shouldBe "1:1:N"
    }
})
