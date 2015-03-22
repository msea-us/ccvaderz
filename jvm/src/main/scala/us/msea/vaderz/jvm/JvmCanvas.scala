package us.msea.vaderz.jvm

import processing.core._
import us.msea.vaderz.shared.framework._

class JvmCanvas(handler : Processing) extends Canvas {
  val applet = new ProcessingApplet(handler)
  
  def init() = {
    val jFrame = new javax.swing.JFrame()
    handler.setCanvas(this)
    val w = handler._width
    val h = handler._height
    jFrame.setSize(w,h)
    jFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
    val panel  = new javax.swing.JPanel()
    panel.setBounds(20, 20, w, h)
    panel.add(applet)
    jFrame.add(panel)
    applet.init()
    jFrame.setVisible(true)
    applet.size(w, h)
  }
  
  override def frameRate(r:Int) = {
    applet.frameRate(r)
  }
  
  override def size(w:Int,h:Int) = {
    applet.size(w,h)
  }
  
  override def stroke(rgb : Int) = {
     applet.stroke(rgb)
  }
  
  override def rect(a : Float, b : Float, c: Float, d: Float) = {
    applet.rect(a,b,c,d)
  }
  
    
}

class ProcessingApplet(handler : Processing) extends PApplet {
  override def setup() = {
     handler.setup()
     size(handler._width, handler._height)
  }
  
  override def draw() = {
    handler.draw()
  }
}
  


