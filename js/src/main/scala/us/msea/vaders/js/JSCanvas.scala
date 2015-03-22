package us.msea.vaders.js

import us.msea.vaderz.shared.framework._
import org.scalajs.dom
import org.scalajs.dom.html

class JSCanvas(handler : Processing)  extends Canvas {
  
  val canvas = dom.document.getElementById("canvas").asInstanceOf[html.Canvas]
  val ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
  
  var _frameRate = 0f
  
  def init() = {
    handler.setCanvas(this)
    handler.setup()
    dom.setInterval(() => handler.draw, 1000 / _frameRate)
  }
  
  def frameRate(r:Float) = {
    _frameRate = r
  }
  
  def size(w:Int, h:Int) = {
    
  }
  
  def stroke(rgb : Int) = {
     ctx.fillStyle = rgb
  }
  
  def rect(a : Float, b : Float, c: Float, d: Float) = {
    ctx.fillRect(a, b, c, d)
  }
  

}