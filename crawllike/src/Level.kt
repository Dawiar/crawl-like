import java.awt.Graphics

class Level {
    var board : Array<Array<Tile>> = emptyArray()

    var boardH : Int = 0
    var boardW : Int = 0

    fun paint(g : Graphics) {
        for(i in 0 until boardW) {
            for(j in 0 until boardH) {
                board[i][j].paint(g)
            }
        }
    }
}