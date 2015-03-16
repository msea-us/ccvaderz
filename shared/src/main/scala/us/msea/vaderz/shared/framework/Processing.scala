package us.msea.vaderz.shared.framework

trait Processing {
  
  var _width : Int = 0
  var _height : Int = 0
  var _frameRate : Int = 0
  var _rgb : Int = 0
  
  var _canvas : Canvas = null
  
  def setCanvas(canvas : Canvas) = {
    _canvas = canvas
  }
  
  def setup()
  
  def draw()
  
  def frameRate( rate : Int) = {
    _frameRate = rate
  }
  
  def stroke(rgb : Int) = {
    _rgb = rgb
    _canvas.stroke(rgb)
  }
  
  def rect(a : Float, b : Float, c: Float, d: Float) = {
    _canvas.rect(a, b, c, d)
  }
  
  def init() = {
    setup()
    while(true) {
      draw()
      Thread.sleep( 1000 / _frameRate)
    }
  }

}