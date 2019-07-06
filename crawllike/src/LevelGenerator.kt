import enumClasses.TerrainTypes

object LevelGenerator {
    fun GenerateLevel() : Level {
        val level = Level()

        level.boardH = 50;
        level.boardW = 50;
        level.board = Array<Array<Tile>>(level.boardW) {
                                            val x = it
                                            Array<Tile>(level.boardH) {
                                                Tile(TerrainTypes.FLOOR, x, it)
                                            }
        }

        return level
    }


}