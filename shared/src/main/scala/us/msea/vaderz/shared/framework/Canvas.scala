package us.msea.vaderz.shared.framework

/*
 * Canvas contains methods for drawing various shapes.
 * Canvas is responsible for redraw timer and keyboard actions.
 */
trait Canvas {
  
  def init(eventHnadler : ProcessingApiAdapter)
  
  def background(rgb : Int)
  
  def frameRate( r : Float)
  
  def size(w : Int, h : Int) 
  
  def stroke(rgb : Int)
  
  def rect(a : Float, b : Float, c: Float, d: Float)
  
  def textSize(size : Float)
  
  def text(txt : String, x : Float, y : Float)

}