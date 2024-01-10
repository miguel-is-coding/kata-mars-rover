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


})
