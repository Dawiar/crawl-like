import enumClasses.TerrainTypes
import java.awt.Color
import java.awt.Graphics

class Tile (var terrainType : TerrainTypes, var x : Int, var y : Int){

     var entity : Entity? = null


    fun paint(g : Graphics)
    {
        when(terrainType)
        {
            TerrainTypes.FLOOR -> g.color = Color.YELLOW
            TerrainTypes.WALL -> g.color = Color.BLACK
        }

        g.fillRect(x*Game.tileSize, y*Game.tileSize, Game.tileSize, Game.tileSize)
        g.color = Color.BLACK
        g.drawRect(x*Game.tileSize, y*Game.tileSize, Game.tileSize, Game.tileSize)
        entity?.paint(g)
    }
}