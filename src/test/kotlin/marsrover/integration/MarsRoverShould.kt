package marsrover.integration

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import marsrover.infrestructure.MarsRover

class MarsRoverShould : FunSpec({
    val marsRover = MarsRover()

    test("face north at first instance") {
        marsRover.orientedTo shouldBe "N"
    }

    context("rotates to right") {
        withData(
            MarsRoverPosition("R", "0:0:E"),
            MarsRoverPosition("RR", "0:0:S"),
            MarsRoverPosition("RRR", "0:0:W"),
            MarsRoverPosition("RRRR", "0:0:N")
        ) { (movement, expectedPosition) ->
            val finalPosition = marsRover.move(movement)

            finalPosition shouldBe expectedPosition
        }
    }

    test("rotate to west when is facing north") {
        val finalPosition = marsRover.move("L")

        finalPosition shouldBe "0:0:W"
    }

    test("rotate to east when is facing north") {
        val finalPosition = marsRover.move("R")

        finalPosition shouldBe "0:0:E"
    }
})
