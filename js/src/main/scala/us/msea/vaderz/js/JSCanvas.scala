package us.msea.vaderz.js

import us.msea.vaderz.shared.framework._
import org.scalajs.dom
import org.scalajs.dom.html

class JSCanvas(val _width : Int = 800, val _height : Int = 600) extends Canvas {
  
  var _eventHandler : ProcessingApiAdapter = null
  
  val canvas = dom.document.getElementById("canvas").asInstanceOf[html.Canvas]
  val ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
  
  var _frameRate = 0f
  
  var debugMsg = "debug"
  
  def init(eventHandler : ProcessingApiAdapter) = {
    _eventHandler = eventHandler
    _eventHandler.setCanvas(this)
    
    _eventHandler.setup()
    
    // frame rate must be set in the setup()
    assert( _frameRate > 0)
    
    //activate timer
    dom.setInterval(() => _eventHandler.draw, 1000 / _frameRate)
    
    dom.onkeydown = {(e: dom.KeyboardEvent) => 
      _eventHandler.keyPressed(e.keyCode.toInt)
    }
      
    dom.onkeyup = {(e: dom.KeyboardEvent) =>
      _eventHandler.keyReleased(e.keyCode.toInt)
    }
    
    text("I can be moved by pressing and holding the arrow keys, even diagonally!",0,10);
    
  }
  
  //TODO - fixme!!!
  def background(rgb : Int) = {
    ctx.fillStyle = Color.Black
    ctx.fillRect(0, 0, _width, _height)
  }
  
  def frameRate(r:Float) = {
    _frameRate = r
  }
  
  def size(w:Int, h:Int) = {
    throw new NotImplementedError
  }
  
  //TODO fixme
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