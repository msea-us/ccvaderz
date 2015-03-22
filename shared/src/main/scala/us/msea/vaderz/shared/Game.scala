package us.msea.vaderz.shared

import us.msea.vaderz.shared.framework.ProcessingApiAdapter

class Game extends ProcessingApiAdapter {
  
  override def setup() = {
    frameRate(10)
    stroke(0) // Set line drawing color to white
  }
  
  var i = 0
  override def draw() = {
    i+=10
    rect(10+i,20+i,20+i,10+i)
  }
}