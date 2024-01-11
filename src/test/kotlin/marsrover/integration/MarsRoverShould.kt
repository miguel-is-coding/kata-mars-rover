package marsrover.integration

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import marsrover.infrestructure.MarsRover

class MarsRoverShould : ShouldSpec({
    should("move to the front with one movement when is requested") {
        val marsRover = MarsRover()

        val finalPosition = marsRover.move("M")

        finalPosition shouldBe "1:1:N"
    }

    should("face north at first instance") {
        val marsRover = MarsRover()

        marsRover.orientedTo shouldBe "N"
    }

    should("rotate to west when is facing north") {
        val marsRover = MarsRover()

        val finalPosition = marsRover.move("L")

        finalPosition shouldBe  "1:1:W"
    }

    should("rotate to east when is facing north") {
        val marsRover = MarsRover()

        val finalPosition = marsRover.move("R")

        finalPosition shouldBe  "1:1:E"
    }
})
