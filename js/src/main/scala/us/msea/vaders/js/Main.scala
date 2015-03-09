package us.msea.vaderz.js

import scala.scalajs.js
import org.scalajs.dom
import us.msea.vaderz.shared._

object Main extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!!!mm!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)
    
    val game = new Game()
    game.hello()
  }
  
}