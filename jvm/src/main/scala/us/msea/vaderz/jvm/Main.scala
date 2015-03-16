package us.msea.vaderz.jvm

import us.msea.vaderz.shared._

object Main {
   def main(args: Array[String]): Unit = {
    val game = new Game()
    game.setCanvas(new JvmCanvas(game.screenWidth,game.screenLength))
    game.init()
  }
}