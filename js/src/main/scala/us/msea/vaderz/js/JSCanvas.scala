package us.msea.vaderz.js

import us.msea.vaderz.shared.framework._
import org.scalajs.dom
import org.scalajs.dom.html

class JSCanvas(handler : ProcessingApiAdapter) extends Canvas {
  
  val canvas = dom.document.getElementById("canvas").asInstanceOf[html.Canvas]
  val ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
  
  val w = 800
  val h = 600
  
  var _frameRate = 0f
  
  var debugMsg = "debug"
  
  def init() = {
    debugMsg = "init"
    handler.setWidth(w)
    handler.setHeight(h)
    handler.setCanvas(this)
    handler.setup()
    assert( _frameRate > 0)
    dom.setInterval(() => handler.draw, 1000 / _frameRate)
    
    dom.onkeydown = {(e: dom.KeyboardEvent) => 
      handler.keyPressed(e.keyCode.toInt)
    }
      
    dom.onkeyup = {(e: dom.KeyboardEvent) =>
      handler.keyReleased(e.keyCode.toInt)
    }
    
    
  }
  
  def background(rgb : Int) = {
    ctx.fillStyle = Color.Black
    ctx.fillRect(0, 0, w, h)
    
    //text(debugMsg, 100, 500)
  }
  
  def frameRate(r:Float) = {
    _frameRate = r
  }
  
  def size(w:Int, h:Int) = {
    throw new NotImplementedError
  }
  
  def stroke(rgb : Int) = {
     ctx.fillStyle = Color.White //rgb
  }
  
  def rect(a : Float, b : Float, c: Float, d: Float) = {
    ctx.fillRect(a, b, c, d)
  }
  
  def textSize(size : Float) = {
    //
  }
  
  def text(txt : String, x : Float, y : Float) = {
    ctx.fillStyle = Color.White
    ctx.font = "20pt Arial"
    ctx.textAlign = "center"
    ctx.fillText(txt, x, y)
  }
  
  def KEY_LEFT = 37
  
  def KEY_RIGHT = 39
  

}

object Color{
  def rgb(r: Int, g: Int, b: Int) = s"rgb($r, $g, $b)"
  val White = rgb(255, 255, 255)
  val Red = rgb(255, 0, 0)
  val Green = rgb(0, 255, 0)
  val Blue = rgb(0, 0, 255)
  val Cyan = rgb(0, 255, 255)
  val Magenta = rgb(255, 0, 255)
  val Yellow = rgb(255, 255, 0)
  val Black = rgb(0, 0, 0)
}