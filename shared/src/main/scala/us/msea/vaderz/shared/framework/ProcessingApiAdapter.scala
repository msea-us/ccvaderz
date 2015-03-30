package us.msea.vaderz.shared.framework

trait ProcessingApiAdapter extends Canvas {
  
  var _canvas : Canvas = null
  def setCanvas(canvas : Canvas) = {
    _canvas = canvas
  }
  
  var _width : Int = 0
  def setWidth(w:Int) = {
    _width = w
  }
  
  var _height : Int = 0
  def setHeight(h:Int) = {
    _height = h
  }
  
  var _rgb : Int = 0
  
  def background(rgb : Int) = {
    _canvas.background(rgb)
  }
  
  var _textSize = 0
  def textSize(size : Int) = {
    _textSize = size
    _canvas.textSize(size)
  }
  
  def setup()
  
  def draw()
  
  def size(w : Int, h : Int) = {
    _canvas.size(w,h)
  }
  
  def frameRate( rate : Float) = {
    _canvas.frameRate( rate )
  }
  
  def stroke(rgb : Int) = {
    _rgb = rgb
    _canvas.stroke(rgb)
  }
  
  def rect(a : Float, b : Float, c: Float, d: Float) = {
    _canvas.rect(a, b, c, d)
  }
  
  def text(txt : String, x : Float, y : Float) = {
    _canvas.text(txt, x, y)
  }
  
  def textSize( size : Float) = _canvas.textSize(size)
  
  def keyPressed(keyCode : Int) = {}
  
  def keyReleased(keyCode : Int) = {}
  
}