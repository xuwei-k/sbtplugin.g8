sbtPlugin := true

name := "$name$"

organization := "$organization$"

version := "$version$"

scalacOptions := Seq("-deprecation", "-unchecked")

ScriptedPlugin.scriptedSettings

ScriptedPlugin.scriptedBufferLog := false

watchSources <++= (sbtTestDirectory).map{ dir => (dir ***).get }

initialCommands in console := Seq(
  "$organization$"
).map{"import " + _ + "._"}.mkString("\n")

libraryDependencies ++= Seq(
)
