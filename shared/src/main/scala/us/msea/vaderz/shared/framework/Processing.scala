package us.msea.vaderz.shared.framework

trait Processing {
  
  var _width : Int = 0
  def setWidth(w:Int) = {
    _width = w
  }
  var _height : Int = 0
  def setHeight(h:Int) = {
    _height = h
  }
  var _rgb : Int = 0
  
  var _canvas : Canvas = null
  
  def setCanvas(canvas : Canvas) = {
    _canvas = canvas
  }
  
  def setup()
  
  def draw()
  
  def size(w : Int, h : Int) = {
    _canvas.size(w,h)
  }
  
  def frameRate( rate : Int) = {
    _canvas.frameRate( rate )
  }
  
  def stroke(rgb : Int) = {
    _rgb = rgb
    _canvas.stroke(rgb)
  }
  
  def rect(a : Float, b : Float, c: Float, d: Float) = {
    _canvas.rect(a, b, c, d)
  }
  
//  def init() = {
//    setup()
//    _canvas.setInterval(draw, 1000 / _frameRate)
//    //while(true) {   
//       //Thread.sleep( 1000 / _frameRate)
//    //}
//  }

}