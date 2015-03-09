name := "Cross-compile Vaderz"

lazy val root = project.in(file(".")).
  aggregate(vaderzJS, vaderzJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val vaderz = crossProject.in(file(".")).
  settings(
    name := "ccvaders",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.5"
  ).
jsSettings(
    name := "ccvadersJS"
  ).
jvmSettings(
    name := "ccvadersJVM"
  )

lazy val vaderzJS = vaderz.js
lazy val vaderzJVM = vaderz.jvm

