package us.msea.vaderz.shared.framework

trait Canvas {
  
  def background(rgb : Int)
  
  def frameRate( r : Float)
  
  def size(w : Int, h : Int) 
  
  def stroke(rgb : Int)
  
  def rect(a : Float, b : Float, c: Float, d: Float)
  
  def KEY_LEFT() : Int
  
  def KEY_RIGHT() : Int
  
  def textSize(size : Float)
  
  def text(txt : String, x : Float, y : Float)

}