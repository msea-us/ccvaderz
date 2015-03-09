name := "Cross-compile Vaderz"

lazy val root = project.in(file(".")).
  aggregate(vaderzJS, vaderzJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val vaderz = crossProject.in(file(".")).
  settings(
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.5"
  ).
jsSettings(    
    name := "ccvaderzjs",
    persistLauncher in Compile := true,
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.8.0"
    )
  ).
jvmSettings(
    name := "ccvaderzjvm"
  )

lazy val vaderzJS = vaderz.js
lazy val vaderzJVM = vaderz.jvm

