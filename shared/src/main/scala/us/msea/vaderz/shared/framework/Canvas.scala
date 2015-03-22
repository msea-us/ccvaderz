package us.msea.vaderz.shared.framework

trait Canvas {
  
  def frameRate( r : Int)
  
  def size(w : Int, h : Int) 
  
  def stroke(rgb : Int)
  
  def rect(a : Float, b : Float, c: Float, d: Float)
  

}