sbtPlugin := true

name := "$name$"

organization := "$organization$"

version := "$version$"

scalacOptions := Seq("-deprecation", "-unchecked", "-language:_")

watchSources <++= (sbtTestDirectory).map{ dir => (dir ***).get }

initialCommands in console := Seq(
  "$organization$"
).map{"import " + _ + "._"}.mkString("\n")

libraryDependencies ++= Seq(
)
