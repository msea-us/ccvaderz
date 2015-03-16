package us.msea.vaderz.shared

import us.msea.vaderz.shared.framework.Processing

class Game extends Processing {
  def hello() = {
    println("Hello Vaderz")
  }
  
  
  val screenWidth = 800
  val screenLength = 600
  
  override def setup() = {
   // size(screenWidth, screenLength) // Size must be the first statement
    frameRate(60)
    stroke(0) // Set line drawing color to white
  }
  
  override def draw() = {
    rect(10,20,20,10)
  }
}