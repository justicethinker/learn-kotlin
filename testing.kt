package lpk.basics

import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main() {
    // Schedules the creation and showing of the GUI on the Event Dispatch Thread
    SwingUtilities.invokeLater { FirstProgram().doLaunch() }
}

class FirstProgram {
    // Function to return a 2D array of integers representing tile colors
    fun tileColors(): Array<Array<Int>> {
        // Defines a 2x2 array with values 0 and 255, likely representing colors
        return arrayOf(
            arrayOf(0, 255),   // First row: 0, 255
            arrayOf(255, 0)    // Second row: 255, 0
        )
    }

    fun doLaunch() {
        // Creates a new JFrame window with the title "Basics"
        val frame = JFrame("Basics")
        
        // Sets the default close operation to exit the application when the window is closed
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        
        // Loads an image from the specified path and sets it as the frame's icon
        frame.iconImage = ImageIcon("./src/lpk/basics/icon.png").image
        
        // Adds a custom panel (TilePanel) that uses the tileColors array to display something
        frame.add(TilePanel(tileColors()))
        
        // Packs the components within the frame for optimal size
        frame.pack()
        
        // Makes the frame visible on the screen
        frame.isVisible = true
    }
}
