package marsrover.infrestructure

class MarsRover {
    var orientedTo: String = "N"

    fun move(moveCommands: String): String {
        for (movement in moveCommands) {
            if (movement == 'L') {
                orientedTo('W')
            }
            if (movement == 'R') {
                orientedTo('E')
            }
        }
        return "1:1:$orientedTo"
    }

    private fun orientedTo(orientation: Char) {
        this.orientedTo = orientation.toString()
    }
}
