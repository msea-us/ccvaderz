package us.msea.vaderz.jvm

import processing.core._
import us.msea.vaderz.shared.framework._
import java.awt.event.KeyEvent._

class JvmCanvas(val _width : Int = 800, val _height : Int = 600 ) extends PApplet with Canvas {
  
  var _eventHandler : ProcessingApiAdapter = null
  
  override def init(eventHandler : ProcessingApiAdapter) = {
    _eventHandler = eventHandler
    val jFrame = new javax.swing.JFrame()
    
    jFrame.setSize(_width,_height)
    jFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
    val panel  = new javax.swing.JPanel()
    panel.setBounds(20, 20, _width, _height)
    panel.add(this)
    jFrame.add(panel)
    
    //start PApplet
    _eventHandler.setCanvas(this)
    super.init()
    
    jFrame.setVisible(true)
    this.size(_width, _height)
  }
  
  override def setup() = {
   _eventHandler.setup()
   size(_width, _height)
  }
  
  override def draw() = {
    _eventHandler.draw()
  }
  
  override def keyPressed() = {
    _eventHandler.keyPressed(keyCode)
  }
  
  override def keyReleased() = {
    _eventHandler.keyReleased(keyCode)
  }
  
  def text(txt : String, x : Int, y : Int) = {}
  
  def KEY_LEFT = VK_LEFT
  
  def KEY_RIGHT = VK_RIGHT
  
}  


