package us.msea.vaderz.shared

import us.msea.vaderz.shared.framework._

class Game extends ProcessingApiAdapter {
  
  var message  = ""
  
  override def setup() = {
    frameRate(10)
  }
  
  var i = 0
  override def draw() = {
    background(0)
    stroke(0) // Set line drawing color to white
    rect(10+i,20,20,10)
    displayMessage()
  }
  
  def displayMessage() = {
      text(message, 100, 500)
  }
  
  override def keyPressed(keyCode : Int) = {
    if(keyCode == KeyCodes.LEFT_ARROW) {
      message = "left"
      i -= 5
    }
    if(keyCode == KeyCodes.RIGHT_ARROW) {
      i += 5
      message = "right"
    }
  }
  
  override def keyReleased(keyCode : Int) = {
  }
}