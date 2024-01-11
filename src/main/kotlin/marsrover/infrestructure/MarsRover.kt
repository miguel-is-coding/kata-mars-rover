package marsrover.infrestructure

class MarsRover {
    var orientedTo: String = "N"

    fun move(moveCommands: String): String {
        for (movement in moveCommands) {
            when (movement){
                'L' -> orientedTo('W')
                'R' -> orientedTo('E')
            }
        }
        return "1:1:$orientedTo"
    }

    private fun orientedTo(orientation: Char) {
        this.orientedTo = orientation.toString()
    }
}
