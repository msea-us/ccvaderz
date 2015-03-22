package us.msea.vaders.js

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import us.msea.vaderz.shared._

object Main extends js.JSApp {
  def main(): Unit = {
    val game = new Game()
    new JSCanvas(game).init()
  }
  
}