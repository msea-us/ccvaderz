package us.msea.vaderz.js

import scala.scalajs.js
import us.msea.vaderz.shared._

object Main extends js.JSApp {
  def main(): Unit = {
    val game = new Game()
    game.hello()
  }
  
}