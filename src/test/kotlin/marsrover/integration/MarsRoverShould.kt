package marsrover.integration

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import marsrover.infrestructure.MarsRover

class MarsRoverShould : ShouldSpec({
    val marsRover = MarsRover()

    should("face north at first instance") {
        marsRover.orientedTo shouldBe "N"
    }

    should("rotate to west when is facing north") {
        val finalPosition = marsRover.move("L")

        finalPosition shouldBe "0:0:W"
    }

    should("rotate to east when is facing north") {
        val finalPosition = marsRover.move("R")

        finalPosition shouldBe "0:0:E"
    }
})
