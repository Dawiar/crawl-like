import java.awt.Graphics
import javax.swing.JFrame

object Game {

    val tileSize = 64

    var mainForm = MainForm()
    var currentLevel : Level? = null
    fun start() {

        currentLevel = LevelGenerator.GenerateLevel()
        mainForm.setVisible(true)
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        mainForm.setSize(650, 650)
        //render(mainForm.mainPanel.graphics)
    }

    fun render(g : Graphics) {
        currentLevel?.paint(g)
    }
}