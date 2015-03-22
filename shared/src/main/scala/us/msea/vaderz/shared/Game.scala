package us.msea.vaderz.shared

import us.msea.vaderz.shared.framework.Processing

class Game extends Processing {
  
  //these must be set in the constructor to support jvm jFrame
  setWidth(800)
  setHeight(600)
  
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