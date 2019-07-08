import enumClasses.TerrainTypes

object LevelGenerator {
    fun GenerateLevel() : Level {
        val level = Level()
        level.boardH = 50
        level.boardW = 50
        level.board = Array(level.boardW) {
                                            val x = it
                                            Array(level.boardH) {
                                                Tile(TerrainTypes.FLOOR, x, it)
                                            }
        }
      //  var world = Array(level.boardW) { x-> Array(level.boardH) { Tile(TerrainTypes.FLOOR,x,it) } }
        level.board[0][0].entity = Player(1,1,1,1,1,1,1,1,1,1)
        return level
    }


}