import java.awt.Graphics

abstract class Entity( var x : Int, var y : Int, var hp : Int, var atack : Int,var speed : Int, var exp: Int, var AC : Int, var EV : Int, var MR : Int, var size : Int   ){
     var inventory : Array<Item> = emptyArray()
     var equipmentLimit : Map<String,Int> = emptyMap()
     var equipment : Map<String,Array<Item>> = emptyMap()

    abstract fun paint(g: Graphics)
}