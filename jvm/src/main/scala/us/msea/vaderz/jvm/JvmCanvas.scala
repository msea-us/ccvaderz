package us.msea.vaderz.jvm

import processing.core._
import us.msea.vaderz.shared.framework._

class JvmCanvas(handler : ProcessingApiAdapter) extends PApplet with Canvas {
  
  //TODO get width and height from jvm runtime environment; -Dwidth=...
  val w = 800
  val h = 600
  
  override def init() = {
    val jFrame = new javax.swing.JFrame()
    
    jFrame.setSize(w,h)
    jFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
    val panel  = new javax.swing.JPanel()
    panel.setBounds(20, 20, w, h)
    panel.add(this)
    jFrame.add(panel)
    
    //start PApplet
    handler.setCanvas(this)
    super.init()
    
    jFrame.setVisible(true)
    this.size(w, h)
  }
  
  override def setup() = {
   handler.setup()
   size(w, h)
  }
  
  override def draw() = {
    handler.draw()
  }
  
}  


