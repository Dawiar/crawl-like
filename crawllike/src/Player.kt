import java.awt.Graphics
import java.awt.Image
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO




class Player(x : Int, y : Int, hp : Int, atack : Int, speed : Int, exp: Int, AC : Int, EV : Int, MR : Int, size : Int ) :
        Entity(x, y, hp, atack, speed, exp, AC, EV, MR, size) {

    private var img : BufferedImage
    init {
       var path = File("").absolutePath
        path += "\\crawllike\\resources\\hero.jpg"
        img = ImageIO.read(File(path))
        img = resize(img, Game.tileSize,Game.tileSize)
    }

    override fun paint(g: Graphics) {
        g.drawImage(img,x,y,null)
    }

    fun resize(img: BufferedImage, newW: Int, newH: Int): BufferedImage {
        val tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH)
        val dimg = BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB)
        val g2d = dimg.createGraphics()
        g2d.drawImage(tmp, 0, 0, null)
        g2d.dispose()

        return dimg
    }
}

