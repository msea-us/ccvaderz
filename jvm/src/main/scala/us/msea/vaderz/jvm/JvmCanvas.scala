package us.msea.vaderz.jvm

import processing.core._
import us.msea.vaderz.shared.framework.Canvas

class JvmCanvas(w : Int, h: Int) extends javax.swing.JFrame with Canvas {
  val applet = new ProcessingApplet()
  this.setSize(w, h)
  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
  val panel  = new javax.swing.JPanel()
  panel.setBounds(20, 20, w, h)
  panel.add(applet)
  this.add(panel)
  applet.init()
  setVisible(true)
  applet.size(w, h)
  
  def stroke(rgb : Int) = {
     applet.stroke(rgb)
  }
  
  def rect(a : Float, b : Float, c: Float, d: Float) = {
    applet.rect(a,b,c,d)
  }
    
    
}

class ProcessingApplet extends PApplet
  


